package br.com.fastrequest.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fastrequest.model.Cliente;
import javax.swing.JOptionPane;


public class ClienteDAO implements ModeloDao {

	
	//puxando o get con da classe conection 
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
                
                ConexaoBD.abrirconexao();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			int index =0;
			// prepara o comando para enviar ao banco
			
			ps.setString(index++, cliente.getNome());
			ps.setString(index++, cliente.getPratoPreferido());
			ps.setString(index++, cliente.getEmail());
			ps.setString(index++, cliente.getTelefone());
			ps.executeUpdate();
			// efetivando a inser��o no banco pode usar execute (retorna
			// boleano) ou executeUpdate(retorna um inteiro )
			// pode ainda usar o executeBatch
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir";
			}

		} catch (SQLException e1) {
		   JOptionPane.showMessageDialog(null, "Banco desconectado");
                  throw new ConexaoFalhou_Exception("Erro ao conectar ", e1);
		}
		
		
		
	}

	@Override
	public String alterar(Cliente cliente) {
		// esse metodo recebe um objeto cliente como parametro e faz a alteracao
		// dos dados
            
              ConexaoBD.abrirconexao();
		String sql = "update cliente set nome = ?, prato = ?,email = ? ,telefone = ?";
		sql += " where id = ?";
		int index =0;
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(index++, cliente.getNome());
			ps.setString(index++, cliente.getPratoPreferido());
			ps.setString(index++, cliente.getEmail());
			ps.setString(index++, cliente.getTelefone());
			ps.executeUpdate();
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso.";
			} else {
				return "Erro ao alterar";
			}

		} catch (SQLException e1) {
			   JOptionPane.showMessageDialog(null, "Banco desconectado");
                  throw new ConexaoFalhou_Exception("Erro ao conectar ", e1);
		}
		

	}

	@Override
	public String deletar(Cliente cliente) {
		// Este m�todo receber� um objeto cliente como par�metro e far� a
		// exclus�o dos dados na nossa tabela
		String sql = "delete from cliente where id = ?";
		int index =0;
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setLong(index++, cliente.getId());
			ps.executeUpdate();	
			if (ps.executeUpdate() > 0) {
				return "Exclu�do com sucesso.";
			} else {
				return "Erro ao excluir";
			}

		} catch (SQLException e) {
			   JOptionPane.showMessageDialog(null, "Banco desconectado");
                  throw new ConexaoFalhou_Exception("Erro ao conectar ", e);
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
			// Um objeto ResultSet tem acesso ao m�todo next que permite
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
			throw	new ConexaoFalhou_Exception("nao foi possivel completar a operacao pesquisar ",e1);
			
		}finally{
			
		}
		
	}
}