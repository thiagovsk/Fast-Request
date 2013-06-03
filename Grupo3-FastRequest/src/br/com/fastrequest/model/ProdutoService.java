/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.model;

/**
 *
 * @author Thiagoo
 */
import java.util.ArrayList;

import br.com.fastrequest.dao.ProdutoDAO;
import br.com.fastrequest.model.Produto;
        
        
public class ProdutoService {
               
private ProdutoDAO dao;
private Produto produto;
    public ProdutoService(){
    
    dao = new ProdutoDAO();
    }

    public void salvar(Produto produto){
    
        if(produto.getIdProduto() == 0){
            dao.cadastrar(produto);
        }
    }
    
    public String getProdutos(){
    
        return produto.toString();
    }
}
