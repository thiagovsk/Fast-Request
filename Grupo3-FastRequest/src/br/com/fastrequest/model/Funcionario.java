package br.com.fastrequest.model;

public class Funcionario extends Pessoa{

	
	private int id_funcionario;
	private String rg;
		
	public Funcionario() {
		super();
                
	}
	
	public Funcionario(int id_funcionario, String cpf, String rg,
			String telefone) {
            
            super(telefone, cpf);
            
		this.id_funcionario = id_funcionario;
		this.rg = rg;
		
	}

	public int getId_funcionario() {
		return id_funcionario;
	}
	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	

	@Override
	public String toString() {
            
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [id_funcionario=");
		builder.append(id_funcionario);
		builder.append(", Cpf=");
		builder.append(getCpf());
		builder.append(", rg=");
		builder.append(rg);
		builder.append(", telefone=");
		builder.append(getTelefone());
		builder.append("]");
		return builder.toString();
                
	}
	
}
