package Testes;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.controller.ClienteController;
import br.com.fastrequest.dao.ClienteDAO;
import br.com.fastrequest.model.Cliente;

public class ClienteControllerTeste {
	
	ClienteController controler = new ClienteController();
	Cliente cliente = new Cliente();
	ClienteDAO dao = new ClienteDAO();

	@Before
	public void setUp() throws Exception {
	
		
		
		
	}

	
	@Test
	public void testarInstancia(){
		assertNotNull(controler);
	}



}
