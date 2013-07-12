package Testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.fastrequest.model.ValidaCpf;

@RunWith(Suite.class)
@SuiteClasses({ ClienteTeste.class, ProdutoTeste.class, TestaValidaCpf.class, PedidoTeste.class,
	FuncionarioTeste.class  ,TestarVAlidaNome.class,TestarValidaPreco.class,TestarValidaTelefone.class, 
	TestaValidaDescricao.class ,})

public class TestaTodos {
	
	
}
