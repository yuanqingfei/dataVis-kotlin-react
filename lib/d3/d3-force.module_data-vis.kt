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

external interface SimulationNodeDatum {
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var vy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fy: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SimulationLinkDatum<NodeDatum : SimulationNodeDatum> {
    var source: dynamic /* NodeDatum | String | Number */
    var target: dynamic /* NodeDatum | String | Number */
    var index: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Simulation<NodeDatum : SimulationNodeDatum, LinkDatum : SimulationLinkDatum<NodeDatum>?> {
    fun restart(): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun stop(): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun tick(iterations: Number? = definedExternally /* null */)
    fun nodes(): Array<NodeDatum>
    fun nodes(nodesData: Array<NodeDatum>): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun alpha(): Number
    fun alpha(alpha: Number): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun alphaMin(): Number
    fun alphaMin(min: Number): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun alphaDecay(): Number
    fun alphaDecay(decay: Number): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun alphaTarget(): Number
    fun alphaTarget(target: Number): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun velocityDecay(): Number
    fun velocityDecay(decay: Number): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun <F : Force<NodeDatum, LinkDatum>> force(name: String): F?
    fun force(name: String, force: Nothing?): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun force(name: String, force: Force<NodeDatum, LinkDatum>): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun find(x: Number, y: Number, radius: Number? = definedExternally /* null */): NodeDatum?
    fun on(typenames: String /* 'tick' */): ((this: Simulation<NodeDatum, LinkDatum>) -> Unit)?
    fun on(typenames: String /* 'end' */): ((this: Simulation<NodeDatum, LinkDatum>) -> Unit)?
    fun on(typenames: String): ((this: Simulation<NodeDatum, LinkDatum>) -> Unit)?
    fun on(typenames: String /* 'tick' */, listener: Nothing?): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun on(typenames: String /* 'end' */, listener: Nothing?): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun on(typenames: String, listener: Nothing?): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun on(typenames: String /* 'tick' */, listener: (this: Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */) -> Unit): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun on(typenames: String /* 'end' */, listener: (this: Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */) -> Unit): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
    fun on(typenames: String, listener: (this: Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */) -> Unit): Simulation<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>?>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceSimulation(nodesData: Array<NodeDatum>? = definedExternally /* null */): Simulation<NodeDatum, Nothing?>

external fun <NodeDatum : SimulationNodeDatum, LinkDatum : SimulationLinkDatum<NodeDatum>> forceSimulation(nodesData: Array<NodeDatum>? = definedExternally /* null */): Simulation<NodeDatum, LinkDatum>

external interface Force<NodeDatum : SimulationNodeDatum, LinkDatum : SimulationLinkDatum<NodeDatum>?> {
    @nativeInvoke
    operator fun invoke(alpha: Number)
    val initialize: ((nodes: Array<NodeDatum>) -> Unit)?
        get() = definedExternally
}

external interface ForceCenter<NodeDatum : SimulationNodeDatum> : Force<NodeDatum, Any> {
    fun initialize(nodes: Array<NodeDatum>)
    fun x(): Number
    fun x(x: Number): ForceCenter<NodeDatum<SimulationNodeDatum>> /* this */
    fun y(): Number
    fun y(y: Number): ForceCenter<NodeDatum<SimulationNodeDatum>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceCenter(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): ForceCenter<NodeDatum>

external interface ForceCollide<NodeDatum : SimulationNodeDatum> : Force<NodeDatum, Any> {
    fun initialize(nodes: Array<NodeDatum>)
    fun radius(): (node: NodeDatum, i: Number, nodes: Array<NodeDatum>) -> Number
    fun radius(radius: Number): ForceCollide<NodeDatum<SimulationNodeDatum>> /* this */
    fun radius(radius: (node: NodeDatum, i: Number, nodes: Array<NodeDatum>) -> Number): ForceCollide<NodeDatum<SimulationNodeDatum>> /* this */
    fun strength(): Number
    fun strength(strength: Number): ForceCollide<NodeDatum<SimulationNodeDatum>> /* this */
    fun iterations(): Number
    fun iterations(iterations: Number): ForceCollide<NodeDatum<SimulationNodeDatum>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceCollide(): ForceCollide<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceCollide(radius: Number): ForceCollide<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceCollide(radius: (node: NodeDatum, i: Number, nodes: Array<NodeDatum>) -> Number): ForceCollide<NodeDatum>

external interface ForceLink<NodeDatum : SimulationNodeDatum, LinkDatum : SimulationLinkDatum<NodeDatum>> : Force<NodeDatum, LinkDatum> {
    fun initialize(nodes: Array<NodeDatum>)
    fun links(): Array<LinkDatum>
    fun links(links: Array<LinkDatum>): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
    fun id(): (node: NodeDatum, i: Number, nodesData: Array<NodeDatum>) -> dynamic
    fun id(id: (node: NodeDatum, i: Number, nodesData: Array<NodeDatum>) -> String): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
    fun distance(): (link: LinkDatum, i: Number, links: Array<LinkDatum>) -> Number
    fun distance(distance: Number): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
    fun distance(distance: (link: LinkDatum, i: Number, links: Array<LinkDatum>) -> Number): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
    fun strength(): (link: LinkDatum, i: Number, links: Array<LinkDatum>) -> Number
    fun strength(strength: Number): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
    fun strength(strength: (link: LinkDatum, i: Number, links: Array<LinkDatum>) -> Number): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
    fun iterations(): Number
    fun iterations(iterations: Number): ForceLink<NodeDatum<SimulationNodeDatum>, LinkDatum<SimulationLinkDatum<NodeDatum>>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum, LinksDatum : SimulationLinkDatum<NodeDatum>> forceLink(): ForceLink<NodeDatum, LinksDatum>

external fun <NodeDatum : SimulationNodeDatum, LinksDatum : SimulationLinkDatum<NodeDatum>> forceLink(links: Array<LinksDatum>): ForceLink<NodeDatum, LinksDatum>

external interface ForceManyBody<NodeDatum : SimulationNodeDatum> : Force<NodeDatum, Any> {
    fun initialize(nodes: Array<NodeDatum>)
    fun strength(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun strength(strength: Number): ForceManyBody<NodeDatum<SimulationNodeDatum>> /* this */
    fun strength(strength: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceManyBody<NodeDatum<SimulationNodeDatum>> /* this */
    fun theta(): Number
    fun theta(theta: Number): ForceManyBody<NodeDatum<SimulationNodeDatum>> /* this */
    fun distanceMin(): Number
    fun distanceMin(distance: Number): ForceManyBody<NodeDatum<SimulationNodeDatum>> /* this */
    fun distanceMax(): Number
    fun distanceMax(distance: Number): ForceManyBody<NodeDatum<SimulationNodeDatum>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceManyBody(): ForceManyBody<NodeDatum>

external interface ForceX<NodeDatum : SimulationNodeDatum> : Force<NodeDatum, Any> {
    fun initialize(nodes: Array<NodeDatum>)
    fun strength(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun strength(strength: Number): ForceX<NodeDatum<SimulationNodeDatum>> /* this */
    fun strength(strength: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceX<NodeDatum<SimulationNodeDatum>> /* this */
    fun x(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun x(x: Number): ForceX<NodeDatum<SimulationNodeDatum>> /* this */
    fun x(x: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceX<NodeDatum<SimulationNodeDatum>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceX(): ForceX<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceX(x: Number): ForceX<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceX(x: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceX<NodeDatum>

external interface ForceY<NodeDatum : SimulationNodeDatum> : Force<NodeDatum, Any> {
    fun initialize(nodes: Array<NodeDatum>)
    fun strength(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun strength(strength: Number): ForceY<NodeDatum<SimulationNodeDatum>> /* this */
    fun strength(strength: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceY<NodeDatum<SimulationNodeDatum>> /* this */
    fun y(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun y(y: Number): ForceY<NodeDatum<SimulationNodeDatum>> /* this */
    fun y(y: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceY<NodeDatum<SimulationNodeDatum>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceY(): ForceY<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceY(y: Number): ForceY<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceY(y: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceY<NodeDatum>

external interface ForceRadial<NodeDatum : SimulationNodeDatum> : Force<NodeDatum, Any> {
    fun initialize(nodes: Array<NodeDatum>)
    fun strength(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun strength(strength: Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun strength(strength: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun radius(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun radius(radius: Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun radius(radius: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun x(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun x(x: Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun x(x: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun y(): (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number
    fun y(y: Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
    fun y(y: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceRadial<NodeDatum<SimulationNodeDatum>> /* this */
}

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: Number, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: Number, x: Number? = definedExternally /* null */, y: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: Number, x: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */, y: Number? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: Number, x: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */, y: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number, x: Number? = definedExternally /* null */, y: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number, x: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */, y: Number? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number, x: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */, y: ((d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number)? = definedExternally /* null */): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceSimulation(): Simulation<NodeDatum, Nothing?>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: Number): ForceRadial<NodeDatum>

external fun <NodeDatum : SimulationNodeDatum> forceRadial(radius: (d: NodeDatum, i: Number, data: Array<NodeDatum>) -> Number): ForceRadial<NodeDatum>