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
package org.techytax.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.techytax.domain.Aftrekpost;
import org.techytax.domain.Kost;
import org.techytax.util.IbatisUtil;

import com.ibatis.sqlmap.client.SqlMapClient;

public class BoekDao {
	public void insertKost(Kost kost) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			sqlMap.insert("insertKost", kost);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Kost> getKostLijst() throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			return sqlMap.queryForList("getKostLijst", null);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Kost> getAlleKosten() throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			return sqlMap.queryForList("getAlleKosten", null);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Kost> getKostLijst(String beginDatum, String eindDatum,
			String balansSoort) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		Map<String,String> map = new HashMap<String, String>();
		map.put("beginDatum", beginDatum);
		map.put("eindDatum", eindDatum);
		try {
			if (balansSoort.equals("alles")) {
				return sqlMap.queryForList("getCompleteKostLijst", map);
			} else if (balansSoort.equals("btwBalans")) {
				return sqlMap.queryForList("getBtwBalansLijst", map);
			} else if (balansSoort.equals("rekeningBalans")) {
				return sqlMap.queryForList("getRekeningBalansLijst", map);
			} else if (balansSoort.equals("kostenBalans")) {
				return sqlMap.queryForList("getKostenBalansLijst", map);
			} else if (balansSoort.equals("reiskostenBalans")) {
				return sqlMap.queryForList("getReisKostenBalansLijst", map);
			} else if (balansSoort.equals("investeringen")) {
				return sqlMap.queryForList("getInvesteringenLijst", map);
			} else if (balansSoort.equals("aftrekpostenLijst")) {
				return sqlMap.queryForList("getAftrekpostenLijst", map);
			} else if (balansSoort.equals("afschrijvingen")) {
				return sqlMap.queryForList("getAfschrijvingenLijst", map);
			}
		} catch (SQLException ex) {
			throw ex;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Aftrekpost> getAftrekpostLijst(String beginDatum, String eindDatum,
			String balansSoort) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		Map<String,String> map = new HashMap<String, String>();
		map.put("beginDatum", beginDatum);
		map.put("eindDatum", eindDatum);
		try {
			if (balansSoort.equals("aftrekpostenLijst")) {
				return sqlMap.queryForList("getAftrekpostenLijst", map);
			}
		} catch (SQLException ex) {
			throw ex;
		}
		return null;
	}	

	public Integer getBelastingKosten(String beginDatum, String eindDatum)
			throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		Map<String,String> map = new HashMap<String,String>();
		map.put("beginDatum", beginDatum);
		map.put("eindDatum", eindDatum);
		try {
			return (Integer) sqlMap.queryForObject("getBelastingKosten", map);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	public Integer getBelastingTeruggave(String beginDatum, String eindDatum)
			throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		Map<String,String> map = new HashMap<String,String>();
		map.put("beginDatum", beginDatum);
		map.put("eindDatum", eindDatum);
		try {
			return (Integer) sqlMap
					.queryForObject("getBelastingTeruggave", map);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	public void updateKost(Kost kost) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			sqlMap.insert("updateKost", kost);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	public Kost getKost(String id) throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		try {
			return (Kost) sqlMap.queryForObject("getKost", id);
		} catch (SQLException ex) {
			throw ex;
		}
	}

	public Kost getKostMetDatumEnBedrag(String datum, String bedrag)
			throws Exception {
		SqlMapClient sqlMap = IbatisUtil.getSqlMapInstance();
		Map<String,String> map = new HashMap<String,String>();
		map.put("datum", datum);
		map.put("bedrag", bedrag);
		try {
			return (Kost) sqlMap.queryForObject("getKostMetDatumEnBedrag", map);
		} catch (SQLException ex) {
			throw ex;
		}
	}

}