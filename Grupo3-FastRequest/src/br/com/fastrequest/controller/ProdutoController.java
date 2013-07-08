package br.com.fastrequest.controller;

import br.com.fastrequest.dao.ProdutoDAO;
import br.com.fastrequest.model.Produto;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
public class ProdutoController {

    
 
    
	  public void salvar(String nome, String descricao, double preco) throws SQLException, ParseException {
	        Produto produto = new Produto();
	        produto.setNome(nome);
	        produto.setDescricao(descricao);
	        produto.setPreco(preco);
	 
	        new ProdutoDAO().salvar(produto);
	    }
	  public void alterar( int idProduto,String nome, String descricao, double preco) throws SQLException , IndexOutOfBoundsException{
	        Produto produto = new Produto();
	        produto.setNome(nome);
	        produto.setDescricao(descricao);
	        produto.setPreco(preco);
	        produto.setIdProduto(idProduto);
	        new ProdutoDAO().alterar(produto);
	    }
	  public List<Produto> listaProdutos() {
	        ProdutoDAO produtoDAO = new ProdutoDAO();
	        try {
	            return produtoDAO.encontrarProduto();
	        } catch (SQLException e) {
	            JOptionPane.showMessageDialog(null, "Problemas ao localizar contato\n" + e.getLocalizedMessage());
	        }
	        return null;
	    }
	  public void excluir(int id) throws SQLException {
	        new ProdutoDAO().excluir(id);
	    }
	 
	    public Produto buscaContatoPorNome(String nome) throws SQLException {
	        ProdutoDAO produtoDAo = new ProdutoDAO();
	        return produtoDAo.encontrarNome(nome);
	    }
}