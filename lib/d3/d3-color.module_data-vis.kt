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

external interface ColorCommonInstance {
    fun displayable(): Boolean
    override fun toString(): String
    fun brighter(k: Number? = definedExternally /* null */): ColorCommonInstance /* this */
    fun darker(k: Number? = definedExternally /* null */): ColorCommonInstance /* this */
    fun rgb(): RGBColor
    fun hex(): String
}

external interface Color {
    fun displayable(): Boolean
    override fun toString(): String
    fun hex(): String
}

external interface ColorFactory : Function {
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): dynamic /* RGBColor | HSLColor | Nothing? */
    @nativeInvoke
    operator fun invoke(color: RGBColor): dynamic /* RGBColor | HSLColor */
    @nativeInvoke
    operator fun invoke(color: HSLColor): dynamic /* RGBColor | HSLColor */
    @nativeInvoke
    operator fun invoke(color: LabColor): dynamic /* RGBColor | HSLColor */
    @nativeInvoke
    operator fun invoke(color: HCLColor): dynamic /* RGBColor | HSLColor */
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): dynamic /* RGBColor | HSLColor */
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): dynamic /* RGBColor | HSLColor */
    override var prototype: Color
}

external interface RGBColor : Color {
    var r: Number
    var g: Number
    var b: Number
    var opacity: Number
    fun brighter(k: Number? = definedExternally /* null */): RGBColor /* this */
    fun darker(k: Number? = definedExternally /* null */): RGBColor /* this */
    fun rgb(): RGBColor /* this */
}

external interface RGBColorFactory : Function {
    @nativeInvoke
    operator fun invoke(r: Number, g: Number, b: Number, opacity: Number? = definedExternally /* null */): RGBColor
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): RGBColor
    @nativeInvoke
    operator fun invoke(color: RGBColor): RGBColor
    @nativeInvoke
    operator fun invoke(color: HSLColor): RGBColor
    @nativeInvoke
    operator fun invoke(color: LabColor): RGBColor
    @nativeInvoke
    operator fun invoke(color: HCLColor): RGBColor
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): RGBColor
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): RGBColor
    override var prototype: RGBColor
}

external interface HSLColor : Color {
    var h: Number
    var s: Number
    var l: Number
    var opacity: Number
    fun brighter(k: Number? = definedExternally /* null */): HSLColor /* this */
    fun darker(k: Number? = definedExternally /* null */): HSLColor /* this */
    fun rgb(): RGBColor
}

external interface HSLColorFactory : Function {
    @nativeInvoke
    operator fun invoke(h: Number, s: Number, l: Number, opacity: Number? = definedExternally /* null */): HSLColor
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): HSLColor
    @nativeInvoke
    operator fun invoke(color: RGBColor): HSLColor
    @nativeInvoke
    operator fun invoke(color: HSLColor): HSLColor
    @nativeInvoke
    operator fun invoke(color: LabColor): HSLColor
    @nativeInvoke
    operator fun invoke(color: HCLColor): HSLColor
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): HSLColor
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): HSLColor
    override var prototype: HSLColor
}

external interface LabColor : Color {
    var l: Number
    var a: Number
    var b: Number
    var opacity: Number
    fun brighter(k: Number? = definedExternally /* null */): LabColor /* this */
    fun darker(k: Number? = definedExternally /* null */): LabColor /* this */
    fun rgb(): RGBColor
}

external interface LabColorFactory : Function {
    @nativeInvoke
    operator fun invoke(l: Number, a: Number, b: Number, opacity: Number? = definedExternally /* null */): LabColor
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): LabColor
    @nativeInvoke
    operator fun invoke(color: RGBColor): LabColor
    @nativeInvoke
    operator fun invoke(color: HSLColor): LabColor
    @nativeInvoke
    operator fun invoke(color: LabColor): LabColor
    @nativeInvoke
    operator fun invoke(color: HCLColor): LabColor
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): LabColor
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): LabColor
    override var prototype: LabColor
}

typealias GrayColorFactory = (l: Number, opacity: Number? /* = null */) -> LabColor

external interface HCLColor : Color {
    var h: Number
    var c: Number
    var l: Number
    var opacity: Number
    fun brighter(k: Number? = definedExternally /* null */): HCLColor /* this */
    fun darker(k: Number? = definedExternally /* null */): HCLColor /* this */
    fun rgb(): RGBColor
}

external interface HCLColorFactory : Function {
    @nativeInvoke
    operator fun invoke(h: Number, l: Number, c: Number, opacity: Number? = definedExternally /* null */): HCLColor
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): HCLColor
    @nativeInvoke
    operator fun invoke(color: RGBColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: HSLColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: LabColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: HCLColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): HCLColor
    override var prototype: HCLColor
}

external interface LCHColorFactory {
    @nativeInvoke
    operator fun invoke(l: Number, c: Number, h: Number, opacity: Number? = definedExternally /* null */): HCLColor
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): HCLColor
    @nativeInvoke
    operator fun invoke(color: RGBColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: HSLColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: LabColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: HCLColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): HCLColor
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): HCLColor
}

external interface CubehelixColor : Color {
    var h: Number
    var s: Number
    var l: Number
    var opacity: Number
    fun brighter(k: Number? = definedExternally /* null */): CubehelixColor /* this */
    fun darker(k: Number? = definedExternally /* null */): CubehelixColor /* this */
    fun rgb(): RGBColor
}

external interface CubehelixColorFactory : Function {
    @nativeInvoke
    operator fun invoke(h: Number, s: Number, l: Number, opacity: Number? = definedExternally /* null */): CubehelixColor
    @nativeInvoke
    operator fun invoke(cssColorSpecifier: String): CubehelixColor
    @nativeInvoke
    operator fun invoke(color: RGBColor): CubehelixColor
    @nativeInvoke
    operator fun invoke(color: HSLColor): CubehelixColor
    @nativeInvoke
    operator fun invoke(color: LabColor): CubehelixColor
    @nativeInvoke
    operator fun invoke(color: HCLColor): CubehelixColor
    @nativeInvoke
    operator fun invoke(color: CubehelixColor): CubehelixColor
    @nativeInvoke
    operator fun invoke(color: ColorCommonInstance): CubehelixColor
    override var prototype: CubehelixColor
}

external var color: ColorFactory

external var rgb: RGBColorFactory

external var hsl: HSLColorFactory

external var lab: LabColorFactory

external var gray: GrayColorFactory

external var hcl: HCLColorFactory

external var lch: LCHColorFactory

external var cubehelix: CubehelixColorFactory