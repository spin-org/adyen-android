/*
 * Copyright (c) 2020 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by josephj on 18/12/2020.
 */

package com.adyen.checkout.components.util

import java.util.*

object CountryUtils {

    /**
     * Returns the list of supported countries to display.
     *
     * @param allowedISOCodes the list of ISO codes to filter the countries with. No filtering is done if this param is `null`.
     * @return the list of countries.
     */
    @JvmStatic
    fun getCountries(allowedISOCodes: List<String>? = null): List<CountryInfo> {
        if (allowedISOCodes == null) return countries
        return countries.filter { allowedISOCodes.contains(it.isoCode) }
    }

    /**
     * Returns the localized display name of a country
     *
     * @param isoCode the ISO code of the country.
     * @param locale the locale in which the country name should be localized.
     * @return the localized country name.
     */
    @JvmStatic
    fun getCountryName(isoCode: String, locale: Locale): String {
        val countryLocale = Locale("", isoCode)
        return countryLocale.getDisplayCountry(locale)
    }

    private val countries = listOf(
        CountryInfo(isoCode = "AF", callingCode = "+93", emoji = "🇦🇫"),
        CountryInfo(isoCode = "AL", callingCode = "+355", emoji = "🇦🇱"),
        CountryInfo(isoCode = "DZ", callingCode = "+213", emoji = "🇩🇿"),
        CountryInfo(isoCode = "AS", callingCode = "+1684", emoji = "🇦🇸"),
        CountryInfo(isoCode = "AD", callingCode = "+376", emoji = "🇦🇩"),
        CountryInfo(isoCode = "AO", callingCode = "+244", emoji = "🇦🇴"),
        CountryInfo(isoCode = "AI", callingCode = "+1264", emoji = "🇦🇮"),
        CountryInfo(isoCode = "AG", callingCode = "+1268", emoji = "🇦🇬"),
        CountryInfo(isoCode = "AR", callingCode = "+54", emoji = "🇦🇷"),
        CountryInfo(isoCode = "AM", callingCode = "+374", emoji = "🇦🇲"),
        CountryInfo(isoCode = "AW", callingCode = "+297", emoji = "🇦🇼"),
        CountryInfo(isoCode = "AU", callingCode = "+61", emoji = "🇦🇺"),
        CountryInfo(isoCode = "AT", callingCode = "+43", emoji = "🇦🇹"),
        CountryInfo(isoCode = "AZ", callingCode = "+994", emoji = "🇦🇿"),
        CountryInfo(isoCode = "BS", callingCode = "+1242", emoji = "🇧🇸"),
        CountryInfo(isoCode = "BH", callingCode = "+973", emoji = "🇧🇭"),
        CountryInfo(isoCode = "BD", callingCode = "+880", emoji = "🇧🇩"),
        CountryInfo(isoCode = "BB", callingCode = "+1246", emoji = "🇧🇧"),
        CountryInfo(isoCode = "BY", callingCode = "+375", emoji = "🇧🇾"),
        CountryInfo(isoCode = "BE", callingCode = "+32", emoji = "🇧🇪"),
        CountryInfo(isoCode = "BZ", callingCode = "+501", emoji = "🇧🇿"),
        CountryInfo(isoCode = "BJ", callingCode = "+229", emoji = "🇧🇯"),
        CountryInfo(isoCode = "BM", callingCode = "+1441", emoji = "🇧🇲"),
        CountryInfo(isoCode = "BT", callingCode = "+975", emoji = "🇧🇹"),
        CountryInfo(isoCode = "BA", callingCode = "+387", emoji = "🇧🇦"),
        CountryInfo(isoCode = "BW", callingCode = "+267", emoji = "🇧🇼"),
        CountryInfo(isoCode = "BR", callingCode = "+55", emoji = "🇧🇷"),
        CountryInfo(isoCode = "IO", callingCode = "+246", emoji = "🇮🇴"),
        CountryInfo(isoCode = "BG", callingCode = "+359", emoji = "🇧🇬"),
        CountryInfo(isoCode = "BF", callingCode = "+226", emoji = "🇧🇫"),
        CountryInfo(isoCode = "BI", callingCode = "+257", emoji = "🇧🇮"),
        CountryInfo(isoCode = "KH", callingCode = "+855", emoji = "🇰🇭"),
        CountryInfo(isoCode = "CM", callingCode = "+237", emoji = "🇨🇲"),
        CountryInfo(isoCode = "CA", callingCode = "+1", emoji = "🇨🇦"),
        CountryInfo(isoCode = "CV", callingCode = "+238", emoji = "🇨🇻"),
        CountryInfo(isoCode = "KY", callingCode = "+345", emoji = "🇰🇾"),
        CountryInfo(isoCode = "CF", callingCode = "+236", emoji = "🇨🇫"),
        CountryInfo(isoCode = "TD", callingCode = "+235", emoji = "🇹🇩"),
        CountryInfo(isoCode = "CL", callingCode = "+56", emoji = "🇨🇱"),
        CountryInfo(isoCode = "CN", callingCode = "+86", emoji = "🇨🇳"),
        CountryInfo(isoCode = "CX", callingCode = "+61", emoji = "🇨🇽"),
        CountryInfo(isoCode = "CO", callingCode = "+57", emoji = "🇨🇴"),
        CountryInfo(isoCode = "KM", callingCode = "+269", emoji = "🇰🇲"),
        CountryInfo(isoCode = "CG", callingCode = "+242", emoji = "🇨🇬"),
        CountryInfo(isoCode = "CK", callingCode = "+682", emoji = "🇨🇰"),
        CountryInfo(isoCode = "CR", callingCode = "+506", emoji = "🇨🇷"),
        CountryInfo(isoCode = "HR", callingCode = "+385", emoji = "🇭🇷"),
        CountryInfo(isoCode = "CU", callingCode = "+53", emoji = "🇨🇺"),
        CountryInfo(isoCode = "CY", callingCode = "+537", emoji = "🇨🇾"),
        CountryInfo(isoCode = "CZ", callingCode = "+420", emoji = "🇨🇿"),
        CountryInfo(isoCode = "DK", callingCode = "+45", emoji = "🇩🇰"),
        CountryInfo(isoCode = "DJ", callingCode = "+253", emoji = "🇩🇯"),
        CountryInfo(isoCode = "DM", callingCode = "+1767", emoji = "🇩🇲"),
        CountryInfo(isoCode = "DO", callingCode = "+1849", emoji = "🇩🇴"),
        CountryInfo(isoCode = "EC", callingCode = "+593", emoji = "🇪🇨"),
        CountryInfo(isoCode = "EG", callingCode = "+20", emoji = "🇪🇬"),
        CountryInfo(isoCode = "SV", callingCode = "+503", emoji = "🇸🇻"),
        CountryInfo(isoCode = "GQ", callingCode = "+240", emoji = "🇬🇶"),
        CountryInfo(isoCode = "ER", callingCode = "+291", emoji = "🇪🇷"),
        CountryInfo(isoCode = "EE", callingCode = "+372", emoji = "🇪🇪"),
        CountryInfo(isoCode = "ET", callingCode = "+251", emoji = "🇪🇹"),
        CountryInfo(isoCode = "FO", callingCode = "+298", emoji = "🇫🇴"),
        CountryInfo(isoCode = "FJ", callingCode = "+679", emoji = "🇫🇯"),
        CountryInfo(isoCode = "FI", callingCode = "+358", emoji = "🇫🇮"),
        CountryInfo(isoCode = "FR", callingCode = "+33", emoji = "🇫🇷"),
        CountryInfo(isoCode = "GF", callingCode = "+594", emoji = "🇬🇫"),
        CountryInfo(isoCode = "PF", callingCode = "+689", emoji = "🇵🇫"),
        CountryInfo(isoCode = "GA", callingCode = "+241", emoji = "🇬🇦"),
        CountryInfo(isoCode = "GM", callingCode = "+220", emoji = "🇬🇲"),
        CountryInfo(isoCode = "GE", callingCode = "+995", emoji = "🇬🇪"),
        CountryInfo(isoCode = "DE", callingCode = "+49", emoji = "🇩🇪"),
        CountryInfo(isoCode = "GH", callingCode = "+233", emoji = "🇬🇭"),
        CountryInfo(isoCode = "GI", callingCode = "+350", emoji = "🇬🇮"),
        CountryInfo(isoCode = "GR", callingCode = "+30", emoji = "🇬🇷"),
        CountryInfo(isoCode = "GL", callingCode = "+299", emoji = "🇬🇱"),
        CountryInfo(isoCode = "GD", callingCode = "+1473", emoji = "🇬🇩"),
        CountryInfo(isoCode = "GP", callingCode = "+590", emoji = "🇬🇵"),
        CountryInfo(isoCode = "GU", callingCode = "+1671", emoji = "🇬🇺"),
        CountryInfo(isoCode = "GT", callingCode = "+502", emoji = "🇬🇹"),
        CountryInfo(isoCode = "GN", callingCode = "+224", emoji = "🇬🇳"),
        CountryInfo(isoCode = "GW", callingCode = "+245", emoji = "🇬🇼"),
        CountryInfo(isoCode = "GY", callingCode = "+595", emoji = "🇬🇾"),
        CountryInfo(isoCode = "HT", callingCode = "+509", emoji = "🇭🇹"),
        CountryInfo(isoCode = "HN", callingCode = "+504", emoji = "🇭🇳"),
        CountryInfo(isoCode = "HU", callingCode = "+36", emoji = "🇭🇺"),
        CountryInfo(isoCode = "IS", callingCode = "+354", emoji = "🇮🇸"),
        CountryInfo(isoCode = "IN", callingCode = "+91", emoji = "🇮🇳"),
        CountryInfo(isoCode = "ID", callingCode = "+62", emoji = "🇮🇩"),
        CountryInfo(isoCode = "IQ", callingCode = "+964", emoji = "🇮🇶"),
        CountryInfo(isoCode = "IE", callingCode = "+353", emoji = "🇮🇪"),
        CountryInfo(isoCode = "IL", callingCode = "+972", emoji = "🇮🇱"),
        CountryInfo(isoCode = "IT", callingCode = "+39", emoji = "🇮🇹"),
        CountryInfo(isoCode = "JM", callingCode = "+1876", emoji = "🇯🇲"),
        CountryInfo(isoCode = "JP", callingCode = "+81", emoji = "🇯🇵"),
        CountryInfo(isoCode = "JO", callingCode = "+962", emoji = "🇯🇴"),
        CountryInfo(isoCode = "KZ", callingCode = "+77", emoji = "🇰🇿"),
        CountryInfo(isoCode = "KE", callingCode = "+254", emoji = "🇰🇪"),
        CountryInfo(isoCode = "KI", callingCode = "+686", emoji = "🇰🇮"),
        CountryInfo(isoCode = "KW", callingCode = "+965", emoji = "🇰🇼"),
        CountryInfo(isoCode = "KG", callingCode = "+996", emoji = "🇰🇬"),
        CountryInfo(isoCode = "LV", callingCode = "+371", emoji = "🇱🇻"),
        CountryInfo(isoCode = "LB", callingCode = "+961", emoji = "🇱🇧"),
        CountryInfo(isoCode = "LS", callingCode = "+266", emoji = "🇱🇸"),
        CountryInfo(isoCode = "LR", callingCode = "+231", emoji = "🇱🇷"),
        CountryInfo(isoCode = "LI", callingCode = "+423", emoji = "🇱🇮"),
        CountryInfo(isoCode = "LT", callingCode = "+370", emoji = "🇱🇹"),
        CountryInfo(isoCode = "LU", callingCode = "+352", emoji = "🇱🇺"),
        CountryInfo(isoCode = "MG", callingCode = "+261", emoji = "🇲🇬"),
        CountryInfo(isoCode = "MW", callingCode = "+265", emoji = "🇲🇼"),
        CountryInfo(isoCode = "MY", callingCode = "+60", emoji = "🇲🇾"),
        CountryInfo(isoCode = "MV", callingCode = "+960", emoji = "🇲🇻"),
        CountryInfo(isoCode = "ML", callingCode = "+223", emoji = "🇲🇱"),
        CountryInfo(isoCode = "MT", callingCode = "+356", emoji = "🇲🇹"),
        CountryInfo(isoCode = "MH", callingCode = "+692", emoji = "🇲🇭"),
        CountryInfo(isoCode = "MQ", callingCode = "+596", emoji = "🇲🇶"),
        CountryInfo(isoCode = "MR", callingCode = "+222", emoji = "🇲🇷"),
        CountryInfo(isoCode = "MU", callingCode = "+230", emoji = "🇲🇺"),
        CountryInfo(isoCode = "YT", callingCode = "+262", emoji = "🇾🇹"),
        CountryInfo(isoCode = "MX", callingCode = "+52", emoji = "🇲🇽"),
        CountryInfo(isoCode = "MC", callingCode = "+377", emoji = "🇲🇨"),
        CountryInfo(isoCode = "MN", callingCode = "+976", emoji = "🇲🇳"),
        CountryInfo(isoCode = "ME", callingCode = "+382", emoji = "🇲🇪"),
        CountryInfo(isoCode = "MS", callingCode = "+1664", emoji = "🇲🇸"),
        CountryInfo(isoCode = "MA", callingCode = "+212", emoji = "🇲🇦"),
        CountryInfo(isoCode = "MM", callingCode = "+95", emoji = "🇲🇲"),
        CountryInfo(isoCode = "NA", callingCode = "+264", emoji = "🇳🇦"),
        CountryInfo(isoCode = "NR", callingCode = "+674", emoji = "🇳🇷"),
        CountryInfo(isoCode = "NP", callingCode = "+977", emoji = "🇳🇵"),
        CountryInfo(isoCode = "NL", callingCode = "+31", emoji = "🇳🇱"),
        CountryInfo(isoCode = "AN", callingCode = "+599", emoji = "🇦🇳"),
        CountryInfo(isoCode = "NC", callingCode = "+687", emoji = "🇳🇨"),
        CountryInfo(isoCode = "NZ", callingCode = "+64", emoji = "🇳🇿"),
        CountryInfo(isoCode = "NI", callingCode = "+505", emoji = "🇳🇮"),
        CountryInfo(isoCode = "NE", callingCode = "+227", emoji = "🇳🇪"),
        CountryInfo(isoCode = "NG", callingCode = "+234", emoji = "🇳🇬"),
        CountryInfo(isoCode = "NU", callingCode = "+683", emoji = "🇳🇺"),
        CountryInfo(isoCode = "NF", callingCode = "+672", emoji = "🇳🇫"),
        CountryInfo(isoCode = "MP", callingCode = "+1670", emoji = "🇲🇵"),
        CountryInfo(isoCode = "NO", callingCode = "+47", emoji = "🇳🇴"),
        CountryInfo(isoCode = "OM", callingCode = "+968", emoji = "🇴🇲"),
        CountryInfo(isoCode = "PK", callingCode = "+92", emoji = "🇵🇰"),
        CountryInfo(isoCode = "PW", callingCode = "+680", emoji = "🇵🇼"),
        CountryInfo(isoCode = "PA", callingCode = "+507", emoji = "🇵🇦"),
        CountryInfo(isoCode = "PG", callingCode = "+675", emoji = "🇵🇬"),
        CountryInfo(isoCode = "PY", callingCode = "+595", emoji = "🇵🇾"),
        CountryInfo(isoCode = "PE", callingCode = "+51", emoji = "🇵🇪"),
        CountryInfo(isoCode = "PH", callingCode = "+63", emoji = "🇵🇭"),
        CountryInfo(isoCode = "PL", callingCode = "+48", emoji = "🇵🇱"),
        CountryInfo(isoCode = "PT", callingCode = "+351", emoji = "🇵🇹"),
        CountryInfo(isoCode = "PR", callingCode = "+1939", emoji = "🇵🇷"),
        CountryInfo(isoCode = "QA", callingCode = "+974", emoji = "🇶🇦"),
        CountryInfo(isoCode = "RO", callingCode = "+40", emoji = "🇷🇴"),
        CountryInfo(isoCode = "RW", callingCode = "+250", emoji = "🇷🇼"),
        CountryInfo(isoCode = "WS", callingCode = "+685", emoji = "🇼🇸"),
        CountryInfo(isoCode = "SM", callingCode = "+378", emoji = "🇸🇲"),
        CountryInfo(isoCode = "SA", callingCode = "+966", emoji = "🇸🇦"),
        CountryInfo(isoCode = "SN", callingCode = "+221", emoji = "🇸🇳"),
        CountryInfo(isoCode = "RS", callingCode = "+381", emoji = "🇷🇸"),
        CountryInfo(isoCode = "SC", callingCode = "+248", emoji = "🇸🇨"),
        CountryInfo(isoCode = "SL", callingCode = "+232", emoji = "🇸🇱"),
        CountryInfo(isoCode = "SG", callingCode = "+65", emoji = "🇸🇬"),
        CountryInfo(isoCode = "SK", callingCode = "+421", emoji = "🇸🇰"),
        CountryInfo(isoCode = "SI", callingCode = "+386", emoji = "🇸🇮"),
        CountryInfo(isoCode = "SB", callingCode = "+677", emoji = "🇸🇧"),
        CountryInfo(isoCode = "ZA", callingCode = "+27", emoji = "🇿🇦"),
        CountryInfo(isoCode = "GS", callingCode = "+500", emoji = "🇬🇸"),
        CountryInfo(isoCode = "ES", callingCode = "+34", emoji = "🇪🇸"),
        CountryInfo(isoCode = "LK", callingCode = "+94", emoji = "🇱🇰"),
        CountryInfo(isoCode = "SD", callingCode = "+249", emoji = "🇸🇩"),
        CountryInfo(isoCode = "SR", callingCode = "+597", emoji = "🇸🇷"),
        CountryInfo(isoCode = "SZ", callingCode = "+268", emoji = "🇸🇿"),
        CountryInfo(isoCode = "SE", callingCode = "+46", emoji = "🇸🇪"),
        CountryInfo(isoCode = "CH", callingCode = "+41", emoji = "🇨🇭"),
        CountryInfo(isoCode = "TJ", callingCode = "+992", emoji = "🇹🇯"),
        CountryInfo(isoCode = "TH", callingCode = "+66", emoji = "🇹🇭"),
        CountryInfo(isoCode = "TG", callingCode = "+228", emoji = "🇹🇬"),
        CountryInfo(isoCode = "TK", callingCode = "+690", emoji = "🇹🇰"),
        CountryInfo(isoCode = "TO", callingCode = "+676", emoji = "🇹🇴"),
        CountryInfo(isoCode = "TT", callingCode = "+1868", emoji = "🇹🇹"),
        CountryInfo(isoCode = "TN", callingCode = "+216", emoji = "🇹🇳"),
        CountryInfo(isoCode = "TR", callingCode = "+90", emoji = "🇹🇷"),
        CountryInfo(isoCode = "TM", callingCode = "+993", emoji = "🇹🇲"),
        CountryInfo(isoCode = "TC", callingCode = "+1649", emoji = "🇹🇨"),
        CountryInfo(isoCode = "TV", callingCode = "+688", emoji = "🇹🇻"),
        CountryInfo(isoCode = "UG", callingCode = "+256", emoji = "🇺🇬"),
        CountryInfo(isoCode = "UA", callingCode = "+380", emoji = "🇺🇦"),
        CountryInfo(isoCode = "AE", callingCode = "+971", emoji = "🇦🇪"),
        CountryInfo(isoCode = "GB", callingCode = "+44", emoji = "🇬🇧"),
        CountryInfo(isoCode = "US", callingCode = "+1", emoji = "🇺🇸"),
        CountryInfo(isoCode = "UY", callingCode = "+598", emoji = "🇺🇾"),
        CountryInfo(isoCode = "UZ", callingCode = "+998", emoji = "🇺🇿"),
        CountryInfo(isoCode = "VU", callingCode = "+678", emoji = "🇻🇺"),
        CountryInfo(isoCode = "WF", callingCode = "+681", emoji = "🇼🇫"),
        CountryInfo(isoCode = "YE", callingCode = "+967", emoji = "🇾🇪"),
        CountryInfo(isoCode = "ZM", callingCode = "+260", emoji = "🇿🇲"),
        CountryInfo(isoCode = "ZW", callingCode = "+263", emoji = "🇿🇼"),
        CountryInfo(isoCode = "AX", callingCode = "+358", emoji = "🇦🇽"),
        CountryInfo(isoCode = "AQ", callingCode = "+672", emoji = "🇦🇶"),
        CountryInfo(isoCode = "BO", callingCode = "+591", emoji = "🇧🇴"),
        CountryInfo(isoCode = "BN", callingCode = "+673", emoji = "🇧🇳"),
        CountryInfo(isoCode = "CC", callingCode = "+61", emoji = "🇨🇨"),
        CountryInfo(isoCode = "CD", callingCode = "+243", emoji = "🇨🇩"),
        CountryInfo(isoCode = "CI", callingCode = "+225", emoji = "🇨🇮"),
        CountryInfo(isoCode = "FK", callingCode = "+500", emoji = "🇫🇰"),
        CountryInfo(isoCode = "GG", callingCode = "+44", emoji = "🇬🇬"),
        CountryInfo(isoCode = "VA", callingCode = "+379", emoji = "🇻🇦"),
        CountryInfo(isoCode = "HK", callingCode = "+852", emoji = "🇭🇰"),
        CountryInfo(isoCode = "IR", callingCode = "+98", emoji = "🇮🇷"),
        CountryInfo(isoCode = "IM", callingCode = "+44", emoji = "🇮🇲"),
        CountryInfo(isoCode = "JE", callingCode = "+44", emoji = "🇯🇪"),
        CountryInfo(isoCode = "KP", callingCode = "+850", emoji = "🇰🇵"),
        CountryInfo(isoCode = "KR", callingCode = "+82", emoji = "🇰🇷"),
        CountryInfo(isoCode = "LA", callingCode = "+856", emoji = "🇱🇦"),
        CountryInfo(isoCode = "LY", callingCode = "+218", emoji = "🇱🇾"),
        CountryInfo(isoCode = "MO", callingCode = "+853", emoji = "🇲🇴"),
        CountryInfo(isoCode = "MK", callingCode = "+389", emoji = "🇲🇰"),
        CountryInfo(isoCode = "FM", callingCode = "+691", emoji = "🇫🇲"),
        CountryInfo(isoCode = "MD", callingCode = "+373", emoji = "🇲🇩"),
        CountryInfo(isoCode = "MZ", callingCode = "+258", emoji = "🇲🇿"),
        CountryInfo(isoCode = "PS", callingCode = "+970", emoji = "🇵🇸"),
        CountryInfo(isoCode = "PN", callingCode = "+872", emoji = "🇵🇳"),
        CountryInfo(isoCode = "RE", callingCode = "+262", emoji = "🇷🇪"),
        CountryInfo(isoCode = "RU", callingCode = "+7", emoji = "🇷🇺"),
        CountryInfo(isoCode = "BL", callingCode = "+590", emoji = "🇧🇱"),
        CountryInfo(isoCode = "SH", callingCode = "+290", emoji = "🇸🇭"),
        CountryInfo(isoCode = "KN", callingCode = "+1869", emoji = "🇰🇳"),
        CountryInfo(isoCode = "LC", callingCode = "+1758", emoji = "🇱🇨"),
        CountryInfo(isoCode = "MF", callingCode = "+590", emoji = "🇲🇫"),
        CountryInfo(isoCode = "PM", callingCode = "+508", emoji = "🇵🇲"),
        CountryInfo(isoCode = "VC", callingCode = "+1784", emoji = "🇻🇨"),
        CountryInfo(isoCode = "ST", callingCode = "+239", emoji = "🇸🇹"),
        CountryInfo(isoCode = "SO", callingCode = "+252", emoji = "🇸🇴"),
        CountryInfo(isoCode = "SJ", callingCode = "+47", emoji = "🇸🇯"),
        CountryInfo(isoCode = "SY", callingCode = "+963", emoji = "🇸🇾"),
        CountryInfo(isoCode = "TW", callingCode = "+886", emoji = "🇹🇼"),
        CountryInfo(isoCode = "TZ", callingCode = "+255", emoji = "🇹🇿"),
        CountryInfo(isoCode = "TL", callingCode = "+670", emoji = "🇹🇱"),
        CountryInfo(isoCode = "VE", callingCode = "+58", emoji = "🇻🇪"),
        CountryInfo(isoCode = "VN", callingCode = "+84", emoji = "🇻🇳"),
        CountryInfo(isoCode = "VG", callingCode = "+1284", emoji = "🇻🇬"),
        CountryInfo(isoCode = "VI", callingCode = "+1340", emoji = "🇻🇮")
    )
}

/**
 * Class that holds data about a given country
 */
data class CountryInfo(
    val isoCode: String,
    val callingCode: String,
    val emoji: String
)
