package br.com.fastrequest.controller;

import br.com.fastrequest.dao.ConexaoBD;
import br.com.fastrequest.dao.ProdutoDAO;
import br.com.fastrequest.model.Produto;
public class Controller {

    
 
    
    public void inserirNoBD(String nome , String descricao , double preco){
        
        
        Produto produto = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setPreco(preco);
        dao.cadastrar(produto);
        
    
    }
	
}