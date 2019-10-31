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

external fun blob(url: String, init: RequestInit? = definedExternally /* null */): Promise<Blob>

external fun buffer(url: String, init: RequestInit? = definedExternally /* null */): Promise<ArrayBuffer>

external fun <Columns : String> csv(url: String, init: RequestInit? = definedExternally /* null */): Promise<DSVRowArray<Columns>>

external fun <ParsedRow : Any?, Columns : String> csv(url: String, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): Promise<DSVParsedArray<ParsedRow>>

external fun <ParsedRow : Any?, Columns : String> csv(url: String, init: RequestInit, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): Promise<DSVParsedArray<ParsedRow>>

external fun <Columns : String> dsv(delimiter: String, url: String, init: RequestInit? = definedExternally /* null */): Promise<DSVRowArray<Columns>>

external fun <ParsedRow : Any?, Columns : String> dsv(delimiter: String, url: String, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): Promise<DSVParsedArray<ParsedRow>>

external fun <ParsedRow : Any?, Columns : String> dsv(delimiter: String, url: String, init: RequestInit, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): Promise<DSVParsedArray<ParsedRow>>

external fun html(url: String, init: RequestInit? = definedExternally /* null */): Promise<Document>

external fun image(url: String, init: Partial<HTMLImageElement>? = definedExternally /* null */): Promise<HTMLImageElement>

external fun <ParsedJSONObject : Any> json(url: String, init: RequestInit? = definedExternally /* null */): Promise<ParsedJSONObject>

external fun svg(url: String, init: RequestInit? = definedExternally /* null */): Promise<Document>

external fun text(url: String, init: RequestInit? = definedExternally /* null */): Promise<String>

external fun <Columns : String> tsv(url: String, init: RequestInit? = definedExternally /* null */): Promise<DSVRowArray<Columns>>

external fun <ParsedRow : Any?, Columns : String> tsv(url: String, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): Promise<DSVParsedArray<ParsedRow>>

external fun <ParsedRow : Any?, Columns : String> tsv(url: String, init: RequestInit, row: (rawRow: DSVRowString<Columns>, index: Number, columns: Array<Columns>) -> ParsedRow?): Promise<DSVParsedArray<ParsedRow>>

external fun xml(url: String, init: RequestInit? = definedExternally /* null */): Promise<XMLDocument>