package Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.ValidaTelefone;

public class TestarValidaTelefone {

	ValidaTelefone obj = new ValidaTelefone();
	@Before
	public void setUp() throws Exception {
		obj = new ValidaTelefone();
		
	}

	@Test
	public void test() {
		assertNotNull(obj);
		assertFalse(ValidaTelefone.validaTelefone("0000000"));
		
		assertTrue(ValidaTelefone.validaTelefone("6133562860"));
		
	}

}
