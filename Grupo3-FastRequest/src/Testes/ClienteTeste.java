package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.ValidaCpf;
import br.com.fastrequest.model.ValidaEmail;

public class ClienteTeste {
	
	Cliente cliente, client;
	ValidaCpf vp;
	ValidaEmail ve;

	@Before
	public void setUp() throws Exception {
		cliente = new Cliente();
		cliente.setCpf("03638061132");
		cliente.setNome("EUIOREUIOREUIOREUIOREUIOREUIOREUIOREUIOREUIOR");
		cliente.setEmail("_antonio_@hotmail.com");
		
		client = new Cliente();
		client.setNome("EUIOREUIOREUIOREUIOREUIOREUIOREUIOREUIOREUIORASD");
		client.setEmail("antoniocoj");
		

	}
	
	@Test
	public void testNomeCerto() {
		assertTrue(cliente.validanome(cliente.getNome()));
	}
	
	@Test
	public void testNomeErrado() {
		assertFalse(client.validanome(client.getNome()));
	}

	@Test
	public void testCpf() {
		assertTrue(vp.validarCpf(cliente.getCpf()));
	}
	@Test
	public void testEmailCerto() {
		assertTrue(ve.validaEmail(cliente.getEmail()));
	}
	@Test
	public void testEmailErrado() {
		assertFalse(ve.validaEmail(client.getEmail()));
	}

}
