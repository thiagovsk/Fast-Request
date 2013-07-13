package Testes;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.dao.PedidoDAO;
import br.com.fastrequest.model.Pedido;


public class TestaPedidoDao {

	Pedido pedido;
	PedidoDAO pedidoDao;
	@Before
	public void setUp() throws Exception {
		pedido = new Pedido("desc",10,"nome",10);
		pedidoDao = new PedidoDAO();
	}

	@Test()
	public void testNull() {

		assertNotNull(pedido);
		assertNotNull(pedidoDao);

	}

	@Test()
	public void testSalvar() throws SQLException {

		
			pedidoDao.salvar(pedido);
			assertNotNull(pedido);
			

	}

	@Test()
	public void testAlterar() throws SQLException {

		
			pedidoDao.alterar(pedido);
			assertNotNull(pedido);

		

	}

	@Test()
	public void testExcluir() throws SQLException {

		
			pedidoDao.excluir(1);
			assertNotNull(pedido);

	}

	@Test()
	public void testENcontrarPedidoNome() throws SQLException {

		
			pedidoDao.encontrarNome("nome");
			assertNotNull(pedido);

		

	}

	@Test()
			public void testENcontrarPedido() throws SQLException  {
				
				 
					pedidoDao.encontrarProduto();
					assertNotNull(pedido);
					
				 
	}

	
}
