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

typealias DSVRowString<Columns> = Any

typealias DSVRaw<T> = Any

external interface DSVRowAny {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external interface DSVRowArray<Columns : String> : Array<DSVRowString<Columns>> {
    var columns: Array<Columns>
}

external interface DSVParsedArray<T> : Array<T> {
    var columns: Array<Any>
}

external fun <Columns : String> csvParse(csvString: String): DSVRowArray<Columns>

external fun <ParsedRow : Any?, Columns : String> csvParse(csvString: String, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): DSVParsedArray<ParsedRow>

external fun csvParseRows(csvString: String): Array<Array<String>>

external fun <ParsedRow : Any?> csvParseRows(csvString: String, row: (rawRow: Array<String>, index: Number) -> ParsedRow?): Array<ParsedRow>

external fun <T : Any?> csvFormat(rows: Array<T>, columns: Array<Any>? = definedExternally /* null */): String

external fun csvFormatRows(rows: Array<Array<String>>): String

external fun <Columns : String> tsvParse(tsvString: String): DSVRowArray<Columns>

external fun <ParsedRow : Any?, Columns : String> tsvParse(tsvString: String, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): DSVParsedArray<ParsedRow>

external fun tsvParseRows(tsvString: String): Array<Array<String>>

external fun <ParsedRow : Any?> tsvParseRows(tsvString: String, row: (rawRow: Array<String>, index: Number) -> ParsedRow?): Array<ParsedRow>

external fun <T : Any?> tsvFormat(rows: Array<T>, columns: Array<Any>? = definedExternally /* null */): String

external fun tsvFormatRows(rows: Array<Array<String>>): String

external interface DSV {
    fun <Columns : String> parse(dsvString: String): DSVRowArray<Columns>
    fun <ParsedRow : Any?, Columns : String> parse(dsvString: String, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): DSVParsedArray<ParsedRow>
    fun parseRows(dsvString: String): Array<Array<String>>
    fun <ParsedRow : Any?> parseRows(dsvString: String, row: (rawRow: Array<String>, index: Number) -> ParsedRow?): Array<ParsedRow>
    fun <T : Any?> format(rows: Array<T>, columns: Array<Any>? = definedExternally /* null */): String
    fun formatRows(rows: Array<Array<String>>): String
}

external fun dsvFormat(delimiter: String): DSV