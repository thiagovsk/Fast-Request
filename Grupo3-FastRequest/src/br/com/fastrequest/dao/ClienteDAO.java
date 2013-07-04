/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fastrequest.model.Cliente;
/**
 *
 * @author Antonio
 */
public class ClienteDAO extends DaoGenerica{
	
    public void salvar (Cliente cliente) throws SQLException{
		String insert = "insert into cliente(nome,cpf,email,telefone)values(?,?,?,?)";
		inserir(insert ,cliente.getNome(),cliente.getCpf(),cliente.getEmail(),cliente.getTelefone());
	
	}
	public void alterar(Cliente cliente) throws SQLException {
		String update = "update cliente set nome = ?, cpf = ?,email = ?, telefone = ?";
		update += " where idCliente = ?";
		atualizar(update, cliente.getNome(),cliente.getCpf(),cliente.getEmail(),cliente.getTelefone());
		
	}
	public void excluir(String cpf) throws SQLException{
		String delete ="DELETE FROM clientes WHERE cpf = ?";
		deletar(delete,cpf);
	}
	public ArrayList<Cliente> encontrarCliente() throws SQLException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String select = "SELECT * FROM CLIENTE";
		   PreparedStatement stmt = getConnection().prepareStatement(select);
	        ResultSet rs = stmt.executeQuery();
	 
	        while (rs.next()) {
	            Cliente cliente = new Cliente();
	            cliente.setId(rs.getInt("id"));
	            cliente.setNome(rs.getString("nome"));
	            cliente.setCpf(rs.getString("cpf"));
	            cliente.setEmail(rs.getString("email"));
                cliente.setEmail(rs.getString("telefone"));
	            clientes.add(cliente);
	        }
	 
	        rs.close();
	        stmt.close();
	 
	        return clientes;	
	}
	public Cliente encontrarCpf(String cpf) throws SQLException {
        String select = "SELECT * FROM CLIENTE WHERE cpf = ?";
        Cliente cliente = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);
        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();
 
        while (rs.next()) {
            cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));
        }
 
        rs.close();
        stmt.close();
        return cliente; 
}
    
    
}
