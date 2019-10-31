@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import react.*
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.css.CSSStyleDeclaration
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

typealias Percentage = String

typealias RechartsFunction = (args: Any) -> Unit

typealias LegendValueFormatter = (value: Any? /* = null */, entry: LegendPayload? /* = null */, i: Number? /* = null */) -> Any

typealias TickFormatterFunction = (value: Any) -> Any

typealias TickGeneratorFunction = (noTicksProps: Any?) -> Array<Any>

typealias LabelFormatter = (label: dynamic /* String | Number */) -> Any

typealias TooltipFormatter = (value: dynamic /* String | Number | Array<dynamic /* String | Number */> */, name: String, entry: TooltipPayload, index: Number) -> Any

typealias ItemSorter<T> = (a: T, b: T) -> Number

typealias ContentRenderer<P> = (props: P) -> Any

external interface BoxSize {
    var boxWidth: Number
    var boxHeight: Number
}

external interface ContainerSize {
    var containerWidth: Number
    var containerHeight: Number
}

external interface Point {
    var x: Number
    var y: Number
    var value: dynamic /* Number | Array<Any> */
}

external interface Margin {
    var top: Number
    var right: Number
    var bottom: Number
    var left: Number
}

external interface Animatable {
    var onAnimationStart: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onAnimationEnd: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var animationId: Number?
        get() = definedExternally
        set(value) = definedExternally
    var isAnimationActive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isUpdateAnimationActive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animationBegin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var animationDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var animationEasing: dynamic /* 'ease' | 'ease-in' | 'ease-out' | 'ease-in-out' | 'linear' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CategoricalChartWrapper<L> {
    var syncId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var compact: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var layout: L?
        get() = definedExternally
        set(value) = definedExternally
    var stackOffset: dynamic /* 'sign' | 'expand' | 'none' | 'wiggle' | 'silhouette' */
        get() = definedExternally
        set(value) = definedExternally
    var throttleDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: Margin?
        get() = definedExternally
        set(value) = definedExternally
    var barCategoryGap: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var barGap: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var barSize: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var baseValue: dynamic /* Number | 'auto' | 'dataMin' | 'dataMax' */
        get() = definedExternally
        set(value) = definedExternally
    var maxBarSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* Any | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var onClick: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseMove: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseDown: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseUp: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var reverseStackOrder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventAttributes {
    var onClick: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseDown: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseUp: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseOver: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseMove: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseOut: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onTouchEnd: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onTouchMove: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onTouchStart: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onTouchCancel: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
}

//external interface PresentationAttributes<X, Y> : CSSStyleDeclaration /* 'alignmentBaseline' | 'baselineShift' | 'clip' | 'clipPath' | 'clipRule' | 'color' | 'colorInterpolationFilters' | 'cursor' | 'direction' | 'display' | 'dominantBaseline' | 'enableBackground' | 'fill' | 'fillRule' | 'filter' | 'floodColor' | 'floodOpacity' | 'font' | 'fontFamily' | 'fontStretch' | 'fontStyle' | 'fontVariant' | 'glyphOrientationHorizontal' | 'glyphOrientationVertical' | 'letterSpacing' | 'lightingColor' | 'markerEnd' | 'markerMid' | 'markerStart' | 'mask' | 'overflow' | 'pointerEvents' | 'stopColor' | 'strokeDasharray' | 'strokeLinecap' | 'strokeLinejoin' | 'textAnchor' | 'textDecoration' | 'unicodeBidi' | 'visibility' | 'writingMode' | 'transform' */{
//    var angle: Number
//    var colorInterpolation: String
//    var colorProfile: String
//    var colorRendering: String
//    var fill: String
//    var fillOpacity: dynamic /* Number | String */
//    var fontSize: dynamic /* Number | String */
//    var fontSizeAdjust: dynamic /* Number | String */
//    var fontWeight: dynamic /* 'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 | 300 | 400 | 500 | 600 | 700 | 800 | 900 | 'inherit' */
//    var imageRendering: dynamic /* 'auto' | 'optimizeSpeed' | 'optimizeQuality' | 'inherit' */
//    var kerning: dynamic /* Number | String */
//    var opacity: dynamic /* Number | String */
//    var shapeRendering: dynamic /* 'auto' | 'optimizeSpeed' | 'crispEdges' | 'geometricPrecision' | 'inherit' */
//    var stopOpacity: dynamic /* Number | String */
//    var stroke: dynamic /* Number | String */
//    var strokeDashoffset: dynamic /* Number | String */
//    var strokeMiterlimit: dynamic /* Number | String */
//    var strokeOpacity: dynamic /* Number | String */
//    var strokeWidth: dynamic /* Number | String */
//    var textRendering: dynamic /* 'auto' | 'optimizeSpeed' | 'optimizeLegibility' | 'geometricPrecision' | 'inherit' */
//    var wordSpacing: dynamic /* Number | String */
//    var style: Any?
//    var width: Number
//    var height: Number
//    var dx: Number
//    var dy: Number
//    var x: X
//    var y: Y
//    var r: Number
//}

external interface AreaProps : EventAttributes, Animatable {
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* 'basis' | 'basisClosed' | 'basisOpen' | 'linear' | 'linearClosed' | 'natural' | 'monotoneX' | 'monotoneY' | 'monotone' | 'step' | 'stepBefore' | 'stepAfter' | CurveFactory */
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var stackId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var connectNulls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var activeDot: dynamic /* Boolean | Any? | React.ReactElement | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var dot: dynamic /* Boolean | Any? | React.ReactElement | ContentRenderer<DotProps> */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* Boolean | Any? | ContentRenderer<Any> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var layout: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var baseLine: dynamic /* Number | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var isRange: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var points: Array<Point>?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Area : React.Component<AreaProps>

external open class AreaChart : React.Component<CategoricalChartWrapper /* CategoricalChartWrapper & EventAttributes */>

external interface BarData {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var radius: dynamic /* Number | Array<Any> */
    var value: dynamic /* Number | String | Array<Any> */
}

external interface BarProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var fill: String?
        get() = definedExternally
        set(value) = definedExternally
    var radius: dynamic /* Number | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
    var layout: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var stackId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var barSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var minPointSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxBarSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* React.ReactElement | ContentRenderer<RectangleProps> */
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<BarData>?
        get() = definedExternally
        set(value) = definedExternally
    var background: dynamic /* Boolean | React.ReactElement | ContentRenderer<Any> | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* Boolean | Label | LabelProps | React.SFC<LabelProps> | React.ReactElement<LabelProps> | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Bar : React.Component<BarProps>

external open class BarChart : React.Component<CategoricalChartWrapper /* CategoricalChartWrapper & EventAttributes */>

external interface BrushProps {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var fill: String?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var travellerWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var padding: Partial<Margin>?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var startIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickFormatter: TickFormatterFunction?
        get() = definedExternally
        set(value) = definedExternally
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var updateId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var gap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var leaveTimeOut: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Brush : React.Component<BrushProps>

external interface CartesianAxisProps : EventAttributes, Partial<PresentationAttributes> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'top' | 'bottom' | 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: ViewBox?
        get() = definedExternally
        set(value) = definedExternally
    var tick: dynamic /* Boolean | ContentRenderer<Any> | Any? | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var tickLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var mirror: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minTickGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ticks: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tickSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var tickFormatter: TickFormatterFunction?
        get() = definedExternally
        set(value) = definedExternally
    var ticksGenerator: TickGeneratorFunction?
        get() = definedExternally
        set(value) = definedExternally
    var interval: dynamic /* Number | 'preserveStart' | 'preserveEnd' | 'preserveStartEnd' */
        get() = definedExternally
        set(value) = definedExternally
}

external open class CartesianAxis : React.Component<CartesianAxisProps>

external interface `T$4` {
    var yAxis: Any
    var width: Any
    var height: Any
    var offset: Any
}

typealias CoordinatesGenerator = (arg: `T$4`) -> Array<Number>

external interface CartesianGridProps : Partial<PresentationAttributes> {
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var horizontal: dynamic /* Any? | React.ReactElement | ContentRenderer<LineProps /* LineProps & CartesianGridProps */> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var vertical: dynamic /* Any? | React.ReactElement | ContentRenderer<LineProps /* LineProps & CartesianGridProps */> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var horizontalPoints: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var verticalPoints: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var horizontalCoordinatesGenerator: CoordinatesGenerator?
        get() = definedExternally
        set(value) = definedExternally
    var verticalCoordinatesGenerator: CoordinatesGenerator?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Any?
        get() = definedExternally
        set(value) = definedExternally
    var chartWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var chartHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var horizontalFill: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var verticalFill: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CartesianGrid : React.Component<CartesianGridProps>

external interface CellProps : Partial<PresentationAttributes> {
    var onClick: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Cell : React.Component<CellProps>

external open class ComposedChart : React.Component<CategoricalChartWrapper /* CategoricalChartWrapper & EventAttributes */>

external interface CrossProps : Partial<PresentationAttributes> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Cross : React.Component<CrossProps>

external interface CurveProps : EventAttributes, Partial<PresentationAttributes> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* 'basis' | 'basisClosed' | 'basisOpen' | 'linear' | 'linearClosed' | 'natural' | 'monotoneX' | 'monotoneY' | 'monotone' | 'step' | 'stepBefore' | 'stepAfter' | CurveFactory */
        get() = definedExternally
        set(value) = definedExternally
    var layout: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var baseLine: dynamic /* Number | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var points: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var connectNulls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var pathRef: React.Ref<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Curve : React.Component<CurveProps>

external interface DotProps : EventAttributes {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Dot : React.Component<DotProps>

external interface `T$5` {
    var x: Number
    var y: Number
    var value: Any
    var errorVal: Any
}

typealias DataPointFormatter = (entry: Any, dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */) -> `T$5`

external interface ErrorBarProps {
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var layout: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataPointFormatter: DataPointFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var strokeWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
}


external interface LegendPayload {
    var value: Any
    var id: Any
    var type: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$6` {
    var width: Number
    var height: Number
}

typealias BBoxUpdateCallback = (box: `T$6`) -> Unit

external interface LegendProps {
    var content: dynamic /* React.ReactElement | ContentRenderer<LegendProps> */
        get() = definedExternally
        set(value) = definedExternally
    var wrapperStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var chartWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var chartHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var iconSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var iconType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' */
        get() = definedExternally
        set(value) = definedExternally
    var layout: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var align: dynamic /* 'left' | 'center' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlign: dynamic /* 'top' | 'middle' | 'bottom' */
        get() = definedExternally
        set(value) = definedExternally
    var margin: Partial<Margin>?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Array<LegendPayload>?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: LegendValueFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var onClick: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
    var onBBoxUpdate: BBoxUpdateCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Legend : React.Component<LegendProps, BoxSize>

external interface LineProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* 'basis' | 'basisClosed' | 'basisOpen' | 'linear' | 'linearClosed' | 'natural' | 'monotoneX' | 'monotoneY' | 'monotone' | 'step' | 'stepBefore' | 'stepAfter' | CurveFactory */
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var layout: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var connectNulls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var activeDot: dynamic /* Any? | React.ReactElement | ContentRenderer<Any> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var dot: dynamic /* Any? | React.ReactElement | ContentRenderer<DotProps> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var label: dynamic /* Boolean | Any? | React.ReactElement | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var points: Array<Point>?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Line : React.Component<LineProps>

external open class LineChart : React.Component<CategoricalChartWrapper /* CategoricalChartWrapper & EventAttributes */>

external interface `T$0` {
    var offsetRadius: Number
}

external interface PieProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var cx: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var cy: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var midAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var paddingAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var nameKey: dynamic /* String | Number | (dataObject: Any) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var valueKey: dynamic /* String | Number | (dataObject: Any) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var minAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var maxRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sectors: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var labelLine: dynamic /* Any? | ContentRenderer<LineProps /* LineProps & Any */> | React.ReactElement | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* `T$0` | React.ReactElement | ContentRenderer<PieLabelRenderProps> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var activeShape: dynamic /* Any? | ContentRenderer<Any> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var activeIndex: dynamic /* Number | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
    var blendStroke: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieLabelRenderProps : PieProps {
    var name: String
    var percent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textAnchor: String
    var x: Number
    var y: Number
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external open class Pie : React.Component<PieProps>

external interface PieChartProps : EventAttributes, CategoricalChartWrapper<String /* 'centric' */> {
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cx: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var cy: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
}

external open class PieChart : React.Component<PieChartProps>

external interface PolarAngleAxisTick {
    var value: Any
    var coordinate: Number
}

external interface PolarAngleAxisProps : EventAttributes, Partial<PresentationAttributes> {
    var type: dynamic /* 'number' | 'category' */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radius: dynamic /* Percentage | Number */
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* 'auto' | 'linear' | 'pow' | 'sqrt' | 'log' | 'identity' | 'time' | 'band' | 'point' | 'ordinal' | 'quantile' | 'quantize' | 'utcTime' | 'sequential' | 'threshold' | RechartsFunction */
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var axisLineType: dynamic /* 'polygon' | 'circle' */
        get() = definedExternally
        set(value) = definedExternally
    var tickLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var tick: dynamic /* Boolean | ContentRenderer<Any> | Any? | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var ticks: Array<PolarAngleAxisTick>?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'inner' | 'outer' */
        get() = definedExternally
        set(value) = definedExternally
    var tickFormatter: TickFormatterFunction?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PolarAngleAxis : React.Component<PolarAngleAxisProps>

external interface PolarGridProps : Partial<PresentationAttributes> {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var polarAngles: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var polarRadius: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var gridType: dynamic /* 'polygon' | 'circle' */
        get() = definedExternally
        set(value) = definedExternally
}

external open class PolarGrid : React.Component<PolarGridProps>

external interface PolarRadiusAxisTick {
    var value: Any
    var coordinate: Number
}

external interface PolarRadiusAxisProps : EventAttributes, Partial<PresentationAttributes> {
    var type: dynamic /* 'number' | 'category' */
        get() = definedExternally
        set(value) = definedExternally
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ticks: Array<PolarRadiusAxisTick>?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* "left" | "right" | "middle" */
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var tick: dynamic /* Boolean | Any? | React.ReactElement | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var tickFormatter: TickFormatterFunction?
        get() = definedExternally
        set(value) = definedExternally
    var domain: dynamic /* JsTuple<dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* 'auto' | 'linear' | 'pow' | 'sqrt' | 'log' | 'identity' | 'time' | 'band' | 'point' | 'ordinal' | 'quantile' | 'quantize' | 'utcTime' | 'sequential' | 'threshold' | RechartsFunction */
        get() = definedExternally
        set(value) = definedExternally
    var allowDataOverflow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class PolarRadiusAxis : React.Component<PolarRadiusAxisProps>

external interface PolygonPoint {
    var x: Number
    var y: Number
}

external interface PolygonProps : EventAttributes, Partial<PresentationAttributes> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var points: Array<PolygonPoint>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Polygon : React.Component<PolygonProps>

external interface RadarPoint {
    var x: Number
    var y: Number
    var cx: Number
    var cy: Number
    var angle: Number
    var radius: Number
    var value: Number
    var payload: Any?
}

external interface RadarProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var points: Array<RadarPoint>?
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* React.ReactElement | ContentRenderer<RadarProps> */
        get() = definedExternally
        set(value) = definedExternally
    var activeDot: dynamic /* Any? | React.ReactElement | ContentRenderer<Any> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var dot: dynamic /* Any? | React.ReactElement | ContentRenderer<DotProps> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* Any? | React.ReactElement | ContentRenderer<Any> | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Radar : React.Component<RadarProps>

external interface RadarChartProps : EventAttributes, CategoricalChartWrapper<String /* 'centric' */> {
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cx: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var cy: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
}

external open class RadarChart : React.Component<RadarChartProps>

external interface RadialBarData {
    var cx: Number
    var cy: Number
    var innerRadius: Number
    var outerRadius: Number
    var value: Any
}

external interface RadialBarProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
    var angleAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* ContentRenderer<Any> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var activeShape: dynamic /* Any? | ContentRenderer<Any> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var minPointSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxBarSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<RadialBarData>?
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* Boolean | React.ReactElement | ContentRenderer<Any> | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var background: dynamic /* Boolean | React.ReactElement | ContentRenderer<Any> | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class RadialBar : React.Component<RadialBarProps>

external interface RadialBarChartProps : CategoricalChartWrapper<String /* 'radial' */> {
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cx: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var cy: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external open class RadialBarChart : React.Component<RadialBarChartProps>

external interface RectangleProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radius: dynamic /* Number | Array<Any> */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Rectangle : React.Component<RectangleProps>

external interface ReferenceAreaProps : Partial<PresentationAttributes> {
    var className: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: ViewBox?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var isFront: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alwaysShow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ifOverflow: dynamic /* 'hidden' | 'visible' | 'discard' | 'extendDomain' */
        get() = definedExternally
        set(value) = definedExternally
    var x1: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var x2: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var y1: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var y2: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* ContentRenderer<ReferenceAreaProps /* ReferenceAreaProps & RectangleProps */> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
}

external open class ReferenceArea : React.Component<ReferenceAreaProps>

typealias ScaleCalculator = (x: dynamic /* Number | String */) -> Number

external interface ReferenceDotAxisConfiguration {
    var scale: ScaleCalculator
}

external interface ReferenceDotProps : EventAttributes, Partial<PresentationAttributes<dynamic /* Number | String */, dynamic /* Number | String */>> {
    var className: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: ReferenceDotAxisConfiguration?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: ReferenceDotAxisConfiguration?
        get() = definedExternally
        set(value) = definedExternally
    var isFront: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alwaysShow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ifOverflow: dynamic /* 'hidden' | 'visible' | 'discard' | 'extendDomain' */
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* ContentRenderer<EventAttributes /* EventAttributes & Partial<PresentationAttributes<dynamic /* Number | String */, dynamic /* Number | String */>> & `T$1` */> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | Number | React.ReactElement | RechartsFunction */
}

external open class ReferenceDot : React.Component<ReferenceDotProps>

external interface ReferenceLineProps : Partial<PresentationAttributes<dynamic /* Number | String */, dynamic /* Number | String */>> {
    var className: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: ViewBox?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var isFront: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alwaysShow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ifOverflow: dynamic /* 'hidden' | 'visible' | 'discard' | 'extendDomain' */
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | Number | ContentRenderer<Any> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* ContentRenderer<EventAttributes /* EventAttributes & Partial<PresentationAttributes<dynamic /* Number | String */, dynamic /* Number | String */>> & `T$2` */> | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
}

external open class ReferenceLine : React.Component<ReferenceLineProps>

external interface ResponsiveContainerProps {
    var aspect: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var minHeight: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var minWidth: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var maxHeight: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var children: Any
    var debounce: Number?
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var className: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external open class ResponsiveContainer : React.Component<ResponsiveContainerProps, ContainerSize>

external interface `T$3` {
    var x: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var z: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScatterPoint {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var node: `T$3`?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScatterProps : EventAttributes, Partial<PresentationAttributes>, Animatable {
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var zAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var line: dynamic /* Boolean | Any? | RechartsFunction | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var lineType: dynamic /* 'joint' | 'fitting' */
        get() = definedExternally
        set(value) = definedExternally
    var lineJointType: dynamic /* 'basis' | 'basisClosed' | 'basisOpen' | 'linear' | 'linearClosed' | 'natural' | 'monotoneX' | 'monotoneY' | 'monotone' | 'step' | 'stepBefore' | 'stepAfter' | CurveFactory */
        get() = definedExternally
        set(value) = definedExternally
    var legendType: dynamic /* 'plainline' | 'line' | 'square' | 'rect' | 'circle' | 'cross' | 'diamond' | 'star' | 'triangle' | 'wye' | 'none' */
        get() = definedExternally
        set(value) = definedExternally
    var activeIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var activeShape: dynamic /* Any? | RechartsFunction | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var shape: dynamic /* 'circle' | 'cross' | 'diamond' | 'square' | 'star' | 'triangle' | 'wye' | React.ReactElement | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var points: Array<ScatterPoint>?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Scatter : React.Component<ScatterProps>

external open class ScatterChart : React.Component<CategoricalChartWrapper /* CategoricalChartWrapper & EventAttributes */>

external interface SectorProps : EventAttributes, Partial<PresentationAttributes> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Sector : React.Component<SectorProps>

external interface TextProps : Partial<PresentationAttributes> {
    var scaleToFit: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textAnchor: dynamic /* 'start' | 'middle' | 'end' | 'inherit' */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAnchor: dynamic /* 'start' | 'middle' | 'end' */
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var capHeight: String?
        get() = definedExternally
        set(value) = definedExternally
    var lineHeight: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Text : React.Component<TextProps>

external interface ViewBox {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PolarViewBox {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var outerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Coordinate {
    var x: Number
    var y: Number
}

external interface TooltipPayload {
    var name: String
    var value: dynamic /* String | Number | Array<dynamic /* String | Number */> */
    var unit: String?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var fill: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var formatter: TooltipFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$7` {
    var x: Boolean
}

external interface `T$8` {
    var y: Boolean
}

external interface `T$9` {
    var x: Boolean
    var y: Boolean
}

external interface TooltipProps : Animatable {
    var content: dynamic /* React.ReactElement | React.StatelessComponent<Any> | ContentRenderer<TooltipProps> */
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: ViewBox?
        get() = definedExternally
        set(value) = definedExternally
    var allowEscapeViewBox: dynamic /* `T$7` | `T$8` | `T$9` */
        get() = definedExternally
        set(value) = definedExternally
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var separator: String?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: TooltipFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var labelStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var contentStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var wrapperStyle: Any?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: dynamic /* Boolean | Any? | React.ReactElement | React.StatelessComponent<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var coordinate: Coordinate?
        get() = definedExternally
        set(value) = definedExternally
    var position: Coordinate?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var labelFormatter: LabelFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Array<TooltipPayload>?
        get() = definedExternally
        set(value) = definedExternally
    var itemSorter: ItemSorter<TooltipPayload>?
        get() = definedExternally
        set(value) = definedExternally
    var filterNull: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useTranslate3d: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Tooltip : React.Component<TooltipProps, BoxSize>

external interface TreemapProps : EventAttributes, Animatable {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var aspectRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var content: dynamic /* React.ReactElement | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
    var fill: String?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var nameKey: dynamic /* String | Number | RechartsFunction */
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* Array<Any> | Any */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Treemap : React.Component<TreemapProps>

external open class Label : React.Component<LabelProps>

external interface LabelProps : Partial<PresentationAttributes> {
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: dynamic /* ViewBox | PolarViewBox */
        get() = definedExternally
        set(value) = definedExternally
    var formatter: LabelFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* 'top' | 'left' | 'right' | 'bottom' | 'inside' | 'outside' | 'insideLeft' | 'insideRight' | 'insideTop' | 'insideBottom' | 'insideTopLeft' | 'insideBottomLeft' | 'insideTopRight' | 'insideBottomRight' | 'insideStart' | 'insideEnd' | 'end' | 'center' */
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* Array<Any> | Any */
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var content: dynamic /* React.ReactElement | ContentRenderer<Any> */
        get() = definedExternally
        set(value) = definedExternally
}

external open class LabelList : React.Component<LabelListProps>

external interface LabelListProps {
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* Array<Any> | Any */
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var clockWise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var content: dynamic /* React.ReactElement | ContentRenderer<LabelProps> */
        get() = definedExternally
        set(value) = definedExternally
    var data: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | RechartsFunction */
    var formatter: LabelFormatter?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* 'top' | 'left' | 'right' | 'bottom' | 'inside' | 'outside' | 'insideLeft' | 'insideRight' | 'insideTop' | 'insideBottom' | 'insideTopLeft' | 'insideBottomLeft' | 'insideTopRight' | 'insideBottomRight' | 'insideStart' | 'insideEnd' | 'end' | 'center' */
        get() = definedExternally
        set(value) = definedExternally
    var valueAccessor: RechartsFunction?
        get() = definedExternally
        set(value) = definedExternally
}

external interface XPadding {
    var left: Number
    var right: Number
}

external interface XAxisProps : EventAttributes {
    var allowDecimals: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var domain: dynamic /* JsTuple<dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mirror: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'top' | 'bottom' */
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* 'number' | 'category' */
        get() = definedExternally
        set(value) = definedExternally
    var ticks: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tickCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickFormatter: TickFormatterFunction?
        get() = definedExternally
        set(value) = definedExternally
    var padding: XPadding?
        get() = definedExternally
        set(value) = definedExternally
    var allowDataOverflow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* 'auto' | 'linear' | 'pow' | 'sqrt' | 'log' | 'identity' | 'time' | 'band' | 'point' | 'ordinal' | 'quantile' | 'quantize' | 'utcTime' | 'sequential' | 'threshold' | RechartsFunction */
        get() = definedExternally
        set(value) = definedExternally
    var tick: dynamic /* Boolean | ContentRenderer<Any> | Any? | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var tickLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var minTickGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickMargin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interval: dynamic /* Number | 'preserveStart' | 'preserveEnd' | 'preserveStartEnd' */
        get() = definedExternally
        set(value) = definedExternally
    var textAnchor: String?
        get() = definedExternally
        set(value) = definedExternally
    var reversed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | Number | Label | LabelProps */
        get() = definedExternally
        set(value) = definedExternally
    var allowDuplicatedCategory: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class XAxis : React.Component<XAxisProps>

external interface YPadding {
    var top: Number
    var bottom: Number
}

external interface YAxisProps : EventAttributes {
    var allowDecimals: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hide: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var domain: dynamic /* JsTuple<dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var ticks: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tickCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var angle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickFormatter: TickFormatterFunction?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mirror: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* 'number' | 'category' */
        get() = definedExternally
        set(value) = definedExternally
    var padding: YPadding?
        get() = definedExternally
        set(value) = definedExternally
    var allowDataOverflow: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* 'auto' | 'linear' | 'pow' | 'sqrt' | 'log' | 'identity' | 'time' | 'band' | 'point' | 'ordinal' | 'quantile' | 'quantize' | 'utcTime' | 'sequential' | 'threshold' | RechartsFunction */
        get() = definedExternally
        set(value) = definedExternally
    var tick: dynamic /* Boolean | ContentRenderer<Any> | Any? | React.ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var tickLine: dynamic /* Boolean | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var minTickGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickMargin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interval: dynamic /* Number | 'preserveStart' | 'preserveEnd' | 'preserveStartEnd' */
        get() = definedExternally
        set(value) = definedExternally
    var reversed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* String | Number | Label | LabelProps */
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class YAxis : React.Component<YAxisProps>

external interface ZAxisProps {
    var type: dynamic /* 'number' | 'category' */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var zAxisId: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var dataKey: dynamic /* String | Number | (dataObject: Any) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var range: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* 'auto' | 'linear' | 'pow' | 'sqrt' | 'log' | 'identity' | 'time' | 'band' | 'point' | 'ordinal' | 'quantile' | 'quantize' | 'utcTime' | 'sequential' | 'threshold' | RechartsFunction */
        get() = definedExternally
        set(value) = definedExternally
}

external open class ZAxis : React.Component<ZAxisProps>

external interface SurfaceProps {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: ViewBox?
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var style: Any?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* Array<Any> | Any */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Surface : React.Component<SurfaceProps>

external interface SymbolsProps : Partial<PresentationAttributes> {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* 'circle' | 'cross' | 'diamond' | 'square' | 'star' | 'triangle' | 'wye' */
        get() = definedExternally
        set(value) = definedExternally
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sizeType: dynamic /* 'area' | 'diameter' */
        get() = definedExternally
        set(value) = definedExternally
}

external open class Symbols : React.Component<SymbolsProps>