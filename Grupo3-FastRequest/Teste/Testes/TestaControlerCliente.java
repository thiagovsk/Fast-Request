package Testes;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

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
		modelMock.setCpf("cpf");
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
	public void testSalvar() throws SQLException, ParseException {
		
			cliente.salvar(modelMock.getCpf(), modelMock.getNome(), modelMock.getEmail(), modelMock.getTelefone());
	
	}

	@Test
	public void testAlterar() throws ParseException, SQLException {
		
		
			cliente.alterar(1, "nome", "cpf", "email", "13241");
			
			
		}
	@Test
	public void testListClientes() throws SQLException {
		
			daoMock.encontrarCliente();
			Mockito.when(cliente.listaClientes()).thenThrow(SQLException.class);
			 cliente.listaClientes();
		
		
	}
	
	@Test
	public void testBuscaPorCpf() throws SQLException{
		
	
			cliente.buscaContatoPorCPF(modelMock.getCpf());
			Mockito.when(cliente.buscaContatoPorCPF(null)).thenThrow(SQLException.class);
		
		
	}
	@Test
	public void testBuscaPorNome() throws SQLException{
		
		
			cliente.buscaContatoPorNome(modelMock.getNome());
		
	}
	
}
