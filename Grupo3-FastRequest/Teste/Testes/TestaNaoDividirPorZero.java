package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.NaoDividirPorZero;
import Excecoes.PrecoNaoRecebeString;

public class TestaNaoDividirPorZero {

	@Test
	public void testConstrutor1() {
		NaoDividirPorZero verifica = new NaoDividirPorZero(); 
		assertNotNull(verifica);
		
	}
	
	@Test
	public void testConstrutor2() {
		NaoDividirPorZero verifica = new NaoDividirPorZero("teste"); 
		assertNotNull(verifica);
		
	}

}
