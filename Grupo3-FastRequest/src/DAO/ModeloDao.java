package DAO;

import java.util.ArrayList;

import Model.Cliente;


//Interface a ser seguida pelas classes 
public interface ModeloDao {
	
	String alterar(Cliente cliente);
	String deletar(Cliente cliente);
	 ArrayList<Cliente>  pesquisar(Cliente cliente);
	String cadastrar(Cliente cliente);

}
