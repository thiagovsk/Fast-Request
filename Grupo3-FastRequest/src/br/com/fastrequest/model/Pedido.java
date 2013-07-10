package br.com.fastrequest.model;

import java.util.InputMismatchException;

public class Pedido extends Produto{
	
	private int numeroClientes;
	private double valorTotal;

	public Pedido(int numeroClientes, double valorTotal , String descricao, int idProduto, String nome , double preco) {
		this.numeroClientes=numeroClientes;
                this.valorTotal=valorTotal;
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
                
            } else {
                throw new IllegalArgumentException("Pedido não pode ter número de pedidos negativo ou nulos.");
                
            }
        
		this.numeroClientes = numeroClientes;
	}
        
	public double getValorTotal() {
		return valorTotal;
	}
        
	public void setValorTotal(double valorTotal) throws IllegalArgumentException, NumberFormatException, InputMismatchException {
    
            if (valorTotal > 0) {
                this.valorTotal = valorTotal;
                
            } else {
                throw new IllegalArgumentException("Pedido naoo pode ter valor total vazio, nulo ou negativo.");
                
            }
        
		this.valorTotal = valorTotal;
	}
	
	public void tempoPreparo(){
		
	}

}
