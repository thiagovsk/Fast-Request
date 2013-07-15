package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.ValidarCpfException;
import Excecoes.ValidarEmailException;

public class TestaValidarEmailException {

	@Test
	public void testConstrutor1() {
		ValidarEmailException validarEmail = new ValidarEmailException(); 
		assertNotNull(validarEmail);
		
	}
	
	@Test
	public void testConstrutor2() {
		ValidarEmailException validarEmail = new ValidarEmailException("Teste"); 
		assertNotNull(validarEmail);
		
	}

}
