/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.controller;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fastrequest.dao.ClienteDAO;
import br.com.fastrequest.model.Cliente;
/**
 *
 * @author Priscilla
 */
public class ClienteController {
    
    
	  public void salvar( String nome, String cpf, String email, String telefone) throws SQLException, ParseException {
	        Cliente cliente = new Cliente();
	        cliente.setNome(nome);
	        cliente.setCpf(cpf);
                cliente.setEmail(email);
                cliente.setTelefone(telefone);
                
	        new ClienteDAO().salvar(cliente);
	    }
          
          
	  public void alterar(int id, String nome, String cpf, String email, String telefone) throws ParseException, SQLException {
            Cliente cliente = new Cliente();
	        cliente.setId(id);
	        cliente.setNome(nome);
	        cliente.setCpf(cpf);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
                
	        new ClienteDAO().alterar(cliente);
	    }
          
          
	  public List<Cliente> listaClientes() {
	        ClienteDAO clienteDao = new ClienteDAO();
	       
                try {
	            return clienteDao.encontrarCliente();
	      
                } catch (SQLException e) {
	            JOptionPane.showMessageDialog(null, "Problemas ao localizar contato\n" );
	        }
	        return null;
	  }
          
          

          
	  public Cliente buscaContatoPorNome(String cpf) throws SQLException {
	        ClienteDAO clienteDAo = new ClienteDAO();
	        return clienteDAo.encontrarCpf(cpf);
	  }
	     
		  public Cliente buscaContatoPorCPF(String cpf) throws SQLException {
		        ClienteDAO clienteDAo = new ClienteDAO();
		        return clienteDAo.encontrarCpf(cpf);
		  }
    
}
