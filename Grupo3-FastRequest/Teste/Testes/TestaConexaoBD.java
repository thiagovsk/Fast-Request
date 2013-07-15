package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import bancoMysql.ConexaoBD;

public class TestaConexaoBD {

	ConexaoBD conexao;

	@Before
	public void setUp() throws Exception {
		conexao = new ConexaoBD();
		
	}
	

	@Test
	public void testGetConnection() {
		assertNotNull(conexao);		
		ConexaoBD.getConnection();
		assertNotNull(ConexaoBD.getConnection());
		
		
		
		
	}
	@Test
	public void testGetConnectionFalha() {
		assertNotNull(conexao);		
		assertNotNull(ConexaoBD.getConnection());
		
	}

	@Test
	public void testGetPW() {
		ConexaoBD.setPW("11");
		assertTrue(ConexaoBD.getPW().equals("11"));
		assertFalse(ConexaoBD.getPW().equals("10"));
	}

	@Test
	public void testSetPW() {
	 	ConexaoBD.setPW("ae");
		assertEquals("O metodo nao esta retornando corretamente", "ae",ConexaoBD.getPW());
	}

	@Test
	public void testGetUSER() {
		assertNotNull(ConexaoBD.getUSER());
		}


	
	
}
