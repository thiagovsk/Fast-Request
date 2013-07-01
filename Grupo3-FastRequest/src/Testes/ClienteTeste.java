package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Cliente;

public class ClienteTeste {

	private Cliente cliente;
	@Before
	public void setUp() throws Exception {
		cliente = new Cliente();
		cliente.setNome("teste");
		cliente.setCpf("000");
		cliente.setEmail("a@a");
		cliente.setId(1);
		cliente.setTelefone("0000");
	}
	
	@Test
	public void testarInstancia() {

		assertNotNull(cliente);
		
	}
	@Test
	public void testarTelefone(){
		assertNotNull(cliente.getTelefone());	
	}
	@Test
	public void testarNome(){
		assertNotNull(cliente.getNome());
			
	}
	@Test
	public void testarEmail(){
		assertNotNull(cliente.getEmail());
			
	}
	@Test
	public void testarID(){
		assertNotNull(cliente.getId());
			
	}
	@Test
	public void testarCpf(){
		
			
	}
	

	
}
