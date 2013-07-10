package br.com.fastrequest.model;

public class ValidaPreco {
	
	public boolean validaPreco(Double preco){

		if(preco < 0){
			return false;
		
		}
		return true;
	}

}
