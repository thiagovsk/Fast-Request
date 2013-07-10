package Testes;

import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.ValidaCpf;
import br.com.fastrequest.model.ValidaEmail;
import br.com.fastrequest.model.ValidaNome;
import br.com.fastrequest.model.ValidaTelefone;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


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
		assertTrue(vp.validarCpf(cliente.getCpf()));
	}
        
    @Test
	public void testCpfErrado() {
		assertFalse(vp.validarCpf(client.getCpf()));
	}
        
    @Test
	public void testGetCpf() {
		assertEquals("O metodo nao esta retornando corretamente", "03638061132", cliente.getCpf());
	}
        
	@Test
	public void testEmailCerto() {
		assertTrue(ve.validaEmail(cliente.getEmail()));
	}
        
	@Test
	public void testEmailErrado() {
		assertFalse(ve.validaEmail(client.getEmail()));
	}
	
	@Test
	public void testGetEmail() {
		assertEquals("O metodo nao esta retornando corretamente", "_antonio_@hotmail.com", cliente.getEmail());
	}
	
        
        @Test
        public void testTelefoneCerto() {
                assertTrue(vt.validaTelefone(cliente.getTelefone()));
        }
        
        @Test
        public void testTelefoneErrado() {
                assertTrue(vt.validaTelefone(client.getTelefone()));
        }
        
        @Test
    	public void testGetTelefone() {
    		assertEquals("O metodo nao esta retornando corretamente", "84574904", cliente.getTelefone());
    	}
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetNome(){
                cliente.setNome(null);
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetCpf(){
                cliente.setCpf(null);
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetEmail(){
                cliente.setEmail(null);
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetTelefone(){
                cliente.setTelefone(null);
        }

}
