package app

import kotlinx.html.SVG
import react.*
import react.dom.svg
import victory.*
import kotlin.js.Date
import kotlin.js.Json
import kotlin.js.json

class VictoryApp : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        //<VictoryChart domain={{ x: [0, 4] }}>
        //  <VictoryBar
        //    style={{ data: { fill: "red" } }}
        //    data={[
        //      { x: 1, y: 2 }, { x: 2, y: 4 }, { x: 3, y: 6 }
        //    ]}
        //  />
        //  <VictoryLine
        //    style={{ data: { stroke: "blue", strokeWidth: 5 } }}
        //    y={(d) => d.x}
        //  />
        //</VictoryChart>
        val data: Array<Any>? = arrayOf(
                json(Pair("x", 1), Pair("y", 2)),
                json(Pair("x", 2), Pair("y", 3)),
                json(Pair("x", 3), Pair("y", 6)));
        VictoryChart{
//            attrs.domain = arrayOf(0,6)
            attrs.domainPadding = json(Pair("x", 50), Pair("y", arrayOf(0, 10)))
            VictoryBar{
                attrs.data = data
//                attrs.x = "x"
//                attrs.y = "y"
//                attrs.alignment = "middle"
                attrs.barRatio = 0.3
                // style doesn't work
                attrs.style = js("""{ data: {fill:  "blue"} }""")
//                        VictoryStyleClass(data=json(Pair("fill", "blue")), parent = null, labels = null)
            }
            VictoryLine{
                attrs.style = js("""{ data: { stroke: "red", strokeWidth: 5} }""")
                attrs.data = data
                // arrow function doesn't work in ES 5.1. So need use anonymous function
                attrs.y = js("""{function (d){return 3*d.x}}""")
            }
        }
    }
}

class VictoryStyleClass(parent: VictoryStyleObject?, data: VictoryStyleObject?, labels: VictoryStyleObject?): VictoryStyleInterface{
}



fun RBuilder.victoryApp() = child(VictoryApp::class) {}