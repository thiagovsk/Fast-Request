package br.com.fastrequest.testes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fastrequest.controller.ProdutoController;
import br.com.fastrequest.dao.ConexaoBD;
import br.com.fastrequest.dao.ProdutoDAO;
import br.com.fastrequest.model.Produto;


import static org.junit.Assert.*;

import org.junit.Test;

public class TestaControllerCadastrarProduto {
	
	
	@Test
	public void testaSeObjetosForamInstanciados() {
		
		Produto produto = new Produto();	
		ProdutoDAO dao = new ProdutoDAO();
		
		assertNotNull(produto);
		assertNotNull(dao);
		
		
	}
}
