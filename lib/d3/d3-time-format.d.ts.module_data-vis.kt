@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface TimeLocaleDefinition {
    var dateTime: String
    var date: String
    var time: String
    var periods: dynamic /* JsTuple<String, String> */
    var days: dynamic /* JsTuple<String, String, String, String, String, String, String> */
    var shortDays: dynamic /* JsTuple<String, String, String, String, String, String, String> */
    var months: dynamic /* JsTuple<String, String, String, String, String, String, String, String, String, String, String, String> */
    var shortMonths: dynamic /* JsTuple<String, String, String, String, String, String, String, String, String, String, String, String> */
}

external interface TimeLocaleObject {
    fun format(specifier: String): (date: Date) -> String
    fun parse(specifier: String): (dateString: String) -> Date?
    fun utcFormat(specifier: String): (date: Date) -> String
    fun utcParse(specifier: String): (dateString: String) -> Date?
}

external fun timeFormatLocale(timeLocale: TimeLocaleDefinition): TimeLocaleObject

external fun timeFormatDefaultLocale(defaultTimeLocale: TimeLocaleDefinition): TimeLocaleObject

external fun timeFormat(specifier: String): (date: Date) -> String

external fun timeParse(specifier: String): (dateString: String) -> Date?

external fun utcFormat(specifier: String): (date: Date) -> String

external fun utcParse(specifier: String): (dateString: String) -> Date?

external fun isoFormat(date: Date): String

external fun isoParse(dateString: String): Date?