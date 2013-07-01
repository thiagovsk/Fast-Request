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

	@Test
	public final void testarNome() {
		assertNotNull(produto.getNome()); // TODO
	}

	@Test
	public final void testarDescricao() {
		assertNotNull(produto.getDescricao()); // TODO
	}
	
	public final void testarPreco() {
		assertNotNull(produto.getPreco());// TODO
	}
	public void testarID(){
		assertNotNull(produto.getIdProduto());		
	}
	
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
