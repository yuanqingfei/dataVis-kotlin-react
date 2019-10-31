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

external interface CanvasPath_D3Shape {
    fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */)
    fun arcTo(x1: Number, y1: Number, x2: Number, y2: Number, radius: Number)
    fun bezierCurveTo(cp1x: Number, cp1y: Number, cp2x: Number, cp2y: Number, x: Number, y: Number)
    fun closePath()
    fun ellipse(x: Number, y: Number, radiusX: Number, radiusY: Number, rotation: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */)
    fun lineTo(x: Number, y: Number)
    fun moveTo(x: Number, y: Number)
    fun quadraticCurveTo(cpx: Number, cpy: Number, x: Number, y: Number)
    fun rect(x: Number, y: Number, w: Number, h: Number)
}

external interface DefaultArcObject {
    var innerRadius: Number
    var outerRadius: Number
    var startAngle: Number
    var endAngle: Number
    var padAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Arc<This, Datum> {
    @nativeInvoke
    operator fun invoke(this: This, d: Datum, vararg args: Any): String?
    @nativeInvoke
    operator fun invoke(this: This, d: Datum, vararg args: Any)
    fun centroid(d: Datum, vararg args: Any): dynamic /* JsTuple<Number, Number> */
    fun innerRadius(): (this: This, d: Datum, args: Any) -> Number
    fun innerRadius(radius: Number): Arc<This, Datum> /* this */
    fun innerRadius(radius: (this: This, d: Datum, args: Array<Any>) -> Number): Arc<This, Datum> /* this */
    fun outerRadius(): (this: This, d: Datum, args: Any) -> Number
    fun outerRadius(radius: Number): Arc<This, Datum> /* this */
    fun outerRadius(radius: (this: This, d: Datum, args: Array<Any>) -> Number): Arc<This, Datum> /* this */
    fun cornerRadius(): (this: This, d: Datum, args: Any) -> Number
    fun cornerRadius(radius: Number): Arc<This, Datum> /* this */
    fun cornerRadius(radius: (this: This, d: Datum, args: Array<Any>) -> Number): Arc<This, Datum> /* this */
    fun startAngle(): (this: This, d: Datum, args: Any) -> Number
    fun startAngle(angle: Number): Arc<This, Datum> /* this */
    fun startAngle(angle: (this: This, d: Datum, args: Array<Any>) -> Number): Arc<This, Datum> /* this */
    fun endAngle(): (this: This, d: Datum, args: Any) -> Number
    fun endAngle(angle: Number): Arc<This, Datum> /* this */
    fun endAngle(angle: (this: This, d: Datum, args: Array<Any>) -> Number): Arc<This, Datum> /* this */
    fun padAngle(): (this: This, d: Datum, args: Any) -> Number?
    fun padAngle(angle: Number?): Arc<This, Datum> /* this */
    fun padAngle(angle: (this: This, d: Datum, args: Array<Any>) -> Number?): Arc<This, Datum> /* this */
    fun padRadius(): ((this: This, d: Datum, args: Any) -> Number)?
    fun padRadius(radius: Nothing?): Arc<This, Datum> /* this */
    fun padRadius(radius: Number): Arc<This, Datum> /* this */
    fun padRadius(radius: (this: This, d: Datum, args: Array<Any>) -> Number): Arc<This, Datum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): Arc<This, Datum> /* this */
    fun context(context: Nothing?): Arc<This, Datum> /* this */
    @nativeInvoke
    operator fun invoke(this: This, d: Datum, args: Any): String?
}

external fun arc(): Arc<Any, DefaultArcObject>

external fun <Datum> arc(): Arc<Any, Datum>

external fun <This, Datum> arc(): Arc<This, Datum>

external interface PieArcDatum<T> {
    var data: T
    var value: Number
    var index: Number
    var startAngle: Number
    var endAngle: Number
    var padAngle: Number
}

external interface Pie<This, Datum> {
    @nativeInvoke
    operator fun invoke(this: This, data: Array<Datum>, vararg args: Any): Array<PieArcDatum<Datum>>
    fun value(): (d: Datum, i: Number, data: Array<Datum>) -> Number
    fun value(value: Number): Pie<This, Datum> /* this */
    fun value(value: (d: Datum, i: Number, data: Array<Datum>) -> Number): Pie<This, Datum> /* this */
    fun sort(): ((a: Datum, b: Datum) -> Number)?
    fun sort(comparator: (a: Datum, b: Datum) -> Number): Pie<This, Datum> /* this */
    fun sort(comparator: Nothing?): Pie<This, Datum> /* this */
    fun sortValues(): ((a: Number, b: Number) -> Number)?
    fun sortValues(comparator: (a: Number, b: Number) -> Number): Pie<This, Datum> /* this */
    fun sortValues(comparator: Nothing?): Pie<This, Datum> /* this */
    fun startAngle(): (this: This, data: Array<Datum>, args: Any) -> Number
    fun startAngle(angle: Number): Pie<This, Datum> /* this */
    fun startAngle(angle: (this: This, data: Array<Datum>, args: Array<Any>) -> Number): Pie<This, Datum> /* this */
    fun endAngle(): (this: This, data: Array<Datum>, args: Any) -> Number
    fun endAngle(angle: Number): Pie<This, Datum> /* this */
    fun endAngle(angle: (this: This, data: Array<Datum>, args: Array<Any>) -> Number): Pie<This, Datum> /* this */
    fun padAngle(): (this: This, data: Array<Datum>, args: Any) -> Number
    fun padAngle(angle: Number): Pie<This, Datum> /* this */
    fun padAngle(angle: (this: This, data: Array<Datum>, args: Array<Any>) -> Number): Pie<This, Datum> /* this */
}

external interface `T$0` {
    fun valueOf(): Number
}

external fun pie(): Pie<Any, dynamic /* Number | `T$0` */>

external fun <Datum> pie(): Pie<Any, Datum>

external fun <This, Datum> pie(): Pie<This, Datum>

external interface Line<Datum> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
    @nativeInvoke
    operator fun invoke(data: Array<Datum>)
    fun x(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun x(x: Number): Line<Datum> /* this */
    fun x(x: (d: Datum, index: Number, data: Array<Datum>) -> Number): Line<Datum> /* this */
    fun y(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun y(y: Number): Line<Datum> /* this */
    fun y(y: (d: Datum, index: Number, data: Array<Datum>) -> Number): Line<Datum> /* this */
    fun defined(): (d: Datum, index: Number, data: Array<Datum>) -> Boolean
    fun defined(defined: Boolean): Line<Datum> /* this */
    fun defined(defined: (d: Datum, index: Number, data: Array<Datum>) -> Boolean): Line<Datum> /* this */
    fun curve(): dynamic /* CurveFactory | CurveFactoryLineOnly */
    fun <C : dynamic> curve(): C
    fun curve(curve: CurveFactory): Line<Datum> /* this */
    fun curve(curve: CurveFactoryLineOnly): Line<Datum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): Line<Datum> /* this */
    fun context(context: Nothing?): Line<Datum> /* this */
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
}

external fun line(): Line<dynamic /* JsTuple<Number, Number> */>

external fun <Datum> line(): Line<Datum>

external interface LineRadial<Datum> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
    @nativeInvoke
    operator fun invoke(data: Array<Datum>)
    fun angle(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun angle(angle: Number): LineRadial<Datum> /* this */
    fun angle(angle: (d: Datum, index: Number, data: Array<Datum>) -> Number): LineRadial<Datum> /* this */
    fun radius(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun radius(radius: Number): LineRadial<Datum> /* this */
    fun radius(radius: (d: Datum, index: Number, data: Array<Datum>) -> Number): LineRadial<Datum> /* this */
    fun defined(): (d: Datum, index: Number, data: Array<Datum>) -> Boolean
    fun defined(defined: Boolean): LineRadial<Datum> /* this */
    fun defined(defined: (d: Datum, index: Number, data: Array<Datum>) -> Boolean): LineRadial<Datum> /* this */
    fun curve(): dynamic /* CurveFactory | CurveFactoryLineOnly */
    fun <C : dynamic> curve(): C
    fun curve(curve: CurveFactory): LineRadial<Datum> /* this */
    fun curve(curve: CurveFactoryLineOnly): LineRadial<Datum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): LineRadial<Datum> /* this */
    fun context(context: Nothing?): LineRadial<Datum> /* this */
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
}

external fun lineRadial(): LineRadial<dynamic /* JsTuple<Number, Number> */>

external fun <Datum> lineRadial(): LineRadial<Datum>

typealias RadialLine<Datum> = LineRadial<Datum>

external fun radialLine(): RadialLine<dynamic /* JsTuple<Number, Number> */>

external fun <Datum> radialLine(): RadialLine<Datum>

external interface Area<Datum> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
    @nativeInvoke
    operator fun invoke(data: Array<Datum>)
    fun x(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun x(x: Number): Area<Datum> /* this */
    fun x(x: (d: Datum, index: Number, data: Array<Datum>) -> Number): Area<Datum> /* this */
    fun x0(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun x0(x: Number): Area<Datum> /* this */
    fun x0(x: (d: Datum, index: Number, data: Array<Datum>) -> Number): Area<Datum> /* this */
    fun x1(): ((d: Datum, index: Number, data: Array<Datum>) -> Number)?
    fun x1(x: Nothing?): Area<Datum> /* this */
    fun x1(x: Number): Area<Datum> /* this */
    fun x1(x: (d: Datum, index: Number, data: Array<Datum>) -> Number): Area<Datum> /* this */
    fun y(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun y(y: Number): Area<Datum> /* this */
    fun y(y: (d: Datum, index: Number, data: Array<Datum>) -> Number): Area<Datum> /* this */
    fun y0(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun y0(y: Number): Area<Datum> /* this */
    fun y0(y: (d: Datum, index: Number, data: Array<Datum>) -> Number): Area<Datum> /* this */
    fun y1(): ((d: Datum, index: Number, data: Array<Datum>) -> Number)?
    fun y1(y: Nothing?): Area<Datum> /* this */
    fun y1(y: Number): Area<Datum> /* this */
    fun y1(y: (d: Datum, index: Number, data: Array<Datum>) -> Number): Area<Datum> /* this */
    fun defined(): (d: Datum, index: Number, data: Array<Datum>) -> Boolean
    fun defined(defined: Boolean): Area<Datum> /* this */
    fun defined(defined: (d: Datum, index: Number, data: Array<Datum>) -> Boolean): Area<Datum> /* this */
    fun curve(): CurveFactory
    fun <C : CurveFactory> curve(): C
    fun curve(curve: CurveFactory): Area<Datum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): Area<Datum> /* this */
    fun context(context: Nothing?): Area<Datum> /* this */
    fun lineX0(): Line<Datum>
    fun lineY0(): Line<Datum>
    fun lineX1(): Line<Datum>
    fun lineY1(): Line<Datum>
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
}

external fun area(): Area<dynamic /* JsTuple<Number, Number> */>

external fun <Datum> area(): Area<Datum>

external interface AreaRadial<Datum> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
    @nativeInvoke
    operator fun invoke(data: Array<Datum>)
    fun angle(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun angle(angle: Number): AreaRadial<Datum> /* this */
    fun angle(angle: (d: Datum, index: Number, data: Array<Datum>) -> Number): AreaRadial<Datum> /* this */
    fun startAngle(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun startAngle(angle: Number): AreaRadial<Datum> /* this */
    fun startAngle(angle: (d: Datum, index: Number, data: Array<Datum>) -> Number): AreaRadial<Datum> /* this */
    fun endAngle(): ((d: Datum, index: Number, data: Array<Datum>) -> Number)?
    fun endAngle(angle: Nothing?): AreaRadial<Datum> /* this */
    fun endAngle(angle: Number): AreaRadial<Datum> /* this */
    fun endAngle(angle: (d: Datum, index: Number, data: Array<Datum>) -> Number): AreaRadial<Datum> /* this */
    fun radius(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun radius(radius: Number): AreaRadial<Datum> /* this */
    fun radius(radius: (d: Datum, index: Number, data: Array<Datum>) -> Number): AreaRadial<Datum> /* this */
    fun innerRadius(): (d: Datum, index: Number, data: Array<Datum>) -> Number
    fun innerRadius(radius: Number): AreaRadial<Datum> /* this */
    fun innerRadius(radius: (d: Datum, index: Number, data: Array<Datum>) -> Number): AreaRadial<Datum> /* this */
    fun outerRadius(): ((d: Datum, index: Number, data: Array<Datum>) -> Number)?
    fun outerRadius(radius: Nothing?): AreaRadial<Datum> /* this */
    fun outerRadius(radius: Number): AreaRadial<Datum> /* this */
    fun outerRadius(radius: (d: Datum, index: Number, data: Array<Datum>) -> Number): AreaRadial<Datum> /* this */
    fun defined(): (d: Datum, index: Number, data: Array<Datum>) -> Boolean
    fun defined(defined: Boolean): AreaRadial<Datum> /* this */
    fun defined(defined: (d: Datum, index: Number, data: Array<Datum>) -> Boolean): AreaRadial<Datum> /* this */
    fun curve(): CurveFactory
    fun <C : CurveFactory> curve(): C
    fun curve(curve: CurveFactory): AreaRadial<Datum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): AreaRadial<Datum> /* this */
    fun context(context: Nothing?): AreaRadial<Datum> /* this */
    fun lineStartAngle(): LineRadial<Datum>
    fun lineInnerRadius(): LineRadial<Datum>
    fun lineEndAngle(): LineRadial<Datum>
    fun lineOuterRadius(): LineRadial<Datum>
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): String?
}

external fun areaRadial(): AreaRadial<dynamic /* JsTuple<Number, Number> */>

external fun <Datum> areaRadial(): AreaRadial<Datum>

typealias RadialArea<Datum> = AreaRadial<Datum>

external fun radialArea(): RadialArea<dynamic /* JsTuple<Number, Number> */>

external fun <Datum> radialArea(): RadialArea<Datum>

external interface CurveGeneratorLineOnly {
    fun lineStart()
    fun lineEnd()
    fun point(x: Number, y: Number)
}

typealias CurveFactoryLineOnly = (context: dynamic /* CanvasRenderingContext2D | Path */) -> CurveGeneratorLineOnly

external interface CurveGenerator : CurveGeneratorLineOnly {
    fun areaStart()
    fun areaEnd()
}

typealias CurveFactory = (context: dynamic /* CanvasRenderingContext2D | Path */) -> CurveGenerator

external var curveBasis: CurveFactory

external var curveBasisClosed: CurveFactory

external var curveBasisOpen: CurveFactory

external interface CurveBundleFactory : CurveFactoryLineOnly {
    fun beta(beta: Number): CurveBundleFactory /* this */
}

external var curveBundle: CurveBundleFactory

external interface CurveCardinalFactory : CurveFactory {
    fun tension(tension: Number): CurveCardinalFactory /* this */
}

external var curveCardinal: CurveCardinalFactory

external var curveCardinalClosed: CurveCardinalFactory

external var curveCardinalOpen: CurveCardinalFactory

external interface CurveCatmullRomFactory : CurveFactory {
    fun alpha(alpha: Number): CurveCatmullRomFactory /* this */
}

external var curveCatmullRom: CurveCatmullRomFactory

external var curveCatmullRomClosed: CurveCatmullRomFactory

external var curveCatmullRomOpen: CurveCatmullRomFactory

external var curveLinear: CurveFactory

external var curveLinearClosed: CurveFactory

external var curveMonotoneX: CurveFactory

external var curveMonotoneY: CurveFactory

external var curveNatural: CurveFactory

external var curveStep: CurveFactory

external var curveStepAfter: CurveFactory

external var curveStepBefore: CurveFactory

external interface DefaultLinkObject {
    var source: dynamic /* JsTuple<Number, Number> */
    var target: dynamic /* JsTuple<Number, Number> */
}

external interface Link<This, LinkDatum, NodeDatum> {
    @nativeInvoke
    operator fun invoke(this: This, d: LinkDatum, vararg args: Any): String?
    @nativeInvoke
    operator fun invoke(this: This, d: LinkDatum, vararg args: Any)
    fun source(): (this: This, d: LinkDatum, args: Any) -> NodeDatum
    fun source(source: (this: This, d: LinkDatum, args: Array<Any>) -> NodeDatum): Link<This, LinkDatum, NodeDatum> /* this */
    fun target(): (this: This, d: LinkDatum, args: Any) -> NodeDatum
    fun target(target: (this: This, d: LinkDatum, args: Array<Any>) -> NodeDatum): Link<This, LinkDatum, NodeDatum> /* this */
    fun x(): (this: This, node: NodeDatum, args: Any) -> Number
    fun x(x: (this: This, node: NodeDatum, args: Array<Any>) -> Number): Link<This, LinkDatum, NodeDatum> /* this */
    fun y(): (this: This, node: NodeDatum, args: Any) -> Number
    fun y(y: (this: This, node: NodeDatum, args: Array<Any>) -> Number): Link<This, LinkDatum, NodeDatum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): Link<This, LinkDatum, NodeDatum> /* this */
    fun context(context: Nothing?): Link<This, LinkDatum, NodeDatum> /* this */
    @nativeInvoke
    operator fun invoke(this: This, d: LinkDatum, args: Any): String?
}

external fun linkHorizontal(): Link<Any, DefaultLinkObject, dynamic /* JsTuple<Number, Number> */>

external fun <LinkDatum, NodeDatum> linkHorizontal(): Link<Any, LinkDatum, NodeDatum>

external fun <This, LinkDatum, NodeDatum> linkHorizontal(): Link<This, LinkDatum, NodeDatum>

external fun linkVertical(): Link<Any, DefaultLinkObject, dynamic /* JsTuple<Number, Number> */>

external fun <LinkDatum, NodeDatum> linkVertical(): Link<Any, LinkDatum, NodeDatum>

external fun <This, LinkDatum, NodeDatum> linkVertical(): Link<This, LinkDatum, NodeDatum>

external interface LinkRadial<This, LinkDatum, NodeDatum> {
    @nativeInvoke
    operator fun invoke(this: This, d: LinkDatum, vararg args: Any): String?
    @nativeInvoke
    operator fun invoke(this: This, d: LinkDatum, vararg args: Any)
    fun source(): (this: This, d: LinkDatum, args: Any) -> NodeDatum
    fun source(source: (this: This, d: LinkDatum, args: Array<Any>) -> NodeDatum): LinkRadial<This, LinkDatum, NodeDatum> /* this */
    fun target(): (this: This, d: LinkDatum, args: Any) -> NodeDatum
    fun target(target: (this: This, d: LinkDatum, args: Array<Any>) -> NodeDatum): LinkRadial<This, LinkDatum, NodeDatum> /* this */
    fun angle(): (this: This, node: NodeDatum, args: Any) -> Number
    fun angle(angle: (this: This, node: NodeDatum, args: Array<Any>) -> Number): LinkRadial<This, LinkDatum, NodeDatum> /* this */
    fun radius(): (this: This, node: NodeDatum, args: Any) -> Number
    fun radius(radius: (this: This, node: NodeDatum, args: Array<Any>) -> Number): LinkRadial<This, LinkDatum, NodeDatum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): LinkRadial<This, LinkDatum, NodeDatum> /* this */
    fun context(context: Nothing?): LinkRadial<This, LinkDatum, NodeDatum> /* this */
    @nativeInvoke
    operator fun invoke(this: This, d: LinkDatum, args: Any): String?
}

typealias RadialLink<This, LinkDatum, NodeDatum> = LinkRadial<This, LinkDatum, NodeDatum>

external fun linkRadial(): LinkRadial<Any, DefaultLinkObject, dynamic /* JsTuple<Number, Number> */>

external fun <LinkDatum, NodeDatum> linkRadial(): LinkRadial<Any, LinkDatum, NodeDatum>

external fun <This, LinkDatum, NodeDatum> linkRadial(): LinkRadial<This, LinkDatum, NodeDatum>

external interface SymbolType {
    fun draw(context: CanvasPath_D3Shape, size: Number)
}

external interface Symbol<This, Datum> {
    @nativeInvoke
    operator fun invoke(this: This, d: Datum? = definedExternally /* null */, vararg args: Any): String?
    @nativeInvoke
    operator fun invoke(this: This, d: Datum? = definedExternally /* null */, vararg args: Any)
    fun size(): (this: This, d: Datum, args: Any) -> Number
    fun size(size: Number): Symbol<This, Datum> /* this */
    fun size(size: (this: This, d: Datum, args: Array<Any>) -> Number): Symbol<This, Datum> /* this */
    fun type(): (this: This, d: Datum, args: Any) -> SymbolType
    fun type(type: SymbolType): Symbol<This, Datum> /* this */
    fun type(type: (this: This, d: Datum, args: Array<Any>) -> SymbolType): Symbol<This, Datum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): Symbol<This, Datum> /* this */
    fun context(context: Nothing?): Symbol<This, Datum> /* this */
    @nativeInvoke
    operator fun invoke(this: This): String?
}

external fun symbol(): Symbol<Any, Any>

external fun <Datum> symbol(): Symbol<Any, Datum>

external fun <This, Datum> symbol(): Symbol<This, Datum>

external var symbols: Array<SymbolType>

external var symbolCircle: SymbolType

external var symbolCross: SymbolType

external var symbolDiamond: SymbolType

external var symbolSquare: SymbolType

external var symbolStar: SymbolType

external var symbolTriangle: SymbolType

external var symbolWye: SymbolType

external fun pointRadial(angle: Number, radius: Number): dynamic /* JsTuple<Number, Number> */

external interface SeriesPoint<Datum> : Array<Number> {
    var `0`: Number
    var `1`: Number
    var data: Datum
}

external interface Series<Datum, Key> : Array<SeriesPoint<Datum>> {
    var key: Key
    var index: Number
}

external interface Stack<This, Datum, Key> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>, vararg args: Any): Array<Series<Datum, Key>>
    fun keys(): (this: This, data: Array<Datum>, args: Any) -> Array<Key>
    fun keys(keys: Array<Key>): Stack<This, Datum, Key> /* this */
    fun keys(keys: (this: This, data: Array<Datum>, args: Array<Any>) -> Array<Key>): Stack<This, Datum, Key> /* this */
    fun value(): (d: Datum, key: Key, i: Number, data: Array<Datum>) -> Number
    fun value(value: Number): Stack<This, Datum, Key> /* this */
    fun value(value: (d: Datum, key: Key, i: Number, data: Array<Datum>) -> Number): Stack<This, Datum, Key> /* this */
    fun order(): (series: Series<Datum, Key>) -> Array<Number>
    fun order(order: Nothing?): Stack<This, Datum, Key> /* this */
    fun order(order: Array<Number>): Stack<This, Datum, Key> /* this */
    fun order(order: (series: Series<Datum, Key>) -> Array<Number>): Stack<This, Datum, Key> /* this */
    fun offset(): (series: Series<Datum, Key>, order: Array<Number>) -> Unit
    fun offset(offset: Nothing?): Stack<This, Datum, Key> /* this */
    fun offset(offset: (series: Series<Datum, Key>, order: Array<Number>) -> Unit): Stack<This, Datum, Key> /* this */
}

external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): Number?
    @nativeSetter
    operator fun set(key: String, value: Number)
}

external fun stack(): Stack<Any, `T$1`, String>

external fun <Datum> stack(): Stack<Any, Datum, String>

external fun <Datum, Key> stack(): Stack<Any, Datum, Key>

external fun <This, Datum, Key> stack(): Stack<This, Datum, Key>

external fun stackOrderAppearance(series: Series<Any, Any>): Array<Number>

external fun stackOrderAscending(series: Series<Any, Any>): Array<Number>

external fun stackOrderDescending(series: Series<Any, Any>): Array<Number>

external fun stackOrderInsideOut(series: Series<Any, Any>): Array<Number>

external fun stackOrderNone(series: Series<Any, Any>): Array<Number>

external fun stackOrderReverse(series: Series<Any, Any>): Array<Number>

external fun stackOffsetExpand(series: Series<Any, Any>, order: Array<Number>)

external fun stackOffsetDiverging(series: Series<Any, Any>, order: Array<Number>)

external fun stackOffsetNone(series: Series<Any, Any>, order: Array<Number>)

external fun stackOffsetSilhouette(series: Series<Any, Any>, order: Array<Number>)

external fun stackOffsetWiggle(series: Series<Any, Any>, order: Array<Number>)