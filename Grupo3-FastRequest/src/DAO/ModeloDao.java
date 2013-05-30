package DAO;

import Model.Cliente;


//Interface a ser seguida pelas classes 
public interface ModeloDao {
	
	void cadastrar();
	void alterar();
	void deletar();
	void pesquisar();

}
