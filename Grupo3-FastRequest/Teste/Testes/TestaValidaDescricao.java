package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.ValidaDescricao;

public class TestaValidaDescricao {

	ValidaDescricao obj;
	@Before
	public void setUp() throws Exception {
		obj= new ValidaDescricao();
	}

	@Test
	public void test() {
		assertNotNull(obj);
		assertTrue(obj.validaDescricao("correto"));
		assertFalse(obj.validaDescricao("11111111111111111111111111111111111111111111111111111111111111111111111111111" +
				"11111111111111111111111111111111111111111111111111111111111111111111111111111" +
				"11111111111111111111111111111111111111111111111111111111111111111111111111111" +
				"11111111111111111111111111111111111111111111111111111111111111111111111111111"));
	}

}
