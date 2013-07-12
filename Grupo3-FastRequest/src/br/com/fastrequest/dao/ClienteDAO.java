/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.dao;

import br.com.fastrequest.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		
		
		String update = "UPDATE cliente " +
                "SET nome = ?,  cpf = ?, email = ? , telefone = ?" +
                "WHERE id = ?";
		atualizar(update, cliente.getId(),cliente.getNome(),cliente.getCpf(),cliente.getEmail(),cliente.getTelefone());
		
	}

	public ArrayList<Cliente> encontrarCliente() throws SQLException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String select = "SELECT * FROM cliente";
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
        String select = "SELECT * FROM cliente WHERE cpf = ?";
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
