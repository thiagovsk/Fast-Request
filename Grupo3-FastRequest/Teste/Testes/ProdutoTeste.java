package Testes;

import br.com.fastrequest.model.Produto;
import br.com.fastrequest.model.ValidaDescricao;
import br.com.fastrequest.model.ValidaNome;
import br.com.fastrequest.model.ValidaPreco;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTeste {
	
	private Produto produto;
	ValidaNome vn;
	ValidaDescricao vd;
	ValidaPreco vp;
	
	@Before
	public void setUp() throws Exception {
		vp = new ValidaPreco();
		vd = new ValidaDescricao();
		vn = new ValidaNome();
		produto = new Produto();
		produto.setNome("testeproduto");
		produto.setDescricao("descricaoproduto");
		produto.setPreco(12.00);
	}

	@Test
	public final void testarInstancia() {
		assertNotNull(produto); 
	}

	@Test
	//ALTERAR DAQUI PRA BAIXO DE ACORDO COM A MODELO
	public final void validarNome() {
		produto.setNome("AUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIU");
		assertTrue(vd.validaDescricao(produto.getNome()));
	}
        
	@Test
	public final void validarDescricao() {
		produto.setDescricao("AUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIUAUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIU");
		assertTrue(vd.validaDescricao(produto.getDescricao()));
	}
        
        @Test
	public final void validarPreco() {
		produto.setPreco(-45.98);
		assertFalse(vp.validaPreco(produto.getPreco()));
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
