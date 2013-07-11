package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fastrequest.model.Pedido;

public class PedidoTeste {
	
	Pedido pedido;

	@Before
	public void setUp() throws Exception {
		pedido = new Pedido();
		pedido.setNumeroClientes(1);
		pedido.setValorTotal(10);
	}

	@Test
	public void testPedidoInstanciado() {
		assertNotNull(pedido);
	}

	@Test
	public void testGetNumeroClientes() {
		assertEquals("Retorno não esperado para o numero de Clientes", 1, pedido.getNumeroClientes());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSetNumeroClientes() {
		pedido.setNumeroClientes(0);
	}

	@Test
	public void testGetValorTotal() {
		assertEquals("Retorno nao esperado para o valor total do pedido", 10, pedido.getValorTotal(), 0.0001);
		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSetValorTotal() {
		pedido.setValorTotal(0);
	}

}
