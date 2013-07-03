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
        
	public void setTelefone(String telefone) throws IllegalArgumentException {
    
            if (telefone != null && !telefone.equals("")) {
                this.telefone = telefone;
                
            } else {
                throw new IllegalArgumentException("Pessoa não pode ter telefone vazio ou nulo.");
                
            }
        
        }
        
	public String getCpf() {
		return cpf;
	}
        
	public void setCpf(String cpf)throws IllegalArgumentException {
    
            if (cpf != null && !cpf.equals("")) {
                this.cpf = cpf;
                
            } else {
                throw new IllegalArgumentException("Pessoa não pode ter cpf vazio ou nulo.");
                
            }
        
        }
	

}
