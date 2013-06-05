package br.com.fastrequest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {

	// fornece a conexao ao bd
	// passando o endereco da conexao pra variavel url
	private static String url = "jdbc:mysql://localhost:3306/fast";
        //"jdbc:oracle:thin:@localhost:1521:xe";
    
	public static Connection abrirconexao() { // metodo para abrir conexao do banco											// bd
            Connection con;
		
		try {
			con = DriverManager.getConnection(url, "root", "");
			//senha e user do banco , favor inserir o seu aqui ou utilizar o mesmo

			System.out.println("Conexao aberta");// mostra no console a conexao
													// esta aberta

		} catch (SQLException e1) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e1);

		}

		return con;
	}

	public static Connection fecharconexao(Connection con) { // metodo para
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

}	