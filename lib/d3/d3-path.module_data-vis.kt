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

external interface Path {
    fun moveTo(x: Number, y: Number)
    fun closePath()
    fun lineTo(x: Number, y: Number)
    fun quadraticCurveTo(cpx: Number, cpy: Number, x: Number, y: Number)
    fun bezierCurveTo(cpx1: Number, cpy1: Number, cpx2: Number, cpy2: Number, x: Number, y: Number)
    fun arcTo(x1: Number, y1: Number, x2: Number, y2: Number, radius: Number)
    fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */)
    fun rect(x: Number, y: Number, w: Number, h: Number)
    override fun toString(): String
}

external fun path(): Path