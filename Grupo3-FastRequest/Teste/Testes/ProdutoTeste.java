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
		produto.setPreco(10);
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
	public final void testPrecoMenorQue0() {
		produto.setPreco(-45.98);
		assertFalse(vp.validaPreco(produto.getPreco()));
		// TODO
	}

	@Test
	public final void testvalidarPrecoCaminhoFeliz() {
		produto.setPreco(45.98);
		assertTrue(vp.validaPreco(produto.getPreco()));
		// TODO
	}

	@Test
	public final void testToString(){
		assertEquals("Metodo toString nao funcionou", "testeproduto R$ 12.0\n", produto.toString());
	}
	    
	    
	    @Test
	    public final void testaConstrutorProduto(){
	    	Produto produto1 = new Produto(2, "pizza", "massa", 20.5, "prato");
	    	assertNotNull(produto1);
	    }
	    
	    @Test
	    public final void testGetNome(){
	    	assertEquals("Get Nome n�o funcionando corretamente", "testeproduto", produto.getNome());
	    }
	    

	    @Test
	    public final void testGetIdProduto(){
	    	assertEquals("Get Nome n�o funcionando corretamente", 8, produto.getIdProduto());
	    }
	    
	    @Test
	    public final void testGetTipo(){
	    	assertEquals("Get Nome n�o funcionando corretamente", "Prato", produto.getTipo());
	    }        

	    @Test
	    public final void testSetIdProduto(){
	    	produto.setIdProduto(9);
	    	assertEquals("Set Idproduto n�o funcionando corretamente", 9, produto.getIdProduto());
	    }
	    
	}