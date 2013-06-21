/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.controller;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fastrequest.dao.ConexaoBD;
import br.com.fastrequest.dao.ClienteDAO;
import br.com.fastrequest.model.Cliente;
/**
 *
 * @author Priscilla
 */
public class ClienteController {
    
    
	  public void salvar(int id, String nome, String pratoPreferido, String email,
			String telefone) throws SQLException, ParseException {
	        Cliente cliente = new Cliente();
	        cliente.setId(id);
	        cliente.setNome(nome);
	        cliente.setPratoPreferido(pratoPreferido);
                cliente.setEmail(email);
                cliente.setTelefone(telefone);
                
	        new ClienteDAO().salvar(cliente);
	    }
	  public void alterar(int  id, String nome, String descricao, double preco) throws ParseException, SQLException {
	        Produto produto = new Produto();
	        produto.setNome(nome);
	        produto.setDescricao(descricao);
	        produto.setPreco(preco);
	        produto.setIdProduto(id);
	 
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
	  public void excluir(String nome) throws SQLException {
	        new ProdutoDAO().excluir(nome);
	    }
	 
	    public Produto buscaContatoPorNome(String nome) throws SQLException {
	        ProdutoDAO produtoDAo = new ProdutoDAO();
	        return produtoDAo.encontrarNome(nome);
	    }
    
}
