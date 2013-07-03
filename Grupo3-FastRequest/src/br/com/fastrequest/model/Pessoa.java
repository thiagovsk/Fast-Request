package br.com.fastrequest.model;


public class Pessoa {
	
    
	private String telefone;
	private String cpf;
	
	public Pessoa() {
		super();
                
	}
        
        public Pessoa(String telefone, String cpf){
        
            this.telefone = telefone;
            this.cpf = cpf;
        
        }
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
