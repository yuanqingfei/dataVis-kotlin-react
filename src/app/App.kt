package app

import react.*
import react.dom.*
import kotlin.js.json

/**
 *
<LineChart width={600} height={300} data={data}
margin={{top: 5, right: 30, left: 20, bottom: 5}}>
<XAxis dataKey="name"/>
<YAxis/>
<CartesianGrid strokeDasharray="3 3"/>
<Tooltip/>
<Legend />
<Line type="monotone" dataKey="pv" stroke="#8884d8" activeDot={{r: 8}}/>
<Line type="monotone" dataKey="uv" stroke="#82ca9d" />
</LineChart>
);
 */

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        LineChart{
            attrs.width = 600
            attrs.height = 300
            attrs.data =
                    arrayOf(json(Pair("name", "Page A"), Pair("uv", 4000), Pair("pv", 2400), Pair("amt", 2400)),
                    json(Pair("name", "Page B"), Pair("uv", 3000), Pair("pv", 1398), Pair("amt", 2210)),
                    json(Pair("name", "Page C"), Pair("uv", 2000), Pair("pv", 9800), Pair("amt", 2290)),
                    json(Pair("name", "Page D"), Pair("uv", 2780), Pair("pv", 3908), Pair("amt", 2000)),
                    json(Pair("name", "Page E"), Pair("uv", 1890), Pair("pv", 4800), Pair("amt", 2181)),
                    json(Pair("name", "Page F"), Pair("uv", 2390), Pair("pv", 3800), Pair("amt", 2500)),
                    json(Pair("name", "Page G"), Pair("uv", 3490), Pair("pv", 4300), Pair("amt", 2100))
            )
            XAxis{
                attrs.dataKey = "name"
            }
            YAxis{

            }
            CartesianGrid{

            }
            Tooltip{

            }
            Legend{

            }
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
}

fun RBuilder.app() = child(App::class) {}
