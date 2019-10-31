package app

import react.*
import recharts.*
import kotlin.js.json

class RechartsApp : RComponent<RProps, RState>() {
    val myData: Array<Any?> = arrayOf(
            json(Pair("name", "Page A"), Pair("uv", 4000), Pair("pv", 2400), Pair("amt", 2400)),
            json(Pair("name", "Page B"), Pair("uv", 3000), Pair("pv", 1398), Pair("amt", 2210)),
            json(Pair("name", "Page C"), Pair("uv", 2000), Pair("pv", 9800), Pair("amt", 2290)),
            json(Pair("name", "Page D"), Pair("uv", 2780), Pair("pv", 3908), Pair("amt", 2000)),
            json(Pair("name", "Page E"), Pair("uv", 1890), Pair("pv", 4800), Pair("amt", 2181)),
            json(Pair("name", "Page F"), Pair("uv", 2390), Pair("pv", 3800), Pair("amt", 2500)),
            json(Pair("name", "Page G"), Pair("uv", 3490), Pair("pv", 4300), Pair("amt", 2100))
    )

    override fun RBuilder.render() {

        // vertical line
        ResponsiveContainer{
            attrs.width = 600
            attrs.height = 300
            LineChart{
                attrs.margin = json(Pair("top", 5), Pair("right", 30), Pair("left", 20), Pair("bottom", 5))
                attrs.data = myData
                XAxis{
                    attrs.dataKey = "name"
                }
                YAxis{}
                CartesianGrid{}
                Tooltip{}
                Legend{}
                Line{
                    attrs.type = "monotone"
                    attrs.dataKey = "pv"
//                attrs.activeDot = Pair("r", 160)
                }
                Line{
                    attrs.type = "monotone"
                    attrs.dataKey = "uv"
                }
            }
        }

        // vertical bar
        ResponsiveContainer{
            attrs.width = 600
            attrs.height = 300
            BarChart{
                attrs.margin = json(Pair("top", 5), Pair("right", 30), Pair("left", 20), Pair("bottom", 5))
                attrs.data = myData
                XAxis{
                    attrs.dataKey = "name"
                }
                YAxis{}
                CartesianGrid{}
                Tooltip{}
                Legend{}
                Bar{
                    attrs.dataKey = "pv"
                    attrs.fill = "#8884d8"
                }
                Bar{
                    attrs.dataKey = "uv"
                    attrs.fill = "#82ca9d"
                }
            }
        }


        // horizon line
        ResponsiveContainer {
            attrs.width = 600
            attrs.height = 600
            LineChart{
                attrs.margin = json(Pair("top", 5), Pair("right", 30), Pair("left", 20), Pair("bottom", 5))
                attrs.data = myData
                attrs.layout = "vertical"
                XAxis{
                    attrs.type = "number"
                    attrs.domain = arrayOf(0, "dataMax + 1000")
                }
                YAxis{
                    attrs.dataKey = "name"
                    attrs.type = "category"
                }
                CartesianGrid{}
                Tooltip{}
                Legend{}
                Line{
                    attrs.type = "monotone"
                    attrs.dataKey = "pv"
//                attrs.activeDot = Pair("r", 160)
                }
                Line{
                    attrs.type = "monotone"
                    attrs.dataKey = "uv"
                }
            }
        }

        // horizon bar
        ResponsiveContainer{
            attrs.width = 600
            attrs.height = 600
            BarChart{
                attrs.layout = "vertical"
                attrs.margin = json(Pair("top", 20), Pair("right", 20), Pair("left", 20), Pair("bottom", 20))
                attrs.data = myData
                XAxis{
                    attrs.type = "number"
//                    attrs.domain = arrayOf(0, "dataMax + 1000")
                }
                YAxis{
                    attrs.dataKey = "name"
                    attrs.type = "category"
                }
                CartesianGrid{}
                Tooltip{}
                Legend{}
                Bar{
                    attrs.dataKey = "uv"
                    attrs.fill = "#8884d8"
                }
                Bar{
                    attrs.dataKey = "pv"
                    attrs.fill = "#82ca9d"
                }
            }
        }
    }
}

fun RBuilder.rechartsApp() = child(RechartsApp::class) {}
