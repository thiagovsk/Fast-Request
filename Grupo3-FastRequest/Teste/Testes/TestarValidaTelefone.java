package Testes;

import static org.junit.Assert.*;

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
		assertFalse(obj.validaTelefone("0000000"));
		
		assertTrue(obj.validaTelefone("6133562860"));
		
	}

}
