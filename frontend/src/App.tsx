import NavBar from "./components/NavBar/NavBar";
import Footer from "./components/Footer/Footer";
import DataTable from "./components/DataTable/DataTable";

function App() {
    return (
        <>
            <NavBar></NavBar>
            <div className="container">
                <h1 className="text-primary">Olá mundão</h1>
                <DataTable></DataTable>
            </div>
            <Footer></Footer>
        </>
    );
}

export default App;
