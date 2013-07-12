package Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.ValidaCpf;

public class TestaValidaCpf {
	
	Cliente c, d;
	ValidaCpf a;

	@Before
	public void setUp() throws Exception {

	c = new Cliente();
	c.setCpf("03713770131");
	
	d = new Cliente();
	d.setCpf("00000000000");
	a = new ValidaCpf();
	}
	@Test
	public void testInstancia(){
		assertNotNull(c);
		assertNotNull(d);
	}
	@Test
	public void testValidarCpf() {
		assertTrue(ValidaCpf.validarCpf(c.getCpf()));
	}
	
	@Test
	public void testValidarCpf2() {
		assertTrue(ValidaCpf.validarCpf(d.getCpf()));
	}
	@Test
	public void testarErrado(){
		assertFalse(ValidaCpf.validarCpf("123456789"));
	}
	
}
