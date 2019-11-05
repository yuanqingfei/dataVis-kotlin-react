@file:JsModule("data-vis")
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

external interface ChartComponentProps {
    var data: dynamic /* ChartDataFunction<chartjs.ChartData> | chartjs.ChartData */
    var type: chartjs.ChartType?
        get() = definedExternally
        set(value) = definedExternally
    val getDatasetAtEvent: ((e: Any) -> Unit)?
        get() = definedExternally
    val getElementAtEvent: ((e: Any) -> Unit)?
        get() = definedExternally
    val getElementsAtEvent: ((e: Any) -> Unit)?
        get() = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var legend: chartjs.ChartLegendOptions?
        get() = definedExternally
        set(value) = definedExternally
    val onElementsClick: ((e: Any) -> Unit)?
        get() = definedExternally
    var options: chartjs.ChartOptions?
        get() = definedExternally
        set(value) = definedExternally
    var plugins: Array<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var redraw: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var datasetKeyProvider: ((any: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LinearComponentProps : ChartComponentProps {
    override var data: dynamic /* ChartDataFunction<chartjs.ChartData> | chartjs.ChartData */
}

@JsName("default")
external open class ChartComponent<P : ChartComponentProps> : React.Component<P, dynamic> {
    open var chartInstance: chartjs
}

external open class Doughnut : ChartComponent<ChartComponentProps>

external open class Pie : ChartComponent<ChartComponentProps>

external open class Line : ChartComponent<LinearComponentProps>

external open class Scatter : ChartComponent<ChartComponentProps>

external open class Bar : ChartComponent<LinearComponentProps>

external open class HorizontalBar : ChartComponent<ChartComponentProps>

external open class Radar : ChartComponent<ChartComponentProps>

external open class Polar : ChartComponent<ChartComponentProps>

external open class Bubble : ChartComponent<ChartComponentProps>

external object defaults {
    var global: chartjs.ChartOptions /* chartjs.ChartOptions & chartjs.ChartFontOptions */
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}