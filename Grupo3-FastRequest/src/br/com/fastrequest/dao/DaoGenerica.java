package br.com.fastrequest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancoMysql.ConexaoBD;

public abstract class DaoGenerica {
	private Connection connection;

	protected DaoGenerica() {
		this.connection = ConexaoBD.getConnection();
	}

	protected Connection getConnection() {
		return connection;
	}

	protected void inserir(String inserirSql, Object... parametros)
			throws SQLException {
		PreparedStatement pstmt = getConnection().prepareStatement(inserirSql);

		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}

		pstmt.execute();
		pstmt.close();
	}

	protected void atualizar(String atualizarSql, Object id, Object... parametros)
			throws SQLException {
		PreparedStatement pstmt = getConnection().prepareStatement(atualizarSql);
		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}
		pstmt.setObject(parametros.length + 1, id);
		pstmt.execute();
		pstmt.close();
	}

	protected void deletar(String deletarSql, Object... parametros)
			throws SQLException {
		PreparedStatement pstmt = getConnection().prepareStatement(deletarSql);
		for (int i = 0; i < parametros.length; i++) {
			pstmt.setObject(i + 1, parametros[i]);
		}

		pstmt.execute();
		pstmt.close();
	}
}