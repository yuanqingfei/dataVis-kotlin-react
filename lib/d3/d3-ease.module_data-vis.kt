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

external fun easeLinear(normalizedTime: Number): Number

external fun easeQuad(normalizedTime: Number): Number

external fun easeQuadIn(normalizedTime: Number): Number

external fun easeQuadOut(normalizedTime: Number): Number

external fun easeQuadInOut(normalizedTime: Number): Number

external fun easeCubic(normalizedTime: Number): Number

external fun easeCubicIn(normalizedTime: Number): Number

external fun easeCubicOut(normalizedTime: Number): Number

external fun easeCubicInOut(normalizedTime: Number): Number

external interface PolynomialEasingFactory {
    @nativeInvoke
    operator fun invoke(normalizedTime: Number): Number
    fun exponent(e: Number): PolynomialEasingFactory
}

external var easePoly: PolynomialEasingFactory

external var easePolyIn: PolynomialEasingFactory

external var easePolyOut: PolynomialEasingFactory

external var easePolyInOut: PolynomialEasingFactory

external fun easeSin(normalizedTime: Number): Number

external fun easeSinIn(normalizedTime: Number): Number

external fun easeSinOut(normalizedTime: Number): Number

external fun easeSinInOut(normalizedTime: Number): Number

external fun easeExp(normalizedTime: Number): Number

external fun easeExpIn(normalizedTime: Number): Number

external fun easeExpOut(normalizedTime: Number): Number

external fun easeExpInOut(normalizedTime: Number): Number

external fun easeCircle(normalizedTime: Number): Number

external fun easeCircleIn(normalizedTime: Number): Number

external fun easeCircleOut(normalizedTime: Number): Number

external fun easeCircleInOut(normalizedTime: Number): Number

external fun easeBounce(normalizedTime: Number): Number

external fun easeBounceIn(normalizedTime: Number): Number

external fun easeBounceOut(normalizedTime: Number): Number

external fun easeBounceInOut(normalizedTime: Number): Number

external interface BackEasingFactory {
    @nativeInvoke
    operator fun invoke(normalizedTime: Number): Number
    fun overshoot(s: Number): BackEasingFactory
}

external var easeBack: BackEasingFactory

external var easeBackIn: BackEasingFactory

external var easeBackOut: BackEasingFactory

external var easeBackInOut: BackEasingFactory

external interface ElasticEasingFactory {
    @nativeInvoke
    operator fun invoke(normalizedTime: Number): Number
    fun amplitude(a: Number): ElasticEasingFactory
    fun period(p: Number): ElasticEasingFactory
}

external var easeElastic: ElasticEasingFactory

external var easeElasticIn: ElasticEasingFactory

external var easeElasticOut: ElasticEasingFactory

external var easeElasticInOut: ElasticEasingFactory