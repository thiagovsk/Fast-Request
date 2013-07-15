package br.com.fastrequest.model;

import java.util.InputMismatchException;

public class Pedido extends Produto{
	
	protected int numeroClientes;
	protected double valorTotal;

	public Pedido(String descricao, int idProduto, String nome , double preco) {
		
               setDescricao(descricao);
               setIdProduto(idProduto);
               setNome(nome);
               setPreco(preco);
	}
        
        public Pedido() {
        	super();
		// TODO Auto-generated constructor stub
	}
        
	public int getNumeroClientes() {
		return numeroClientes;
	}
        
	public void setNumeroClientes(int numeroClientes) throws IllegalArgumentException, NumberFormatException {
    
            if (numeroClientes > 0) {
                this.numeroClientes = numeroClientes;
                
            }
        
		this.numeroClientes = numeroClientes;
	}
        
	public double getValorTotal() {
		return valorTotal;
	}
        
	public void setValorTotal(double valorTotal) throws IllegalArgumentException, NumberFormatException, InputMismatchException {
    
            if (valorTotal > 0) {
                this.valorTotal = valorTotal;
                
            } 
        
		this.valorTotal = valorTotal;
	}
	
	

}
