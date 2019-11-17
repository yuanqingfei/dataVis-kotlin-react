package app

import chartjs.Chart
import chartjs.HorizontalBar
import react.*
import react.dom.div
import react.dom.h2
import kotlin.browser.window

/**
 * coming from https://jsfiddle.net/fx0a6o6q/3/
 *
 * https://github.com/chartjs/Chart.js/issues/3832
 *
 * https://youtu.be/hR3QY198bb4
 */

interface ChartjsSortComponentProp: RProps{
    var chartRef : RReadableRef<Chart>?
}

interface ChartjsSortComponentState: RState{
    var chartJsData: dynamic
}

class ChartjsSortComponent: RComponent<ChartjsSortComponentProp, ChartjsSortComponentState>() {
//    init {
//        this.props.chartRef = createRef()
//    }

    override fun componentDidUpdate(prevProps: ChartjsSortComponentProp, prevState: ChartjsSortComponentState, snapshot: Any) {
    }

    override fun componentDidMount() {
        js("""
            console.log("chart " + this.chartRef);
            Chart.defaults.global.animation.duration = 3000;
            Chart.plugins.register({
                beforeUpdate: function(chart) {
                  var dataArray = chart.data.datasets[0].data;
                    console.log("chart111 " + this.chartRef);
                  var dataIndexes = dataArray.map(function (d, i) {return i});

                  dataIndexes.sort(function(a, b){
                    return dataArray[a] - dataArray[b];
                  });

                  dataArray.sort(function(a, b){return a - b});

                  var meta = chart.getDatasetMeta(0);
                  var newMeta = [];
                  var labels = chart.data.labels;
                  var newLabels = [];
                  var newColors = [];

                  meta.data.forEach(function(bar, i) {
                    var newIndex = dataIndexes.indexOf(i);

                    newMeta[newIndex] = bar;
                    newLabels[newIndex] = chart.data.labels[i];
                    newColors[newIndex] = chart.data.datasets[0].backgroundColor[i];
                  });

                  meta.data = newMeta;
                  chart.data.labels = newLabels;
                  chart.data.datasets[0].backgroundColor = newColors;
                }
            })
//            setInterval(function(){
//                myChart.update();
//            }, 3000)
        """)

        window.setInterval({this.render()}, 3000)
    }

    override fun ChartjsSortComponentState.init(){
        chartJsData = js("""
                        {
                            labels: ['美国', '中国', '日本', '德国', '英国', '法国', '印度', '意大利', '巴西', '加拿大'],
                            datasets: [{
                              label: "2018",
                              backgroundColor: [
                                "#FF5733",
                                "#884EA0",
                                "#2471A3",
                                "#17A589",
                                "#D4AC0D",
                                "#CA6F1E",
                                "#BA4A00",
                                "#F8C471",
                                "#7FB3D5",
                                "#C39BD3"
                              ],
                              data: [20494100.00, 13608151.86, 4970915.56, 3996759.29, 2825207.95, 2777535.24,
                                2726322.62, 2073901.99, 1868626.09, 1712510.03]
                            }]
                        }
                    """)
    }



    override fun RBuilder.render() {
        div("container"){
            h2("text-muted"){
                +"Crazy Bar"
            }
            HorizontalBar{
                attrs{
//                    ref = props.chartRef!!
                    data = state.chartJsData
                    options = js("""
                                    {
                                        scales: {
                                          xAxes: [{
                                            ticks: {
                                              beginAtZero: true
                                            }
                                          }],
                                          yAxes: [{
                                            barThickness: 30
                                          }]
                                        }
                                      }
                                """) as? Chart.ChartOptions
                }
            }
        }
    }
}

fun RBuilder.getChartjsSortComponent() = child(ChartjsSortComponent::class) {}