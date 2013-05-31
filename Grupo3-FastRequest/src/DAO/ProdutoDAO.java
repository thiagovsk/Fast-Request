package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Model.Produto;

public class ProdutoDAO  {

	
	//puxando o get con da classe conection 
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String cadastrar(Produto produto)  {
		// esse metodo recebe um objeto cliente como parametro e faz a insercao
		// dos dados
		String sql = "insert into cliente(nome,descricao,preco)values(?,?,?)";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			int index =0;
			// prepara o comando para enviar ao banco
			
			ps.setString(index++, produto.getNome());
			ps.setString(index++, produto.getDescricao());
			ps.setDouble(index++, produto.getPreco());
			ps.executeUpdate();
			// efetivando a inserção no banco pode usar execute (retorna
			// boleano) ou executeUpdate(retorna um inteiro )
			// pode ainda usar o executeBatch
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir";
			}

		} catch (SQLException e1) {
		throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e1);
		}finally{
			ConexaoBD.release(con);
		}
		
	}

	public String alterar(Produto produto) {
		// esse metodo recebe um objeto cliente como parametro e faz a alteracao
		// dos dados
		String sql = "update cliente set nome = ?, descricao = ?,preco = ?";
		sql += " where idProduto = ?";
		int index =0;
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(index++, produto.getNome());
			ps.setString(index++, produto.getDescricao());
			ps.setDouble(index++, produto.getPreco());
			ps.executeUpdate();
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso.";
			} else {
				return "Erro ao alterar";
			}

		} catch (SQLException e1) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e1);
		}finally{
			ConexaoBD.release(con);
		}
		

	}

	public String deletar(Produto produto) {
		// Este método receberá um objeto cliente como parâmetro e fará a
		// exclusão dos dados na nossa tabela
		String sql = "delete from cliente where idProduto = ?";
		int index =0;
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setLong(index++, produto.getIdProduto());
			ps.executeUpdate();	
			if (ps.executeUpdate() > 0) {
				return "Excluído com sucesso.";
			} else {
				return "Erro ao excluir";
			}

		} catch (SQLException e) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e);
		}finally{
			ConexaoBD.release(con);
		}

	}

	public ArrayList<Produto> pesquisar(Produto produto) {
		// Metodo de pesquisa no banco de dados
		ArrayList<Produto> lista = new ArrayList<Produto>();
		String sql = "select * from produto ";

		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // pegando um objeto ResultSet
												// para armazenar o resultado q
												// vem do banco
			// usando o executeQuery ao inves do executeupdate
			// Um objeto ResultSet tem acesso ao método next que permite
			// percorrer todos os dados nele contido.

			int index =0;	
			if (rs != null) {
				while (rs.next()) {
					Produto produtos = new Produto();
					produtos.setNome(rs.getString(index++));
					produtos.setDescricao(rs.getString(index++));
					produtos.setPreco(rs.getDouble(index++));
					
					lista.add(produto);
					
				}
				return lista;
			} else {
				return null;
			}

		} catch (SQLException e1) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e1);
			
		}finally{
			ConexaoBD.release(con);
		}
		
	}
}