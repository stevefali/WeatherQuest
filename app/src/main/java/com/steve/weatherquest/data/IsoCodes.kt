package com.steve.weatherquest.data

import com.steve.weatherquest.models.Pl


/**
 * Class for fetching the corresponding two-letter ISO 3166 country code from the
 * three-letter one.
 */
class IsoCodes {
    /**
     * List of 2-letter Iso country codes paired with their 3-letter ones.
     */
    val isoList = listOf<Pl>(
        Pl("AFG", "AF"),
        Pl("ALA", "AX"),
        Pl("ALB", "AL"),
        Pl("DZA", "DZ"),
        Pl("ASM", "AS"),
        Pl("AND", "AD"),
        Pl("AGO", "AO"),
        Pl("AIA", "AI"),
        Pl("ATA", "AQ"),
        Pl("ATG", "AG"),
        Pl("ARG", "AR"),
        Pl("ARM", "AM"),
        Pl("ABW", "AW"),
        Pl("AUS", "AU"),
        Pl("AUT", "AT"),
        Pl("AZE", "AZ"),
        Pl("BHS", "BS"),
        Pl("BHR", "BH"),
        Pl("BGD", "BD"),
        Pl("BRB", "BB"),
        Pl("BLR", "BY"),
        Pl("BEL", "BE"),
        Pl("BLZ", "BZ"),
        Pl("BEN", "BJ"),
        Pl("BMU", "BM"),
        Pl("BTN", "BT"),
        Pl("BOL", "BO"),
        Pl("BES", "BQ"),
        Pl("BIH", "BA"),
        Pl("BWA", "BW"),
        Pl("BVT", "BV"),
        Pl("BRA", "BR"),
        Pl("IOT", "IO"),
        Pl("BRN", "BN"),
        Pl("BGR", "BG"),
        Pl("BFA", "BF"),
        Pl("BDI", "BI"),
        Pl("CPV", "CV"),
        Pl("KHM", "KH"),
        Pl("CMR", "CM"),
        Pl("CAN", "CA"),
        Pl("CYM", "KY"),
        Pl("CAF", "CF"),
        Pl("TCD", "TD"),
        Pl("CHL", "CL"),
        Pl("CHN", "CN"),
        Pl("CXR", "CX"),
        Pl("CCK", "CC"),
        Pl("COL", "CO"),
        Pl("COM", "KM"),
        Pl("COG", "CG"),
        Pl("COD", "CD"),
        Pl("COK", "CK"),
        Pl("CRI", "CR"),
        Pl("CIV", "CI"),
        Pl("HRV", "HR"),
        Pl("CUB", "CU"),
        Pl("CUW", "CW"),
        Pl("CYP", "CY"),
        Pl("CZE", "CZ"),
        Pl("DNK", "DK"),
        Pl("DJI", "DJ"),
        Pl("DMA", "DM"),
        Pl("DOM", "DO"),
        Pl("ECU", "EC"),
        Pl("EGY", "EG"),
        Pl("SLV", "SV"),
        Pl("GNQ", "GQ"),
        Pl("ERI", "ER"),
        Pl("EST", "EE"),
        Pl("SWZ", "SZ"),
        Pl("ETH", "ET"),
        Pl("FLK", "FK"),
        Pl("FRO", "FO"),
        Pl("FJI", "FJ"),
        Pl("FIN", "FI"),
        Pl("FRA", "FR"),
        Pl("GUF", "GF"),
        Pl("PYF", "PF"),
        Pl("ATF", "TF"),
        Pl("GAB", "GA"),
        Pl("GMB", "GM"),
        Pl("GEO", "GE"),
        Pl("DEU", "DE"),
        Pl("GHA", "GH"),
        Pl("GIB", "GI"),
        Pl("GRC", "GR"),
        Pl("GRL", "GL"),
        Pl("GRD", "GD"),
        Pl("GLP", "GP"),
        Pl("GUM", "GU"),
        Pl("GTM", "GT"),
        Pl("GGY", "GG"),
        Pl("GIN", "GN"),
        Pl("GNB", "GW"),
        Pl("GUY", "GY"),
        Pl("HTI", "HT"),
        Pl("HMD", "HM"),
        Pl("VAT", "VA"),
        Pl("HND", "HN"),
        Pl("HKG", "HK"),
        Pl("HUN", "HU"),
        Pl("ISL", "IS"),
        Pl("IND", "IN"),
        Pl("IDN", "ID"),
        Pl("IRN", "IR"),
        Pl("IRQ", "IQ"),
        Pl("IRL", "IE"),
        Pl("IMN", "IM"),
        Pl("ISR", "IL"),
        Pl("ITA", "IT"),
        Pl("JAM", "JM"),
        Pl("JPN", "JP"),
        Pl("JEY", "JE"),
        Pl("JOR", "JO"),
        Pl("KAZ", "KZ"),
        Pl("KEN", "KE"),
        Pl("KIR", "KI"),
        Pl("PRK", "KP"),
        Pl("KOR", "KR"),
        Pl("KWT", "KW"),
        Pl("KGZ", "KG"),
        Pl("LAO", "LA"),
        Pl("LVA", "LV"),
        Pl("LBN", "LB"),
        Pl("LSO", "LS"),
        Pl("LBR", "LR"),
        Pl("LBY", "LY"),
        Pl("LIE", "LI"),
        Pl("LTU", "LT"),
        Pl("LUX", "LU"),
        Pl("MAC", "MO"),
        Pl("MDG", "MG"),
        Pl("MWI", "MW"),
        Pl("MYS", "MY"),
        Pl("MDV", "MV"),
        Pl("MLI", "ML"),
        Pl("MLT", "MT"),
        Pl("MHL", "MH"),
        Pl("MTQ", "MQ"),
        Pl("MRT", "MR"),
        Pl("MUS", "MU"),
        Pl("MYT", "YT"),
        Pl("MEX", "MX"),
        Pl("FSM", "FM"),
        Pl("MDA", "MD"),
        Pl("MCO", "MC"),
        Pl("MNG", "MN"),
        Pl("MNE", "ME"),
        Pl("MSR", "MS"),
        Pl("MAR", "MA"),
        Pl("MOZ", "MZ"),
        Pl("MMR", "MM"),
        Pl("NAM", "NA"),
        Pl("NRU", "NR"),
        Pl("NPL", "NP"),
        Pl("NLD", "NL"),
        Pl("NCL", "NC"),
        Pl("NZL", "NZ"),
        Pl("NIC", "NI"),
        Pl("NER", "NE"),
        Pl("NGA", "NG"),
        Pl("NIU", "NU"),
        Pl("NFK", "NF"),
        Pl("MKD", "MK"),
        Pl("MNP", "MP"),
        Pl("NOR", "NO"),
        Pl("OMN", "OM"),
        Pl("PAK", "PK"),
        Pl("PLW", "PW"),
        Pl("PSE", "PS"),
        Pl("PAN", "PA"),
        Pl("PNG", "PG"),
        Pl("PRY", "PY"),
        Pl("PER", "PE"),
        Pl("PHL", "PH"),
        Pl("PCN", "PN"),
        Pl("POL", "PL"),
        Pl("PRT", "PT"),
        Pl("PRI", "PR"),
        Pl("QAT", "QA"),
        Pl("REU", "RE"),
        Pl("ROU", "RO"),
        Pl("RUS", "RU"),
        Pl("RWA", "RW"),
        Pl("BLM", "BL"),
        Pl("SHN", "SH"),
        Pl("KNA", "KN"),
        Pl("LCA", "LC"),
        Pl("MAF", "MF"),
        Pl("SPM", "PM"),
        Pl("VCT", "VC"),
        Pl("WSM", "WS"),
        Pl("SMR", "SM"),
        Pl("STP", "ST"),
        Pl("SAU", "SA"),
        Pl("SEN", "SN"),
        Pl("SRB", "RS"),
        Pl("SYC", "SC"),
        Pl("SLE", "SL"),
        Pl("SGP", "SG"),
        Pl("SXM", "SX"),
        Pl("SVK", "SK"),
        Pl("SVN", "SI"),
        Pl("SLB", "SB"),
        Pl("SOM", "SO"),
        Pl("ZAF", "ZA"),
        Pl("SGS", "GS"),
        Pl("SSD", "SS"),
        Pl("ESP", "ES"),
        Pl("LKA", "LK"),
        Pl("SDN", "SD"),
        Pl("SUR", "SR"),
        Pl("SJM", "SJ"),
        Pl("SWE", "SE"),
        Pl("CHE", "CH"),
        Pl("SYR", "SY"),
        Pl("TWN", "TW"),
        Pl("TJK", "TJ"),
        Pl("TZA", "TZ"),
        Pl("THA", "TH"),
        Pl("TLS", "TL"),
        Pl("TGO", "TG"),
        Pl("TKL", "TK"),
        Pl("TON", "TO"),
        Pl("TTO", "TT"),
        Pl("TUN", "TN"),
        Pl("TUR", "TR"),
        Pl("TKM", "TM"),
        Pl("TCA", "TC"),
        Pl("TUV", "TV"),
        Pl("UGA", "UG"),
        Pl("UKR", "UA"),
        Pl("ARE", "AE"),
        Pl("GBR", "GB"),
        Pl("USA", "US"),
        Pl("UMI", "UM"),
        Pl("URY", "UY"),
        Pl("UZB", "UZ"),
        Pl("VUT", "VU"),
        Pl("VEN", "VE"),
        Pl("VNM", "VN"),
        Pl("VGB", "VG"),
        Pl("VIR", "VI"),
        Pl("WLF", "WF"),
        Pl("ESH", "EH"),
        Pl("YEM", "YE"),
        Pl("ZMB", "ZM"),
        Pl("ZWE", "ZW"),
    )

    /**
     * Return the two-letter country code for the given three-letter code
     */
    fun convertThreeToTwoLetter(three: String): String? {
        val queriedCountry = isoList.find { it.three == three }
        return queriedCountry?.two
    }
}