import Chart from 'react-apexcharts';
import {useEffect, useState} from "react";
import axios from "axios";
import {BASE_URL} from "../../utils/request";
import {SaleSuccess} from "../../types/sale";
import {round} from "../../utils/format";

type BarChartType = {
    labels: {
        categories: string[]
    },
    series: {
        name: string,
        data: number[]
    }[]
}

const BarChart = () => {
    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const [chartData, setChartData] = useState<BarChartType>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/success-by-seller`).then(response => {
            const data = response.data as SaleSuccess[];
            const myLabel = data.map(x => x.sellerName);
            const mySeries = data.map(x => round(100 as number * x.deals / x.visited, 1));
            const newValue = {
                labels: {
                    categories: myLabel
                },
                series: [
                    {
                        name: "% Success",
                        data: mySeries
                    }
                ]
            };
            setChartData(newValue);
        });
    }, []);

    return (
        <Chart
            options={{...options, xaxis: chartData.labels}}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;

