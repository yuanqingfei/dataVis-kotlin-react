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

typealias ZoomedElementBaseType = Element

external interface ZoomScale {
    fun domain(): dynamic /* Array<Number> | Array<Date> */
    fun domain(domain: Array<dynamic /* Date | Number */>): ZoomScale /* this */
    fun range(): Array<Number>
    fun range(range: Array<Number>): ZoomScale /* this */
    fun copy(): ZoomScale
    fun invert(value: Number): dynamic /* Number | Date */
}

external interface ZoomBehavior<ZoomRefElement : ZoomedElementBaseType, Datum> : Function {
    @nativeInvoke
    operator fun invoke(selection: Selection<ZoomRefElement, Datum, Any, Any>, vararg args: Any)
    fun transform(selection: Selection<ZoomRefElement, Datum, Any, Any>, transform: ZoomTransform)
    fun transform(selection: Selection<ZoomRefElement, Datum, Any, Any>, transform: ValueFn<ZoomRefElement, Datum, ZoomTransform>)
    fun transform(transition: TransitionLike<ZoomRefElement, Datum>, transform: ZoomTransform)
    fun transform(transition: TransitionLike<ZoomRefElement, Datum>, transform: ValueFn<ZoomRefElement, Datum, ZoomTransform>)
    fun translateBy(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: Number, y: Number)
    fun translateBy(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: ValueFn<ZoomRefElement, Datum, Number>, y: Number)
    fun translateBy(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: Number, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateBy(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: ValueFn<ZoomRefElement, Datum, Number>, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateBy(transition: TransitionLike<ZoomRefElement, Datum>, x: Number, y: Number)
    fun translateBy(transition: TransitionLike<ZoomRefElement, Datum>, x: ValueFn<ZoomRefElement, Datum, Number>, y: Number)
    fun translateBy(transition: TransitionLike<ZoomRefElement, Datum>, x: Number, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateBy(transition: TransitionLike<ZoomRefElement, Datum>, x: ValueFn<ZoomRefElement, Datum, Number>, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateTo(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: Number, y: Number)
    fun translateTo(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: ValueFn<ZoomRefElement, Datum, Number>, y: Number)
    fun translateTo(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: Number, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateTo(selection: Selection<ZoomRefElement, Datum, Any, Any>, x: ValueFn<ZoomRefElement, Datum, Number>, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateTo(transition: TransitionLike<ZoomRefElement, Datum>, x: Number, y: Number)
    fun translateTo(transition: TransitionLike<ZoomRefElement, Datum>, x: ValueFn<ZoomRefElement, Datum, Number>, y: Number)
    fun translateTo(transition: TransitionLike<ZoomRefElement, Datum>, x: Number, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun translateTo(transition: TransitionLike<ZoomRefElement, Datum>, x: ValueFn<ZoomRefElement, Datum, Number>, y: ValueFn<ZoomRefElement, Datum, Number>)
    fun scaleBy(selection: Selection<ZoomRefElement, Datum, Any, Any>, k: Number)
    fun scaleBy(selection: Selection<ZoomRefElement, Datum, Any, Any>, k: ValueFn<ZoomRefElement, Datum, Number>)
    fun scaleBy(transition: TransitionLike<ZoomRefElement, Datum>, k: Number)
    fun scaleBy(transition: TransitionLike<ZoomRefElement, Datum>, k: ValueFn<ZoomRefElement, Datum, Number>)
    fun scaleTo(selection: Selection<ZoomRefElement, Datum, Any, Any>, k: Number)
    fun scaleTo(selection: Selection<ZoomRefElement, Datum, Any, Any>, k: ValueFn<ZoomRefElement, Datum, Number>)
    fun scaleTo(transition: TransitionLike<ZoomRefElement, Datum>, k: Number)
    fun scaleTo(transition: TransitionLike<ZoomRefElement, Datum>, k: ValueFn<ZoomRefElement, Datum, Number>)
    fun constrain(): (transform: ZoomTransform, extent: dynamic /* JsTuple<dynamic, dynamic> */, translateExtent: dynamic /* JsTuple<dynamic, dynamic> */) -> ZoomTransform
    fun constrain(constraint: (transform: ZoomTransform, extent: dynamic /* JsTuple<dynamic, dynamic> */, translateExtent: dynamic /* JsTuple<dynamic, dynamic> */) -> ZoomTransform): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun filter(): ValueFn<ZoomRefElement, Datum, Boolean>
    fun filter(filterFn: ValueFn<ZoomRefElement, Datum, Boolean>): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun touchable(): ValueFn<ZoomRefElement, Datum, Boolean>
    fun touchable(touchable: Boolean): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun touchable(touchable: ValueFn<ZoomRefElement, Datum, Boolean>): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun wheelDelta(): ValueFn<ZoomRefElement, Datum, Number>
    fun wheelDelta(delta: ValueFn<ZoomRefElement, Datum, Number>): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun extent(): ValueFn<ZoomRefElement, Datum, dynamic /* JsTuple<dynamic, dynamic> */>
    fun extent(extent: dynamic /* JsTuple<dynamic, dynamic> */): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun extent(extent: ValueFn<ZoomRefElement, Datum, dynamic /* JsTuple<dynamic, dynamic> */>): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun scaleExtent(): dynamic /* JsTuple<Number, Number> */
    fun scaleExtent(extent: dynamic /* JsTuple<Number, Number> */): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun translateExtent(): dynamic /* JsTuple<dynamic, dynamic> */
    fun translateExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun clickDistance(): Number
    fun clickDistance(distance: Number): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun duration(): Number
    fun duration(duration: Number): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun <InterpolationFactory : (a: ZoomView, b: ZoomView) -> (t: Number) -> ZoomView> interpolate(): InterpolationFactory
    fun interpolate(interpolatorFactory: (a: ZoomView, b: ZoomView) -> (t: Number) -> ZoomView): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun on(typenames: String): ValueFn<ZoomRefElement, Datum, Unit>?
    fun on(typenames: String, listener: Nothing?): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
    fun on(typenames: String, listener: ValueFn<ZoomRefElement, Datum, Unit>): ZoomBehavior<ZoomRefElement<ZoomedElementBaseType>, Datum> /* this */
}

external fun <ZoomRefElement : ZoomedElementBaseType, Datum> zoom(): ZoomBehavior<ZoomRefElement, Datum>

external interface D3ZoomEvent<ZoomRefElement : ZoomedElementBaseType, Datum> {
    var target: ZoomBehavior<ZoomRefElement, Datum>
    var type: dynamic /* 'start' | 'zoom' | 'end' | String */
    var transform: ZoomTransform
    var sourceEvent: Any
}

external interface ZoomTransform {
    var x: Number
    var y: Number
    var k: Number
    fun apply(point: dynamic /* JsTuple<Number, Number> */): dynamic /* JsTuple<Number, Number> */
    fun applyX(x: Number): Number
    fun applyY(y: Number): Number
    fun invert(point: dynamic /* JsTuple<Number, Number> */): dynamic /* JsTuple<Number, Number> */
    fun invertX(x: Number): Number
    fun invertY(y: Number): Number
    fun <S : ZoomScale> rescaleX(xScale: S): S
    fun <S : ZoomScale> rescaleY(yScale: S): S
    fun scale(k: Number): ZoomTransform
    override fun toString(): String
    fun translate(x: Number, y: Number): ZoomTransform
}

external fun zoomTransform(node: ZoomedElementBaseType): ZoomTransform

external var zoomIdentity: ZoomTransform