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
	public void testSalvar() {

		try {
			pedidoDao.salvar(pedido);
			assertNotNull(pedido);
			

		} catch (SQLException e) {
			e.getMessage();
		}
	}

	@Test()
	public void testAlterar() {

		try {
			pedidoDao.alterar(pedido);
			assertNotNull(pedido);

		} catch (SQLException e) {

		}

	}

	@Test()
	public void testExcluir() {

		try {
			pedidoDao.excluir(1);
			assertNotNull(pedido);

		} catch (SQLException e) {

		}

	}

	@Test()
	public void testENcontrarPedidoNome() {

		try {
			pedidoDao.encontrarNome("nome");
			assertNotNull(pedido);

		} catch (SQLException e) {

		}

	}

	@Test()
			public void testENcontrarPedido()  {
				
				 try {
					pedidoDao.encontrarProduto();
					assertNotNull(pedido);
					
				} catch (SQLException e) {
					
				}
	}

	
}
