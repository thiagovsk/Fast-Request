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
	public void testSalvar() throws SQLException, ParseException {
		
			produto.salvar(modelMock.getNome(),modelMock.getDescricao(),modelMock.getPreco(),modelMock.getTipo());
		
	}

	@Test
	public void testAlterar() throws SQLException{
			produto.alterar(1,"pizza","massa",20.0,"prato");

	}
	
	@Test
	public void testBuscarPorNome() throws SQLException{
		
		produto.buscaContatoPorNome(modelMock.getNome());
		
	}
	
	@Test
	public void testListClientes1(){
		
		produto.listaProdutosBebida();
		
	}
	@Test
	public void testListClientes4(){
		
		produto.listaProdutos();
		
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
	public void testExcluir() throws SQLException{
		
			produto.excluir(1);
		
	}
	
}
