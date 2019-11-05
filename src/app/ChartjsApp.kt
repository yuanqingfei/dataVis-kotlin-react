package app

import chartjs.Bar
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h2

class ChartjsApp : RComponent<RProps, RState>() {

    val data = js("""
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
      data: [65, 59, 80, 81, 56, 55, 20]
    }
  ]
}
    """)

    override fun RBuilder.render() {
        div{
            h2{
                +"Bar Example"
            }
            Bar{
                attrs.data = data
//                attrs.width = 0.5
//                attrs.height = 0.5
//                attrs.options = js("{maintainAspectRatio: true}")
            }
        }
    }

}

fun RBuilder.chartJsApp() = child(ChartjsApp::class) {}