package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Produto;

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


	
	//ALTERAR DAQUI PRA BAIXO DE ACORDO COM A MODELO
	public final void validarNome() {
		produto.setNome("AUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIU");
		assertTrue(produto.validanome(produto.getNome()));
	}
	
	public final void validarDiscricao() {
		produto.setDescricao("AUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIUAUEHAUSHIAUEHAIUSHAIUEHASeAYUEHAUEHAUHEAUHEUAHEUAHEUAHIUEHAIUHSAIUEHAIUSHAIUEHASIUHAEIU");
		assertTrue(produto.validanome(produto.getDescricao()));
		// TODO
	}


}
