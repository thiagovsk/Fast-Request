package Testes;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import br.com.fastrequest.dao.ConexaoBD;

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
		assertNotNull(conexao.getConnection());
		
		
		
		
	}
	@Test
	public void testGetConnectionFalha() {
		assertNotNull(conexao);		
		assertNotNull(conexao.getConnection());
		
	}

	@Test
	public void testGetPW() {
		conexao.setPW("11");
		assertTrue(conexao.getPW().equals("11"));
		assertFalse(conexao.getPW().equals("10"));
	}

	@Test
	public void testSetPW() {
	 	conexao.setPW("ae");
		assertEquals("O metodo nao esta retornando corretamente", "ae",conexao.getPW());
	}

	@Test
	public void testGetUSER() {
		assertNotNull(conexao.getUSER());
		}


	
	
}
