package Testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Main.Main;

@RunWith(Suite.class)
@SuiteClasses({ ClienteTeste.class, ProdutoTeste.class, TestaValidaCpf.class, PedidoTeste.class,
	FuncionarioTeste.class  ,TestarVAlidaNome.class,TestarValidaPreco.class,TestarValidaTelefone.class, 
	TestaValidaDescricao.class ,MainTeste.class,TestaClienteDAO.class,TestaConexaoBD.class,TestaControlerCliente.class
	,TestaPedidoDao.class,TestaProdutoDao.class,TestaProdutoController.class,TestarValidaTelefone.class,
})

public class TestaTodos {
	
	
}
