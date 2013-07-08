package br.com.fastrequest.model;

import java.util.InputMismatchException;


public class Produto {

	private int idProduto;
	private String nome;
	private String descricao;
	private double preco;
	
	
	public Produto() {
		
	}
	
	public Produto(int idProduto, String nome, String descricao, double preco) throws IllegalArgumentException{
		this.idProduto = idProduto;
		this.setNome (nome);
		this.setDescricao (descricao);
		this.setPreco (preco);
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
                
            } else {
                throw new IllegalArgumentException("Produto não pode ter nome vazio ou nulo.");
                
            }
        
        }
        
        
	public String getDescricao() {
		return descricao;
	}
        
	public void setDescricao(String descricao) throws IllegalArgumentException {
    
            if (descricao != null && !descricao.equals("")) {
                this.descricao = descricao;
                
            } else {
                throw new IllegalArgumentException("Produto não pode ter descrição vazia ou nula.");
                
            }
        
        }
        
	public double getPreco() {
		return preco;
	}
        
	public void setPreco(double preco) throws IllegalArgumentException, InputMismatchException, 
                                                  NumberFormatException {
    
            if ((preco == 0)) {
                this.preco = preco;
                
            } else {
                throw new IllegalArgumentException("Produto não pode ter preço nulo.");
                
            }
            
            
        
        }
	
        
	public boolean validanome(String nome){

		if(nome.length() >45){
			return false;
		
		}
		return true;
	}
	
        
	public boolean validaDescricao(String nome){

		if(descricao.length() >200){
			return false;
		
		}
		return true;
	}
        
        public boolean validaPreco(Double preco){

		if(preco < 0){
			return false;
		
		}
		return true;
	}

        
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Id=");
		builder.append(idProduto);
		builder.append("Nome=");
		builder.append(nome);
		builder.append("Descricao=");
		builder.append(descricao);
		builder.append("Preco=");
		builder.append(preco);
		return builder.toString();
	}


	
}
