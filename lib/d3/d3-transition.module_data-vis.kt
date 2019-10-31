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

external fun <GElement : BaseType, Datum, PElement : BaseType, PDatum> active(node: GElement, name: String? = definedExternally /* null */): Transition<GElement, Datum, PElement, PDatum>?

external fun interrupt(node: BaseType, name: String? = definedExternally /* null */)

external interface Transition<GElement : BaseType, Datum, PElement : BaseType, PDatum> {
    fun <DescElement : BaseType> select(selector: String): Transition<DescElement, Datum, PElement, PDatum>
    fun <DescElement : BaseType> select(selector: ValueFn<GElement, Datum, DescElement>): Transition<DescElement, Datum, PElement, PDatum>
    fun <DescElement : BaseType, OldDatum> selectAll(selector: String): Transition<DescElement, OldDatum, GElement, Datum>
    fun <DescElement : BaseType, OldDatum> selectAll(selector: ValueFn<GElement, Datum, dynamic /* Array<DescElement> | ArrayLike<DescElement> */>): Transition<DescElement, OldDatum, GElement, Datum>
    fun selection(): Selection<GElement, Datum, PElement, PDatum>
    fun transition(): Transition<GElement, Datum, PElement, PDatum>
    fun attr(name: String, value: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun attr(name: String, value: String): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun attr(name: String, value: Number): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun attr(name: String, value: Boolean): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun attr(name: String, value: ValueFn<GElement, Datum, dynamic /* String | Number | Boolean | Nothing? */>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun attrTween(name: String): ValueFn<GElement, Datum, (t: Number) -> String>?
    fun attrTween(name: String, factory: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun attrTween(name: String, factory: ValueFn<GElement, Datum, (t: Number) -> String>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun style(name: String, value: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun style(name: String, value: String, priority: String? = definedExternally /* null */): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun style(name: String, value: Number, priority: String? = definedExternally /* null */): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun style(name: String, value: Boolean, priority: String? = definedExternally /* null */): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun style(name: String, value: ValueFn<GElement, Datum, dynamic /* String | Number | Boolean | Nothing? */>, priority: String? = definedExternally /* null */): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun styleTween(name: String): ValueFn<GElement, Datum, (t: Number) -> String>?
    fun styleTween(name: String, factory: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun styleTween(name: String, factory: ValueFn<GElement, Datum, (t: Number) -> String>, priority: String? = definedExternally /* null */): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun text(value: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun text(value: String): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun text(value: Number): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun text(value: Boolean): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun text(value: ValueFn<GElement, Datum, dynamic /* String | Number | Boolean */>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun tween(name: String): ValueFn<GElement, Datum, (t: Number) -> Unit>?
    fun tween(name: String, tweenFn: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun tween(name: String, tweenFn: ValueFn<GElement, Datum, (t: Number) -> Unit>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun remove(): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun merge(other: Transition<GElement, Datum, PElement, PDatum>): Transition<GElement, Datum, PElement, PDatum>
    fun filter(filter: String): Transition<GElement, Datum, PElement, PDatum>
    fun <FilteredElement : BaseType> filter(filter: String): Transition<FilteredElement, Datum, PElement, PDatum>
    fun filter(filter: ValueFn<GElement, Datum, Boolean>): Transition<GElement, Datum, PElement, PDatum>
    fun <FilteredElement : BaseType> filter(filter: ValueFn<GElement, Datum, Boolean>): Transition<FilteredElement, Datum, PElement, PDatum>
    fun on(type: String): ValueFn<GElement, Datum, Unit>?
    fun on(typenames: String, listener: Nothing?): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun on(type: String, listener: ValueFn<GElement, Datum, Unit>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun each(func: ValueFn<GElement, Datum, Unit>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun call(func: (transition: Transition<GElement, Datum, PElement, PDatum>, args: Array<Any>) -> Any, vararg args: Any): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun empty(): Boolean
    fun node(): GElement?
    fun nodes(): Array<GElement>
    fun size(): Number
    fun delay(): Number
    fun delay(milliseconds: Number): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun delay(milliseconds: ValueFn<GElement, Datum, Number>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun duration(): Number
    fun duration(milliseconds: Number): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun duration(milliseconds: ValueFn<GElement, Datum, Number>): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun ease(): (normalizedTime: Number) -> Number
    fun ease(easingFn: (normalizedTime: Number) -> Number): Transition<GElement<BaseType>, Datum, PElement<BaseType>, PDatum> /* this */
    fun filter(filter: String): Transition<GElement, Datum, PElement, PDatum>
    fun filter(filter: ValueFn<GElement, Datum, Boolean>): Transition<GElement, Datum, PElement, PDatum>
}

external fun <OldDatum> transition(name: String? = definedExternally /* null */): Transition<HTMLElement, OldDatum, Nothing?, Nothing?>

external fun <OldDatum> transition(transition: Transition<BaseType, Any, BaseType, Any>): Transition<HTMLElement, OldDatum, Nothing?, Nothing?>