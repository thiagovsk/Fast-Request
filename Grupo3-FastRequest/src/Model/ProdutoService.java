/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Thiagoo
 */
import DAO.ProdutoDAO;
import java.util.ArrayList;
import Model.Produto;
        
        
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
