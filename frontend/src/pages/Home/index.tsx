import Footer from "../../components/Footer/Footer";
import NavBar from "../../components/NavBar/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar/>
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4"> DSVendas</h1>
                    <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
                    <hr/>
                    <p>Esta aplicação consiste em exibir um dashboard.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">Acessar o dashboard</Link>
                </div>
            </div>
            <Footer/>
        </>
    );
}

export default Home;
