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

external interface ChordSubgroup {
    var startAngle: Number
    var endAngle: Number
    var value: Number
    var index: Number
    var subindex: Number
}

external interface Chord {
    var source: ChordSubgroup
    var target: ChordSubgroup
}

external interface ChordGroup {
    var startAngle: Number
    var endAngle: Number
    var value: Number
    var index: Number
}

external interface Chords : Array<Chord> {
    var groups: Array<ChordGroup>
}

external interface ChordLayout {
    @nativeInvoke
    operator fun invoke(matrix: Array<Array<Number>>): Chords
    fun padAngle(): Number
    fun padAngle(angle: Number): ChordLayout /* this */
    fun sortGroups(): ((a: Number, b: Number) -> Number)?
    fun sortGroups(compare: Nothing?): ChordLayout /* this */
    fun sortGroups(compare: (a: Number, b: Number) -> Number): ChordLayout /* this */
    fun sortSubgroups(): ((a: Number, b: Number) -> Number)?
    fun sortSubgroups(compare: Nothing?): ChordLayout /* this */
    fun sortSubgroups(compare: (a: Number, b: Number) -> Number): ChordLayout /* this */
    fun sortChords(): ((a: Number, b: Number) -> Number)?
    fun sortChords(compare: Nothing?): ChordLayout /* this */
    fun sortChords(compare: (a: Number, b: Number) -> Number): ChordLayout /* this */
}

external fun chord(): ChordLayout

external interface RibbonSubgroup {
    var startAngle: Number
    var endAngle: Number
    var radius: Number
}

external interface Ribbon {
    var source: RibbonSubgroup
    var target: RibbonSubgroup
}

external interface RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> {
    @nativeInvoke
    operator fun invoke(this: This, d: RibbonDatum, vararg args: Any)
    @nativeInvoke
    operator fun invoke(this: This, d: RibbonDatum, vararg args: Any): String?
    fun source(): (this: This, d: RibbonDatum, args: Any) -> RibbonSubgroupDatum
    fun source(source: (this: This, d: RibbonDatum, args: Array<Any>) -> RibbonSubgroupDatum): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun target(): (this: This, d: RibbonDatum, args: Any) -> RibbonSubgroupDatum
    fun target(target: (this: This, d: RibbonDatum, args: Array<Any>) -> RibbonSubgroupDatum): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun radius(): (this: This, d: RibbonSubgroupDatum, args: Any) -> Number
    fun radius(radius: Number): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun radius(radius: (this: This, d: RibbonSubgroupDatum, args: Array<Any>) -> Number): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun startAngle(): (this: This, d: RibbonSubgroupDatum, args: Any) -> Number
    fun startAngle(angle: Number): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun startAngle(angle: (this: This, d: RibbonSubgroupDatum, args: Array<Any>) -> Number): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun endAngle(): (this: This, d: RibbonSubgroupDatum, args: Any) -> Number
    fun endAngle(angle: Number): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun endAngle(angle: (this: This, d: RibbonSubgroupDatum, args: Array<Any>) -> Number): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun context(): CanvasRenderingContext2D?
    fun context(context: CanvasRenderingContext2D): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    fun context(context: Nothing?): RibbonGenerator<This, RibbonDatum, RibbonSubgroupDatum> /* this */
    @nativeInvoke
    operator fun invoke(this: This, d: RibbonDatum, args: Any)
}

external fun ribbon(): RibbonGenerator<Any, Ribbon, RibbonSubgroup>

external fun <Datum, SubgroupDatum> ribbon(): RibbonGenerator<Any, Datum, SubgroupDatum>

external fun <This, Datum, SubgroupDatum> ribbon(): RibbonGenerator<This, Datum, SubgroupDatum>