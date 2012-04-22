<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<h4 class="section">Release Notes</h4>
<div style="width:600">
<h4>1.9 (upcoming)</h4>
<p>
Changes:
</p>
<ul>
<li>Improved global error handling.</li>
<li>Added translations for the following languages: Portuguese (Brazilian), Spanish, French, Greek.</li>
<li>Added administratitive splitting (Administratief splitsen) of costs. Administrative splitting is automatically done
during the import of settlement (bedrijfsruimte) costs.</li>
<li>Extended settlement (bedrijfsruimte) administration. You can enter the square meters for private and business use of a settlement.</li>
<li>Don't use repurchases in profit calculation.</li>
<li>Added cost deduction for private car usage.</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Fixed vat calculation during cost import.</li>
<li>Fixed bookvalue calculation for machinery.</li>
<li>Fixed double-check of current account balance.</li>
</ul>
<h4>1.8 (2012-03-24) - The "Inkomsten Belasting 2011" release</h4>
<p>This release can be used for the Dutch income tax declaration for 2011.</p>
<p>
Changes:
</p>
<ul>
<li>Added settlement (bedrijfsruimte) administration.</li>
<li>Added balance types VAT_TO_BE_PAID (Schuld omzetbelasting) and INVOCES_TO_BE_PAID (Vorderingen op handelsdebiteuren).</li>
<li>Added private deposits (priv&eacute;stortingen).</li>
<li>Added enterprise capital in fiscal overview.</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Added check for machinery in fiscal overview.</li>
<li>Fixed encryption issue with deductable cost.</li>
<li>Fixed setting latest onlinetime.</li>
<li>Fixed updating of bookvalues.</li>
<li>Fixed fiscal overview for first year.</li>
<li>Corrected private withdrawal with enterprise capital.</li>
</ul>
<h4>1.7 (2012-01-28)</h4>
<p>
Changes:
</p>
<ul>
<li>Added costtype costtype.repurchase (inkoop).</li>
<li>Added balance types STOCK (Voorraad) and OFFICE (Bedrijfsruimte).</li>
<li>Added bookvalue overview.</li>
<li>Added bar chart and pie chart (using JFreeChart).</li>
<li>Improved depreciation.</li>
<li>Added account type PRIVATE_SAVINGS.</li>
<li>Adjusted MAXIMALE_FOR for 2011.</li>
<li>Added interest from business savings (Renteopbrengsten van banktegoeden) in fiscal overview.</li>
<li>Fiscal overview is now stored in the session.</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Fixed calculation of withdrawal private usage business car in fiscal overview.</li>
<li>Fixed encryption issue with account balance entry.</li>
</ul>
<p>
<h4>1.6.2 (2011-12-27)</h4>
<p>
Changes:
</p>
<ul>
<li>Improved cost matching for tax costs.</li>
<li>Improved depreciation.</li>
<li>Removed techytax property depreciation.terms</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Fixed encryption issue with manual cost entry.</li>
</ul>
<p>
<h4>1.6.1 (2011-12-11)</h4>
<p>
Changes:
</p>
<ul>
<li>Improved depreciation.</li>
<li>Improved logon.</li>
<li>Fixed matching VAT costs.</li>
<li>Case-insensitive cost matching.</li>
<li>Use investment cost in double check calculation for current account.</li>
</ul>
<h4>1.6 (2011-12-06)</h4>
<p>
Added features:
</p>
<ul>
<li>Added search option in the cost overview.</li>
<li>Added Kleinschaligheidsinvesteringsaftrek in the fiscal overview.</li>
<li>Loading data depending on account type.</li>
<li>Calculating the actual account balance in the cost overview report for current account.</li>
<li>Added more calculations in the cost overview report for current account for double-checking the balance.</li>
<li>Added new costtypes: costtype.saving.in, costtype.saving.out, costtype.private.in, costtype.private.out.</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Fixed investment overview.</li>
<li>Fixed updating costtype.</li>
</ul>
<p>
Maintenance:
</p>
<ul>
<li>Removed unused costtypes: costtype.pension.reservation and costtype.debt.interest</li>
</ul>
<p>
<h4>1.5 (2011-11-16)</h4>
<p>
Added features:
</p>
<ul>
<li>Multiple users can use the application.</li>
<li>Added techytax property html.extra for extra messages on the welcome screen.</li>
<li>Costs can be matched with cost types using private match strings.</li>
</ul>
<p>
Security changes:
</p>
<ul>
<li>Replaced container managed security with application managed security.</li>
<li>Restricted access for guest user.</li>
<li>Encrypted all sensitive data in database.</li>
<li>SHA encryption of the password by jQuery.</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Bugfix for TaxCodeHelper.</li>
<li>Fixed bug in cost entry.</li>
<li>Fixed display of cost types after update cost action.</li>
</ul>
<p>
Maintenance:
</p>
<ul>
<li>Adjusted FOOD_TAXFREE_PERCENTAGE to 73.5%</li>
<li>Removed unused costtype: costtype.business.car.non.deductible</li>
</ul>
<p>
Database changes:
</p>
<ul>
<li>New tables: user, kostmatch_private, btwmatch_private</li>
<li>Multi user changes</li>
<li>Removed crediteur_id column in kosten table</li>
</ul>
<h4>1.4 (2011-07-23)</h4>
<p>
Added features:
</p>
<ul>
<li>Added export option for audit file: XAF 3.1.</li>
<li>Added costtypes for paid and sent invoices.</li>
<li>Added Profijtrekening to balance calculation.</li>
</ul>
<h4>1.3 (2011-06-15)</h4>
<p>
Added features:
</p>
<ul>
<li>Added prepaid tax to fiscal overview.</li>
<li>Added tax list to overview.</li>
<li>Added Dutch taxcode converter.</li>
<li>Read depreciation terms from properties file (depreciation.terms).</li>
</ul>
<p>
Bugfixes:
</p>
<ul>
<li>Fixed private withdrawal calculation.</li>
<li>Fixed sending VAT email.</li>
<li>Fixed calculation of balance current account.</li>
</ul>
<h4>1.2.1 (2009-07-19)</h4>
<p>
Added feature:
</p>
<ul>
<li>Admin users can e-mail a Dutch VAT report, based on AangifteOB2006v2.0.xsd</li>
</ul>
<h4>1.2 (2009-06-19)</h4>
<p>
Added features:
</p>
<ul>
<li>VAT corrections for depreciations.</li>
<li>VAT corrections for private usage of a business car.</li>
<li>Monthly expenses are displayed in the private cost overview.</li>
<li>Admin users can change the database connection.</li>
</ul>
<p>
New cost types:
</p>
<ul>
<li>VAT return, incoming on other account</li>
<li>VAT correction of depreciation</li>
<li>business car private usage, VAT correction</li>
<li>business car, non-deductable</li>
</ul>
<h4>1.1 (2009-06-14)</h4>
<p>
Added features:
</p>
<ul>
<li>User guide with Use Case scenario's.</li>
<li>Load data from private accounts.</li>
<li>Private cost overview.</li>
<li>Cost type: interest.</li>
<li>Account maintenance.</li>
</ul>
<p>
Database changes:
</p>
<ul>
<li>New table: private_expenses</li>
<li>New table: accounts</li>
<li>New table: account_balance</li>
</ul>
<h4>1.0 (2009-04-23)</h4>
<p>
First release.
</p>
</div>
