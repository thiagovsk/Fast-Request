package br.com.fastrequest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fastrequest.model.Produto;



public class ProdutoDAO  {

	
	//puxando o get con da classe conection 
	private Connection con=null;
        
         public ProdutoDAO(){
          ConexaoBD conecta = new ConexaoBD();
        }
        
	

	public String cadastrar(Produto produto)  {
		// esse metodo recebe um objeto cliente como parametro e faz a insercao
		// dos dados
		String sql = "insert into produto(nome,descricao,preco)values(?,?,?)";
                
                  
		try {
                         con = ConexaoBD.abrirconexao();
			PreparedStatement ps = con.prepareStatement(sql);
			int index = 0;
			// prepara o comando para enviar ao banco
			
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setDouble(3, produto.getPreco());
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
		throw	new CreateDAO_Exception("nao foi possivel completar a operacao cadastrar",e1);
		}finally{
			
		}
		
	}

	public String alterar(Produto produto) {
		// esse metodo recebe um objeto cliente como parametro e faz a alteracao
		// dos dados
            
               
		String sql = "update produto set nome = ?, descricao = ?,preco = ?";
		sql += " where idProduto = ?";
		int index =0;
		try {
                     con = ConexaoBD.abrirconexao();
			PreparedStatement ps = con.prepareStatement(sql);
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
                    ConexaoBD.fecharconexao(con);
			
		}
		

	}

	public String deletar(Produto produto) {
		// Este m�todo receber� um objeto cliente como par�metro e far� a
		// exclus�o dos dados na nossa tabela
                ConexaoBD.abrirconexao();
		String sql = "delete from produto where idProduto = ?";
		int index =0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(index++, produto.getIdProduto());
			ps.executeUpdate();	
			if (ps.executeUpdate() > 0) {
				return "Exclu�do com sucesso.";
			} else {
				return "Erro ao excluir";
			}

		} catch (SQLException e) {
			throw	new CreateDAO_Exception("nao foi possivel completar a operacao",e);
		}finally{
			ConexaoBD.fecharconexao(con);
		}

	}

	public ArrayList<Produto> pesquisar(Produto produto) {
		// Metodo de pesquisa no banco de dados
            ConexaoBD.abrirconexao();
		ArrayList<Produto> lista = new ArrayList<Produto>();
		String sql = "select * from produto ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // pegando um objeto ResultSet
												// para armazenar o resultado q
												// vem do banco
			// usando o executeQuery ao inves do executeupdate
			// Um objeto ResultSet tem acesso ao m�todo next que permite
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
			ConexaoBD.fecharconexao(con);
		}
		
	}
}