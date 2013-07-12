 package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Pedido;

public class PedidoTeste {
	
	Pedido pedido;
	Pedido pedido2;

	@Before
	public void setUp() throws Exception {
		pedido = new Pedido();
		pedido.setNumeroClientes(1);
		pedido.setValorTotal(10);
		pedido2 = new Pedido("aeja",10,"auhe",1029);
		
	}

	@Test
	public void testPedidoInstanciado() {
		assertNotNull(pedido);
	}

	@Test
	public void testPedidoInstanciado2() {
		assertNotNull(pedido2);
	}
	
	@Test
	public void testGetNumeroClientes() {
		assertEquals("Retorno não esperado para o numero de Clientes", 1, pedido.getNumeroClientes());
	}

	@Test
	public void testSetNumeroClientes() {
		pedido.setNumeroClientes(5);
		assertEquals(5, pedido.getNumeroClientes());
	}

	@Test
	public void testGetValorTotal() {
		assertEquals("Retorno nao esperado para o valor total do pedido", 10, pedido.getValorTotal(), 0.0001);
		
	}

	@Test
	public void testSetValorTotal() {
		assertEquals("Retorno nao esperado para o valor total do pedido", 10, pedido.getValorTotal(), 0.0001);
	}

		@Test
		public void testDescricao(){
			assertNotNull(pedido2);
			assertTrue(pedido2.getDescricao().equals("aeja"));
		}
}
