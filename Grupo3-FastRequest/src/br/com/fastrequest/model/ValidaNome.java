package br.com.fastrequest.model;

public class ValidaNome {
	
	public boolean validaNome(String nome){

		if(nome.length() >45){
			return false;
		
		}
		return true;
	}

}
