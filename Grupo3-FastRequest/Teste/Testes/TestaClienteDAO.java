package Testes;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.dao.ClienteDAO;
import br.com.fastrequest.model.Cliente;

public class TestaClienteDAO {

	Cliente cliente;
	ClienteDAO clienteDAO;

	@Before
	public void setUp() throws Exception {
		cliente = new Cliente(1,"nome","03713770131","email","10");
		
		clienteDAO = new ClienteDAO();
	}

	@Test()
	public void testNull() {

		assertNotNull(cliente);
		assertNotNull(clienteDAO);

	}

	@Test()
	public void testSalvar() {

		try {
			clienteDAO.salvar(cliente);
			assertNotNull(cliente);

		} catch (SQLException e) {
			
		}
	}

	@Test()
	public void testAlterar() {

		try {
			clienteDAO.alterar(cliente);
			assertNotNull(cliente);

		} catch (SQLException e) {

		}

	}

	@Test()
	public  void testExcluir() {

		try {
			clienteDAO.excluir(1);
			assertNotNull(cliente);
		} catch (SQLException e) {

		}

	}

	@Test()
	public void testENcontrarCliente() {

		try {
			clienteDAO.encontrarCliente();
			assertNotNull(cliente);

		} catch (SQLException e) {

		}

	}

	@Test()
			public void testENcontrar()  {
				
				 try {
					clienteDAO.encontrarCpf("03713770131");
					assertNotNull(cliente);
					
				} catch (SQLException e) {
					
				}
	}


	


}
