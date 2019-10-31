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

external interface GeoSphere {
    var type: String /* 'Sphere' */
}

external interface `T$0` {
    var type: String
    var properties: Any
}

external interface ExtendedGeometryCollection<GeometryType : dynamic> {
    var type: String
    var bbox: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var crs: `T$0`?
        get() = definedExternally
        set(value) = definedExternally
    var geometries: Array<GeometryType>
}

external interface ExtendedFeature<GeometryType : dynamic, Properties : GeoJSON.GeoJsonProperties> : GeoJSON.GeoJsonObject {
    var geometry: GeometryType
    var properties: Properties
    var id: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExtendedFeatureCollection<FeatureType : ExtendedFeature> : GeoJSON.GeoJsonObject {
    var features: Array<FeatureType>
}

external fun geoArea(`object`: ExtendedFeature): Number

external fun geoArea(`object`: ExtendedFeatureCollection): Number

external fun geoArea(`object`: GeoJSON.GeometryObject): Number

external fun geoArea(`object`: GeoSphere): Number

external fun geoArea(`object`: ExtendedGeometryCollection): Number

external fun geoBounds(`object`: ExtendedFeature): dynamic /* JsTuple<dynamic, dynamic> */

external fun geoBounds(`object`: ExtendedFeatureCollection): dynamic /* JsTuple<dynamic, dynamic> */

external fun geoBounds(`object`: GeoJSON.GeometryObject): dynamic /* JsTuple<dynamic, dynamic> */

external fun geoBounds(`object`: GeoSphere): dynamic /* JsTuple<dynamic, dynamic> */

external fun geoBounds(`object`: ExtendedGeometryCollection): dynamic /* JsTuple<dynamic, dynamic> */

external fun geoCentroid(`object`: ExtendedFeature): dynamic /* JsTuple<Number, Number> */

external fun geoCentroid(`object`: ExtendedFeatureCollection): dynamic /* JsTuple<Number, Number> */

external fun geoCentroid(`object`: GeoJSON.GeometryObject): dynamic /* JsTuple<Number, Number> */

external fun geoCentroid(`object`: GeoSphere): dynamic /* JsTuple<Number, Number> */

external fun geoCentroid(`object`: ExtendedGeometryCollection): dynamic /* JsTuple<Number, Number> */

external fun geoContains(`object`: ExtendedFeature, point: dynamic /* JsTuple<Number, Number> */): Boolean

external fun geoContains(`object`: ExtendedFeatureCollection, point: dynamic /* JsTuple<Number, Number> */): Boolean

external fun geoContains(`object`: GeoJSON.GeometryObject, point: dynamic /* JsTuple<Number, Number> */): Boolean

external fun geoContains(`object`: GeoSphere, point: dynamic /* JsTuple<Number, Number> */): Boolean

external fun geoContains(`object`: ExtendedGeometryCollection, point: dynamic /* JsTuple<Number, Number> */): Boolean

external fun geoDistance(a: dynamic /* JsTuple<Number, Number> */, b: dynamic /* JsTuple<Number, Number> */): Number

external fun geoLength(`object`: ExtendedFeature): Number

external fun geoLength(`object`: ExtendedFeatureCollection): Number

external fun geoLength(`object`: GeoJSON.GeometryObject): Number

external fun geoLength(`object`: GeoSphere): Number

external fun geoLength(`object`: ExtendedGeometryCollection): Number

external fun geoInterpolate(a: dynamic /* JsTuple<Number, Number> */, b: dynamic /* JsTuple<Number, Number> */): (t: Number) -> dynamic

external interface GeoRotation {
    @nativeInvoke
    operator fun invoke(point: dynamic /* JsTuple<Number, Number> */): dynamic /* JsTuple<Number, Number> */
    fun invert(point: dynamic /* JsTuple<Number, Number> */): dynamic /* JsTuple<Number, Number> */
}

external fun geoRotation(angles: dynamic /* JsTuple<Number, Number> */): GeoRotation

external fun geoRotation(angles: dynamic /* JsTuple<Number, Number, Number> */): GeoRotation

external interface GeoCircleGenerator<This, Datum> {
    @nativeInvoke
    operator fun invoke(this: This, d: Datum? = definedExternally /* null */, vararg args: Any): GeoJSON.Polygon
    fun center(): (this: This, d: Datum, args: Any) -> dynamic
    fun center(center: dynamic /* JsTuple<Number, Number> */): GeoCircleGenerator<This, Datum> /* this */
    fun center(center: (this: This, d: Datum, args: Array<Any>) -> dynamic): GeoCircleGenerator<This, Datum> /* this */
    fun radius(): (this: This, d: Datum, args: Any) -> Number
    fun radius(radius: Number): GeoCircleGenerator<This, Datum> /* this */
    fun radius(radius: (this: This, d: Datum, args: Array<Any>) -> Number): GeoCircleGenerator<This, Datum> /* this */
    fun precision(): (this: This, d: Datum, args: Any) -> Number
    fun precision(precision: Number): GeoCircleGenerator<This, Datum> /* this */
    fun precision(precision: (this: This, d: Datum, args: Array<Any>) -> Number): GeoCircleGenerator<This, Datum> /* this */
}

external fun geoCircle(): GeoCircleGenerator

external fun <Datum> geoCircle(): GeoCircleGenerator<Any, Datum>

external fun <This, Datum> geoCircle(): GeoCircleGenerator<This, Datum>

external interface GeoGraticuleGenerator {
    @nativeInvoke
    operator fun invoke(): GeoJSON.MultiLineString
    fun lines(): Array<GeoJSON.LineString>
    fun outline(): GeoJSON.Polygon
    fun extent(): dynamic /* JsTuple<dynamic, dynamic> */
    fun extent(extent: dynamic /* JsTuple<dynamic, dynamic> */): GeoGraticuleGenerator /* this */
    fun extentMajor(): dynamic /* JsTuple<dynamic, dynamic> */
    fun extentMajor(extent: dynamic /* JsTuple<dynamic, dynamic> */): GeoGraticuleGenerator /* this */
    fun extentMinor(): dynamic /* JsTuple<dynamic, dynamic> */
    fun extentMinor(extent: dynamic /* JsTuple<dynamic, dynamic> */): GeoGraticuleGenerator /* this */
    fun step(): dynamic /* JsTuple<Number, Number> */
    fun step(step: dynamic /* JsTuple<Number, Number> */): GeoGraticuleGenerator /* this */
    fun stepMajor(): dynamic /* JsTuple<Number, Number> */
    fun stepMajor(step: dynamic /* JsTuple<Number, Number> */): GeoGraticuleGenerator /* this */
    fun stepMinor(): dynamic /* JsTuple<Number, Number> */
    fun stepMinor(step: dynamic /* JsTuple<Number, Number> */): GeoGraticuleGenerator /* this */
    fun precision(): Number
    fun precision(angle: Number): GeoGraticuleGenerator /* this */
}

external fun geoGraticule(): GeoGraticuleGenerator

external fun geoGraticule10(): GeoJSON.MultiLineString

external interface GeoStream {
    fun lineEnd()
    fun lineStart()
    fun point(x: Number, y: Number, z: Number? = definedExternally /* null */)
    fun polygonEnd()
    fun polygonStart()
    val sphere: (() -> Unit)?
        get() = definedExternally
}

external fun geoStream(`object`: ExtendedFeature, stream: GeoStream)

external fun geoStream(`object`: ExtendedFeatureCollection, stream: GeoStream)

external fun geoStream(`object`: GeoJSON.GeometryObject, stream: GeoStream)

external fun geoStream(`object`: GeoSphere, stream: GeoStream)

external fun geoStream(`object`: ExtendedGeometryCollection, stream: GeoStream)

external interface GeoRawProjection {
    @nativeInvoke
    operator fun invoke(lambda: Number, phi: Number): dynamic /* JsTuple<Number, Number> */
    val invert: ((x: Number, y: Number) -> dynamic)?
        get() = definedExternally
}

external interface GeoStreamWrapper {
    fun stream(stream: GeoStream): GeoStream
}

external interface GeoProjection : GeoStreamWrapper {
    @nativeInvoke
    operator fun invoke(point: dynamic /* JsTuple<Number, Number> */): dynamic /* dynamic | Nothing? */
    fun center(): dynamic /* JsTuple<Number, Number> */
    fun center(point: dynamic /* JsTuple<Number, Number> */): GeoProjection /* this */
    fun preclip(): (stream: GeoStream) -> GeoStream
    fun preclip(preclip: (stream: GeoStream) -> GeoStream): GeoProjection /* this */
    fun postclip(): (stream: GeoStream) -> GeoStream
    fun postclip(postclip: (stream: GeoStream) -> GeoStream): GeoProjection /* this */
    fun clipAngle(): Number?
    fun clipAngle(angle: Nothing?): GeoProjection /* this */
    fun clipAngle(angle: Number): GeoProjection /* this */
    fun clipExtent(): dynamic /* dynamic | Nothing? */
    fun clipExtent(extent: Nothing?): GeoProjection /* this */
    fun clipExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */): GeoProjection /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: ExtendedFeature): GeoProjection /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: ExtendedFeatureCollection): GeoProjection /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: GeoJSON.GeometryObject): GeoProjection /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: GeoSphere): GeoProjection /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: ExtendedGeometryCollection): GeoProjection /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: ExtendedFeature): GeoProjection /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: ExtendedFeatureCollection): GeoProjection /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: GeoJSON.GeometryObject): GeoProjection /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: GeoSphere): GeoProjection /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: ExtendedGeometryCollection): GeoProjection /* this */
    fun fitWidth(width: Number, `object`: ExtendedFeature): GeoProjection /* this */
    fun fitWidth(width: Number, `object`: ExtendedFeatureCollection): GeoProjection /* this */
    fun fitWidth(width: Number, `object`: GeoJSON.GeometryObject): GeoProjection /* this */
    fun fitWidth(width: Number, `object`: GeoSphere): GeoProjection /* this */
    fun fitWidth(width: Number, `object`: ExtendedGeometryCollection): GeoProjection /* this */
    fun fitHeight(height: Number, `object`: ExtendedFeature): GeoProjection /* this */
    fun fitHeight(height: Number, `object`: ExtendedFeatureCollection): GeoProjection /* this */
    fun fitHeight(height: Number, `object`: GeoJSON.GeometryObject): GeoProjection /* this */
    fun fitHeight(height: Number, `object`: GeoSphere): GeoProjection /* this */
    fun fitHeight(height: Number, `object`: ExtendedGeometryCollection): GeoProjection /* this */
    val invert: ((point: dynamic /* JsTuple<Number, Number> */) -> dynamic)?
        get() = definedExternally
    fun precision(): Number
    fun precision(precision: Number): GeoProjection /* this */
    fun angle(): Number
    fun angle(angle: Number): GeoProjection /* this */
    fun rotate(): dynamic /* JsTuple<Number, Number, Number> */
    fun rotate(angles: dynamic /* JsTuple<Number, Number> */): GeoProjection /* this */
    fun rotate(angles: dynamic /* JsTuple<Number, Number, Number> */): GeoProjection /* this */
    fun scale(): Number
    fun scale(scale: Number): GeoProjection /* this */
    fun translate(): dynamic /* JsTuple<Number, Number> */
    fun translate(point: dynamic /* JsTuple<Number, Number> */): GeoProjection /* this */
}

external interface GeoConicProjection : GeoProjection {
    fun parallels(): dynamic /* JsTuple<Number, Number> */
    fun parallels(value: dynamic /* JsTuple<Number, Number> */): GeoConicProjection /* this */
}

external interface GeoContext {
    fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */)
    fun beginPath()
    fun closePath()
    fun lineTo(x: Number, y: Number)
    fun moveTo(x: Number, y: Number)
}

external interface GeoPath<This, DatumObject : dynamic> {
    @nativeInvoke
    operator fun invoke(this: This, `object`: DatumObject, vararg args: Any): String?
    @nativeInvoke
    operator fun invoke(this: This, `object`: DatumObject, vararg args: Any)
    fun area(`object`: DatumObject): Number
    fun bounds(`object`: DatumObject): dynamic /* JsTuple<dynamic, dynamic> */
    fun centroid(`object`: DatumObject): dynamic /* JsTuple<Number, Number> */
    fun measure(`object`: DatumObject): Number
    fun <C : GeoContext?> context(): C
    fun context(context: Nothing?): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    fun context(context: GeoContext): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    fun <P : dynamic> projection(): P
    fun projection(projection: Nothing?): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    fun projection(projection: GeoProjection): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    fun projection(projection: GeoStreamWrapper): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    fun pointRadius(): dynamic /* (this: This, object: DatumObject, args: Any) -> Number | Number */
    fun pointRadius(value: Number): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    fun pointRadius(value: (this: This, `object`: DatumObject, args: Array<Any>) -> Number): GeoPath<This, DatumObject<dynamic /* GeoJSON.GeometryObject | GeoSphere | ExtendedGeometryCollection | ExtendedFeature | ExtendedFeatureCollection */>> /* this */
    @nativeInvoke
    operator fun invoke(this: This, `object`: DatumObject, args: Any): String?
}

external fun geoPath(projection: GeoProjection? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath

external fun geoPath(projection: GeoStreamWrapper? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath

external fun geoPath(projection: Nothing? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath

external fun <DatumObject : dynamic> geoPath(projection: GeoProjection? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath<Any, DatumObject>

external fun <DatumObject : dynamic> geoPath(projection: GeoStreamWrapper? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath<Any, DatumObject>

external fun <DatumObject : dynamic> geoPath(projection: Nothing? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath<Any, DatumObject>

external fun <This, DatumObject : dynamic> geoPath(projection: GeoProjection? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath<This, DatumObject>

external fun <This, DatumObject : dynamic> geoPath(projection: GeoStreamWrapper? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath<This, DatumObject>

external fun <This, DatumObject : dynamic> geoPath(projection: Nothing? = definedExternally /* null */, context: GeoContext? = definedExternally /* null */): GeoPath<This, DatumObject>

external fun geoProjection(project: GeoRawProjection): GeoProjection

external fun geoProjectionMutator(factory: (args: Array<Any>) -> GeoRawProjection): () -> GeoProjection

external fun geoAzimuthalEqualArea(): GeoProjection

external fun geoAzimuthalEqualAreaRaw(): GeoRawProjection

external fun geoAzimuthalEquidistant(): GeoProjection

external fun geoAzimuthalEquidistantRaw(): GeoRawProjection

external fun geoGnomonic(): GeoProjection

external fun geoGnomonicRaw(): GeoRawProjection

external fun geoOrthographic(): GeoProjection

external fun geoOrthographicRaw(): GeoRawProjection

external fun geoStereographic(): GeoProjection

external fun geoStereographicRaw(): GeoRawProjection

external fun geoEqualEarth(): GeoProjection

external fun geoEqualEarthRaw(): GeoRawProjection

external fun geoAlbersUsa(): GeoProjection

external fun geoAlbers(): GeoConicProjection

external fun geoConicConformal(): GeoConicProjection

external fun geoConicConformalRaw(phi0: Number, phi1: Number): GeoRawProjection

external fun geoConicEqualArea(): GeoConicProjection

external fun geoConicEqualAreaRaw(phi0: Number, phi1: Number): GeoRawProjection

external fun geoConicEquidistant(): GeoConicProjection

external fun geoConicEquidistantRaw(phi0: Number, phi1: Number): GeoRawProjection

external fun geoEquirectangular(): GeoProjection

external fun geoEquirectangularRaw(): GeoRawProjection

external fun geoMercator(): GeoProjection

external fun geoMercatorRaw(): GeoRawProjection

external fun geoTransverseMercator(): GeoProjection

external fun geoTransverseMercatorRaw(): GeoRawProjection

external fun geoNaturalEarth1(): GeoProjection

external fun geoNaturalEarth1Raw(): GeoRawProjection

external interface GeoTransformPrototype {
    val lineEnd: ((this: GeoTransformPrototype /* this */) -> Unit)?
        get() = definedExternally
    val lineStart: ((this: GeoTransformPrototype /* this */) -> Unit)?
        get() = definedExternally
    val point: ((this: GeoTransformPrototype /* this */, x: Number, y: Number, z: Number? /* = null */) -> Unit)?
        get() = definedExternally
    val polygonEnd: ((this: GeoTransformPrototype /* this */) -> Unit)?
        get() = definedExternally
    val polygonStart: ((this: GeoTransformPrototype /* this */) -> Unit)?
        get() = definedExternally
    val sphere: ((this: GeoTransformPrototype /* this */) -> Unit)?
        get() = definedExternally
}

external interface `T$2` {
    fun stream(s: GeoStream): T /* T & GeoStream */
}

external fun <T : GeoTransformPrototype> geoTransform(methods: T): `T$2`

typealias GeoIdentityTranform = GeoIdentityTransform

external interface GeoIdentityTransform : GeoStreamWrapper {
    fun clipExtent(): dynamic /* dynamic | Nothing? */
    fun clipExtent(extent: Nothing?): GeoIdentityTransform /* this */
    fun clipExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */): GeoIdentityTransform /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: ExtendedFeature): GeoIdentityTransform /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: ExtendedFeatureCollection): GeoIdentityTransform /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: GeoJSON.GeometryObject): GeoIdentityTransform /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: GeoSphere): GeoIdentityTransform /* this */
    fun fitExtent(extent: dynamic /* JsTuple<dynamic, dynamic> */, `object`: ExtendedGeometryCollection): GeoIdentityTransform /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: ExtendedFeature): GeoIdentityTransform /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: ExtendedFeatureCollection): GeoIdentityTransform /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: GeoJSON.GeometryObject): GeoIdentityTransform /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: GeoSphere): GeoIdentityTransform /* this */
    fun fitSize(size: dynamic /* JsTuple<Number, Number> */, `object`: ExtendedGeometryCollection): GeoIdentityTransform /* this */
    fun reflectX(): Boolean
    fun reflectX(reflect: Boolean): GeoIdentityTransform /* this */
    fun reflectY(): Boolean
    fun reflectY(reflect: Boolean): GeoIdentityTransform /* this */
    fun scale(): Number
    fun scale(scale: Number): GeoIdentityTransform /* this */
    fun translate(): dynamic /* JsTuple<Number, Number> */
    fun translate(point: dynamic /* JsTuple<Number, Number> */): GeoIdentityTransform /* this */
}

external fun geoIdentity(): GeoIdentityTransform

external var geoClipAntimeridian: (stream: GeoStream) -> GeoStream

external fun geoClipCircle(angle: Number): (stream: GeoStream) -> GeoStream

external fun geoClipRectangle(x0: Number, y0: Number, x1: Number, y1: Number): (stream: GeoStream) -> GeoStream

external fun geoPath(): GeoPath