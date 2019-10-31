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

external interface ZoomInterpolator : Function {
    @nativeInvoke
    operator fun invoke(t: Number): ZoomView
    var duration: Number
}

external interface ColorGammaInterpolationFactory : Function {
    @nativeInvoke
    operator fun invoke(a: String, b: String): (t: Number) -> String
    @nativeInvoke
    operator fun invoke(a: String, b: ColorCommonInstance): (t: Number) -> String
    @nativeInvoke
    operator fun invoke(a: ColorCommonInstance, b: String): (t: Number) -> String
    @nativeInvoke
    operator fun invoke(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String
    fun gamma(g: Number): ColorGammaInterpolationFactory
}

external fun interpolate(a: Any, b: Nothing?): (t: Number) -> Nothing?

external fun interpolate(a: Any, b: Boolean): (t: Number) -> Boolean

external interface `T$0` {
    fun valueOf(): Number
}

external fun interpolate(a: Number, b: Number): (t: Number) -> Number

external fun interpolate(a: `T$0`, b: Number): (t: Number) -> Number

external fun interpolate(a: String, b: ColorCommonInstance): (t: Number) -> String

external fun interpolate(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String

external fun interpolate(a: Date, b: Date): (t: Number) -> Date

external interface `T$1` {
    override fun toString(): String
}

external fun interpolate(a: String, b: String): (t: Number) -> String

external fun interpolate(a: `T$1`, b: String): (t: Number) -> String

external fun <U : Array<Any>> interpolate(a: Array<Any>, b: U): (t: Number) -> U

external fun interpolate(a: Number, b: `T$0`): (t: Number) -> Number

external fun interpolate(a: `T$0`, b: `T$0`): (t: Number) -> Number

external fun <U : Any?> interpolate(a: Any, b: U): (t: Number) -> U

external fun interpolateNumber(a: Number, b: Number): (t: Number) -> Number

external fun interpolateNumber(a: Number, b: `T$0`): (t: Number) -> Number

external fun interpolateNumber(a: `T$0`, b: Number): (t: Number) -> Number

external fun interpolateNumber(a: `T$0`, b: `T$0`): (t: Number) -> Number

external fun interpolateRound(a: Number, b: Number): (t: Number) -> Number

external fun interpolateRound(a: Number, b: `T$0`): (t: Number) -> Number

external fun interpolateRound(a: `T$0`, b: Number): (t: Number) -> Number

external fun interpolateRound(a: `T$0`, b: `T$0`): (t: Number) -> Number

external fun interpolateString(a: String, b: String): (t: Number) -> String

external fun interpolateString(a: String, b: `T$1`): (t: Number) -> String

external fun interpolateString(a: `T$1`, b: String): (t: Number) -> String

external fun interpolateString(a: `T$1`, b: `T$1`): (t: Number) -> String

external fun interpolateDate(a: Date, b: Date): (t: Number) -> Date

typealias ArrayInterpolator<A> = (t: Number) -> A

external fun <A : Array<Any>> interpolateArray(a: Array<Any>, b: A): ArrayInterpolator<A>

external fun <U : Any?> interpolateObject(a: Any, b: U): (t: Number) -> U

external fun interpolateTransformCss(a: String, b: String): (t: Number) -> String

external fun interpolateTransformSvg(a: String, b: String): (t: Number) -> String

external fun interpolateZoom(a: ZoomView, b: ZoomView): ZoomInterpolator

external fun <T> interpolateDiscrete(values: Array<T>): (t: Number) -> T

external fun <T> quantize(interpolator: (t: Number) -> T, n: Number): Array<T>

external var interpolateRgb: ColorGammaInterpolationFactory

external fun interpolateRgbBasis(colors: Array<dynamic /* String | ColorCommonInstance */>): (t: Number) -> String

external fun interpolateRgbBasisClosed(colors: Array<dynamic /* String | ColorCommonInstance */>): (t: Number) -> String

external fun interpolateHsl(a: String, b: String): (t: Number) -> String

external fun interpolateHsl(a: String, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHsl(a: ColorCommonInstance, b: String): (t: Number) -> String

external fun interpolateHsl(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHslLong(a: String, b: String): (t: Number) -> String

external fun interpolateHslLong(a: String, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHslLong(a: ColorCommonInstance, b: String): (t: Number) -> String

external fun interpolateHslLong(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateLab(a: String, b: String): (t: Number) -> String

external fun interpolateLab(a: String, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateLab(a: ColorCommonInstance, b: String): (t: Number) -> String

external fun interpolateLab(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHcl(a: String, b: String): (t: Number) -> String

external fun interpolateHcl(a: String, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHcl(a: ColorCommonInstance, b: String): (t: Number) -> String

external fun interpolateHcl(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHclLong(a: String, b: String): (t: Number) -> String

external fun interpolateHclLong(a: String, b: ColorCommonInstance): (t: Number) -> String

external fun interpolateHclLong(a: ColorCommonInstance, b: String): (t: Number) -> String

external fun interpolateHclLong(a: ColorCommonInstance, b: ColorCommonInstance): (t: Number) -> String

external var interpolateCubehelix: ColorGammaInterpolationFactory

external var interpolateCubehelixLong: ColorGammaInterpolationFactory

external fun interpolateHue(a: Number, b: Number): (t: Number) -> Number

external fun interpolateBasis(splineNodes: Array<Number>): (t: Number) -> Number

external fun interpolateBasisClosed(splineNodes: Array<Number>): (t: Number) -> Number

external fun piecewise(interpolate: (a: ZoomView, b: ZoomView) -> ZoomInterpolator, values: Array<ZoomView>): ZoomInterpolator

external fun <A : Array<Any>> piecewise(interpolate: (a: Array<Any>, b: A) -> ArrayInterpolator<A>, values: Array<A>): ArrayInterpolator<A>

external fun <TData, Interpolator> piecewise(interpolate: (a: TData, b: TData) -> Interpolator, values: Array<TData>): (t: Number) -> Any