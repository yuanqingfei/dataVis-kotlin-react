package index

//import app.chartJsApp
//import kotlinext.js.*
//import react.dom.*
//import kotlin.browser.*

//fun main(args: Array<String>) {
//    requireAll(require.context("src", true, js("/\\.css$/")))
//
//    render(document.getElementById("root")) {
////        rechartsApp()
////        victoryApp()
//        chartJsApp()
//    }
//}




//package index
//
//import chartjs.Chart
//import chartjs.MetaData
//import kotlinext.js.*
//import kotlin.browser.*
//import kotlinx.html.*
//import kotlinx.html.dom.*
//
//fun main() {
//    requireAll(require.context("src", true, js("/\\.css$/")))
//
//    document.getElementById("root")!!.append {
//        div {
//            +"added it"
//        }
//    }
//
//    val chartElement = document.getElementById("chart")!!
//
//    Chart.defaults.global.animation?.duration = 3000;
//    val chart : Chart = null
//    val sort: Boolean = null
//    Chart.plugins.register(beforeUpdate(chart, sort))
//
//    val chartConfig : Chart.ChartConfiguration =
//}
//    val barChart = js(Chart(chartElement, {
//        type: 'horizontalBar',
//        data: {
//        labels: ['美国', '中国', '日本', '德国', '英国', '法国', '印度', '意大利', '巴西', '加拿大'],
//        datasets: [{
//        label: "2018",
//        backgroundColor: [
//        "#FF5733",
//        "#884EA0",
//        "#2471A3",
//        "#17A589",
//        "#D4AC0D",
//        "#CA6F1E",
//        "#BA4A00",
//        "#F8C471",
//        "#7FB3D5",
//        "#C39BD3"
//        ],
//        data: [20494100.00, 13608151.86, 4970915.56, 3996759.29, 2825207.95, 2777535.24,
//        2726322.62, 2073901.99, 1868626.09, 1712510.03]
//    }]
//    },
//        options: {
//        scales: {
//        xAxes: [{
//        ticks: {
//        beginAtZero: true
//    }
//    }],
//        yAxes: [{
//        barThickness: 30
//    }]
//
//    }
//    }
//    });
//
//    setInterval(function() {
//        barChart.options.sort = true;
//        barChart.update();
//        barChart.options.sort = false;
//        //barChart.data.datasets[0].data = [Math.random(), Math.random(), Math.random(), Math.random(), Math.random(), Math.random()];
//    }, 5000);
//
//}
//
//fun beforeUpdate(chart: Chart, sort: Boolean) : Chart.PluginServiceGlobalRegistration {
//    if (sort) {
//        // This gets the dataArray for the first dataset
//        val dataArray = chart.data.datasets?.get(0)?.data;
//
//        // We create an array of indexes
//        // [0, 1, 2 ... length - 1]
//        val dataIndexes = dataArray.map{d, i -> i}
//
//        // We sort these indexes by the data value
//        // If the data is [10, 0, 30, 20]
//        // dataIndexes starts as [0, 1, 2, 3]
//        // and is sorted into [1, 0, 3, 2]
//        dataIndexes.sort{a, b ->  dataArray[a] - dataArray[b]}
//
//        // Npw we sort the data array so the chart will have the correct data
//        dataArray.sort{a, b -> a - b}
//
//        // At this point dataIndexes is sorted by value of the data,
//        // so we know how the indexes map to each other
//        // Now we need to sort the bar objects, labels and background colours
//        val meta = chart.getDatasetMeta(0);
//        val newMeta = emptyArray<MetaData>();
//        val labels = chart.data.labels;
//        val newLabels = emptyArray<dynamic>();
//        val newColors = emptyArray<dynamic>();
//
//        meta.data.forEachIndexed{i, bar -> {
//            // The meta.data array has the bars in the old order
//            // so we look up the new index by using the dataIndexes array.
//            // indexOf isn't the most efficient but we have a small number of bars
//            val newIndex = dataIndexes.indexOf(i);
//
//            // copy the bar to the correct location in the new array
//            newMeta[newIndex] = bar;
//
//            // Copy the label to the new position
//            newLabels[newIndex] = chart.data.labels?.get(i);
//
//            // Copy the color to the new position
//            newColors[newIndex] = chart.data.datasets?.get(0)?.backgroundColor[i];
//        }}
//
//        // update the chart
//        meta.data = newMeta;
//        chart.data.labels = newLabels;
//        chart.data.datasets?.get(0)?.backgroundColor = newColors;
//
//}
