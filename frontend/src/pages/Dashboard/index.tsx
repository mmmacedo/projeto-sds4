import NavBar from "../../components/NavBar/NavBar";
import BarChart from "../../components/BarChart/BarChart";
import DataTable from "../../components/DataTable/DataTable";
import Footer from "../../components/Footer/Footer";
import DonutChart from "../../components/DonutChart";

const Dashboard = () => {
    return (
        <>
            <NavBar></NavBar>
            <div className="container">
                <h1 className="text-primary py-3">Dashboard</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso</h5>
                        <BarChart/>
                    </div>

                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de sucesso</h5>
                        <DonutChart/>
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Total de vendas</h2>
                    <DataTable></DataTable>
                </div>
            </div>
            <Footer></Footer>
        </>
    );
}

export default Dashboard;
