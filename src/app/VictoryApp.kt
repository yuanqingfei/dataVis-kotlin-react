package app

import react.*
import victory.*
import kotlin.js.Json
import kotlin.js.json

class VictoryApp : RComponent<RProps, RState>() {
    //  <VictoryChart
    //    domainPadding={{x: 40}}
    //  >
    //    <VictoryBar
    //      data={[
    //        { experiment: "trial 1", expected: 3.75, actual: 3.21 },
    //        { experiment: "trial 2", expected: 3.75, actual: 3.38 },
    //        { experiment: "trial 3", expected: 3.75, actual: 2.05 },
    //        { experiment: "trial 4", expected: 3.75, actual: 3.71 }
    //      ]}
    //      x="experiment"
    //      y={(d) => (d.actual / d.expected) * 100}
    //    />
    //    <VictoryAxis
    //      label="experiment"
    //      style={{
    //        axisLabel: { padding: 30 }
    //      }}
    //    />
    //    <VictoryAxis dependentAxis
    //      label="percent yield"
    //      style={{
    //        axisLabel: { padding: 40 }
    //      }}
    //    />
    //</VictoryChart>
    val data: Array<Any>? = arrayOf(json(Pair("experiment", "trial 1"), Pair("expected", 3.75), Pair("actual", 3.21)),
            json(Pair("experiment", "trial 2"), Pair("expected", 3.75), Pair("actual", 3.38)),
            json(Pair("experiment", "trial 3"), Pair("expected", 3.75), Pair("actual", 2.05)),
            json(Pair("experiment", "trial 4"), Pair("expected", 3.75), Pair("actual", 3.71)))
//    fun mapY(d: dynamic) = (d.actual / d.expected) * 100
    override fun RBuilder.render() {
        VictoryChart{
            attrs.domainPadding = Pair("x", 40)
            VictoryBar{
                attrs.data = data
                attrs.x = "experiment"
                attrs.y = {d: Json -> (d.get("actual") as Double / d.get("expected") as Double) * 100}
            }
            VictoryAxis{
                attrs.label = "experiment"
                attrs.style = json(Pair("axisLabel", Pair("padding", 30)))
            }
            VictoryAxis{
                attrs.label = "percent yield"
                attrs.style = json(Pair("axisLabel", Pair("padding", 40)))
            }
        }
    }
}

fun RBuilder.victoryApp() = child(VictoryApp::class) {}