package Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.sql.SQLException;
import java.text.ParseException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.com.fastrequest.controller.ClienteController;
import br.com.fastrequest.dao.ClienteDAO;
import br.com.fastrequest.model.Cliente;

public class TestaControlerCliente {

	ClienteController cliente;
	@Mock
	ClienteDAO daoMock = Mockito.mock(ClienteDAO.class);
	Cliente modelMock = Mockito.mock(Cliente.class);
	@Before
	
	public void setUp() throws Exception {
		daoMock = Mockito.mock(ClienteDAO.class);
		modelMock = Mockito.mock(Cliente.class);
		cliente = new ClienteController();
		modelMock.setCpf("1");
		modelMock.setEmail("email");
		modelMock.setId(1);
		modelMock.setNome("nome");
		modelMock.setTelefone("101010");
		
		
	}

	@Test
	public void testInstancia(){
		assertNotNull(cliente);
		assertNotNull(daoMock);
		assertNotNull(modelMock);
	}
	@Test
	public void testSalvar() {
		try {
			cliente.salvar(modelMock.getCpf(), modelMock.getNome(), modelMock.getEmail(), modelMock.getTelefone());
		} catch (SQLException e) {
		
		
		} catch (ParseException e) {
			
		}
	}

	@Test
	public void testAlterar() {
		try {
			cliente.alterar(modelMock.getId(), modelMock.getNome(), modelMock.getCpf(), 
					modelMock.getEmail(), modelMock.getTelefone());
		} catch (SQLException e) {
		
		
		} catch (ParseException e) {
			
		}
	}
	@Test
	public void testListClientes(){
		
		cliente.listaClientes();
		
	}
	@Test
	public void testBuscaPorCpf(){
		
		try {
			cliente.buscaContatoPorCPF(modelMock.getCpf());
		} catch (SQLException e) {
		
		}
		
	}
	@Test
	public void testBuscaPorNome(){
		
		try {
			cliente.buscaContatoPorNome(modelMock.getNome());
		} catch (SQLException e) {
		
		}
		
	}
	
}
