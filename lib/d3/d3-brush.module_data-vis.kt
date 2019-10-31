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

external interface BrushBehavior<Datum> {
    @nativeInvoke
    operator fun invoke(group: Selection<SVGGElement, Datum, Any, Any>, vararg args: Any)
    fun move(group: Selection<SVGGElement, Datum, Any, Any>, selection: Nothing?)
    fun move(group: Selection<SVGGElement, Datum, Any, Any>, selection: dynamic /* JsTuple<dynamic, dynamic> */)
    fun move(group: Selection<SVGGElement, Datum, Any, Any>, selection: dynamic /* JsTuple<Number, Number> */)
    fun move(group: Selection<SVGGElement, Datum, Any, Any>, selection: ValueFn<SVGGElement, Datum, dynamic /* dynamic | dynamic */>)
    fun move(group: Selection<SVGGElement, Datum, Any, Any>, selection: Nothing?)
    fun move(group: TransitionLike<SVGGElement, Datum>, selection: dynamic /* JsTuple<dynamic, dynamic> */)
    fun move(group: TransitionLike<SVGGElement, Datum>, selection: dynamic /* JsTuple<Number, Number> */)
    fun move(group: TransitionLike<SVGGElement, Datum>, selection: ValueFn<SVGGElement, Datum, dynamic /* dynamic | dynamic */>)
    fun extent(): ValueFn<SVGGElement, Datum, dynamic /* JsTuple<dynamic, dynamic> */>
    fun extent(extent: dynamic /* JsTuple<dynamic, dynamic> */): BrushBehavior<Datum> /* this */
    fun extent(extent: ValueFn<SVGGElement, Datum, dynamic /* JsTuple<dynamic, dynamic> */>): BrushBehavior<Datum> /* this */
    fun filter(): ValueFn<SVGGElement, Datum, Boolean>
    fun filter(filterFn: ValueFn<SVGGElement, Datum, Boolean>): BrushBehavior<Datum> /* this */
    fun handleSize(): Number
    fun handleSize(size: Number): BrushBehavior<Datum> /* this */
    fun on(typenames: String): ValueFn<SVGGElement, Datum, Unit>?
    fun on(typenames: String, listener: Nothing?): BrushBehavior<Datum> /* this */
    fun on(typenames: String, listener: ValueFn<SVGGElement, Datum, Unit>): BrushBehavior<Datum> /* this */
}

external fun <Datum> brush(): BrushBehavior<Datum>

external fun <Datum> brushX(): BrushBehavior<Datum>

external fun <Datum> brushY(): BrushBehavior<Datum>

external fun brushSelection(node: SVGGElement): dynamic /* dynamic | dynamic */

external interface D3BrushEvent<Datum> {
    var target: BrushBehavior<Datum>
    var type: dynamic /* 'start' | 'brush' | 'end' | String */
    var selection: dynamic /* dynamic | dynamic */
    var sourceEvent: Any
}