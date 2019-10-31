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

typealias DraggedElementBaseType = Element

external interface SubjectPosition {
    var x: Number
    var y: Number
}

external interface DragBehavior<GElement : DraggedElementBaseType, Datum, Subject> : Function {
    @nativeInvoke
    operator fun invoke(selection: Selection<GElement, Datum, Any, Any>, vararg args: Any)
    fun container(): ValueFn<GElement, Datum, dynamic /* HTMLElement | SVGSVGElement | SVGGElement */>
    fun container(accessor: ValueFn<GElement, Datum, dynamic /* HTMLElement | SVGSVGElement | SVGGElement */>): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun container(container: HTMLElement): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun container(container: SVGSVGElement): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun container(container: SVGGElement): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun filter(): ValueFn<GElement, Datum, Boolean>
    fun filter(filterFn: ValueFn<GElement, Datum, Boolean>): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun touchable(): ValueFn<GElement, Datum, Boolean>
    fun touchable(touchable: Boolean): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun touchable(touchable: ValueFn<GElement, Datum, Boolean>): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun subject(): ValueFn<GElement, Datum, Subject>
    fun subject(accessor: ValueFn<GElement, Datum, Subject>): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun clickDistance(): Number
    fun clickDistance(distance: Number): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun on(typenames: String): ValueFn<GElement, Datum, Unit>?
    fun on(typenames: String, listener: Nothing?): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun on(typenames: String, listener: ValueFn<GElement, Datum, Unit>): DragBehavior<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
}

external fun <GElement : DraggedElementBaseType, Datum> drag(): DragBehavior<GElement, Datum, dynamic /* Datum | SubjectPosition */>

external fun <GElement : DraggedElementBaseType, Datum, Subject> drag(): DragBehavior<GElement, Datum, Subject>

external interface D3DragEvent<GElement : DraggedElementBaseType, Datum, Subject> {
    var target: DragBehavior<GElement, Datum, Subject>
    var type: dynamic /* 'start' | 'drag' | 'end' | String */
    var subject: Subject
    var x: Number
    var y: Number
    var dx: Number
    var dy: Number
    var identifier: dynamic /* 'mouse' | Number */
    var active: Number
    var sourceEvent: Any
    fun on(typenames: String): ValueFn<GElement, Datum, Unit>?
    fun on(typenames: String, listener: Nothing?): D3DragEvent<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
    fun on(typenames: String, listener: ValueFn<GElement, Datum, Unit>): D3DragEvent<GElement<DraggedElementBaseType>, Datum, Subject> /* this */
}

external fun dragDisable(window: Window)

external fun dragEnable(window: Window, noClick: Boolean? = definedExternally /* null */)