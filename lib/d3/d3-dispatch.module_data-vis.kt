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

external interface Dispatch<T : EventTarget> {
    fun apply(type: String, that: T? = definedExternally /* null */, args: Array<Any>? = definedExternally /* null */)
    fun call(type: String, that: T? = definedExternally /* null */, vararg args: Any)
    fun copy(): Dispatch<T>
    fun on(typenames: String): ((this: T, args: Any) -> Unit)?
    fun on(typenames: String, callback: Nothing?): Dispatch<T<EventTarget>> /* this */
    fun on(typenames: String, callback: (this: T, args: Array<Any>) -> Unit): Dispatch<T<EventTarget>> /* this */
}

external fun <T : EventTarget> dispatch(vararg types: String): Dispatch<T>