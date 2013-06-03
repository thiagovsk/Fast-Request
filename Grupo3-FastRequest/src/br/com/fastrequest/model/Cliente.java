package br.com.fastrequest.model;

public class Cliente {
	
	
	private int id;
	private String nome;
	private String pratoPreferido;
	private String email;
	private String telefone;
	
	public Cliente() {
		
	}
	
	
	public Cliente(int id, String nome, String pratoPreferido, String email,
			String telefone) {
		this.id = id;
		this.nome = nome;
		this.pratoPreferido = pratoPreferido;
		this.email = email;
		this.telefone = telefone;
	}


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPratoPreferido() {
		return pratoPreferido;
	}
	public void setPratoPreferido(String pratoPreferido) {
		this.pratoPreferido = pratoPreferido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		System.out.println("------------------------");
		builder.append("Nome = ");
		builder.append(nome);
		builder.append("Prato Preferido =");
		builder.append(pratoPreferido);
		builder.append("Email = ");
		builder.append(email);
		builder.append(" Telefone =");
		builder.append(telefone);
		builder.append("------------------------");
		return builder.toString();
	}

	
	
	
	
	
	
}
