package Testes;

import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.ValidaCpf;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ValidaCpfTeste {
	
	Cliente c, d;
	ValidaCpf a;

	@Before
	public void setUp() throws Exception {

	c = new Cliente();
	c.setCpf("03713770131");
	
	d = new Cliente();
	d.setCpf("12345678901");
	}

	@Test
	public void testValidarCpf() {
		assertTrue(a.validarCpf(c.getCpf()));
	}
	
	@Test
	public void testValidarCpfFalse() {
		assertFalse(a.validarCpf(d.getCpf()));
	}

}
