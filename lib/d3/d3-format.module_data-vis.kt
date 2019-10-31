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

external interface FormatLocaleDefinition {
    var decimal: String
    var thousands: String
    var grouping: Array<Number>
    var currency: dynamic /* JsTuple<String, String> */
    var numerals: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var percent: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    fun valueOf(): Number
}

external interface FormatLocaleObject {
    fun format(specifier: String): (n: dynamic /* Number | `T$0` */) -> String
    fun formatPrefix(specifier: String, value: Number): (n: dynamic /* Number | `T$0` */) -> String
}

external interface FormatSpecifier {
    var fill: String
    var align: dynamic /* '>' | '<' | '^' | '=' */
    var sign: dynamic /* '-' | '+' | '(' | ' ' */
    var symbol: dynamic /* '$' | '#' | '' */
    var zero: Boolean
    var width: Number?
    var comma: Boolean
    var precision: Number?
    var trim: Boolean
    var type: dynamic /* 'e' | 'f' | 'g' | 'r' | 's' | '%' | 'p' | 'b' | 'o' | 'd' | 'x' | 'X' | 'c' | '' | 'n' */
    override fun toString(): String
}

external fun formatLocale(locale: FormatLocaleDefinition): FormatLocaleObject

external fun formatDefaultLocale(defaultLocale: FormatLocaleDefinition): FormatLocaleObject

external fun format(specifier: String): (n: dynamic /* Number | `T$0` */) -> String

external fun formatPrefix(specifier: String, value: Number): (n: dynamic /* Number | `T$0` */) -> String

external fun formatSpecifier(specifier: String): FormatSpecifier

external fun precisionFixed(step: Number): Number

external fun precisionPrefix(step: Number, value: Number): Number

external fun precisionRound(step: Number, max: Number): Number