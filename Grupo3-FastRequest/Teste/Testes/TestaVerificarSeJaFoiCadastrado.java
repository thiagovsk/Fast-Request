package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.ValidarEmailException;
import Excecoes.VerificarSeJaFoiCadastrado;

public class TestaVerificarSeJaFoiCadastrado {

	@Test
	public void testConstrutor1() {
		VerificarSeJaFoiCadastrado verifica = new VerificarSeJaFoiCadastrado(); 
		assertNotNull(verifica);
		
	}
	
	@Test
	public void testConstrutor2() {
		VerificarSeJaFoiCadastrado verifica = new VerificarSeJaFoiCadastrado("teste"); 
		assertNotNull(verifica);
		
	}

}
