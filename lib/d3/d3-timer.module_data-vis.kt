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

external fun now(): Number

external interface Timer {
    fun restart(callbackFn: (elapsed: Number) -> Unit, delay: Number? = definedExternally /* null */, time: Number? = definedExternally /* null */)
    fun stop()
}

external fun timer(callback: (elapsed: Number) -> Unit, delay: Number? = definedExternally /* null */, time: Number? = definedExternally /* null */): Timer

external fun timerFlush()

external fun timeout(callback: (elapsed: Number) -> Unit, delay: Number? = definedExternally /* null */, time: Number? = definedExternally /* null */): Timer

external fun interval(callback: (elapsed: Number) -> Unit, delay: Number? = definedExternally /* null */, time: Number? = definedExternally /* null */): Timer