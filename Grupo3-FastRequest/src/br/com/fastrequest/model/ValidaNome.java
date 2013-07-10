package br.com.fastrequest.model;

public class ValidaNome {
	
	public boolean validaNome(String nome){

		if(nome.length() < 46){
			return true;
		
		}else
		return false;
	}

}
