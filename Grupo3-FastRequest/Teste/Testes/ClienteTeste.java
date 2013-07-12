package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.ValidaCpf;
import br.com.fastrequest.model.ValidaEmail;
import br.com.fastrequest.model.ValidaNome;
import br.com.fastrequest.model.ValidaTelefone;


public class ClienteTeste {
	
	
	Cliente cliente, client;
	ValidaCpf vp;
	ValidaEmail ve;
	ValidaTelefone vt;
	ValidaNome vn;
	@Before
	public void setUp() throws Exception {
		vp = new ValidaCpf();
		ve = new ValidaEmail();
		vt = new ValidaTelefone();
		vn = new ValidaNome();
		
		cliente = new Cliente();
		cliente.setCpf("03638061132");
		cliente.setNome("OREUIOREUIOREUIOR");
		cliente.setEmail("_antonio_@hotmail.com");
		cliente.setTelefone("84574904");
		cliente.setId(1);
		
		client = new Cliente(100,"nome","111","auheau","91892819");

		

	}
	
        @Test
	public final void testarInstancia() {
		assertNotNull(cliente); // TODO
	}
        @Test
    	public final void testarInstancia2() {
    		assertNotNull(client); // TODO
    	}   
	@Test
	public void testNomeCerto() {
		assertTrue(vn.validaNome(client.getNome()));
	}
	
	@Test
	public void testNomeErrado() {
		cliente.setNome("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		assertTrue(vn.validaNome(client.getNome()));
	}
	
	@Test
	public void testGetNome() {
		assertEquals("O metodo não esta retornando corretamente", "OREUIOREUIOREUIOR", cliente.getNome());
	}

	@Test
	public void testCpfCerto() {
		assertTrue(ValidaCpf.validarCpf(cliente.getCpf()));
	}
        
    @Test
	public void testCpfErrado() {
		assertFalse(ValidaCpf.validarCpf(client.getCpf()));
	}
        
    @Test
	public void testGetCpf() {
		assertEquals("O metodo nao esta retornando corretamente", "03638061132", cliente.getCpf());
	}
        
	@Test
	public void testEmailCerto() {
		assertTrue(ValidaEmail.validaEmail(cliente.getEmail()));
	}
        
	@Test
	public void testEmailErrado() {
		assertFalse(ValidaEmail.validaEmail(client.getEmail()));
	}
	
	@Test
	public void testGetEmail() {
		assertEquals("O metodo nao esta retornando corretamente", "_antonio_@hotmail.com", cliente.getEmail());
	}
	
        
        @Test
        public void testTelefoneCerto() {
                assertTrue(ValidaTelefone.validaTelefone(cliente.getTelefone()));
        }
        
        @Test
        public void testTelefoneErrado() {
                assertTrue(ValidaTelefone.validaTelefone(client.getTelefone()));
        }
        
        @Test
    	public void testGetTelefone() {
    		assertEquals("O metodo nao esta retornando corretamente", "84574904", cliente.getTelefone());
    	}
        
        @Test
    	public void testSetTelefone() {
        	cliente.setTelefone("35561768");
    		assertEquals("O metodo nao esta retornando corretamente", "35561768", cliente.getTelefone());
    	}
        
        @Test
    	public void testSetNome() {
        	cliente.setNome("Ana");
    		assertEquals("O metodo nao esta retornando corretamente", "Ana", cliente.getNome());
    	}
        @Test
    	public void testSetCpf() {
        	cliente.setCpf("00103465111");
    		assertEquals("O metodo nao esta retornando corretamente", "00103465111", cliente.getCpf());
    	}
        @Test
    	public void testSetEmail() {
        	cliente.setEmail("_antonio_@hotmail.com");
    		assertEquals("O metodo nao esta retornando corretamente", "_antonio_@hotmail.com", cliente.getEmail());
    	}
        @Test
        public void testGetId(){
    		assertNotNull(cliente.getId());
    	}
    	@Test
    	public void testToString() {
    		assertNotNull("O metodo esta retornando null", cliente.toString());
    	}
       

}
