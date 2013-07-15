package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.ValidarCpfException;

public class TestaValidarCpfException {

	@Test
	public void testConstrutor1() {
		ValidarCpfException validar = new ValidarCpfException(); 
		assertNotNull(validar);
		
	}
	
	@Test
	public void testConstrutor2() {
		ValidarCpfException validar = new ValidarCpfException("Teste"); 
		assertNotNull(validar);
		
	}
	

}
