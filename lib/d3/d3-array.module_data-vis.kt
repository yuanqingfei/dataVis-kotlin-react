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

external interface Numeric {
    fun valueOf(): Number
}

external fun max(array: Iterable<String>): String?

external fun <T : Numeric> max(array: Iterable<T>): T?

external fun <T> max(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> String?): String?

external fun <T, U : Numeric> max(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> U?): U?

external fun min(array: Iterable<String>): String?

external fun <T : Numeric> min(array: Iterable<T>): T?

external fun <T> min(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> String?): String?

external fun <T, U : Numeric> min(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> U?): U?

external fun extent(array: Iterable<String>): dynamic /* dynamic | dynamic */

external fun <T : Numeric> extent(array: Iterable<T>): dynamic /* dynamic | dynamic */

external fun <T> extent(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> String?): dynamic /* dynamic | dynamic */

external fun <T, U : Numeric> extent(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> U?): dynamic /* dynamic | dynamic */

external fun <T : Numeric> mean(array: Iterable<T?>): Number?

external fun <T> mean(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> Number?): Number?

external fun <T : Numeric> median(array: Iterable<T?>): Number?

external fun <T> median(array: Iterable<T>, accessor: (element: T, i: Number, array: Iterable<T>) -> Number?): Number?

external fun <T : Numeric> quantile(array: Iterable<T?>, p: Number): Number?

external fun <T> quantile(array: Iterable<T>, p: Number, accessor: (element: T, i: Number, array: Iterable<T>) -> Number?): Number?

external fun <T : Numeric> sum(array: Iterable<T?>): Number

external fun <T> sum(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> Number?): Number

external fun <T : Numeric> deviation(array: Iterable<T?>): Number?

external fun <T> deviation(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> Number?): Number?

external fun <T : Numeric> variance(array: Iterable<T?>): Number?

external fun <T> variance(array: Iterable<T>, accessor: (datum: T, index: Number, array: Iterable<T>) -> Number?): Number?

external fun scan(array: Iterable<Number>, comparator: ((a: Number, b: Number) -> Number)? = definedExternally /* null */): Number?

external fun <T> scan(array: Iterable<T>, comparator: (a: T, b: T) -> Number): Number?

external fun bisectLeft(array: ArrayLike<Number>, x: Number, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number

external fun bisectLeft(array: ArrayLike<String>, x: String, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number

external fun bisectLeft(array: ArrayLike<Date>, x: Date, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number

external fun bisectRight(array: ArrayLike<Number>, x: Number, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number

external fun bisectRight(array: ArrayLike<String>, x: String, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number

external fun bisectRight(array: ArrayLike<Date>, x: Date, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number

external var bisect: Any

external interface Bisector<T, U> {
    fun left(array: ArrayLike<T>, x: U, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number
    fun right(array: ArrayLike<T>, x: U, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Number
}

external fun <T, U> bisector(comparator: (a: T, b: U) -> Number): Bisector<T, U>

external fun <T, U> bisector(accessor: (x: T) -> U): Bisector<T, U>

external fun <T> quickselect(array: ArrayLike<T>, k: Number): Array<T>

external fun <T> quickselect(array: ArrayLike<T>, k: Number, left: Number): Array<T>

external fun <T> quickselect(array: ArrayLike<T>, k: Number, left: Number, right: Number): Array<T>

external fun <T> quickselect(array: ArrayLike<T>, k: Number, left: Number, right: Number, compare: (a: dynamic /* Number | String | Boolean | Date */, b: dynamic /* Number | String | Boolean | Date */) -> Number): Array<T>

external fun ascending(a: Number, b: dynamic /* Number | String | Boolean | Date */): Number

external fun ascending(a: String, b: dynamic /* Number | String | Boolean | Date */): Number

external fun ascending(a: Boolean, b: dynamic /* Number | String | Boolean | Date */): Number

external fun ascending(a: Date, b: dynamic /* Number | String | Boolean | Date */): Number

external fun descending(a: Number, b: dynamic /* Number | String | Boolean | Date */): Number

external fun descending(a: String, b: dynamic /* Number | String | Boolean | Date */): Number

external fun descending(a: Boolean, b: dynamic /* Number | String | Boolean | Date */): Number

external fun descending(a: Date, b: dynamic /* Number | String | Boolean | Date */): Number

external fun <TObject, TKey> group(a: Iterable<TObject>, key: (value: TObject) -> TKey): Map<TKey, Array<TObject>>

external fun <TObject, TKey, TReduce> rollup(a: Iterable<TObject>, reduce: (value: Array<TObject>) -> TReduce, key: (value: TObject) -> TKey): Map<TKey, TReduce>

external fun <S, T> cross(a: Iterable<S>, b: Iterable<T>): Array<dynamic /* JsTuple<S, T> */>

external fun <S, T, U> cross(a: Iterable<S>, b: Iterable<T>, reducer: (a: S, b: T) -> U): Array<U>

external fun <T> merge(arrays: Iterable<Iterable<T>>): Array<T>

external fun <T> pairs(array: Iterable<T>): Array<dynamic /* JsTuple<T, T> */>

external fun <T, U> pairs(array: Iterable<T>, reducer: (a: T, b: T) -> U): Array<U>

external interface `T$0`<T> {
    @nativeGetter
    operator fun get(key: Number): T?
    @nativeSetter
    operator fun set(key: Number, value: T)
}

external fun <T> permute(array: `T$0`<T>, keys: ArrayLike<Number>): Array<T>

external fun <T, K : Any> permute(`object`: T, keys: ArrayLike<K>): Array<Any>

external fun range(stop: Number): Array<Number>

external fun range(start: Number, stop: Number, step: Number? = definedExternally /* null */): Array<Number>

external fun <T> shuffle(array: Array<T>, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Array<T>

external fun shuffle(array: Int8Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Int8Array

external fun shuffle(array: Uint8Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Uint8Array

external fun shuffle(array: Uint8ClampedArray, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Uint8ClampedArray

external fun shuffle(array: Int16Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Int16Array

external fun shuffle(array: Uint16Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Uint16Array

external fun shuffle(array: Int32Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Int32Array

external fun shuffle(array: Uint32Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Uint32Array

external fun shuffle(array: Float32Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Float32Array

external fun shuffle(array: Float64Array, lo: Number? = definedExternally /* null */, hi: Number? = definedExternally /* null */): Float64Array

external fun ticks(start: Number, stop: Number, count: Number): Array<Number>

external fun tickIncrement(start: Number, stop: Number, count: Number): Number

external fun tickStep(start: Number, stop: Number, count: Number): Number

external fun <T> transpose(matrix: ArrayLike<ArrayLike<T>>): Array<Array<T>>

external fun <T> zip(vararg arrays: ArrayLike<T>): Array<Array<T>>

external interface Bin<Datum, Value : dynamic> : Array<Datum> {
    var x0: Value?
    var x1: Value?
}

typealias ThresholdCountGenerator<Value> = (values: ArrayLike<Value>, min: Number, max: Number) -> Number

typealias ThresholdNumberArrayGenerator<Value> = (values: ArrayLike<Value>, min: Number, max: Number) -> Array<Value>

typealias ThresholdDateArrayGenerator<Value> = (values: ArrayLike<Value>, min: Date, max: Date) -> Array<Value>

external interface HistogramCommon<Datum, Value : dynamic> {
    @nativeInvoke
    operator fun invoke(data: ArrayLike<Datum>): Array<Bin<Datum, Value>>
    fun value(): (d: Datum, i: Number, data: ArrayLike<Datum>) -> Value
    fun value(valueAccessor: (d: Datum, i: Number, data: ArrayLike<Datum>) -> Value): HistogramCommon<Datum, Value<dynamic /* Number | Date | Nothing? */>> /* this */
}

external interface HistogramGeneratorDate<Datum, Value : Date?> : HistogramCommon<Datum, Date> {
    fun domain(): (values: ArrayLike<Value>) -> dynamic
    fun domain(domain: dynamic /* JsTuple<Date, Date> */): HistogramGeneratorDate<Datum, Value<Date?>> /* this */
    fun domain(domainAccessor: (values: ArrayLike<Value>) -> dynamic): HistogramGeneratorDate<Datum, Value<Date?>> /* this */
    fun thresholds(): ThresholdDateArrayGenerator<Value>
    fun thresholds(thresholds: ArrayLike<Value>): HistogramGeneratorDate<Datum, Value<Date?>> /* this */
    fun thresholds(thresholds: ThresholdDateArrayGenerator<Value>): HistogramGeneratorDate<Datum, Value<Date?>> /* this */
}

external interface HistogramGeneratorNumber<Datum, Value : Number?> : HistogramCommon<Datum, Value> {
    fun domain(): (values: Iterable<Value>) -> dynamic
    fun domain(domain: dynamic /* JsTuple<Number, Number> */): HistogramGeneratorNumber<Datum, Value<Number?>> /* this */
    fun domain(domainAccessor: (values: Iterable<Value>) -> dynamic): HistogramGeneratorNumber<Datum, Value<Number?>> /* this */
    fun thresholds(): dynamic /* ThresholdCountGenerator<Value> | ThresholdNumberArrayGenerator<Value> */
    fun thresholds(count: Number): HistogramGeneratorNumber<Datum, Value<Number?>> /* this */
    fun thresholds(count: ThresholdCountGenerator<Value>): HistogramGeneratorNumber<Datum, Value<Number?>> /* this */
    fun thresholds(thresholds: ArrayLike<Value>): HistogramGeneratorNumber<Datum, Value<Number?>> /* this */
    fun thresholds(thresholds: ThresholdNumberArrayGenerator<Value>): HistogramGeneratorNumber<Datum, Value<Number?>> /* this */
}

external fun histogram(): HistogramGeneratorNumber<Number, Number>

external fun <Datum, Value : Number?> histogram(): HistogramGeneratorNumber<Datum, Value>

external fun <Datum, Value : Date?> histogram(): HistogramGeneratorDate<Datum, Value>

external fun thresholdFreedmanDiaconis(values: ArrayLike<Number?>, min: Number, max: Number): Number

external fun thresholdScott(values: ArrayLike<Number?>, min: Number, max: Number): Number

external fun thresholdSturges(values: ArrayLike<Number?>): Number