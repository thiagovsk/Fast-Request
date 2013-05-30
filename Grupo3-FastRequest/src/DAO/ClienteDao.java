package DAO;

import Model.Cliente;

public interface ClienteDao {
	
	void cadastrar(Cliente cliente);
	void alterar(Cliente cliente);
	void deletar(Cliente cliente);
	void pesquisar(Cliente cliente);

}
