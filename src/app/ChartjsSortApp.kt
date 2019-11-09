package app

import chartjs.Chart
import chartjs.HorizontalBar
import react.*

/**
 * coming from https://jsfiddle.net/fx0a6o6q/3/
 *
 * https://github.com/chartjs/Chart.js/issues/3832
 */
class ChartjsSortApp: RComponent<RProps, RState>() {

    val chart = Chart

    override fun componentDidMount() {
        chart.defaults.global.animation?.duration = 3000
        val myPlugin = js("""
{
  beforeUpdate: function(chart) {
      var dataArray = chart.data.datasets[0].data;

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
}            
        """)
        chart.plugins.register(myPlugin)

//        js("""
//setInterval(function(){
//    myChart.update();
//}, 3000)
//        """)
    }

    override fun RBuilder.render() {
        HorizontalBar{
            attrs.key = "myChart"
            attrs.data = js("""
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
            attrs.options = js("""
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
        }
    }
}

fun RBuilder.chartJsSortApp() = child(ChartjsSortApp::class) {}