import Chart from 'react-apexcharts';
import axios from "axios";
import {BASE_URL} from "../../utils/request";
import {SaleSum} from "../../types/sale";
import {useEffect, useState} from "react";

type ChartData = {
    labels: string[],
    series: number[],
}

const DonutChart = () => {

    const [chartData, setChartData] = useState<ChartData>();

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/amount-by-seller`).then(response => {
            const data = response.data as SaleSum[];
            const myLabel = data.map(x => x.sellerName);
            const mySeries = data.map(x => x.sum);
            setChartData({labels: myLabel, series: mySeries});
        });
    }, []);

    const options = {
        legend: {
            show: true
        },
        labels: [],
    }

    return (
        <Chart
            options={{...options, labels: chartData?.labels || []}}
            series={chartData?.series || []}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;

