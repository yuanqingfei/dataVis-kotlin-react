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

external interface ContourMultiPolygon : MultiPolygon {
    var value: Number
}

external interface Contours {
    @nativeInvoke
    operator fun invoke(values: Array<Number>): Array<ContourMultiPolygon>
    fun contour(values: Array<Number>, threshold: Number): ContourMultiPolygon
    fun size(): dynamic /* JsTuple<Number, Number> */
    fun size(size: dynamic /* JsTuple<Number, Number> */): Contours /* this */
    fun smooth(): Boolean
    fun smooth(smooth: Boolean): Contours /* this */
    fun thresholds(): dynamic /* ThresholdCountGenerator<Number> | ThresholdNumberArrayGenerator<Number> */
    fun thresholds(count: Number): Contours /* this */
    fun thresholds(thresholds: Array<Number>): Contours /* this */
    fun thresholds(thresholds: ThresholdCountGenerator<Number>): Contours /* this */
    fun thresholds(thresholds: ThresholdNumberArrayGenerator<Number>): Contours /* this */
}

external fun contours(): Contours

external interface ContourDensity<Datum> {
    @nativeInvoke
    operator fun invoke(data: Array<Datum>): Array<ContourMultiPolygon>
    fun x(): (d: Datum) -> Number
    fun x(x: (d: Datum) -> Number): ContourDensity<Datum> /* this */
    fun y(): (d: Datum) -> Number
    fun y(y: (d: Datum) -> Number): ContourDensity<Datum> /* this */
    fun weight(): (d: Datum) -> Number
    fun weight(weight: (d: Datum) -> Number): ContourDensity<Datum> /* this */
    fun size(): dynamic /* JsTuple<Number, Number> */
    fun size(size: dynamic /* JsTuple<Number, Number> */): ContourDensity<Datum> /* this */
    fun cellSize(): Number
    fun cellSize(cellSize: Number): ContourDensity<Datum> /* this */
    fun thresholds(): dynamic /* ThresholdCountGenerator<Number> | ThresholdNumberArrayGenerator<Number> */
    fun thresholds(count: Number): ContourDensity<Datum> /* this */
    fun thresholds(thresholds: Array<Number>): ContourDensity<Datum> /* this */
    fun thresholds(thresholds: ThresholdCountGenerator<Number>): ContourDensity<Datum> /* this */
    fun thresholds(thresholds: ThresholdNumberArrayGenerator<Number>): ContourDensity<Datum> /* this */
    fun bandwidth(): Number
    fun bandwidth(bandwidth: Number): ContourDensity<Datum> /* this */
}

external fun <Datum> contourDensity(): ContourDensity<Datum>