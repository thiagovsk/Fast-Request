package br.com.fastrequest.model;

public class ValidaDescricao{
	
	public boolean validaDescricao(String descricao){

		if(descricao.length() >200){
			return false;
		
		}
		return true;
	}
}
