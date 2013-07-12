package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Funcionario;

public class FuncionarioTeste {
	
	Funcionario func;

	@Before
	public void setUp() throws Exception {
		
		func = new Funcionario();
		
		func.setCpf("03638061132");
		func.setRg("EUIOREUIOREU");
		func.setTelefone("84574904");
		func.setId_funcionario(1);
	}

	@Test
	public void testIntanciaFuncionario() {
		assertNotNull(func);
	}


	@Test
	public void testGetId_funcionario() {
		assertEquals("O metodo nao esta retornando o valor esperado", 1, func.getId_funcionario());
	}


	@Test
	public void testGetRg() {
		assertEquals("O metodo nao esta retornando o valor esperado", "EUIOREUIOREU", func.getRg());
	}

	@Test
	public void testSetRg() {
		func.setRg("10");
		assertTrue(func.getRg().equals("10"));
		
	}

	@Test
	public void testToString() {
		assertNotNull("O metodo esta retornando null", func.toString());
	}

}
