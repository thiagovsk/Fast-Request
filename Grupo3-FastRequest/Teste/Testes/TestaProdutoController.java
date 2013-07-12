package Testes;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import br.com.fastrequest.controller.ClienteController;
import br.com.fastrequest.controller.ProdutoController;
import br.com.fastrequest.dao.ClienteDAO;
import br.com.fastrequest.dao.ProdutoDAO;
import br.com.fastrequest.model.Cliente;
import br.com.fastrequest.model.Produto;

public class TestaProdutoController {

	ProdutoController produto;
	@Mock
	ProdutoDAO daoMock = Mockito.mock(ProdutoDAO.class);
	Produto modelMock = Mockito.mock(Produto.class);
	@Before
	
	public void setUp() throws Exception {
		daoMock = Mockito.mock(ProdutoDAO.class);
		modelMock = Mockito.mock(Produto.class);
		produto = new ProdutoController();
		modelMock.setDescricao("desc");
		modelMock.setIdProduto(1);
		modelMock.setNome("nome");
		modelMock.setPreco(1);
		modelMock.setTipo("tipo");	
		
		
	}

	@Test
	public void testInstancia(){
		assertNotNull(produto);
		assertNotNull(daoMock);
		assertNotNull(modelMock);
	}
	@Test
	public void testSalvar() {
		try {
			produto.salvar(modelMock.getNome(),modelMock.getDescricao(),modelMock.getPreco(),modelMock.getTipo());
		} catch (SQLException e) {
		
		
		} catch (ParseException e) {
			
		}
	}

	@Test
	public void testAlterar() {
		try {
			produto.alterar(modelMock.getIdProduto(),modelMock.getNome()
					,modelMock.getDescricao(),modelMock.getPreco(),modelMock.getTipo());

		} catch (SQLException e) {
		
		
		} 
	}
	@Test
	public void testListClientes(){
		
		produto.listaProdutos();
		
	}
	@Test
	public void testBuscarPorNome(){
		
		try {
			produto.buscaContatoPorNome(modelMock.getNome());
		} catch (SQLException e) {
			
		}
		
	}
	@Test
	public void testListClientes1(){
		
		produto.listaProdutosBebida();
		
	}
	@Test
	public void testListClientes2(){
		
		produto.listaProdutosPrato();
		
	}
	@Test
	public void testListClientes3(){
		
		produto.listaProdutosSobremesa();
		
	}
	@Test
	public void testExcluir(){
		
		try {
			produto.excluir(1);
		} catch (SQLException e) {
		
		}
		
	}
	
}
