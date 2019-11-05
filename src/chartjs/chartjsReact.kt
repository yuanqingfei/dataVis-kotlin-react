@file:JsModule("react-chartjs-2")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package chartjs

import react.RClass
import react.RProps
import kotlin.js.*

external interface ChartComponentProps: RProps {
    var data: dynamic /* ChartDataFunction<ChartData> | ChartData */
    var type: dynamic
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
    var legend: Chart.ChartLegendOptions?
        get() = definedExternally
        set(value) = definedExternally
    val onElementsClick: ((e: Any) -> Unit)?
        get() = definedExternally
    var options: Chart.ChartOptions?
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


external abstract open class ChartComponent<P : ChartComponentProps>: RClass<P> {
    open var chartInstance: dynamic
}

external val Doughnut : ChartComponent<ChartComponentProps>

external val Pie : ChartComponent<ChartComponentProps>

external val Line : ChartComponent<ChartComponentProps>

external val Scatter : ChartComponent<ChartComponentProps>

external val Bar : ChartComponent<ChartComponentProps>

external val HorizontalBar : ChartComponent<ChartComponentProps>

external val Radar : ChartComponent<ChartComponentProps>

external val Polar : ChartComponent<ChartComponentProps>

external val Bubble : ChartComponent<ChartComponentProps>
