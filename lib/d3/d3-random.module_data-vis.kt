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

external interface RandomNumberGenerationSource {
    fun source(source: () -> Number): RandomNumberGenerationSource /* this */
}

external interface RandomUniform : RandomNumberGenerationSource {
    @nativeInvoke
    operator fun invoke(min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */): () -> Number
}

external var randomUniform: RandomUniform

external interface RandomNormal : RandomNumberGenerationSource {
    @nativeInvoke
    operator fun invoke(mu: Number? = definedExternally /* null */, sigma: Number? = definedExternally /* null */): () -> Number
}

external var randomNormal: RandomNormal

external interface RandomLogNormal : RandomNumberGenerationSource {
    @nativeInvoke
    operator fun invoke(mu: Number? = definedExternally /* null */, sigma: Number? = definedExternally /* null */): () -> Number
}

external var randomLogNormal: RandomLogNormal

external interface RandomBates : RandomNumberGenerationSource {
    @nativeInvoke
    operator fun invoke(n: Number): () -> Number
}

external var randomBates: RandomBates

external interface RandomIrwinHall : RandomNumberGenerationSource {
    @nativeInvoke
    operator fun invoke(n: Number): () -> Number
}

external var randomIrwinHall: RandomIrwinHall

external interface RandomExponential : RandomNumberGenerationSource {
    @nativeInvoke
    operator fun invoke(lambda: Number): () -> Number
}

external var randomExponential: RandomExponential