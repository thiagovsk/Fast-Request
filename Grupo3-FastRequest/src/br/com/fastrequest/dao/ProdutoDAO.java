package br.com.fastrequest.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fastrequest.model.Produto;
import javax.swing.JOptionPane;



public class ProdutoDAO  extends DaoGenerica{
	
	public void salvar (Produto produto) throws SQLException{
		String insert = "insert into produto(nome,descricao,preco)values(?,?,?)";
		inserir(insert ,produto.getNome(),produto.getDescricao(),produto.getPreco() );
	
	}
	public void alterar(Produto produto) throws SQLException {
		String update = "update produto set nome = ?, descricao = ?,preco = ?";
		update += " where idProduto = ?";
		atualizar(update, produto.getIdProduto(),produto.getNome(),produto.getDescricao(),produto.getPreco());
		
	}
	public void excluir(String nome) throws SQLException{
		String delete ="DELETE FROM produtos WHERE nome = ?";
		deletar(delete,nome);
	}
	public List<Produto> encontrarProduto() throws SQLException{
		List<Produto> produtos = new ArrayList<Produto>();
		String select = "SELECT * FROM PRODUTO";
		   PreparedStatement stmt = getConnection().prepareStatement(select);
	        ResultSet rs = stmt.executeQuery();
	 
	        while (rs.next()) {
	            Produto produto = new Produto();
	        	produto.setIdProduto(rs.getInt("id"));
	            produto.setNome(rs.getString("nome"));
	            produto.setDescricao(rs.getString("descricao"));
	            produto.setPreco(rs.getDouble("preco"));
	            produtos.add(produto);
	        }
	 
	        rs.close();
	        stmt.close();
	 
	        return produtos;	
	}
	public Produto encontrarNome(String nome) throws SQLException {
        String select = "SELECT * FROM PRODUTO WHERE nome = ?";
        Produto produto = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
 
        while (rs.next()) {
            produto = new Produto();
            produto.setNome(rs.getString("nome"));
            produto.setDescricao(rs.getString("descricao"));
           produto.setPreco(rs.getDouble("preco"));
        }
 
        rs.close();
        stmt.close();
        return produto; 
}
}
