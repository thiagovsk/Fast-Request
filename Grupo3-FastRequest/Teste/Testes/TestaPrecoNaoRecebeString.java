package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.PrecoNaoRecebeString;
import Excecoes.VerificarSeJaFoiCadastrado;

public class TestaPrecoNaoRecebeString {

	@Test
	public void testConstrutor1() {
		PrecoNaoRecebeString verifica = new PrecoNaoRecebeString(); 
		assertNotNull(verifica);
		
	}
	
	@Test
	public void testConstrutor3() {
		PrecoNaoRecebeString verifica = new PrecoNaoRecebeString("teste"); 
		assertNotNull(verifica);
		
	}
	
	
	
	
	

}
