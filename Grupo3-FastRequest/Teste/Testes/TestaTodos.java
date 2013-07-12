package Testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClienteTeste.class, ProdutoTeste.class, ValidaCpfTeste.class, PedidoTeste.class,
	FuncionarioTeste.class  ,TestarVAlidaNome.class,TestarValidaPreco.class,TestarValidaTelefone.class, 
	TestaValidaDescricao.class})

public class TestaTodos {
	
	
}
