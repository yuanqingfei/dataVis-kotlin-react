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
        VictoryChart{
//            attrs.domain = arrayOf(0,6)
            attrs.domainPadding = json(Pair("x", 10), Pair("y", arrayOf(0, 10)))
            VictoryBar{
                attrs.data = arrayOf(
                        json(Pair("x", 1), Pair("y", 2)),
                        json(Pair("x", 2), Pair("y", 3)),
                        json(Pair("x", 3), Pair("y", 6)))
//                attrs.x = "x"
//                attrs.y = "y"
//                attrs.alignment = "middle"
//                attrs.barRatio = 0.1
                // style doesn't work
                attrs.style = js("""{{ data: {fill:  "blue"} }}""") as? VictoryStyleInterface
//                        VictoryStyleClass(data=json(Pair("fill", "blue")), parent = null, labels = null)
            }
            VictoryLine{
                attrs.data = arrayOf(
                        json(Pair("x", 1), Pair("y", 2)),
                        json(Pair("x", 2), Pair("y", 3)),
                        json(Pair("x", 3), Pair("y", 6)))
                attrs.style = js("""{{ data: { stroke: "blue"} }}""")

                // lambda function doesn't work
//                attrs.y = {d : Pair<String, Int> -> d.second}
            }
        }
    }
}

class VictoryStyleClass(parent: VictoryStyleObject?, data: VictoryStyleObject?, labels: VictoryStyleObject?): VictoryStyleInterface{
}



fun RBuilder.victoryApp() = child(VictoryApp::class) {}