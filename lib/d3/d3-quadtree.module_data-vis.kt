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

external interface QuadtreeLeaf<T> {
    var data: T
    var next: QuadtreeLeaf<T>?
        get() = definedExternally
        set(value) = definedExternally
    var length: Nothing?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QuadtreeInternalNode<T> : Array<dynamic /* QuadtreeInternalNode<T> | QuadtreeLeaf<T> | Nothing? */> {
    var length: String /* 4 */
}

external interface Quadtree<T> {
    fun x(): (d: T) -> Number
    fun x(x: (d: T) -> Number): Quadtree<T> /* this */
    fun y(): (d: T) -> Number
    fun y(y: (d: T) -> Number): Quadtree<T> /* this */
    fun extent(): dynamic /* dynamic | Nothing? */
    fun extent(extend: dynamic /* JsTuple<dynamic, dynamic> */): Quadtree<T> /* this */
    fun cover(x: Number, y: Number): Quadtree<T> /* this */
    fun add(datum: T): Quadtree<T> /* this */
    fun addAll(data: Array<T>): Quadtree<T> /* this */
    fun remove(datum: T): Quadtree<T> /* this */
    fun removeAll(data: Array<T>): Quadtree<T> /* this */
    fun copy(): Quadtree<T>
    fun root(): dynamic /* QuadtreeInternalNode<T> | QuadtreeLeaf<T> */
    fun data(): Array<T>
    fun size(): Number
    fun find(x: Number, y: Number, radius: Number? = definedExternally /* null */): T?
    fun visit(callback: (node: dynamic /* QuadtreeInternalNode<T> | QuadtreeLeaf<T> */, x0: Number, y0: Number, x1: Number, y1: Number) -> dynamic): Quadtree<T> /* this */
    fun visitAfter(callback: (node: dynamic /* QuadtreeInternalNode<T> | QuadtreeLeaf<T> */, x0: Number, y0: Number, x1: Number, y1: Number) -> Unit): Quadtree<T> /* this */
}

external fun <T> quadtree(): Quadtree<T>

external fun <T> quadtree(data: Array<T>, x: ((d: T) -> Number)? = definedExternally /* null */, y: ((d: T) -> Number)? = definedExternally /* null */): Quadtree<T>