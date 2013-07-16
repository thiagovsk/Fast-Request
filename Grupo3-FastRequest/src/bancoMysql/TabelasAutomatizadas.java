package bancoMysql;

import java.sql.*;


public class TabelasAutomatizadas {

	protected Connection connection;
	
	public  TabelasAutomatizadas() throws SQLException {
		this.connection = ConexaoBD.getConectarCasoEspecial();
	}

	protected Connection getConnection() {
		return connection;
	}

	 

	public void criarBd() throws SQLException, NullPointerException {
		

		String sqlCriaBanco = "CREATE DATABASE IF NOT EXISTS fast;";

		String sqlUsaBanco = "USE fast;";

			String sqlCriarTabelaCLiente = " CREATE TABLE IF NOT EXISTS `cliente` ( `id` int(4) NOT NULL AUTO_INCREMENT,"
					+ "`cpf` varchar(24) DEFAULT NULL,`email` varchar(30) DEFAULT NULL,`nome` varchar(40) DEFAULT NULL,"
					+ "`telefone` varchar(50) DEFAULT NULL,PRIMARY KEY (`id`)) ENGINE=InnoDB  DEFAULT CHARSET=latin1  ";

		String sqlCriarTabelaProduto = " CREATE TABLE IF NOT EXISTS `produto` (`idProduto` int(5) NOT NULL AUTO_INCREMENT,"
				+ " `nome` varchar(45) DEFAULT NULL, `descricao` varchar(200) DEFAULT NULL, `preco` double DEFAULT NULL," +
				" `tipo` varchar(45) DEFAULT NULL,"
				+ " PRIMARY KEY (`idProduto`)) ENGINE=InnoDB  DEFAULT CHARSET=latin1  ";

		PreparedStatement stm1 = getConnection().prepareStatement(sqlCriaBanco);
		PreparedStatement stm2 = getConnection().prepareStatement(sqlUsaBanco);
		PreparedStatement stm3 = getConnection().prepareStatement(sqlCriarTabelaCLiente);
		PreparedStatement stm4 = getConnection().prepareStatement(sqlCriarTabelaProduto);

		stm1.execute();
		stm2.execute();
		stm3.execute();
		stm4.execute();
		
		stm1.close();
		stm2.close();
		stm3.close();
		stm4.close();
	}

}
