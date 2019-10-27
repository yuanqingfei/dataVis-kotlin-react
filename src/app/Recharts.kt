@file:JsModule("recharts")

package  app

import react.*
import kotlin.js.*


external val Line : RClass<LineProps>
external val LineChart : RClass<CategoricalChartWrapper>
external val XAxis : RClass<XAxisProps>
external val YAxis : RClass<YAxisProps>
external val CartesianGrid : RClass<CartesianGridProps>
external val Tooltip : RClass<TooltipProps>
external val Legend : RClass<LegendProps>

external interface TooltipProps : RProps {
    var content: dynamic /* React.ReactElement | React.StatelessComponent<Any> | ContentRenderer<TooltipProps> */
        get() = definedExternally
        set(value) = definedExternally
    var viewBox: dynamic
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
    var formatter: dynamic
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
    var labelFormatter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var payload: Array<TooltipPayload>?
        get() = definedExternally
        set(value) = definedExternally
    var itemSorter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var filterNull: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useTranslate3d: Boolean?
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
    var formatter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var payload: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CartesianGridProps : RProps {
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
    var horizontalCoordinatesGenerator: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var verticalCoordinatesGenerator: dynamic
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

external interface XAxisProps : RProps {
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
    var tickFormatter: dynamic
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

external interface YAxisProps : RProps {
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
    var tickFormatter: dynamic
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

external interface YPadding {
    var top: Number
    var bottom: Number
}

external interface XPadding {
    var left: Number
    var right: Number
}

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
    var onAnimationStart: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onAnimationEnd: dynamic
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



external interface CategoricalChartWrapper: RProps {
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
    var layout: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var stackOffset: dynamic /* 'sign' | 'expand' | 'none' | 'wiggle' | 'silhouette' */
        get() = definedExternally
        set(value) = definedExternally
    var throttleDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var margin: dynamic
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
    var onClick: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseMove: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseDown: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseUp: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var reverseStackOrder: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineProps: RProps {
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
    var points: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LegendProps : RProps{
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
    var margin: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var payload: Array<LegendPayload>?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onClick: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseEnter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onMouseLeave: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var onBBoxUpdate: dynamic
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