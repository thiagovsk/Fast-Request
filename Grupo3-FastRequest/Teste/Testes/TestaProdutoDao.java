package Testes;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.dao.ProdutoDAO;
import br.com.fastrequest.model.Produto;

public class TestaProdutoDao {

	Produto produto;
	ProdutoDAO produtoDAO;

	@Before
	public void setUp() throws Exception {
		produto = new Produto(1, "nome", "descricao", 10, "tipo");
		produtoDAO = new ProdutoDAO();
	}

	@Test()
	public void testNull() {

		assertNotNull(produto);
		assertNotNull(produtoDAO);

	}

	@Test()
	public void testSalvar() throws SQLException {

		
			produtoDAO.salvar(produto);
			assertNotNull(produto);

		}

	@Test()
	public void testAlterar() throws SQLException {

	
			produtoDAO.alterar(produto);
			assertNotNull(produto);

		

	}

	@Test()
	public void testExcluir() throws SQLException {

		
			produtoDAO.excluir(1);
			assertNotNull(produto);


	}

	@Test()
	public void testENcontrarProduto() throws SQLException {

		
			produtoDAO.encontrarProduto();
			assertNotNull(produto);

		

	}

	@Test()
			public void testENcontrarProdutoBebida() throws SQLException  {
				
				
					produtoDAO.encontrarProdutoBebida();
					assertNotNull(produto);
					
				
	}

	@Test()
					public void testENcontrarProdutoComida() throws SQLException  {
						
							produtoDAO.encontrarProdutoPrato();
							assertNotNull(produto);
							
						
	}

	@Test()
	public void testENcontrarProdutoSobremesa() throws SQLException {

		
			produtoDAO.encontrarProdutoSobremesa();
			assertNotNull(produto);

		

	}
	@Test()
	public void testENcontrarNome() throws SQLException  {
		
		 
			produtoDAO.encontrarNome("nome");
			assertNotNull(produto);
			
		
}

}
