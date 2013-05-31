package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Cliente;

public class ClienteDAO implements ModeloDao {

	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String cadastrar(Cliente cliente)  {
		// esse metodo recebe um objeto cliente como parametro e faz a insercao
		// dos dados
		String sql = "insert into cliente(nome,prato,email,telefone)values(?,?,?,?)";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql); // prepara o
																	// comando
																	// para
			// enviar ao banco
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getPratoPreferido());
			ps.setString(3, cliente.getEmail());
			ps.setString(4, cliente.getTelefone());

			// efetivando a inserção no banco pode usar execute (retorna
			// boleano) ou executeUpdate(retorna um inteiro )
			// pode ainda usar o executeBatch
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir";
			}

		} catch (SQLException e1) {
			return e1.getMessage();
		}finally{
			ConexaoBD.release(con);
		}
		
	}

	@Override
	public String alterar(Cliente cliente) {
		// esse metodo recebe um objeto cliente como parametro e faz a alteracao
		// dos dados
		String sql = "update cliente set nome = ?, prato = ?,email = ? ,telefone = ?";
		sql += " where id = ?";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(1, cliente.getPratoPreferido());
			ps.setString(1, cliente.getEmail());
			ps.setString(1, cliente.getTelefone());

			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso.";
			} else {
				return "Erro ao alterar";
			}

		} catch (SQLException e1) {
			return e1.getMessage();
		}finally{
			ConexaoBD.release(con);
		}
		

	}

	@Override
	public String deletar(Cliente cliente) {
		// Este método receberá um objeto cliente como parâmetro e fará a
		// exclusão dos dados na nossa tabela
		String sql = "delete from cliente where id = ?";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setLong(1, cliente.getId());

			if (ps.executeUpdate() > 0) {
				return "Excluído com sucesso.";
			} else {
				return "Erro ao excluir";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}finally{
			ConexaoBD.release(con);
		}

	}

	@Override
	public ArrayList<Cliente> pesquisar(Cliente cliente) {
		// Metodo de pesquisa no banco de dados
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		String sql = "select * from carro ";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // pegando um objeto ResultSet
												// para armazenar o resultado q
												// vem do banco
			// usando o executeQuery ao inves do executeupdate
			// Um objeto ResultSet tem acesso ao método next que permite
			// percorrer todos os dados nele contido.

			if (rs != null) {
				while (rs.next()) {
					Cliente usuario = new Cliente();
					usuario.setNome(rs.getString(1));
					usuario.setPratoPreferido(rs.getString(2));
					usuario.setEmail(rs.getString(3));
					usuario.setTelefone(rs.getString(4));
					lista.add(usuario);
				}
				return lista;
			} else {
				return null;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}finally{
			ConexaoBD.release(con);
		}
		
		if (lista != null) {
			return lista;
		} else {
			return null;
		}
	}
}