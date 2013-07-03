package br.com.fastrequest.model;


public class Cliente extends Pessoa{
	
    
	private int id;
	private String nome;
	private String email;	
	
	public Cliente() {
		super();
                
	}
	
	
	public Cliente(int id, String nome, String cpf, String email,
			String telefone) {
            
            super(telefone, cpf);
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public boolean validanome(String nome){
		
		if(nome.length() >45){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
            
		StringBuilder builder = new StringBuilder();
		System.out.println("------------------------");
		builder.append("Nome = ");
		builder.append(nome);
		builder.append("Cpf =");
		builder.append(getCpf());
		builder.append("Email = ");
		builder.append(email);
		builder.append(" Telefone =");
		builder.append(getTelefone());
		builder.append("------------------------");
		return builder.toString();
                
                
	}


}
