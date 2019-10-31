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

external interface VoronoiPoint : Array<Number> {
    var `0`: Number
    var `1`: Number
}

external interface VoronoiPointPair : Array<dynamic /* JsTuple<Number, Number> */> {
    var `0`: dynamic /* JsTuple<Number, Number> */
    var `1`: dynamic /* JsTuple<Number, Number> */
}

external interface VoronoiPolygon<T> : Array<dynamic /* JsTuple<Number, Number> */> {
    var data: T
}

external interface VoronoiSite<T> : VoronoiPoint {
    var index: Number
    var data: T
}

external interface VoronoiCell<T> {
    var site: VoronoiSite<T>
    var halfedges: Array<Number>
}

external interface VoronoiEdge<T> : VoronoiPointPair {
    var left: VoronoiSite<T>
    var right: VoronoiSite<T>?
}

external interface VoronoiLink<T> {
    var source: T
    var target: T
}

external interface VoronoiLayout<T> {
    @nativeInvoke
    operator fun invoke(data: Array<T>): VoronoiDiagram<T>
    fun x(): (d: T) -> Number
    fun x(x: (d: T) -> Number): VoronoiLayout<T> /* this */
    fun y(): (d: T) -> Number
    fun y(y: (d: T) -> Number): VoronoiLayout<T> /* this */
    fun extent(): dynamic /* dynamic | Nothing? */
    fun extent(extent: dynamic /* JsTuple<dynamic, dynamic> */): VoronoiLayout<T> /* this */
    fun size(): dynamic /* dynamic | Nothing? */
    fun size(size: dynamic /* JsTuple<Number, Number> */): VoronoiLayout<T> /* this */
    fun polygons(data: Array<T>): Array<VoronoiPolygon<T>>
    fun triangles(data: Array<T>): Array<VoronoiTriangle<T>>
    fun links(data: Array<T>): Array<VoronoiLink<T>>
}

external interface VoronoiDiagram<T> {
    var edges: Array<VoronoiEdge<T>>
    var cells: Array<VoronoiCell<T>?>
    fun polygons(): Array<VoronoiPolygon<T>>
    fun triangles(): Array<VoronoiTriangle<T>>
    fun links(): Array<VoronoiLink<T>>
    fun find(x: Number, y: Number, radius: Number? = definedExternally /* null */): VoronoiSite<T>?
}

external fun <T> voronoi(): VoronoiLayout<T>