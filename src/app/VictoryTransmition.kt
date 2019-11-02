package app

import react.*
import victory.VictoryChart
import victory.VictoryScatter
import kotlin.js.json
import kotlin.math.floor
import kotlin.random.Random

//class App extends React.Component {
//

//
//  constructor(props) {
//    super(props);
//    this.state = {
//       data: this.getData(),
//       size: this.getSize()
//    };
//  }
//
//  componentDidMount() {
//    this.setStateInterval = window.setInterval(() => {
//      this.setState({
//        data: this.getData(),
//        size: this.getSize()
//      });
//    }, 3000);
//  }
//
//  componentWillUnmount() {
//    window.clearInterval(this.setStateInterval);
//  }
//
//  getData() {
//    const num = Math.floor(10 * Math.random() + 5);
//    const points = new Array(num).fill(1);
//    return points.map((point, index) => {
//      return { x: index + 1, y: Math.random() };
//    });
//  }
//
//  getSize() {
//    return Math.random() * 10
//  }
//}
//
//ReactDOM.render(<App/>, mountNode)
class VictoryTransmition : RComponent<RProps, RState> {
    constructor(props: RProps) : super(props){
        this.state = js("{data: this.getData(), size: this.getSize()}")
    }

    override fun componentDidMount() {
        super.componentDidMount()
        val newState: RState = js("{data: this.getData(), size: this.getSize()}")
        this.setState(newState, fun(){
            println("set new state: ");
        })
    }

//    override fun componentWillUnmount() {
//        super.componentWillUnmount()
//        this.setState {  }
//    }

    fun getSize() = Random.nextInt()*10
    fun getData() {
        val num = floor(10 * Random.nextDouble() + 5).toInt()
        val points = IntArray(num){i -> 1}
        points.mapIndexed { i, p ->
            json(Pair("x", i + 1), Pair("y", Random.nextInt()))
        }
    }

    //  render() {
//    return (
//      <VictoryChart
//      	domain={{ y: [0, 1] }}
//      	animate={{ duration: 2000 }}
//      >
//        <VictoryScatter
//          size={this.state.size}
//          data={this.state.data}
//          style={{ data: { opacity: ({ datum }) => datum.opacity || 1 } }}
//          animate={{
//            animationWhitelist: ["style", "data", "size"], // Try removing "size"
//            onExit: {
//              duration: 500,
//              before: () => ({ opacity: 0.3, _y: 0 })
//            },
//            onEnter: {
//              duration: 500,
//              before: () => ({ opacity: 0.3, _y: 0 }),
//              after: (datum) => ({ opacity: 1, _y: datum._y })
//            }
//          }}
//        />
//      </VictoryChart>
//    );
//  }
    override fun RBuilder.render() {
        VictoryChart{
            attrs.domain = js("{y: [0, 1]}")
            attrs.animate = js("{duration: 2000}")

            VictoryScatter{
                attrs.size = js("this.state.size")
                attrs.data = js("this.state.data")
                attrs.animate =  js("""{
                    animationWhitelist: ["style", "data", "size"],
                    onExit: {
                      duration: 500,
                      before: {function() { { opacity: 0.3, _y: 0 }}}
                    },
                    onEnter: {
                      duration: 500,
                      before: () => ({ opacity: 0.3, _y: 0 }),
                      after: (datum) => ({ opacity: 1, _y: datum._y })
                    }
                  }""")
            }
        }
    }

}

fun RBuilder.victoryApp2() = child(VictoryTransmition::class) {}