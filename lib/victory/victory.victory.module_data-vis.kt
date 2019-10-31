@file:JsModule("victory")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package victory

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

external interface AnimationStyle {
    @nativeGetter
    operator fun get(key: String): dynamic /* String | Number */
    @nativeSetter
    operator fun set(key: String, value: String)
    @nativeSetter
    operator fun set(key: String, value: Number)
}

external interface BlockProps {
    var top: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bottom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var left: Number?
        get() = definedExternally
        set(value) = definedExternally
    var right: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryStyleInterface {
    var parent: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var data: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var labels: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryAnimationProps {
    var children: ((style: AnimationStyle) -> React.ReactElement)?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easing: dynamic /* 'back' | 'backIn' | 'backOut' | 'backInOut' | 'bounce' | 'bounceIn' | 'bounceOut' | 'bounceInOut' | 'circle' | 'circleIn' | 'circleOut' | 'circleInOut' | 'linear' | 'linearIn' | 'linearOut' | 'linearInOut' | 'cubic' | 'cubicIn' | 'cubicOut' | 'cubicInOut' | 'elastic' | 'elasticIn' | 'elasticOut' | 'elasticInOut' | 'exp' | 'expIn' | 'expOut' | 'expInOut' | 'poly' | 'polyIn' | 'polyOut' | 'polyInOut' | 'quad' | 'quadIn' | 'quadOut' | 'quadInOut' | 'sin' | 'sinIn' | 'sinOut' | 'sinInOut' */
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onEnd: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var data: dynamic /* AnimationStyle | Array<AnimationStyle> */
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryAnimation : React.Component<VictoryAnimationProps, Any>

external interface `T$0` {
    var x: Number
    var y: Number
}

external interface `T$1` {
    @nativeInvoke
    operator fun invoke(): dynamic /* 'start' | 'middle' | 'end' | 'inherit' */
}

external interface `T$2` {
    @nativeInvoke
    operator fun invoke(): dynamic /* 'start' | 'middle' | 'end' */
}

external interface `T$3` {
    @nativeInvoke
    operator fun invoke(): dynamic /* String | Any */
}

external interface VictoryLabelProps {
    var angle: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var capHeight: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var datum: Any?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var events: React.DOMAttributes<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var children: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var labelPlacement: dynamic /* 'parallel' | 'perpendicular' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var lineHeight: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var origin: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var polar: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var renderInPortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* React.CSSProperties | Array<React.CSSProperties> */
        get() = definedExternally
        set(value) = definedExternally
    var text: dynamic /* Array<String> | String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var textAnchor: dynamic /* 'start' | 'middle' | 'end' | 'inherit' | `T$1` */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAnchor: dynamic /* 'start' | 'middle' | 'end' | `T$2` */
        get() = definedExternally
        set(value) = definedExternally
    var transform: dynamic /* String | Any | `T$3` */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dx: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var dy: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryLabel : React.Component<VictoryLabelProps, Any>

external interface VictoryContainerProps {
    var responsive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var events: React.DOMAttributes<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var desc: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryContainer : React.Component<VictoryContainerProps, Any>

external interface CursorData {
    var x: Number
    var y: Number
}

external interface VictoryCursorContainerProps : VictoryContainerProps {
    var cursorComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var cursorDimension: dynamic /* 'x' | 'y' */
        get() = definedExternally
        set(value) = definedExternally
    var cursorLabel: ((point: CursorData) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var cursorLabelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var cursorLabelOffset: dynamic /* Number | CursorData */
        get() = definedExternally
        set(value) = definedExternally
    var defaultCursorValue: dynamic /* Number | CursorData */
        get() = definedExternally
        set(value) = definedExternally
    var disable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onCursorChange: ((value: CursorData, props: VictoryCursorContainerProps) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryCursorContainer : React.Component<VictoryCursorContainerProps, Any>

external interface VictoryBrushContainerProps : VictoryContainerProps {
    var allowDrag: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var allowResize: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var brushComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var brushDimension: dynamic /* 'x' | 'y' */
        get() = definedExternally
        set(value) = definedExternally
    var brushDomain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var brushStyle: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var defaultBrushArea: dynamic /* 'all' | 'none' | 'disable' */
        get() = definedExternally
        set(value) = definedExternally
    var disable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var handleComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var handleStyle: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var onBrushDomainChange: ((domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */, props: VictoryBrushContainerProps) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryBrushContainer : React.Component<VictoryBrushContainerProps, Any>

external interface VictoryVoronoiContainerProps : VictoryContainerProps {
    var activateData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var activateLabels: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var labels: ((point: Any, index: Number, points: Array<Any>) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var labelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var onActivated: ((points: Array<Any>, props: VictoryVoronoiContainerProps) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onDeactivated: ((points: Array<Any>, props: VictoryVoronoiContainerProps) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var voronoiBlacklist: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var voronoiDimension: dynamic /* 'x' | 'y' */
        get() = definedExternally
        set(value) = definedExternally
    var voronoiPadding: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryVoronoiContainer : React.Component<VictoryVoronoiContainerProps, Any>

external interface VictoryZoomContainerProps : VictoryContainerProps {
    var allowPan: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var allowZoom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clipContainerComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var zoomDimension: dynamic /* 'x' | 'y' */
        get() = definedExternally
        set(value) = definedExternally
    var zoomDomain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var brushStyle: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var defaultBrushArea: dynamic /* 'all' | 'none' | 'disable' */
        get() = definedExternally
        set(value) = definedExternally
    var disable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var downsample: dynamic /* Number | Boolean */
        get() = definedExternally
        set(value) = definedExternally
    var minimumZoom: CursorData?
        get() = definedExternally
        set(value) = definedExternally
    var onZoomDomainChange: ((domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */, props: VictoryZoomContainerProps) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryZoomContainer : React.Component<VictoryZoomContainerProps, Any>

external interface ThemeBaseProps {
    var width: Number
    var height: Number
    var colorScale: Array<String>
    var padding: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$4` {
    var data: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
    var labels: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$5` {
    var style: `T$4`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$6` {
    var axis: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var axisLabel: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var grid: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var ticks: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var tickLabels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$7` {
    var style: `T$6`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$8` {
    var data: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var labels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$9` {
    var style: `T$8`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$10` {
    var max: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var maxLabels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var median: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var medianLabels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var min: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var minLabels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var q1: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var q1Labels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var q3: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var q3Labels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$11` {
    var style: `T$10`?
        get() = definedExternally
        set(value) = definedExternally
    var boxWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$12` {
    var positive: String?
        get() = definedExternally
        set(value) = definedExternally
    var negative: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$13` {
    var style: `T$8`?
        get() = definedExternally
        set(value) = definedExternally
    var candleColors: `T$12`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$14` {
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: `T$8`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$15` {
    var data: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var labels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var title: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$16` {
    var gutter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'vertical' | 'horizontal' */
        get() = definedExternally
        set(value) = definedExternally
    var titleOrientation: dynamic /* 'top' | 'bottom' | 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var style: `T$15`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$17` {
    var style: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var flyoutStyle: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pointerLength: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$18` {
    var data: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var labels: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var flyout: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$19` {
    var style: `T$18`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryThemeDefinition {
    var area: `T$5` /* `T$5` & ThemeBaseProps */
    var axis: `T$7` /* `T$7` & ThemeBaseProps */
    var bar: `T$9` /* `T$9` & ThemeBaseProps */
    var boxplot: `T$11` /* `T$11` & ThemeBaseProps */
    var candlestick: `T$13` /* `T$13` & ThemeBaseProps */
    var chart: ThemeBaseProps?
        get() = definedExternally
        set(value) = definedExternally
    var errorbar: `T$14` /* `T$14` & ThemeBaseProps */
    var group: ThemeBaseProps?
        get() = definedExternally
        set(value) = definedExternally
    var legend: `T$16` /* `T$16` & ThemeBaseProps */
    var line: `T$9` /* `T$9` & ThemeBaseProps */
    var pie: `T$9` /* `T$9` & ThemeBaseProps */
    var scatter: `T$9` /* `T$9` & ThemeBaseProps */
    var stack: ThemeBaseProps?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: `T$17`?
        get() = definedExternally
        set(value) = definedExternally
    var voronoi: `T$19` /* `T$19` & ThemeBaseProps */
}

external interface VictoryThemeInterface {
    var grayscale: VictoryThemeDefinition
    var material: VictoryThemeDefinition
}

external var VictoryTheme: VictoryThemeInterface

external interface VictoryTooltipProps {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var activateData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var angle: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: dynamic /* (datum: Any, active: Boolean) -> Number | Number */
        get() = definedExternally
        set(value) = definedExternally
    var datum: Any?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var dx: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var dy: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var events: Any?
        get() = definedExternally
        set(value) = definedExternally
    var flyoutStyle: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var flyoutComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var groupComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* (datum: Any, active: Boolean) -> Number | Number */
        get() = definedExternally
        set(value) = definedExternally
    var horizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var index: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var labelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'top' | 'bottom' | 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var pointerLength: dynamic /* (datum: Any, active: Boolean) -> Number | Number */
        get() = definedExternally
        set(value) = definedExternally
    var pointerWidth: dynamic /* (datum: Any, active: Boolean) -> Number | Number */
        get() = definedExternally
        set(value) = definedExternally
    var renderInPortal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var text: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic | Array<String> | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
    var theme: VictoryThemeDefinition?
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* (datum: Any, active: Boolean) -> Number | Number */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryTooltip : React.Component<VictoryTooltipProps, Any>

external interface `T$20` {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var before: ((datum: Any) -> AnimationStyle)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$21` {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var before: ((datum: Any) -> AnimationStyle)?
        get() = definedExternally
        set(value) = definedExternally
    var after: ((datum: Any) -> AnimationStyle)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimatePropTypeInterface {
    var duration: Number
    var onEnd: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onExit: `T$20`?
        get() = definedExternally
        set(value) = definedExternally
    var onEnter: `T$21`?
        get() = definedExternally
        set(value) = definedExternally
    var onLoad: `T$21`?
        get() = definedExternally
        set(value) = definedExternally
    var easing: dynamic /* 'back' | 'backIn' | 'backOut' | 'backInOut' | 'bounce' | 'bounceIn' | 'bounceOut' | 'bounceInOut' | 'circle' | 'circleIn' | 'circleOut' | 'circleInOut' | 'linear' | 'linearIn' | 'linearOut' | 'linearInOut' | 'cubic' | 'cubicIn' | 'cubicOut' | 'cubicInOut' | 'elastic' | 'elasticIn' | 'elasticOut' | 'elasticInOut' | 'exp' | 'expIn' | 'expOut' | 'expInOut' | 'poly' | 'polyIn' | 'polyOut' | 'polyInOut' | 'quad' | 'quadIn' | 'quadOut' | 'quadInOut' | 'sin' | 'sinIn' | 'sinOut' | 'sinInOut' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventCallbackInterface<TTarget, TEventKey> {
    var childName: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: TTarget?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: TEventKey?
        get() = definedExternally
        set(value) = definedExternally
    var mutation: (props: Any) -> Any
}

external interface `T$22` {
    @nativeInvoke
    operator fun invoke(event: React.SyntheticEvent<Any>): EventCallbackInterface<TTarget, TEventKey>
}

external interface `T$23` {
    @nativeInvoke
    operator fun invoke(event: React.SyntheticEvent<Any>): Array<EventCallbackInterface<TTarget, TEventKey>>
}

external interface `T$24` {
    @nativeGetter
    operator fun get(key: String): dynamic /* `T$22` | `T$23` */
    @nativeSetter
    operator fun set(key: String, value: `T$22`)
    @nativeSetter
    operator fun set(key: String, value: `T$23`)
}

external interface EventPropTypeInterface<TTarget, TEventKey> {
    var childName: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: TTarget
    var eventKey: TEventKey?
        get() = definedExternally
        set(value) = definedExternally
    var eventHandlers: `T$24`
}

external interface `T$35` {
    var x: dynamic /* dynamic | dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* dynamic | dynamic */
}

external interface `T$36` {
    var x: dynamic /* dynamic | dynamic */
    var y: dynamic /* dynamic | dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$37` {
    var x: dynamic /* Number | dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number | dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface D3Scale {
    var domain: () -> Any
    var range: () -> Any
    var copy: () -> Any
}

external interface `T$38` {
    var x: Array<String>
}

external interface `T$39` {
    var y: Array<String>
}

external interface `T$40` {
    var x: Array<String>
    var y: Array<String>
}

external interface `T$41` {
    @nativeInvoke
    operator fun invoke(data: Any): dynamic /* Number | String | Array<String> */
}

external interface `T$25` {
    var x: dynamic /* 'linear' | 'time' | 'log' | 'sqrt' | D3Scale */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* 'linear' | 'time' | 'log' | 'sqrt' | D3Scale */
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryCommonProps {
    var animate: AnimatePropTypeInterface?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var horizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number | BlockProps */
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* 'linear' | 'time' | 'log' | 'sqrt' | D3Scale | `T$25` */
        get() = definedExternally
        set(value) = definedExternally
    var standalone: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var containerComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var theme: VictoryThemeDefinition?
        get() = definedExternally
        set(value) = definedExternally
    var groupComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryDatableProps {
    var categories: dynamic /* Array<String> | `T$38` | `T$39` | `T$40` */
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var dataComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* Number | String | Array<String> | `T$41` */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number | String | Array<String> | `T$41` */
        get() = definedExternally
        set(value) = definedExternally
    var y0: dynamic /* Number | String | Array<String> | `T$41` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryLabableProps {
    var labelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$26` {
    @nativeInvoke
    operator fun invoke(data: Any): String
}

external interface VictoryMultiLabeableProps : VictoryLabableProps {
    var labels: dynamic /* Array<String> | `T$26` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictorySingleLabableProps : VictoryLabableProps {
    var label: dynamic /* String | `T$26` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryAreaProps : VictoryCommonProps, VictoryDatableProps, VictorySingleLabableProps {
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, String /* 'all' */>>?
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: dynamic /* 'basis' | 'basisClosed' | 'basisOpen' | 'bundle' | 'cardinal' | 'cardinalClosed' | 'cardinalOpen' | 'catmullRom' | 'catmullRomClosed' | 'catmullRomOpen' | 'linear' | 'linearClosed' | 'monotoneX' | 'monotoneY' | 'natural' | 'radial' | 'step' | 'stepAfter' | 'stepBefore' */
        get() = definedExternally
        set(value) = definedExternally
    var labels: dynamic /* Array<String> | Array<Number> | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var samples: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryArea : React.Component<VictoryAreaProps, Any>

external interface `T$27` {
    var parent: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var axis: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var axisLabel: React.CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var grid: Any?
        get() = definedExternally
        set(value) = definedExternally
    var ticks: Any?
        get() = definedExternally
        set(value) = definedExternally
    var tickLabels: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$28` {
    @nativeInvoke
    operator fun invoke(tick: Any, index: Number, ticks: Array<Any>): dynamic /* String | Number */
}

external interface VictoryAxisProps : VictoryCommonProps {
    var axisComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var axisLabelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var axisValue: dynamic /* Number | String | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var crossAxis: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dependentAxis: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'axis' | 'axisLabel' | 'grid' | 'ticks' | 'tickLabels' | 'parent' */, dynamic /* Number | String */>>?
        get() = definedExternally
        set(value) = definedExternally
    var fixLabelOverlap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var gridComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var invertAxis: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: Any?
        get() = definedExternally
        set(value) = definedExternally
    var offsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'top' | 'bottom' | 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var style: `T$27`?
        get() = definedExternally
        set(value) = definedExternally
    var tickComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var tickCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tickLabelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var tickFormat: dynamic /* Array<Any> | `T$28` */
        get() = definedExternally
        set(value) = definedExternally
    var tickValues: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryAxis : React.Component<VictoryAxisProps, Any>

external interface `T$29` {
    var top: dynamic /* Number | (datum: Any, active: Boolean) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var topLeft: dynamic /* Number | (datum: Any, active: Boolean) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var topRight: dynamic /* Number | (datum: Any, active: Boolean) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var bottom: dynamic /* Number | (datum: Any, active: Boolean) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var bottomLeft: dynamic /* Number | (datum: Any, active: Boolean) -> Number */
        get() = definedExternally
        set(value) = definedExternally
    var bottomRight: dynamic /* Number | (datum: Any, active: Boolean) -> Number */
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryBarProps : VictoryCommonProps, VictoryDatableProps, VictoryMultiLabeableProps {
    var alignment: dynamic /* 'start' | 'middle' | 'end' */
        get() = definedExternally
        set(value) = definedExternally
    var barRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var barWidth: dynamic /* (datum: Any, active: Boolean) -> Number | Number */
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: dynamic /* (datum: Any, active: Boolean) -> Number | Number | `T$29` */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* Number | String */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    override var horizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryBar : React.Component<VictoryBarProps, Any>

external interface VictoryBoxPlotStyleInterface : VictoryStyleInterface {
    var max: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var maxLabels: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var min: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var minLabels: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var median: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var medianLabels: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var q1: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var q1Labels: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var q3: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
    var q3Labels: VictoryStyleObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VictoryBoxPlotProps : VictoryCommonProps, VictoryDatableProps {
    var boxWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var domainPadding: dynamic /* Number | `T$37` */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<String, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    override var horizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var labelOrientation: dynamic /* 'top' | 'bottom' | 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    var labels: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var max: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var median: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var min: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var q1: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var q3: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryBoxPlotStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
    var whiskerWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryBoxPlot : React.Component<VictoryBoxPlotProps, Any>

external interface VictoryChartProps : VictoryCommonProps {
    var domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var domainPadding: dynamic /* Number | `T$37` */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<String, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var style: Pick<VictoryStyleInterface, String /* 'parent' */>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryChart : React.Component<VictoryChartProps, Any>

external interface VictoryGroupProps : VictoryCommonProps, VictoryDatableProps, VictoryMultiLabeableProps {
    override var categories: dynamic /* Array<String> | `T$38` | `T$39` | `T$40` */
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var colorScale: dynamic /* 'greyscale' | 'qualitative' | 'heatmap' | 'warm' | 'cool' | 'red' | 'green' | 'blue' | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    override var domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var domainPadding: dynamic /* Number | `T$37` */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    override var horizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryGroup : React.Component<VictoryGroupProps, Any>

external interface VictoryLineProps : VictoryCommonProps, VictoryDatableProps, VictorySingleLabableProps {
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* Number | String */>>?
        get() = definedExternally
        set(value) = definedExternally
    var interpolation: dynamic /* 'basis' | 'basisClosed' | 'basisOpen' | 'bundle' | 'cardinal' | 'cardinalClosed' | 'cardinalOpen' | 'catmullRom' | 'catmullRomClosed' | 'catmullRomOpen' | 'linear' | 'linearClosed' | 'monotoneX' | 'monotoneY' | 'natural' | 'radial' | 'step' | 'stepAfter' | 'stepBefore' */
        get() = definedExternally
        set(value) = definedExternally
    var samples: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labels: dynamic /* Array<String> | Array<Number> | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var sortKey: dynamic /* String | Array<String> | Function<*> */
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryLine : React.Component<VictoryLineProps, Any>

external interface `T$30` {
    var fill: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$31` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: `T$30`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$32` {
    var left: Number
    var right: Number
}

external interface VictoryLegendProps : VictoryCommonProps, VictoryDatableProps, VictorySingleLabableProps {
    var borderComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var borderPadding: dynamic /* Number | BlockProps */
        get() = definedExternally
        set(value) = definedExternally
    var centerTitle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var colorScale: dynamic /* 'greyscale' | 'qualitative' | 'heatmap' | 'warm' | 'cool' | 'red' | 'green' | 'blue' | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<`T$31`>?
        get() = definedExternally
        set(value) = definedExternally
    override var dataComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */>>?
        get() = definedExternally
        set(value) = definedExternally
    var externalEventMutations: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var gutter: dynamic /* Number | `T$32` */
        get() = definedExternally
        set(value) = definedExternally
    var itemsPerRow: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var labelComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var orientation: dynamic /* 'horizontal' | 'vertical' */
        get() = definedExternally
        set(value) = definedExternally
    var rowGutter: dynamic /* Number | Omit<BlockProps, dynamic /* 'left' | 'right' */> */
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
    var symbolSpacer: Number?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* String | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var titleComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var titleOrientation: dynamic /* 'top' | 'bottom' | 'left' | 'right' */
        get() = definedExternally
        set(value) = definedExternally
    override var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryLegend : React.Component<VictoryLegendProps, Any>

external interface `T$33` {
    @nativeInvoke
    operator fun invoke(data: Any): Number
}

external interface `T$34` {
    @nativeInvoke
    operator fun invoke(data: Any): dynamic /* 'circle' | 'diamond' | 'plus' | 'square' | 'star' | 'triangleDown' | 'triangleUp' */
}

external interface VictoryScatterProps : VictoryCommonProps, VictoryDatableProps, VictoryMultiLabeableProps {
    var bubbleProperty: String?
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var maxBubbleSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var samples: Number?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* Number | `T$33` */
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* 'circle' | 'diamond' | 'plus' | 'square' | 'star' | 'triangleDown' | 'triangleUp' | `T$34` */
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryScatter : React.Component<VictoryScatterProps, Any>

external interface VictoryStackProps : VictoryCommonProps, VictoryMultiLabeableProps {
    var categories: dynamic /* Array<String> | `T$38` | `T$39` | `T$40` */
        get() = definedExternally
        set(value) = definedExternally
    var colorScale: dynamic /* 'greyscale' | 'qualitative' | 'heatmap' | 'warm' | 'cool' | 'red' | 'green' | 'blue' | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var domain: dynamic /* dynamic | dynamic | `T$35` | `T$36` */
        get() = definedExternally
        set(value) = definedExternally
    var domainPadding: dynamic /* Number | `T$37` */
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    override var horizontal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
    var xOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryStack : React.Component<VictoryStackProps, Any>

external interface VictoryPieProps : VictoryCommonProps, VictoryMultiLabeableProps {
    var colorScale: dynamic /* 'greyscale' | 'qualitative' | 'heatmap' | 'warm' | 'cool' | 'red' | 'green' | 'blue' | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var dataComponent: React.ReactElement?
        get() = definedExternally
        set(value) = definedExternally
    var labelRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var events: Array<EventPropTypeInterface<dynamic /* 'data' | 'labels' | 'parent' */, dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic | Array<String> | Array<Number> */>>?
        get() = definedExternally
        set(value) = definedExternally
    var eventKey: dynamic /* String | Number | (datum: Any, active: Boolean) -> dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var radius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var innerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var padAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var style: VictoryStyleInterface?
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* Number | String | Array<String> | `T$41` */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number | String | Array<String> | `T$41` */
        get() = definedExternally
        set(value) = definedExternally
}

external open class VictoryPie : React.Component<VictoryPieProps, Any>

external fun <V, W> createContainer(c1: String /* 'brush' */, c2: dynamic /* 'brush' | 'cursor' | 'selection' | 'voronoi' | 'zoom' */): React.ComponentType<V /* V & W */>