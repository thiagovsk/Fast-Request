package br.com.fastrequest.model;

import java.util.InputMismatchException;


public class Produto {

	protected int idProduto;
	protected String nome;
	protected String descricao;
	protected double preco;
	protected String tipo;
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Produto() {
		
	}
	
	public Produto(int idProduto, String nome, String descricao, double preco,String tipo) throws IllegalArgumentException{
		this.idProduto = idProduto;
		this.setNome (nome);
		this.setDescricao (descricao);
		this.setPreco (preco);
		this.setTipo(tipo);
	}
        
	public int getIdProduto() {
		return idProduto;
	}
        
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
        
	public String getNome() {
		return nome;
	}
        
	public void setNome(String nome) throws IllegalArgumentException {
    
            if (nome != null && !nome.equals("")) {
                this.nome = nome;
                
            } 
        
        }
        
        
	public String getDescricao() {
		return descricao;
	}
        
	public void setDescricao(String descricao) throws IllegalArgumentException {
    
            if (descricao != null && !descricao.equals("")) {
                this.descricao = descricao;
                
            } 
        
        }
        
	public double getPreco() {
		return preco;
	}
	
        
	public void setPreco(double preco) throws IllegalArgumentException, InputMismatchException, 
                                                  NumberFormatException {
    
            if ((preco != 0)) {
                this.preco = preco;
                
            } 
            
            
        
        }
	
        
	
	
        
	

		@Override
		public String toString() {
			return "" + nome + " R$ " + preco + "\n";
		}

        
        
	
}
