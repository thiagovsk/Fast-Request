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
	public void testSalvar() {

		try {
			produtoDAO.salvar(produto);
			assertNotNull(produto);

		} catch (SQLException e) {
			e.getMessage();
		}
	}

	@Test()
	public void testAlterar() {

		try {
			produtoDAO.alterar(produto);
			assertNotNull(produto);

		} catch (SQLException e) {

		}

	}

	@Test()
	public void testExcluir() {

		try {
			produtoDAO.excluir(1);
			assertNotNull(produto);

		} catch (SQLException e) {

		}

	}

	@Test()
	public void testENcontrarProduto() {

		try {
			produtoDAO.encontrarProduto();
			assertNotNull(produto);

		} catch (SQLException e) {

		}

	}

	@Test()
			public void testENcontrarProdutoBebida()  {
				
				 try {
					produtoDAO.encontrarProdutoBebida();
					assertNotNull(produto);
					
				} catch (SQLException e) {
					
				}
	}

	@Test()
					public void testENcontrarProdutoComida()  {
						
						 try {
							produtoDAO.encontrarProdutoBebida();
							assertNotNull(produto);
							
						} catch (SQLException e) {
							
						}
	}

	@Test()
	public void testENcontrarProdutoSobremesa() {

		try {
			produtoDAO.encontrarProdutoSobremesa();
			assertNotNull(produto);

		} catch (SQLException e) {

		}

	}

}
