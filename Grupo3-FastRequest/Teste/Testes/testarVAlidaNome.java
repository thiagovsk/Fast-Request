package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.ValidaNome;

public class testarVAlidaNome {

	ValidaNome nome ;
	@Before
	public void setUp() throws Exception {
		 nome = new ValidaNome();
	}

	@Test
	public void test() {
		assertNotNull(nome);
		String A="nome";
		String b = "11111111111111111111111111111111111111111111111111111111111111" +
				"11111111111111111111111111111111111111111111111111111111111111111";
		assertTrue(nome.validaNome(A));
		assertFalse(nome.validaNome(b));
		
				
	}

}
