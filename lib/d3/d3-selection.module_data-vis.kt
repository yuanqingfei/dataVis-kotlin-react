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
    fun querySelectorAll(selectors: String): NodeListOf<Element>
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

typealias ValueFn<T, Datum, Result> = (this: T, datum: Datum, index: Number, groups: dynamic /* Array<T> | ArrayLike<T> */) -> Result

external interface TransitionLike<GElement : dynamic, Datum> {
    fun selection(): Selection<GElement, Datum, Any, Any>
    fun on(type: String, listener: Nothing?): TransitionLike<GElement, Datum>
    fun on(type: String, listener: ValueFn<GElement, Datum, Unit>): TransitionLike<GElement, Datum>
    fun tween(name: String, tweenFn: Nothing?): TransitionLike<GElement, Datum>
    fun tween(name: String, tweenFn: ValueFn<GElement, Datum, (t: Number) -> Unit>): TransitionLike<GElement, Datum>
}

external fun <GElement : dynamic, OldDatum> select(selector: String): Selection<GElement, OldDatum, HTMLElement, Any>

external fun <GElement : dynamic, OldDatum> select(node: GElement): Selection<GElement, OldDatum, Nothing?, Nothing?>

external fun selectAll(): Selection<Nothing?, Nothing?, Nothing?, Nothing?>

external fun selectAll(selector: Nothing?): Selection<Nothing?, Nothing?, Nothing?, Nothing?>

external fun selectAll(selector: Nothing?): Selection<Nothing?, Nothing?, Nothing?, Nothing?>

external fun <GElement : dynamic, OldDatum> selectAll(selector: String): Selection<GElement, OldDatum, HTMLElement, Any>

external fun <GElement : dynamic, OldDatum> selectAll(nodes: Array<GElement>): Selection<GElement, OldDatum, Nothing?, Nothing?>

external fun <GElement : dynamic, OldDatum> selectAll(nodes: ArrayLike<GElement>): Selection<GElement, OldDatum, Nothing?, Nothing?>

external interface Selection<GElement : dynamic, Datum, PElement : dynamic, PDatum> {
    fun <DescElement : dynamic> select(selector: String): Selection<DescElement, Datum, PElement, PDatum>
    fun <DescElement : dynamic> select(selector: Nothing?): Selection<Nothing?, Nothing?, PElement, PDatum>
    fun <DescElement : dynamic> select(selector: ValueFn<GElement, Datum, DescElement>): Selection<DescElement, Datum, PElement, PDatum>
    fun selectAll(): Selection<Nothing?, Nothing?, GElement, Datum>
    fun selectAll(selector: Nothing?): Selection<Nothing?, Nothing?, GElement, Datum>
    fun selectAll(selector: Nothing?): Selection<Nothing?, Nothing?, GElement, Datum>
    fun <DescElement : dynamic, OldDatum> selectAll(selector: String): Selection<DescElement, OldDatum, GElement, Datum>
    fun <DescElement : dynamic, OldDatum> selectAll(selector: ValueFn<GElement, Datum, dynamic /* Array<DescElement> | ArrayLike<DescElement> */>): Selection<DescElement, OldDatum, GElement, Datum>
    fun attr(name: String): String
    fun attr(name: String, value: Nothing?): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun attr(name: String, value: String): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun attr(name: String, value: Number): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun attr(name: String, value: Boolean): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun attr(name: String, value: ValueFn<GElement, Datum, dynamic /* String | Number | Boolean | Nothing? */>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun classed(names: String): Boolean
    fun classed(names: String, value: Boolean): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun classed(names: String, value: ValueFn<GElement, Datum, Boolean>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun style(name: String): String
    fun style(name: String, value: Nothing?): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun style(name: String, value: String, priority: String? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun style(name: String, value: Number, priority: String? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun style(name: String, value: Boolean, priority: String? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun style(name: String, value: ValueFn<GElement, Datum, dynamic /* String | Number | Boolean | Nothing? */>, priority: String? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun property(name: String): Any
    fun <T> property(name: Local<T>): T?
    fun property(name: String, value: ValueFn<GElement, Datum, Any>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun property(name: String, value: Nothing?): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun property(name: String, value: Any): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun <T> property(name: Local<T>, value: ValueFn<GElement, Datum, T>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun <T> property(name: Local<T>, value: T): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun text(): String
    fun text(value: Nothing?): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun text(value: String): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun text(value: Number): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun text(value: Boolean): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun text(value: ValueFn<GElement, Datum, dynamic /* String | Number | Boolean | Nothing? */>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun html(): String
    fun html(value: Nothing?): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun html(value: String): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun html(value: ValueFn<GElement, Datum, String?>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun <K : Any> append(type: K): Selection<Any, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> append(type: String): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> append(type: ValueFn<GElement, Datum, ChildElement>): Selection<ChildElement, Datum, PElement, PDatum>
    fun <K : Any> insert(type: K, before: String? = definedExternally /* null */): Selection<Any, Datum, PElement, PDatum>
    fun <K : Any> insert(type: K, before: ValueFn<GElement, Datum, dynamic /* Element | EnterElement | Document | Window | Nothing? */>? = definedExternally /* null */): Selection<Any, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> insert(type: String, before: String? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> insert(type: String, before: ValueFn<GElement, Datum, dynamic /* Element | EnterElement | Document | Window | Nothing? */>? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> insert(type: ValueFn<GElement, Datum, ChildElement>, before: String? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> insert(type: ValueFn<GElement, Datum, ChildElement>, before: ValueFn<GElement, Datum, dynamic /* Element | EnterElement | Document | Window | Nothing? */>? = definedExternally /* null */): Selection<ChildElement, Datum, PElement, PDatum>
    fun remove(): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun clone(deep: Boolean? = definedExternally /* null */): Selection<GElement, Datum, PElement, PDatum>
    fun merge(other: Selection<GElement, Datum, PElement, PDatum>): Selection<GElement, Datum, PElement, PDatum>
    fun filter(selector: String): Selection<GElement, Datum, PElement, PDatum>
    fun <FilteredElement : dynamic> filter(selector: String): Selection<FilteredElement, Datum, PElement, PDatum>
    fun filter(selector: ValueFn<GElement, Datum, Boolean>): Selection<GElement, Datum, PElement, PDatum>
    fun <FilteredElement : dynamic> filter(selector: ValueFn<GElement, Datum, Boolean>): Selection<FilteredElement, Datum, PElement, PDatum>
    fun sort(comparator: ((a: Datum, b: Datum) -> Number)? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun order(): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun raise(): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun lower(): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun datum(): Datum
    fun datum(value: Nothing?): Selection<GElement, Nothing?, PElement, PDatum>
    fun <NewDatum> datum(value: ValueFn<GElement, Datum, NewDatum>): Selection<GElement, NewDatum, PElement, PDatum>
    fun <NewDatum> datum(value: NewDatum): Selection<GElement, NewDatum, PElement, PDatum>
    fun data(): Array<Datum>
    fun <NewDatum> data(data: Array<NewDatum>, key: ValueFn<dynamic /* GElement | PElement */, dynamic /* Datum | NewDatum */, String>? = definedExternally /* null */): Selection<GElement, NewDatum, PElement, PDatum>
    fun <NewDatum> data(data: ValueFn<PElement, PDatum, Array<NewDatum>>, key: ValueFn<dynamic /* GElement | PElement */, dynamic /* Datum | NewDatum */, String>? = definedExternally /* null */): Selection<GElement, NewDatum, PElement, PDatum>
    fun <K : Any, OldDatum> join(enter: K, update: ((elem: Selection<GElement, Datum, PElement, PDatum>) -> Selection<GElement, Datum, PElement, PDatum>?)? = definedExternally /* null */, exit: ((elem: Selection<GElement, OldDatum, PElement, PDatum>) -> Unit)? = definedExternally /* null */): Selection<dynamic /* GElement | Any */, Datum, PElement, PDatum>
    fun <ChildElement : dynamic, OldDatum> join(enter: String, update: ((elem: Selection<GElement, Datum, PElement, PDatum>) -> Selection<GElement, Datum, PElement, PDatum>?)? = definedExternally /* null */, exit: ((elem: Selection<GElement, OldDatum, PElement, PDatum>) -> Unit)? = definedExternally /* null */): Selection<dynamic /* ChildElement | GElement */, Datum, PElement, PDatum>
    fun <ChildElement : dynamic, OldDatum> join(enter: (elem: Selection<EnterElement, Datum, PElement, PDatum>) -> Selection<ChildElement, Datum, PElement, PDatum>, update: ((elem: Selection<GElement, Datum, PElement, PDatum>) -> Selection<GElement, Datum, PElement, PDatum>?)? = definedExternally /* null */, exit: ((elem: Selection<GElement, OldDatum, PElement, PDatum>) -> Unit)? = definedExternally /* null */): Selection<dynamic /* ChildElement | GElement */, Datum, PElement, PDatum>
    fun enter(): Selection<EnterElement, Datum, PElement, PDatum>
    fun <OldDatum> exit(): Selection<GElement, OldDatum, PElement, PDatum>
    fun on(typenames: String): ValueFn<GElement, Datum, Unit>?
    fun on(typenames: String, listener: Nothing?): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun on(typenames: String, listener: ValueFn<GElement, Datum, Unit>, capture: Boolean? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun dispatch(type: String, parameters: CustomEventParameters? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun dispatch(type: String, parameters: ValueFn<GElement, Datum, CustomEventParameters>? = definedExternally /* null */): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun each(func: ValueFn<GElement, Datum, Unit>): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun call(func: (selection: Selection<GElement, Datum, PElement, PDatum>, args: Array<Any>) -> Unit, vararg args: Any): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
    fun empty(): Boolean
    fun node(): GElement?
    fun nodes(): Array<GElement>
    fun size(): Number
    fun <K : Any> insert(type: K): Selection<Any, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> insert(type: String): Selection<ChildElement, Datum, PElement, PDatum>
    fun <ChildElement : dynamic> insert(type: ValueFn<GElement, Datum, ChildElement>): Selection<ChildElement, Datum, PElement, PDatum>
    fun filter(selector: String): Selection<GElement, Datum, PElement, PDatum>
    fun filter(selector: ValueFn<GElement, Datum, Boolean>): Selection<GElement, Datum, PElement, PDatum>
    fun dispatch(type: String): Selection<GElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, Datum, PElement<dynamic /* Element | EnterElement | Document | Window | Nothing? */>, PDatum> /* this */
}

typealias SelectionFn = () -> Selection<HTMLElement, Any, Nothing?, Nothing?>

external var selection: SelectionFn

external interface BaseEvent {
    var type: String
    var sourceEvent: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external var event: Any

external fun <Context, Result> customEvent(event: BaseEvent, listener: (this: Context, args: Array<Any>) -> Result, that: Context, vararg args: Any): Result

external fun mouse(container: HTMLElement): dynamic /* JsTuple<Number, Number> */

external fun mouse(container: SVGSVGElement): dynamic /* JsTuple<Number, Number> */

external fun mouse(container: SVGGElement): dynamic /* JsTuple<Number, Number> */

external fun touch(container: HTMLElement, identifier: Number): dynamic /* dynamic | Nothing? */

external fun touch(container: SVGSVGElement, identifier: Number): dynamic /* dynamic | Nothing? */

external fun touch(container: SVGGElement, identifier: Number): dynamic /* dynamic | Nothing? */

external fun touch(container: HTMLElement, touches: TouchList, identifier: Number): dynamic /* dynamic | Nothing? */

external fun touch(container: SVGSVGElement, touches: TouchList, identifier: Number): dynamic /* dynamic | Nothing? */

external fun touch(container: SVGGElement, touches: TouchList, identifier: Number): dynamic /* dynamic | Nothing? */

external fun touches(container: HTMLElement, touches: TouchList? = definedExternally /* null */): Array<dynamic /* JsTuple<Number, Number> */>

external fun touches(container: SVGSVGElement, touches: TouchList? = definedExternally /* null */): Array<dynamic /* JsTuple<Number, Number> */>

external fun touches(container: SVGGElement, touches: TouchList? = definedExternally /* null */): Array<dynamic /* JsTuple<Number, Number> */>

external fun clientPoint(container: HTMLElement, event: ClientPointEvent): dynamic /* JsTuple<Number, Number> */

external fun clientPoint(container: SVGSVGElement, event: ClientPointEvent): dynamic /* JsTuple<Number, Number> */

external fun clientPoint(container: SVGGElement, event: ClientPointEvent): dynamic /* JsTuple<Number, Number> */

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

external fun namespace(prefixedLocal: String): dynamic /* NamespaceLocalObject | String */

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

external fun <K : Any> create(name: K): Selection<Any, Nothing?, Nothing?, Nothing?>

external fun <NewGElement : Element> create(name: String): Selection<NewGElement, Nothing?, Nothing?, Nothing?>

external fun <K : Any> creator(name: K): (this: dynamic /* Element | EnterElement | Document | Window | Nothing? */) -> Any

external fun <NewGElement : Element> creator(name: String): (this: dynamic /* Element | EnterElement | Document | Window | Nothing? */) -> NewGElement

external fun matcher(selector: String): (this: dynamic /* Element | EnterElement | Document | Window | Nothing? */) -> Boolean

external fun <DescElement : Element> selector(selector: String): (this: dynamic /* Element | EnterElement | Document | Window | Nothing? */) -> DescElement

external fun <DescElement : Element> selectorAll(selector: String): (this: dynamic /* Element | EnterElement | Document | Window | Nothing? */) -> NodeListOf<DescElement>