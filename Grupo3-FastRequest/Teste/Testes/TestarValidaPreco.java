package Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.ValidaPreco;

public class TestarValidaPreco {

	ValidaPreco obj;
	@Before
	public void setUp() throws Exception {
		 obj = new ValidaPreco();
	}
	

	@Test
	public void test() {
		double preco =10;
		double preco1 = -12;
		assertNotNull(obj);
		assertTrue(obj.validaPreco(preco));
		assertFalse(obj.validaPreco(preco1));

}
}