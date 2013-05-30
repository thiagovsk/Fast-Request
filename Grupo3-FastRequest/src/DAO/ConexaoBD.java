package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	// passando o endereco da conexao pra variavel url
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

	private static Connection abrirconexao() { // metodo para abrir conexao do bd

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "thiagovsk", "rose1229");//senha e user do meu banco favor alterar ou usar os mesmos
			
			System.out.println("Conexao aberta");// mostra no console a conexao esta aberta
			

		} catch (SQLException e1) {
			e1.printStackTrace();

		}

		return con;
	}

	private static Connection fecharconexao(Connection con) { // metodo para fexar conexao do bd

		try {
			con.close();
			System.out.println("Conexao Fechada");	// mostra no console que a conexao fechou
		

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return con;
	}

}
//falta ainda capturar os outros catchs 