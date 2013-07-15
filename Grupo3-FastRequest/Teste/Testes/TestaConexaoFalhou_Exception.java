package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Excecoes.ConexaoFalhou_Exception;
import Excecoes.ValidarEmailException;

public class TestaConexaoFalhou_Exception {

	@Test
	public void testConstrutor1() {
		ConexaoFalhou_Exception verifica = new ConexaoFalhou_Exception(); 
		assertNotNull(verifica);
		
	}
	
	@Test
	public void testConstrutor2() {
		ConexaoFalhou_Exception verifica = new ConexaoFalhou_Exception("teste"); 
		assertNotNull(verifica);
		
	}
	
	

}
