@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("d3-selection")
package d3

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

external class BaseType: Any

external interface ArrayLike<T> {
    var length: Number
    fun item(index: Number): T?
    @nativeGetter
    operator fun get(index: Number): T?
    @nativeSetter
    operator fun set(index: Number, value: T)
}

external interface EnterElement {
    var ownerDocument: Document
    var namespaceURI: String
    fun appendChild(newChild: Node): Node
    fun insertBefore(newChild: Node, refChild: Node): Node
    fun querySelector(selectors: String): Element
    fun querySelectorAll(selectors: String): Any
}

external interface ClientPointEvent {
    var clientX: Number
    var clientY: Number
}

external interface CustomEventParameters {
    var bubbles: Boolean
    var cancelable: Boolean
    var detail: Any
}


external interface TransitionLike<GElement : Any, Datum> {
    fun selection(): Selection<GElement, Datum, Any, Any>
    fun on(type: String, listener: Nothing?): TransitionLike<GElement, Datum>
    fun on(type: String, listener: Any): TransitionLike<GElement, Datum>
    fun tween(name: String, tweenFn: Nothing?): TransitionLike<GElement, Datum>
    fun tween(name: String, tweenFn: Any): TransitionLike<GElement, Datum>
}

external fun <GElement : BaseType, OldDatum> select(selector: String): Selection<GElement, OldDatum, HTMLElement, Any>

external fun <GElement : Any, OldDatum> select(node: GElement): Selection<GElement, OldDatum, Any, Nothing?>

external fun selectAll(): Selection<Any, Nothing?, Any, Nothing?>

external fun selectAll(selector: Nothing?): Selection<Any, Nothing?, Any, Nothing?>

external fun selectAll(selector: Nothing?): Selection<Any, Nothing?, Any, Nothing?>

external fun <GElement : Any, OldDatum> selectAll(selector: String): Selection<GElement, OldDatum, HTMLElement, Any>

external fun <GElement : Any, OldDatum> selectAll(nodes: Array<GElement>): Selection<GElement, OldDatum, Any, Nothing?>

external fun <GElement : Any, OldDatum> selectAll(nodes: ArrayLike<GElement>): Selection<GElement, OldDatum, Any, Nothing?>

external interface Selection<GElement : Any, Datum, PElement : Any, PDatum> {
    fun <DescElement : Any> select(selector: String): Selection<DescElement, Datum, PElement, PDatum>
    fun <DescElement : Any> select(selector: Nothing?): Selection<Any, Nothing?, PElement, PDatum>
    fun <DescElement : Any> select(selector: Any): Selection<DescElement, Datum, PElement, PDatum>
    fun selectAll(): Selection<Any, Nothing?, GElement, Datum>
    fun selectAll(selector: Nothing?): Selection<Any, Nothing?, GElement, Datum>
    fun selectAll(selector: Nothing?): Selection<Any, Nothing?, GElement, Datum>
    fun <DescElement : Any, OldDatum> selectAll(selector: String): Selection<DescElement, OldDatum, GElement, Datum>
    fun <DescElement : Any, OldDatum> selectAll(selector: Any): Selection<DescElement, OldDatum, GElement, Datum>
    fun attr(name: String): String
    fun attr(name: String, value: Nothing?): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun attr(name: String, value: String): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun attr(name: String, value: Number): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun attr(name: String, value: Boolean): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun attr(name: String, value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun classed(names: String): Boolean
    fun classed(names: String, value: Boolean): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun classed(names: String, value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun style(name: String): String
    fun style(name: String, value: Nothing?): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun style(name: String, value: String, priority: String? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun style(name: String, value: Number, priority: String? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun style(name: String, value: Boolean, priority: String? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun style(name: String, value: Any, priority: String? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun property(name: String): Any
    fun <T> property(name: Local<T>): T?
    fun property(name: String, value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun property(name: String, value: Nothing?): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun property(name: String, value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun <T> property(name: Local<T>, value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun <T> property(name: Local<T>, value: T): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun text(): String
    fun text(value: Nothing?): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun text(value: String): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun text(value: Number): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun text(value: Boolean): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun text(value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun html(): String
    fun html(value: Nothing?): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun html(value: String): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun html(value: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun <K : Any> append(type: K): Selection<Any, Datum, PElement, PDatum>
    fun <ChildElement : Any> append(type: String): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : Any> append(type: Any): Selection<ChildElement, Datum, PElement, PDatum>
    fun <K : Any> insert(type: K, before: String? = definedExternally /* null */): Selection<Any, Datum, PElement, PDatum>
    fun <K : Any> insert(type: K, before: Any? = definedExternally /* null */): Selection<Any, Datum, PElement, PDatum>
    fun <ChildElement : Any> insert(type: String, before: String? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : Any> insert(type: String, before: Any? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : Any> insert(type: Any, before: String? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : Any> insert(type: Any, before: Any? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun remove(): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun clone(deep: Boolean? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum>
    fun merge(other: Selection<GElement, Datum, PElement, PDatum>): Selection<GElement, Datum, PElement, PDatum>
    fun filter(selector: String): Selection<GElement, Datum, PElement, PDatum>
    fun <FilteredElement : Any> filter(selector: String): Selection<FilteredElement, Datum, PElement, PDatum>
    fun filter(selector: Any): Selection<GElement, Datum, PElement, PDatum>
    fun <FilteredElement : Any> filter(selector: Any): Selection<FilteredElement, Datum, PElement, PDatum>
    fun sort(comparator: ((a: Datum, b: Datum) -> Number)? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun order(): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun raise(): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun lower(): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun datum(): Datum
    fun datum(value: Nothing?): Selection<GElement, Nothing?, PElement, PDatum>
    fun <NewDatum> datum(value: Any): Selection<GElement, NewDatum, PElement, PDatum>
    fun <NewDatum> datum(value: NewDatum): Selection<GElement, NewDatum, PElement, PDatum>
    fun data(): Array<Datum>
    fun <NewDatum> data(data: Array<NewDatum>, key: Any? = definedExternally /* null */): Selection<GElement, NewDatum, PElement, PDatum>
    fun <NewDatum> data(data: Any, key: Any? = definedExternally /* null */): Selection<GElement, NewDatum, PElement, PDatum>
    fun <K : Any, OldDatum> join(enter: K, update: ((elem: Selection<GElement, Datum, PElement, PDatum>) -> Selection<GElement, Datum, PElement, PDatum>?)? = definedExternally /* null */, exit: ((elem: Selection<GElement, OldDatum, PElement, PDatum>) -> Unit)? = definedExternally /* null */): Selection<dynamic /* GElement | Any */, Datum, PElement, PDatum>
    fun <ChildElement : Any, OldDatum> join(enter: String, update: ((elem: Selection<GElement, Datum, PElement, PDatum>) -> Selection<GElement, Datum, PElement, PDatum>?)? = definedExternally /* null */, exit: ((elem: Selection<GElement, OldDatum, PElement, PDatum>) -> Unit)? = definedExternally /* null */): Selection<dynamic /* ChildElement | GElement */, Datum, PElement, PDatum>
    fun <ChildElement : Any, OldDatum> join(enter: (elem: Selection<EnterElement, Datum, PElement, PDatum>) -> Selection<ChildElement, Datum, PElement, PDatum>, update: ((elem: Selection<GElement, Datum, PElement, PDatum>) -> Selection<GElement, Datum, PElement, PDatum>?)? = definedExternally /* null */, exit: ((elem: Selection<GElement, OldDatum, PElement, PDatum>) -> Unit)? = definedExternally /* null */): Selection<dynamic /* ChildElement | GElement */, Datum, PElement, PDatum>
    fun enter(): Selection<EnterElement, Datum, PElement, PDatum>
    fun <OldDatum> exit(): Selection<GElement, OldDatum, PElement, PDatum>
    fun on(typenames: String): Any?
    fun on(typenames: String, listener: Nothing?): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun on(typenames: String, listener: Any, capture: Boolean? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun dispatch(type: String, parameters: CustomEventParameters? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun dispatch(type: String, parameters: Any? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun each(func: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun call(func: (selection: Selection<GElement, Datum, PElement, PDatum>, args: Array<Any>) -> Unit, vararg args: Any): Selection<GElement, Datum, PElement, PDatum> /* this */
    fun empty(): Boolean
    fun node(): GElement?
    fun nodes(): Array<GElement>
    fun size(): Number
    fun <K : Any> insert(type: K): Selection<Any, Datum, PElement, PDatum>
    fun <ChildElement : Any> insert(type: String): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : Any> insert(type: Any): Selection<ChildElement, Datum, PElement, PDatum>
    fun filter(selector: String): Selection<GElement, Datum, PElement, PDatum>
    fun filter(selector: Any): Selection<GElement, Datum, PElement, PDatum>
    fun dispatch(type: String): Selection<GElement, Datum, PElement, PDatum> /* this */
}

external var selection: Any

external interface BaseEvent {
    var type: String
    var sourceEvent: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external var event: Any

external fun <Context, Result> customEvent(event: BaseEvent, listener: (thisObj: Context, args: Array<Any>) -> Result, that: Context, vararg args: Any): Result

external fun mouse(container: HTMLElement): Any /* JsTuple<Number, Number> */

external fun mouse(container: SVGSVGElement): Any /* JsTuple<Number, Number> */

external fun mouse(container: SVGGElement): Any /* JsTuple<Number, Number> */

external fun touch(container: HTMLElement, identifier: Number): Any /* dynamic | Nothing? */

external fun touch(container: SVGSVGElement, identifier: Number): Any /* dynamic | Nothing? */

external fun touch(container: SVGGElement, identifier: Number): Any /* dynamic | Nothing? */

external fun touch(container: HTMLElement, touches: Any, identifier: Number): Any /* dynamic | Nothing? */

external fun touch(container: SVGSVGElement, touches: Any, identifier: Number): Any /* dynamic | Nothing? */

external fun touch(container: SVGGElement, touches: Any, identifier: Number): Any /* dynamic | Nothing? */

external fun touches(container: HTMLElement, touches: Any? = definedExternally /* null */): Array<dynamic /* JsTuple<Number, Number> */>

external fun touches(container: SVGSVGElement, touches: Any? = definedExternally /* null */): Array<dynamic /* JsTuple<Number, Number> */>

external fun touches(container: SVGGElement, touches: Any? = definedExternally /* null */): Array<dynamic /* JsTuple<Number, Number> */>

external fun clientPoint(container: HTMLElement, event: ClientPointEvent): Any /* JsTuple<Number, Number> */

external fun clientPoint(container: SVGSVGElement, event: ClientPointEvent): Any /* JsTuple<Number, Number> */

external fun clientPoint(container: SVGGElement, event: ClientPointEvent): Any /* JsTuple<Number, Number> */

external fun style(node: Element, name: String): String

external interface Local<T> {
    fun get(node: Element): T?
    fun remove(node: Element): Boolean
    fun set(node: Element, value: T): Element
    override fun toString(): String
}

external fun <T> local(): Local<T>

external interface NamespaceLocalObject {
    var space: String
    var local: String
}

external fun namespace(prefixedLocal: String): Any /* NamespaceLocalObject | String */

external interface NamespaceMap {
    @nativeGetter
    operator fun get(prefix: String): String?
    @nativeSetter
    operator fun set(prefix: String, value: String)
}

external var namespaces: NamespaceMap

external fun window(DOMNode: Window): Window

external fun window(DOMNode: Document): Window

external fun window(DOMNode: Element): Window

external fun <K : Any> create(name: K): Selection<Any, Nothing?, Any, Nothing?>

external fun <NewGElement : Element> create(name: String): Selection<NewGElement, Nothing?, Any, Nothing?>

external fun <K : Any> creator(name: K): (thisObj: Any /* Element | EnterElement | Document | Window | Nothing? */) -> Any

external fun <NewGElement : Element> creator(name: String): (thisObj: Any /* Element | EnterElement | Document | Window | Nothing? */) -> NewGElement

external fun matcher(selector: String): (thisObj: Any /* Element | EnterElement | Document | Window | Nothing? */) -> Boolean

external fun <DescElement : Element> selector(selector: String): (thisObj: Any /* Element | EnterElement | Document | Window | Nothing? */) -> DescElement

external fun <DescElement : Element> selectorAll(selector: String): (thisObj: Any /* Element | EnterElement | Document | Window | Nothing? */) -> Any