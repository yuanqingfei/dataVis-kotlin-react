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

external interface HierarchyLink<Datum> {
    var source: HierarchyNode<Datum>
    var target: HierarchyNode<Datum>
}

external interface HierarchyNode<Datum> {
    var data: Datum
    var depth: Number
    var height: Number
    var parent: dynamic /* HierarchyNode<Datum> | Nothing? */
    var children: Array<HierarchyNode<Datum> /* this */>?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    fun ancestors(): Array<HierarchyNode<Datum> /* this */>
    fun descendants(): Array<HierarchyNode<Datum> /* this */>
    fun leaves(): Array<HierarchyNode<Datum> /* this */>
    fun path(target: HierarchyNode<Datum> /* this */): Array<HierarchyNode<Datum> /* this */>
    fun links(): Array<HierarchyLink<Datum>>
    fun sum(value: (d: Datum) -> Number): HierarchyNode<Datum> /* this */
    fun count(): HierarchyNode<Datum> /* this */
    fun sort(compare: (a: HierarchyNode<Datum> /* this */, b: HierarchyNode<Datum> /* this */) -> Number): HierarchyNode<Datum> /* this */
    fun each(func: (node: HierarchyNode<Datum> /* this */) -> Unit): HierarchyNode<Datum> /* this */
    fun eachAfter(func: (node: HierarchyNode<Datum> /* this */) -> Unit): HierarchyNode<Datum> /* this */
    fun eachBefore(func: (node: HierarchyNode<Datum> /* this */) -> Unit): HierarchyNode<Datum> /* this */
    fun copy(): HierarchyNode<Datum> /* this */
}

external fun <Datum> hierarchy(data: Datum, children: ((d: Datum) -> Array<Datum>?)? = definedExternally /* null */): HierarchyNode<Datum>

external interface StratifyOperator<Datum> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): HierarchyNode<Datum>
    fun id(): (d: Datum, i: Number, data: Array<Datum>) -> dynamic
    fun id(id: (d: Datum, i: Number, data: Array<Datum>) -> dynamic): StratifyOperator<Datum> /* this */
    fun parentId(): (d: Datum, i: Number, data: Array<Datum>) -> dynamic
    fun parentId(parentId: (d: Datum, i: Number, data: Array<Datum>) -> dynamic): StratifyOperator<Datum> /* this */
}

external fun <Datum> stratify(): StratifyOperator<Datum>

external interface HierarchyPointLink<Datum> {
    var source: HierarchyPointNode<Datum>
    var target: HierarchyPointNode<Datum>
}

external interface HierarchyPointNode<Datum> : HierarchyNode<Datum> {
    var x: Number
    var y: Number
    override fun links(): Array<HierarchyPointLink<Datum>>
}

external interface ClusterLayout<Datum> {
    @nativeInvoke
    operator fun invoke(root: HierarchyNode<Datum>): HierarchyPointNode<Datum>
    fun size(): dynamic /* dynamic | Nothing? */
    fun size(size: dynamic /* JsTuple<Number, Number> */): ClusterLayout<Datum> /* this */
    fun nodeSize(): dynamic /* dynamic | Nothing? */
    fun nodeSize(size: dynamic /* JsTuple<Number, Number> */): ClusterLayout<Datum> /* this */
    fun separation(): (a: HierarchyPointNode<Datum>, b: HierarchyPointNode<Datum>) -> Number
    fun separation(separation: (a: HierarchyPointNode<Datum>, b: HierarchyPointNode<Datum>) -> Number): ClusterLayout<Datum> /* this */
}

external fun <Datum> cluster(): ClusterLayout<Datum>

external interface TreeLayout<Datum> {
    @nativeInvoke
    operator fun invoke(root: HierarchyNode<Datum>): HierarchyPointNode<Datum>
    fun size(): dynamic /* dynamic | Nothing? */
    fun size(size: dynamic /* JsTuple<Number, Number> */): TreeLayout<Datum> /* this */
    fun nodeSize(): dynamic /* dynamic | Nothing? */
    fun nodeSize(size: dynamic /* JsTuple<Number, Number> */): TreeLayout<Datum> /* this */
    fun separation(): (a: HierarchyPointNode<Datum>, b: HierarchyPointNode<Datum>) -> Number
    fun separation(separation: (a: HierarchyPointNode<Datum>, b: HierarchyPointNode<Datum>) -> Number): TreeLayout<Datum> /* this */
}

external fun <Datum> tree(): TreeLayout<Datum>

external interface HierarchyRectangularLink<Datum> {
    var source: HierarchyRectangularNode<Datum>
    var target: HierarchyRectangularNode<Datum>
}

external interface HierarchyRectangularNode<Datum> : HierarchyNode<Datum> {
    var x0: Number
    var y0: Number
    var x1: Number
    var y1: Number
    override fun links(): Array<HierarchyRectangularLink<Datum>>
}

external interface TreemapLayout<Datum> {
    @nativeInvoke
    operator fun invoke(root: HierarchyNode<Datum>): HierarchyRectangularNode<Datum>
    fun tile(): (node: HierarchyRectangularNode<Datum>, x0: Number, y0: Number, x1: Number, y1: Number) -> Unit
    fun tile(tile: (node: HierarchyRectangularNode<Datum>, x0: Number, y0: Number, x1: Number, y1: Number) -> Unit): TreemapLayout<Datum> /* this */
    fun size(): dynamic /* JsTuple<Number, Number> */
    fun size(size: dynamic /* JsTuple<Number, Number> */): TreemapLayout<Datum> /* this */
    fun round(): Boolean
    fun round(round: Boolean): TreemapLayout<Datum> /* this */
    fun padding(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun padding(padding: Number): TreemapLayout<Datum> /* this */
    fun padding(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
    fun paddingInner(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun paddingInner(padding: Number): TreemapLayout<Datum> /* this */
    fun paddingInner(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
    fun paddingOuter(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun paddingOuter(padding: Number): TreemapLayout<Datum> /* this */
    fun paddingOuter(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
    fun paddingTop(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun paddingTop(padding: Number): TreemapLayout<Datum> /* this */
    fun paddingTop(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
    fun paddingRight(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun paddingRight(padding: Number): TreemapLayout<Datum> /* this */
    fun paddingRight(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
    fun paddingBottom(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun paddingBottom(padding: Number): TreemapLayout<Datum> /* this */
    fun paddingBottom(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
    fun paddingLeft(): (node: HierarchyRectangularNode<Datum>) -> Number
    fun paddingLeft(padding: Number): TreemapLayout<Datum> /* this */
    fun paddingLeft(padding: (node: HierarchyRectangularNode<Datum>) -> Number): TreemapLayout<Datum> /* this */
}

external fun <Datum> treemap(): TreemapLayout<Datum>

external fun treemapBinary(node: HierarchyRectangularNode<Any>, x0: Number, y0: Number, x1: Number, y1: Number)

external fun treemapDice(node: HierarchyRectangularNode<Any>, x0: Number, y0: Number, x1: Number, y1: Number)

external fun treemapSlice(node: HierarchyRectangularNode<Any>, x0: Number, y0: Number, x1: Number, y1: Number)

external fun treemapSliceDice(node: HierarchyRectangularNode<Any>, x0: Number, y0: Number, x1: Number, y1: Number)

external interface RatioSquarifyTilingFactory {
    @nativeInvoke
    operator fun invoke(node: HierarchyRectangularNode<Any>, x0: Number, y0: Number, x1: Number, y1: Number)
    fun ratio(ratio: Number): RatioSquarifyTilingFactory
}

external var treemapSquarify: RatioSquarifyTilingFactory

external var treemapResquarify: RatioSquarifyTilingFactory

external interface PartitionLayout<Datum> {
    @nativeInvoke
    operator fun invoke(root: HierarchyNode<Datum>): HierarchyRectangularNode<Datum>
    fun size(): dynamic /* JsTuple<Number, Number> */
    fun size(size: dynamic /* JsTuple<Number, Number> */): PartitionLayout<Datum> /* this */
    fun round(): Boolean
    fun round(round: Boolean): PartitionLayout<Datum> /* this */
    fun padding(): Number
    fun padding(padding: Number): PartitionLayout<Datum> /* this */
}

external fun <Datum> partition(): PartitionLayout<Datum>

external interface HierarchyCircularLink<Datum> {
    var source: HierarchyCircularNode<Datum>
    var target: HierarchyCircularNode<Datum>
}

external interface HierarchyCircularNode<Datum> : HierarchyNode<Datum> {
    var x: Number
    var y: Number
    var r: Number
    override fun links(): Array<HierarchyCircularLink<Datum>>
}

external interface PackLayout<Datum> {
    @nativeInvoke
    operator fun invoke(root: HierarchyNode<Datum>): HierarchyCircularNode<Datum>
    fun radius(): ((node: HierarchyCircularNode<Datum>) -> Number)?
    fun radius(radius: ((node: HierarchyCircularNode<Datum>) -> Number)?): PackLayout<Datum> /* this */
    fun size(): dynamic /* JsTuple<Number, Number> */
    fun size(size: dynamic /* JsTuple<Number, Number> */): PackLayout<Datum> /* this */
    fun padding(): (node: HierarchyCircularNode<Datum>) -> Number
    fun padding(padding: Number): PackLayout<Datum> /* this */
    fun padding(padding: (node: HierarchyCircularNode<Datum>) -> Number): PackLayout<Datum> /* this */
}

external fun <Datum> pack(): PackLayout<Datum>

external interface PackRadius {
    var r: Number
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PackCircle {
    var r: Number
    var x: Number
    var y: Number
}

external fun <Datum : PackRadius> packSiblings(circles: Array<Datum>): Array<Datum /* Datum & PackCircle */>

external fun <Datum : PackCircle> packEnclose(circles: Array<Datum>): PackCircle