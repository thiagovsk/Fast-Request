package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.ValidarEmailException;
import Excecoes.ValidarTelefoneException;

public class TestaValidarTelefoneException {

	@Test
	public void testConstrutor1() {
		ValidarTelefoneException validarTelefone = new ValidarTelefoneException(); 
		assertNotNull(validarTelefone);
		
	}
	
	@Test
	public void testConstrutor2() {
		ValidarTelefoneException validarTelefone = new ValidarTelefoneException("teste"); 
		assertNotNull(validarTelefone);
		
	}

}
