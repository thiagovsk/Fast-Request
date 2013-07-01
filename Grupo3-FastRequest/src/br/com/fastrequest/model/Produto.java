package br.com.fastrequest.model;


public class Produto {

	private int idProduto;
	private String nome;
	private String descricao;
	private double preco;
	
	
	public Produto() {
		
	}
	
	public Produto(int idProduto, String nome, String descricao, double preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
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
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean validanome(String nome){
		
		boolean validaNome=true;
		if(nome.length() >100){
			validaNome=false;
			return validaNome;
		
		}
		return validaNome;
	}
	
	public boolean validaDescricao(String nome){
		
		boolean validaDescricao=true;
		if(nome.length() >100){
			validaDescricao=false;
			return validaDescricao;
		
		}
		return validaDescricao;
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
