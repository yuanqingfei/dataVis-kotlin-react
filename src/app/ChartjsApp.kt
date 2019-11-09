package app

import chartjs.Bar
import chartjs.HorizontalBar
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2

/**
 * coming from https://github.com/jerairrest/react-chartjs-2/blob/master/example/src/components/crazyLine.js
 */

class ChartjsApp : RComponent<RProps, RState>() {

    val initState: RState = js("""
{
  labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
  datasets: [
    {
      label: 'My First dataset',
      backgroundColor: 'rgba(255,99,132,0.2)',
      borderColor: 'rgba(255,99,132,1)',
      borderWidth: 1,
      hoverBackgroundColor: 'rgba(255,99,132,0.4)',
      hoverBorderColor: 'rgba(255,99,132,1)',
      data: [65, 59, 80, 81, 56, 55, 40]
    }
  ]
}
    """)

    override fun componentWillMount() {
        this.setState(initState)
    }

    override fun componentDidMount() {
        js("""
        var _this = this;

        setInterval(function(){
            var oldDataSet = _this.state.datasets[0];
            var newData = [];

            for(var x=0; x< _this.state.labels.length; x++){
                newData.push(Math.floor(Math.random() * 100));
            }

            var newDataSet = {};
            Object.assign(newDataSet, oldDataSet)

            newDataSet.data = newData;

            var newState = {};
            Object.assign(newState, _this.state);
            newState.datasets = [newDataSet];

            _this.setState(newState);
        }, 5000); 
            """)
    }

    override fun RBuilder.render() {
        div{
            h2{
                +"Creazy Bar Example"
            }
            HorizontalBar{
                    attrs.data = state
            }
        }
    }

}

fun RBuilder.chartJsApp() = child(ChartjsApp::class) {}