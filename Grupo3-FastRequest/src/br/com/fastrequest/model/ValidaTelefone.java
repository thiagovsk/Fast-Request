package br.com.fastrequest.model;

public class ValidaTelefone {
	
	public static boolean validaTelefone(String telefone){
		
		if(telefone.length() == 8 || telefone.length() == 9)
			return true;

		
		if(telefone.charAt(0) != '0' && telefone.charAt(0) != '1')
			return true;
		
		return false;
		
	}

}
