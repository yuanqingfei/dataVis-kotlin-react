@file:JsModule("d3-selection")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package d3_selection

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

external interface Selection<GElement : BaseType, Datum, PElement : BaseType, PDatum> {
    fun interrupt(name: String? = definedExternally /* null */): Transition<GElement, Datum, PElement, PDatum>
    fun transition(name: String? = definedExternally /* null */): Transition<GElement, Datum, PElement, PDatum>
    fun transition(transition: Transition<BaseType, Any, Any, Any>): Transition<GElement, Datum, PElement, PDatum>
}