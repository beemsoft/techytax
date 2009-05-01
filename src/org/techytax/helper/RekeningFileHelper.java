/**
 * Copyright 2009 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.techytax.dao.KostensoortDao;
import org.techytax.dao.KostmatchDao;
import org.techytax.domain.Kost;
import org.techytax.domain.KostConstanten;
import org.techytax.domain.Kostensoort;
import org.techytax.domain.Kostmatch;

import com.Ostermiller.util.CSVParser;
import com.Ostermiller.util.LabeledCSVParser;

public class RekeningFileHelper {

	private static final Log log = LogFactory.getLog(RekeningFileHelper.class);

	final static char DELIMITER = ',';

	final static char QUOTE = '"';

	private String fileName;

	private static LabeledCSVParser parser = null;

	private Vector<String> labels = new Vector<String>();

	private static Vector<String[]> regels = null;

	private static List<Kostensoort> kostensoortList = null;

	private RekeningFileHelper() {
	}

	public static List<Kost> readFile(BufferedReader in, List<Kostensoort> kostensoortList2) {
		kostensoortList = kostensoortList2;
		List<Kost> kostLijst = new ArrayList<Kost>();
		try {
			System.out.println("Initialize parser");
			parser = new LabeledCSVParser(new CSVParser(in));
			System.out.println(parser.getLabels()[0]);
			verwerkRecords();

			Vector<String[]> data = getRegels();
			// aantalRecords = data.size();
			Kost kost = null;
			for (int regelNummer = 1; regelNummer <= data.size(); regelNummer++) {
				// for (int regelNummer = 45; regelNummer <= 50; regelNummer++)
				// {
				String[] regel = (String[]) data.get(regelNummer - 1);
				System.err.println("Regel: " + regelNummer + " " + regel[0]);

				kost = verwerkRegel(regel, regelNummer);
				kostLijst.add(kost);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return kostLijst;
		//
	}

	/**
	 * 
	 */
	private static void verwerkRecords() throws IOException {
		int regelNummer = 0;

		String[] regel = parser.getLine();
		regels = new Vector<String[]>();
		while (regel != null) {

			++regelNummer;
			log.debug("Regel#" + regelNummer + " (" + regel.length + "): "
					+ ArrayUtils.toString(regel));
			regels.add(regel);

			regel = parser.getLine();
		}
	}

	/**
	 * Lees een regel. Haal alle personen op. Haal alle blokken op. Als de
	 * persoon in de regel nog niet bekend is, voeg deze dan toe. Als het blok
	 * in de regel nog niet bekend is, voeg deze dan toe. Voeg het reviewobject
	 * toe.
	 * 
	 * @param regel
	 * @param regelNummer
	 * @param labels
	 * @param request
	 */
	public static Kost verwerkRegel(String[] regel, int regelNummer) {
		Kost kost = new Kost();
		// Controleer of het aantal waarden in de regel klopt.
		try {
			String datum = regel[0];
			kost.setDatum(datum.substring(0, 4) + "-" + datum.substring(4, 6)
					+ "-" + datum.substring(6, 8));
			BigDecimal bedrag = new BigDecimal(regel[6].replace(',', '.'));
			kost.setBedrag(bedrag);
			String omschrijving = regel[1] + " " + regel[8];

			if (omschrijving.trim().equals("")) {
				// Dit is waarschijnlijk een opname van de spaarrekening.
				if (regel[2].equals(regel[3])) {
					if (regel[5].equals("Af")) {
						kost.setOmschrijving("Opname naar spaarrekening");
						kost.setKostenSoortId(KostConstanten.OPNAME);
					} else {
						kost.setOmschrijving("Inleg vanaf spaarrekening");
						kost.setKostenSoortId(KostConstanten.INLEG);
					}
					kost.setKostenSoortOmschrijving(getKostOmschrijving(kost
							.getKostenSoortId()));
					kost.setBtw(new BigDecimal("0"));
				}
			} else {
				kost.setOmschrijving(omschrijving);
				kost = matchKost(kost);
			}
			return kost;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private static long findKostensoort(String omschrijving) throws Exception {
		KostmatchDao kostmatchDao = new KostmatchDao();
		List<Kostmatch> kostmatchList = kostmatchDao.getKostmatchLijst();
		Iterator<Kostmatch> iterator = kostmatchList.iterator();
		while (iterator.hasNext()) {
			Kostmatch kostmatch = iterator.next();
			if (omschrijving.contains(kostmatch.getMatchText())) {
				return kostmatch.getKostenSoortId();
			}
		}
		return 0;
	}

	private static Kost matchKost(Kost kost) throws Exception {
		long kostensoortId = KostConstanten.ONBEPAALD;
		BigDecimal bedrag = kost.getBedrag();
		BigDecimal btwBedrag = new BigDecimal(0);
		boolean berekenBtw_hoog = false;
		boolean berekenBtw_laag = false;
		kostensoortId = findKostensoort(kost.getOmschrijving());
		KostensoortDao kostensoortDao = new KostensoortDao();
		Kostensoort kostensoort = kostensoortDao.getKostensoort(Long
				.toString(kostensoortId));
		if (kostensoort.isBtwVerrekenbaar()) {
			berekenBtw_hoog = true;
		}
		BigDecimal bd = bedrag;
		if (berekenBtw_hoog) {
			int decimalPlace = 2;
			bd = new BigDecimal(bedrag.doubleValue() / 1.19d);
			bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
			btwBedrag = bedrag.subtract(bd);
		}
		if (berekenBtw_laag) {
			int decimalPlace = 2;
			bd = new BigDecimal(bedrag.doubleValue() / 1.06d);
			bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
			btwBedrag = bedrag.subtract(bd);
		}
		kost.setBtw(btwBedrag);
		kost.setBedrag(bd);
		kost.setKostenSoortId(kostensoortId);
		kost.setKostenSoortOmschrijving(getKostOmschrijving(kostensoortId));
		return kost;
	}

	private static String getKostOmschrijving(long kostensoortId) {
		Iterator<Kostensoort> iter = kostensoortList.iterator();
		while (iter.hasNext()) {
			Kostensoort kostensoort = iter.next();
			if (kostensoort.getKostenSoortId() == kostensoortId) {
				return kostensoort.getOmschrijving();
			}
		}
		return "Onbepaald";
	}

	/**
	 * @return
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return
	 */
	public Vector<String> getLabels() {
		return labels;
	}

	/**
	 * @return
	 */
	public static Vector<String[]> getRegels() {
		return regels;
	}

}