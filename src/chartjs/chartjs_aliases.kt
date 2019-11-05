@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package chartjs

typealias ChartTooltipPositioner = (elements: Array<Any>, eventPosition: Chart.Point) -> Chart.Point

typealias Scriptable<T> = (ctx: Chart.`T$2`) -> T