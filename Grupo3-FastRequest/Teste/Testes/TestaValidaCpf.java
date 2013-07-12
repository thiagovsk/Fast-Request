package Testes;

import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.ValidaCpf;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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
		assertTrue(a.validarCpf(c.getCpf()));
	}
	
	@Test
	public void testValidarCpf2() {
		assertTrue(a.validarCpf(d.getCpf()));
	}
	@Test
	public void testarErrado(){
		assertFalse(a.validarCpf("123456789"));
	}
	
}
