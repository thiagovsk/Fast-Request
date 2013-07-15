package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.ElementoForaDosLimites;
import Excecoes.PrecoNaoRecebeString;

public class TestaElementoForaDosLismites {

	@Test
	public void testConstrutor1() {
		ElementoForaDosLimites verifica = new ElementoForaDosLimites(); 
		assertNotNull(verifica);
		
	}
	
	@Test
	public void testConstrutor2() {
		ElementoForaDosLimites verifica = new ElementoForaDosLimites("teste"); 
		assertNotNull(verifica);
		
	}

}
