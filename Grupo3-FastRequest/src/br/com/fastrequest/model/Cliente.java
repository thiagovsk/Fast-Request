package br.com.fastrequest.model;


public class Cliente extends Pessoa{
	
    
	private int id;
	private String nome;
	private String email;	
	
        
	public Cliente() {
		super();
                
	}
	
	public Cliente(int id, String nome, String cpf, String email,
			String telefone) throws IllegalArgumentException{
            
            super(telefone, cpf);
		this.id= id;
		this.setNome (nome);
		this.setEmail (email);
                
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
        
	public void setNome(String nome) throws IllegalArgumentException {
    
            if (nome != null && !nome.equals("")) {
                this.nome = nome;
                
            } else {
                throw new IllegalArgumentException("Pessoa não pode ter nome vazio ou nulo.");
                
            }
        
        }
        
	public String getEmail() {
		return email;
	}
        
	public void setEmail(String email) throws IllegalArgumentException {
    
            if (email != null && !email.equals("")) {
                this.email = email;
                
            } else {
                throw new IllegalArgumentException("Pessoa não pode ter email vazio ou nulo.");
                
            }
        
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
