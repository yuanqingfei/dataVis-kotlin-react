const CHART = document.getElementById("chart");

Chart.defaults.global.animation.duration = 3000;

Chart.plugins.register({
  beforeUpdate: function(chart) {
  	// If this option is true, do the sorting. We only do this when the button is pressed
    if (chart.options.sort) {
    	// This gets the dataArray for the first dataset
      let dataArray = chart.data.datasets[0].data;

     	// We create an array of indexes
      // [0, 1, 2 ... length - 1]
      let dataIndexes = dataArray.map((d, i) => i);

      // We sort these indexes by the data value
      // If the data is [10, 0, 30, 20]
      // dataIndexes starts as [0, 1, 2, 3]
      // and is sorted into [1, 0, 3, 2]
      dataIndexes.sort((a, b) => {
        return dataArray[a] - dataArray[b];
      });

      // Npw we sort the data array so the chart will have the correct data
      dataArray.sort((a, b) => a - b);

      // At this point dataIndexes is sorted by value of the data,
      // so we know how the indexes map to each other
      // Now we need to sort the bar objects, labels and background colours
      let meta = chart.getDatasetMeta(0);
      let newMeta = [];
      let labels = chart.data.labels;
      let newLabels = [];
      let newColors = [];

      meta.data.forEach((bar, i) => {
      	// The meta.data array has the bars in the old order
        // so we look up the new index by using the dataIndexes array.
        // indexOf isn't the most efficient but we have a small number of bars
      	let newIndex = dataIndexes.indexOf(i);

        // copy the bar to the correct location in the new array
        newMeta[newIndex] = bar;

        // Copy the label to the new position
        newLabels[newIndex] = chart.data.labels[i];

        // Copy the color to the new position
        newColors[newIndex] = chart.data.datasets[0].backgroundColor[i];
      });

			// update the chart
      meta.data = newMeta;
      chart.data.labels = newLabels;
      chart.data.datasets[0].backgroundColor = newColors;
    }
  }
});

let barChart = new Chart(CHART, {
  type: 'horizontalBar',
  data: {
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
  },
  options: {
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
});

setInterval(function() {
  barChart.options.sort = true;
  barChart.update();
  barChart.options.sort = false;
  //barChart.data.datasets[0].data = [Math.random(), Math.random(), Math.random(), Math.random(), Math.random(), Math.random()];
}, 5000);