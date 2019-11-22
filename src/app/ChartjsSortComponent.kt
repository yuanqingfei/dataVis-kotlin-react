package app

import chartjs.Chart
import chartjs.HorizontalBar
import chartjs.MetaData
import react.*
import react.dom.div
import react.dom.h2
import kotlin.browser.window

/**
 * coming from https://jsfiddle.net/fx0a6o6q/3/
 *
 * learned from:
 * https://youtu.be/hR3QY198bb4
 * https://github.com/chartjs/Chart.js/issues/3832
 *
 */

class ChartjsSortComponent: RComponent<RProps, RState>() {

    val animationInterval = 3000

    init {
        Chart.defaults.global.animation?.duration = animationInterval
        Chart.defaults.global.animation?.easing = "linear"
        Chart.defaults.global.tooltips?.enabled = false
    }

    var chartReference: dynamic = js("{}")

    val initState: RState =
                js("""
        {
            labels: ['美国', '日本', '中国', '德国', '法国', '英国', '意大利', '西班牙', '巴西', '加拿大'],
            datasets: [{
              label: "2009",
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
              data: [14003000.00, 4993000.00, 4833000.00, 3060000.00, 2499000.00, 2007000.00,
                1988000.00, 1397000.00, 1269000.00, 1229000.00]
            }]
        }
            """)  as RState

//            js("""
//        {
//            labels: ['美国', '中国', '日本', '德国', '英国', '法国', '印度', '意大利', '巴西', '加拿大'],
//            datasets: [{
//              label: "2018",
//              backgroundColor: [
//                "#FF5733",
//                "#884EA0",
//                "#2471A3",
//                "#17A589",
//                "#D4AC0D",
//                "#CA6F1E",
//                "#BA4A00",
//                "#F8C471",
//                "#7FB3D5",
//                "#C39BD3"
//              ],
//              data: [20494100.00, 13608151.86, 4970915.56, 3996759.29, 2825207.95, 2777535.24,
//                2726322.62, 2073901.99, 1868626.09, 1712510.03]
//            }]
//        }
//    """) as RState

    override fun componentDidMount() {
        Chart.plugins.register(
            js("""
                {
                    beforeUpdate: function(chart) {                      
                      var dataArray = chart.data.datasets[0].data;
                      var dataIndexes = dataArray.map(function (d, i) {return i});
                      dataIndexes.sort(function(a, b){
                        return dataArray[b] - dataArray[a];
                      });
                      dataArray.sort(function(a, b){return b - a});
                      var newMeta = [];
                      var newLabels = [];
                      var newColors = [];
                      var meta = chart.getDatasetMeta(0);
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
                }
            """)
        )

        val gdp2009 = doubleArrayOf(14003000.00, 4993000.00, 4833000.00, 3060000.00, 2499000.00, 2007000.00,
                1988000.00, 1397000.00, 1269000.00, 1229000.00)

        val gdp2018 = doubleArrayOf(20494100.00, 4970915.56, 13608151.86,   3996759.29, 2777535.24, 2825207.95,
                2726322.62, 2073901.99, 1868626.09, 1712510.03)

        val labels2018 = arrayOf("美国", "中国", "日本", "德国", "英国", "法国", "印度", "意大利", "巴西", "加拿大");

        for(i in 0..1) {
            window.setTimeout({
                val chartIns = chartReference.chartInstance
                chartIns.update()
                chartIns.data.datasets[0]?.label = "2018"
                chartIns.data.labels = labels2018
                chartIns.data.datasets[0]?.data = gdp2018;
            }, 3000)
        }
    }

    override fun RBuilder.render() {
        div("container"){
            h2("text-muted"){
                +"Crazy Bar"
            }
            HorizontalBar{
                attrs{
                    ref {
                        reference:dynamic -> chartReference = reference
                    }
                    data = initState
                    options =
                        js("""
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
                        """)
                        as Chart.ChartOptions
                }
            }
        }
    }
}

fun RBuilder.getChartjsSortComponent() = child(ChartjsSortComponent::class) {}