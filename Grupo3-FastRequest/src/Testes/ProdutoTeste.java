package Testes;

import br.com.fastrequest.model.Produto;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTeste {
	
	private Produto produto;
	@Before
	public void setUp() throws Exception {
		produto = new Produto();
		produto.setIdProduto(1);
		produto.setNome("testeproduto");
		produto.setDescricao("descricaoproduto");
		produto.setPreco(12.00);
	}

	@Test
	public final void testarInstancia() {
		assertNotNull(produto); // TODO
	}

	@Test
	//ALTERAR DAQUI PRA BAIXO DE ACORDO COM A MODELO
	public final void validarNome() {
		produto.setNome("AUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIU");
		assertFalse(produto.validanome(produto.getNome()));
	}
        
	@Test
	public final void validarDescricao() {
		produto.setDescricao("AUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIUAUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIU");
		assertFalse(produto.validaDescricao(produto.getDescricao()));
		// TODO
	}
        
        @Test
	public final void validarPreco() {
		produto.setPreco(-45.98);
		assertFalse(produto.validaPreco(produto.getPreco()));
		// TODO
	}
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetNome(){
                produto.setNome(null);
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetDescricao(){
                produto.setDescricao(null);
        }
        
        @Test(expected=IllegalArgumentException.class)
        public void testSetPreco(){
                produto.setPreco(0);
        }


}
