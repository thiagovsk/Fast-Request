package br.com.fastrequest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD {

	// fornece a conexao ao bd
	// passando o endereco da conexao pra variavel url
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

	private static Connection abrirconexao() { // metodo para abrir conexao do
												// bd

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "thiagovsk", "rose1229");
			//senha e user do banco , favor inserir o seu aqui ou utilizar o mesmo

			System.out.println("Conexao aberta");// mostra no console a conexao
													// esta aberta

		} catch (SQLException e1) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e1);

		}

		return con;
	}

	private static Connection fecharconexao(Connection con) { // metodo para
																// fexar conexao
																// do bd

		try {
			con.close();
			System.out.println("Conexao Fechada"); // mostra no console que a
													// conexao fechou

		} catch (SQLException e1) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e1);
		}

		return con;
	}

	//criar a release pra poder fechar as conexões no finally 
	//criei assim pra ficar mais organizado
	public static void release(Statement stm) {

		if (stm == null)
			return;

		try {
			stm.close();
		} catch (SQLException e) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e);
		}

	}

	public static void release(Connection con) {

		if (con == null)
			return;

		try {
			con.close();
		} catch (SQLException e) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e);

		}

	}

	public static void releaseALL(Connection con , Statement stm){
		release(stm);
		release(con);
		
	}
}

// falta ainda capturar os outros catchs 