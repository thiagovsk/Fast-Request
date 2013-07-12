package Testes;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import Main.Main;



public class MainTeste {
	Main main;

	@Before
	public void setUp() throws Exception {
	 main = new Main();
		}

	@Test
	public void test() {
		assertNotNull(main);
		
	}

}
