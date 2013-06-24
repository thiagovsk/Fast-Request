package br.com.fastrequest.model;

public class Cliente extends Pessoa{
	
	
	private int id;
	private String nome;
	private int cpf;
	private String email;
	private int telefone;
	
	public Cliente() {
		
	}
	
	
	public Cliente(int id, String nome, String cpf, String email,
			String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		System.out.println("------------------------");
		builder.append("Nome = ");
		builder.append(nome);
		builder.append("Cpf =");
		builder.append(cpf);
		builder.append("Email = ");
		builder.append(email);
		builder.append(" Telefone =");
		builder.append(telefone);
		builder.append("------------------------");
		return builder.toString();
	}

}
