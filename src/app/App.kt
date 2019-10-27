package app

import react.*
import react.dom.*
import kotlin.js.json

/**
 *

);
 */

class App : RComponent<RProps, RState>() {
    val myData: Array<Any?> = arrayOf(json(Pair("name", "Page A"), Pair("uv", 4000), Pair("pv", 2400), Pair("amt", 2400)),
            json(Pair("name", "Page B"), Pair("uv", 3000), Pair("pv", 1398), Pair("amt", 2210)),
            json(Pair("name", "Page C"), Pair("uv", 2000), Pair("pv", 9800), Pair("amt", 2290)),
            json(Pair("name", "Page D"), Pair("uv", 2780), Pair("pv", 3908), Pair("amt", 2000)),
            json(Pair("name", "Page E"), Pair("uv", 1890), Pair("pv", 4800), Pair("amt", 2181)),
            json(Pair("name", "Page F"), Pair("uv", 2390), Pair("pv", 3800), Pair("amt", 2500)),
            json(Pair("name", "Page G"), Pair("uv", 3490), Pair("pv", 4300), Pair("amt", 2100))
    )
    override fun RBuilder.render() {
        div {
            // line
//            <LineChart width={600} height={300} data={data}
    //            margin={{top: 5, right: 30, left: 20, bottom: 5}}>
    //            <XAxis dataKey="name"/>
    //            <YAxis/>
    //            <CartesianGrid strokeDasharray="3 3"/>
    //            <Tooltip/>
    //            <Legend />
    //            <Line type="monotone" dataKey="pv" stroke="#8884d8" activeDot={{r: 8}}/>
    //            <Line type="monotone" dataKey="uv" stroke="#82ca9d" />
//            </LineChart>
            LineChart{
                attrs.width = 600
                attrs.height = 300
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

        // bar
//        return (
    //        <BarChart width={600} height={300} data={data}
    //        margin={{top: 5, right: 30, left: 20, bottom: 5}}>
    //        <CartesianGrid strokeDasharray="3 3"/>
    //        <XAxis dataKey="name"/>
    //        <YAxis/>
    //        <Tooltip/>
    //        <Legend />
    //        <Bar dataKey="pv" fill="#8884d8" />
    //        <Bar dataKey="uv" fill="#82ca9d" />
//        </BarChart>
//        );
        div{
            BarChart{
                attrs.width = 600
                attrs.height = 300
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

    }
}

fun RBuilder.app() = child(App::class) {}
