package br.com.fastrequest.model;


public class Pessoa {
	
    
	protected String telefone;
	protected String cpf;
	
	public Pessoa() {
		super();
                
	}
        
        public Pessoa(String telefone, String cpf) throws IllegalArgumentException{
        
            this.setTelefone (telefone);
            this.setCpf (cpf) ;
        
        }
	
	public String getTelefone() {
		return telefone;
	}
        
	public void setTelefone(String telefone) throws IllegalArgumentException {
    
            if (telefone != null && !telefone.equals("")) {
                this.telefone = telefone;
                
            } 
        
        }
        
	public String getCpf() {
		return cpf;
	}
        
	public void setCpf(String cpf)throws IllegalArgumentException {
    
            if (cpf != null && !cpf.equals("")) {
                this.cpf = cpf;
                
            }
        
        }
	

}
