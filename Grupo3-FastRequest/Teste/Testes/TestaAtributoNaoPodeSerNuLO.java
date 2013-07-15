package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.AtributoNaoPodeSerNulo;
import Excecoes.ValidarEmailException;

public class TestaAtributoNaoPodeSerNuLO {

	@Test
	public void testConstrutor1() {
		AtributoNaoPodeSerNulo verifica = new AtributoNaoPodeSerNulo(); 
		assertNotNull(verifica);
		
	}
	
	@Test
	public void testConstrutor2() {
		AtributoNaoPodeSerNulo verifica = new AtributoNaoPodeSerNulo("teste"); 
		assertNotNull(verifica);
		
	}

}
