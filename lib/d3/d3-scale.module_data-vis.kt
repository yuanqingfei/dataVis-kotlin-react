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

external interface InterpolatorFactory<T, U> {
    @nativeInvoke
    operator fun invoke(a: T, b: T): (t: Number) -> U
}

external interface `T$0` {
    fun valueOf(): Number
}

external interface ScaleContinuousNumeric<Range, Output> {
    @nativeInvoke
    operator fun invoke(value: Number): Output
    @nativeInvoke
    operator fun invoke(value: `T$0`): Output
    fun invert(value: Number): Number
    fun invert(value: `T$0`): Number
    fun domain(): Array<Number>
    fun domain(domain: Array<dynamic /* Number | `T$0` */>): ScaleContinuousNumeric<Range, Output> /* this */
    fun range(): Array<Range>
    fun range(range: ReadonlyArray<Range>): ScaleContinuousNumeric<Range, Output> /* this */
    fun rangeRound(range: Array<dynamic /* Number | `T$0` */>): ScaleContinuousNumeric<Range, Output> /* this */
    fun clamp(): Boolean
    fun clamp(clamp: Boolean): ScaleContinuousNumeric<Range, Output> /* this */
    fun ticks(count: Number? = definedExternally /* null */): Array<Number>
    fun tickFormat(count: Number? = definedExternally /* null */, specifier: String? = definedExternally /* null */): (d: dynamic /* Number | `T$0` */) -> String
    fun nice(count: Number? = definedExternally /* null */): ScaleContinuousNumeric<Range, Output> /* this */
    fun copy(): ScaleContinuousNumeric<Range, Output> /* this */
}

external interface ScaleLinear<Range, Output> : ScaleContinuousNumeric<Range, Output> {
    fun interpolate(): InterpolatorFactory<Any, Any>
    fun interpolate(interpolate: InterpolatorFactory<Range, Output>): ScaleLinear<Range, Output> /* this */
    fun <NewOutput> interpolate(interpolate: InterpolatorFactory<Range, NewOutput>): ScaleLinear<Range, NewOutput>
}

external fun scaleLinear(): ScaleLinear<Number, Number>

external fun <Output> scaleLinear(): ScaleLinear<Output, Output>

external fun <Range, Output> scaleLinear(): ScaleLinear<Range, Output>

external interface ScalePower<Range, Output> : ScaleContinuousNumeric<Range, Output> {
    fun interpolate(): InterpolatorFactory<Any, Any>
    fun interpolate(interpolate: InterpolatorFactory<Range, Output>): ScalePower<Range, Output> /* this */
    fun <NewOutput> interpolate(interpolate: InterpolatorFactory<Range, NewOutput>): ScalePower<Range, NewOutput>
    fun exponent(): Number
    fun exponent(exponent: Number): ScalePower<Range, Output> /* this */
}

external fun scalePow(): ScalePower<Number, Number>

external fun <Output> scalePow(): ScalePower<Output, Output>

external fun <Range, Output> scalePow(): ScalePower<Range, Output>

external fun scaleSqrt(): ScalePower<Number, Number>

external fun <Output> scaleSqrt(): ScalePower<Output, Output>

external fun <Range, Output> scaleSqrt(): ScalePower<Range, Output>

external interface ScaleLogarithmic<Range, Output> : ScaleContinuousNumeric<Range, Output> {
    override fun domain(): Array<Number>
    override fun domain(domain: Array<dynamic /* Number | `T$0` */>): ScaleLogarithmic<Range, Output> /* this */
    fun interpolate(): InterpolatorFactory<Any, Any>
    fun interpolate(interpolate: InterpolatorFactory<Range, Output>): ScaleLogarithmic<Range, Output> /* this */
    fun <NewOutput> interpolate(interpolate: InterpolatorFactory<Range, NewOutput>): ScaleLogarithmic<Range, NewOutput>
    override fun ticks(count: Number?): Array<Number>
    override fun tickFormat(count: Number?, specifier: String?): (d: dynamic /* Number | `T$0` */) -> String
    fun nice(): ScaleLogarithmic<Range, Output> /* this */
    fun base(): Number
    fun base(base: Number): ScaleLogarithmic<Range, Output> /* this */
}

external fun scaleLog(): ScaleLogarithmic<Number, Number>

external fun <Output> scaleLog(): ScaleLogarithmic<Output, Output>

external fun <Range, Output> scaleLog(): ScaleLogarithmic<Range, Output>

external interface ScaleIdentity {
    @nativeInvoke
    operator fun invoke(value: Number): Number
    @nativeInvoke
    operator fun invoke(value: `T$0`): Number
    fun invert(value: Number): Number
    fun invert(value: `T$0`): Number
    fun domain(): Array<Number>
    fun domain(domain: Array<dynamic /* Number | `T$0` */>): ScaleIdentity /* this */
    fun range(): Array<Number>
    fun range(range: Array<dynamic /* Number | `T$0` */>): ScaleIdentity /* this */
    fun ticks(count: Number? = definedExternally /* null */): Array<Number>
    fun tickFormat(count: Number? = definedExternally /* null */, specifier: String? = definedExternally /* null */): (d: dynamic /* Number | `T$0` */) -> String
    fun nice(count: Number? = definedExternally /* null */): ScaleIdentity /* this */
    fun copy(): ScaleIdentity
}

external fun scaleIdentity(): ScaleIdentity

external interface ScaleTime<Range, Output> {
    @nativeInvoke
    operator fun invoke(value: Date): Output
    @nativeInvoke
    operator fun invoke(value: Number): Output
    @nativeInvoke
    operator fun invoke(value: `T$0`): Output
    fun invert(value: Number): Date
    fun invert(value: `T$0`): Date
    fun domain(): Array<Date>
    fun domain(domain: Array<dynamic /* Date | Number | `T$0` */>): ScaleTime<Range, Output> /* this */
    fun range(): Array<Range>
    fun range(range: ReadonlyArray<Range>): ScaleTime<Range, Output> /* this */
    fun rangeRound(range: Array<dynamic /* Number | `T$0` */>): ScaleTime<Range, Output> /* this */
    fun clamp(): Boolean
    fun clamp(clamp: Boolean): ScaleTime<Range, Output> /* this */
    fun interpolate(): InterpolatorFactory<Any, Any>
    fun interpolate(interpolate: InterpolatorFactory<Range, Output>): ScaleTime<Range, Output> /* this */
    fun <NewOutput> interpolate(interpolate: InterpolatorFactory<Range, NewOutput>): ScaleTime<Range, NewOutput>
    fun ticks(): Array<Date>
    fun ticks(count: Number): Array<Date>
    fun ticks(interval: TimeInterval): Array<Date>
    fun tickFormat(): (d: Date) -> String
    fun tickFormat(count: Number, specifier: String? = definedExternally /* null */): (d: Date) -> String
    fun tickFormat(interval: TimeInterval, specifier: String? = definedExternally /* null */): (d: Date) -> String
    fun nice(): ScaleTime<Range, Output> /* this */
    fun nice(count: Number): ScaleTime<Range, Output> /* this */
    fun nice(interval: CountableTimeInterval, step: Number? = definedExternally /* null */): ScaleTime<Range, Output> /* this */
    fun copy(): ScaleTime<Range, Output> /* this */
}

external fun scaleTime(): ScaleTime<Number, Number>

external fun <Output> scaleTime(): ScaleTime<Output, Output>

external fun <Range, Output> scaleTime(): ScaleTime<Range, Output>

external fun scaleUtc(): ScaleTime<Number, Number>

external fun <Output> scaleUtc(): ScaleTime<Output, Output>

external fun <Range, Output> scaleUtc(): ScaleTime<Range, Output>

external interface ScaleSequential<Output> {
    @nativeInvoke
    operator fun invoke(value: Number): Output
    @nativeInvoke
    operator fun invoke(value: `T$0`): Output
    fun domain(): dynamic /* JsTuple<Number, Number> */
    fun domain(domain: dynamic /* JsTuple<dynamic, dynamic> */): ScaleSequential<Output> /* this */
    fun clamp(): Boolean
    fun clamp(clamp: Boolean): ScaleSequential<Output> /* this */
    fun interpolator(): (t: Number) -> Output
    fun interpolator(interpolator: (t: Number) -> Output): ScaleSequential<Output> /* this */
    fun <NewOutput> interpolator(interpolator: (t: Number) -> NewOutput): ScaleSequential<NewOutput>
    fun copy(): ScaleSequential<Output>
}

external fun <Output> scaleSequential(interpolator: (t: Number) -> Output): ScaleSequential<Output>

external interface ScaleDiverging<Output> {
    @nativeInvoke
    operator fun invoke(value: Number): Output
    @nativeInvoke
    operator fun invoke(value: `T$0`): Output
    fun domain(): dynamic /* JsTuple<Number, Number, Number> */
    fun domain(domain: dynamic /* JsTuple<dynamic, dynamic, dynamic> */): ScaleDiverging<Output> /* this */
    fun clamp(): Boolean
    fun clamp(clamp: Boolean): ScaleDiverging<Output> /* this */
    fun interpolator(): (t: Number) -> Output
    fun interpolator(interpolator: ((t: Number) -> Output)? = definedExternally /* null */): ScaleDiverging<Output> /* this */
    fun copy(): ScaleDiverging<Output> /* this */
}

external fun <T> scaleDiverging(interpolator: (t: Number) -> T): ScaleDiverging<T>

external interface ScaleQuantize<Range> {
    @nativeInvoke
    operator fun invoke(value: Number): Range
    @nativeInvoke
    operator fun invoke(value: `T$0`): Range
    fun invertExtent(value: Range): dynamic /* JsTuple<Number, Number> */
    fun domain(): dynamic /* JsTuple<Number, Number> */
    fun domain(domain: dynamic /* JsTuple<dynamic, dynamic> */): ScaleQuantize<Range> /* this */
    fun range(): Array<Range>
    fun range(range: ReadonlyArray<Range>): ScaleQuantize<Range> /* this */
    fun ticks(count: Number? = definedExternally /* null */): Array<Number>
    fun tickFormat(count: Number? = definedExternally /* null */, specifier: String? = definedExternally /* null */): (d: dynamic /* Number | `T$0` */) -> String
    fun nice(count: Number? = definedExternally /* null */): ScaleQuantize<Range> /* this */
    fun copy(): ScaleQuantize<Range> /* this */
}

external fun scaleQuantize(): ScaleQuantize<Number>

external fun <Range> scaleQuantize(): ScaleQuantize<Range>

external interface ScaleQuantile<Range> {
    @nativeInvoke
    operator fun invoke(value: Number): Range
    @nativeInvoke
    operator fun invoke(value: `T$0`): Range
    fun invertExtent(value: Range): dynamic /* JsTuple<Number, Number> */
    fun domain(): Array<Number>
    fun domain(domain: Array<dynamic /* Number | `T$0` | Nothing? | Nothing? */>): ScaleQuantile<Range> /* this */
    fun range(): Array<Range>
    fun range(range: ReadonlyArray<Range>): ScaleQuantile<Range> /* this */
    fun quantiles(): Array<Number>
    fun copy(): ScaleQuantile<Range> /* this */
}

external fun scaleQuantile(): ScaleQuantile<Number>

external fun <Range> scaleQuantile(): ScaleQuantile<Range>

external interface ScaleThreshold<Domain : dynamic, Range> {
    @nativeInvoke
    operator fun invoke(value: Domain): Range
    fun invertExtent(value: Range): dynamic /* JsTuple<Domain?, Domain?> */
    fun domain(): Array<Domain>
    fun domain(domain: ReadonlyArray<Domain>): ScaleThreshold<Domain<dynamic /* Number | String | Date */>, Range> /* this */
    fun range(): Array<Range>
    fun range(range: ReadonlyArray<Range>): ScaleThreshold<Domain<dynamic /* Number | String | Date */>, Range> /* this */
    fun copy(): ScaleThreshold<Domain<dynamic /* Number | String | Date */>, Range> /* this */
}

external fun scaleThreshold(): ScaleThreshold<Number, Number>

external fun <Domain : dynamic, Range> scaleThreshold(): ScaleThreshold<Domain, Range>

external interface `T$1` {
    override fun toString(): String
}

external interface `T$2` {
    var name: String /* 'implicit' */
}

external interface ScaleOrdinal<Domain : `T$1`, Range> {
    @nativeInvoke
    operator fun invoke(x: Domain): Range
    fun domain(): Array<Domain>
    fun domain(domain: ReadonlyArray<Domain>): ScaleOrdinal<Domain<`T$1`>, Range> /* this */
    fun range(): Array<Range>
    fun range(range: ReadonlyArray<Range>): ScaleOrdinal<Domain<`T$1`>, Range> /* this */
    fun unknown(): dynamic /* Range | `T$2` */
    fun unknown(value: Range): ScaleOrdinal<Domain<`T$1`>, Range> /* this */
    fun unknown(value: `T$2`): ScaleOrdinal<Domain<`T$1`>, Range> /* this */
    fun copy(): ScaleOrdinal<Domain<`T$1`>, Range> /* this */
}

external fun <Range> scaleOrdinal(range: ReadonlyArray<Range>? = definedExternally /* null */): ScaleOrdinal<String, Range>

external fun <Domain : `T$1`, Range> scaleOrdinal(range: ReadonlyArray<Range>? = definedExternally /* null */): ScaleOrdinal<Domain, Range>

external object scaleImplicit {
    var name: dynamic
}

external interface ScaleBand<Domain : `T$1`> {
    @nativeInvoke
    operator fun invoke(x: Domain): Number?
    fun domain(): Array<Domain>
    fun domain(domain: ReadonlyArray<Domain>): ScaleBand<Domain<`T$1`>> /* this */
    fun range(): dynamic /* JsTuple<Number, Number> */
    fun range(range: dynamic /* JsTuple<dynamic, dynamic> */): ScaleBand<Domain<`T$1`>> /* this */
    fun rangeRound(range: dynamic /* JsTuple<dynamic, dynamic> */): ScaleBand<Domain<`T$1`>> /* this */
    fun round(): Boolean
    fun round(round: Boolean): ScaleBand<Domain<`T$1`>> /* this */
    fun paddingInner(): Number
    fun paddingInner(padding: Number): ScaleBand<Domain<`T$1`>> /* this */
    fun paddingOuter(): Number
    fun paddingOuter(padding: Number): ScaleBand<Domain<`T$1`>> /* this */
    fun padding(): Number
    fun padding(padding: Number): ScaleBand<Domain<`T$1`>> /* this */
    fun align(): Number
    fun align(align: Number): ScaleBand<Domain<`T$1`>> /* this */
    fun bandwidth(): Number
    fun step(): Number
    fun copy(): ScaleBand<Domain<`T$1`>> /* this */
}

external fun scaleBand(): ScaleBand<String>

external fun <Domain : `T$1`> scaleBand(): ScaleBand<Domain>

external interface ScalePoint<Domain : `T$1`> {
    @nativeInvoke
    operator fun invoke(x: Domain): Number?
    fun domain(): Array<Domain>
    fun domain(domain: ReadonlyArray<Domain>): ScalePoint<Domain<`T$1`>> /* this */
    fun range(): dynamic /* JsTuple<Number, Number> */
    fun range(range: dynamic /* JsTuple<dynamic, dynamic> */): ScalePoint<Domain<`T$1`>> /* this */
    fun rangeRound(range: dynamic /* JsTuple<dynamic, dynamic> */): ScalePoint<Domain<`T$1`>> /* this */
    fun round(): Boolean
    fun round(round: Boolean): ScalePoint<Domain<`T$1`>> /* this */
    fun padding(): Number
    fun padding(padding: Number): ScalePoint<Domain<`T$1`>> /* this */
    fun align(): Number
    fun align(align: Number): ScalePoint<Domain<`T$1`>> /* this */
    fun bandwidth(): Number
    fun step(): Number
    fun copy(): ScalePoint<Domain<`T$1`>> /* this */
}

external fun scalePoint(): ScalePoint<String>

external fun <Domain : `T$1`> scalePoint(): ScalePoint<Domain>

external fun <Range> scaleOrdinal(): ScaleOrdinal<String, Range>