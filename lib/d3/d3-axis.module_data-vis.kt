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

external interface AxisTimeInterval {
    fun range(start: Date, stop: Date, step: Number? = definedExternally /* null */): Array<Date>
}

external interface AxisScale<Domain> {
    @nativeInvoke
    operator fun invoke(x: Domain): Number?
    fun domain(): Array<Domain>
    fun range(): Array<Number>
    fun copy(): AxisScale<Domain> /* this */
    val bandwidth: (() -> Number)?
        get() = definedExternally
}

external interface Axis<Domain> {
    @nativeInvoke
    operator fun invoke(context: Selection<SVGSVGElement, Any, Any, Any>)
    @nativeInvoke
    operator fun invoke(context: Selection<SVGGElement, Any, Any, Any>)
    @nativeInvoke
    operator fun invoke(context: TransitionLike<SVGSVGElement, Any>)
    @nativeInvoke
    operator fun invoke(context: TransitionLike<SVGGElement, Any>)
    fun <A : AxisScale<Domain>> scale(): A
    fun scale(scale: AxisScale<Domain>): Axis<Domain> /* this */
    fun ticks(count: Number, specifier: String? = definedExternally /* null */): Axis<Domain> /* this */
    fun ticks(interval: AxisTimeInterval, specifier: String? = definedExternally /* null */): Axis<Domain> /* this */
    fun ticks(arg0: Any, vararg args: Any): Axis<Domain> /* this */
    fun tickArguments(): Array<Any>
    fun tickArguments(args: dynamic /* JsTuple<Number> */): Axis<Domain> /* this */
    fun tickArguments(args: dynamic /* JsTuple<Number, String> */): Axis<Domain> /* this */
    fun tickArguments(args: dynamic /* JsTuple<AxisTimeInterval> */): Axis<Domain> /* this */
    fun tickArguments(args: dynamic /* JsTuple<AxisTimeInterval, String> */): Axis<Domain> /* this */
    fun tickArguments(args: Array<Any>): Axis<Domain> /* this */
    fun tickValues(): Array<Domain>?
    fun tickValues(values: Array<Domain>): Axis<Domain> /* this */
    fun tickValues(values: Nothing?): Axis<Domain> /* this */
    fun tickFormat(): ((domainValue: Domain, index: Number) -> String)?
    fun tickFormat(format: (domainValue: Domain, index: Number) -> String): Axis<Domain> /* this */
    fun tickFormat(format: Nothing?): Axis<Domain> /* this */
    fun tickSize(): Number
    fun tickSize(size: Number): Axis<Domain> /* this */
    fun tickSizeInner(): Number
    fun tickSizeInner(size: Number): Axis<Domain> /* this */
    fun tickSizeOuter(): Number
    fun tickSizeOuter(size: Number): Axis<Domain> /* this */
    fun tickPadding(): Number
    fun tickPadding(padding: Number): Axis<Domain> /* this */
}

external interface `T$0` {
    fun valueOf(): Number
}

external fun <Domain : dynamic> axisTop(scale: AxisScale<Domain>): Axis<Domain>

external fun <Domain : dynamic> axisRight(scale: AxisScale<Domain>): Axis<Domain>

external fun <Domain : dynamic> axisBottom(scale: AxisScale<Domain>): Axis<Domain>

external fun <Domain : dynamic> axisLeft(scale: AxisScale<Domain>): Axis<Domain>