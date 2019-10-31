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

external interface Stringifiable {
    override fun toString(): String
}

external fun keys(obj: Any?): Array<String>

external interface `T$0`<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T)
}

external fun <T> values(obj: `T$0`<T>): Array<T>

external fun <T> values(obj: ArrayLike<T>): Array<T>

external fun values(obj: Any?): Array<Any>

external interface `T$1`<T> {
    var key: String
    var value: T
}

external fun <T> entries(obj: `T$0`<T>): Array<`T$1`<T>>

external fun <T> entries(obj: ArrayLike<T>): Array<`T$1`<T>>

external interface `T$2` {
    var key: String
    var value: Any
}

external fun entries(obj: Any?): Array<`T$2`>

external interface Map<T> {
    fun has(key: String): Boolean
    fun get(key: String): T?
    fun set(key: String, value: T): Map<T> /* this */
    fun remove(key: String): Boolean
    fun clear()
    fun keys(): Array<String>
    fun values(): Array<T>
    fun entries(): Array<`T$1`<T>>
    fun each(func: (value: T, key: String, map: Map<T>) -> Unit)
    fun empty(): Boolean
    fun size(): Number
}

external fun <T> map(): Map<T>

external fun <T> map(d3Map: Map<T>): Map<T>

external fun <T> map(obj: `T$0`<T>): Map<T>

external interface `T$3`<T> {
    @nativeGetter
    operator fun get(key: Number): T?
    @nativeSetter
    operator fun set(key: Number, value: T)
}

external fun <T> map(obj: `T$3`<T>): Map<T>

external fun <T> map(array: Array<T>, key: ((value: T, i: Number? /* = null */, array: Array<T>? /* = null */) -> String)? = definedExternally /* null */): Map<T>

external fun map(obj: Any?): Map<Any>

external interface Set {
    fun has(value: String): Boolean
    fun has(value: Stringifiable): Boolean
    fun add(value: String): Set /* this */
    fun add(value: Stringifiable): Set /* this */
    fun remove(value: String): Boolean
    fun remove(value: Stringifiable): Boolean
    fun clear()
    fun values(): Array<String>
    fun each(func: (value: String, valueRepeat: String, set: Set) -> Unit)
    fun empty(): Boolean
    fun size(): Number
}

external fun set(): Set

external fun set(d3Set: Set): Set

external fun set(array: Array<dynamic /* String | Stringifiable */>): Set

external fun <T> set(array: Array<T>, key: (value: T, index: Number, array: Array<T>) -> String): Set

external interface NestedArray<Datum, RollupType> : Array<dynamic>

external interface NestedMap<Datum, RollupType> : Map<dynamic /* NestedMap<Datum, RollupType> | Array<Datum> | RollupType */>

external interface NestedObject<Datum, RollupType> {
    @nativeGetter
    operator fun get(key: String): dynamic /* NestedObject<Datum, RollupType> | Array<Datum> | RollupType */
    @nativeSetter
    operator fun set(key: String, value: NestedObject<Datum, RollupType>)
    @nativeSetter
    operator fun set(key: String, value: Array<Datum>)
    @nativeSetter
    operator fun set(key: String, value: RollupType)
}

external interface `T$4` {
    var key: String
    var values: Any
    var value: RollupType?
}

external interface Nest<Datum, RollupType> {
    fun key(func: (datum: Datum) -> String): Nest<Datum, RollupType> /* this */
    fun sortKeys(comparator: (a: String, b: String) -> Number): Nest<Datum, RollupType> /* this */
    fun sortValues(comparator: (a: Datum, b: Datum) -> Number): Nest<Datum, RollupType> /* this */
    fun rollup(func: (values: Array<Datum>) -> RollupType): Nest<Datum, RollupType> /* this */
    fun map(array: Array<Datum>): Map<Any>
    fun `object`(array: Array<Datum>): Json
    fun entries(array: Array<Datum>): Array<`T$4`>
}

external fun <Datum, RollupType> nest(): Nest<Datum, RollupType>