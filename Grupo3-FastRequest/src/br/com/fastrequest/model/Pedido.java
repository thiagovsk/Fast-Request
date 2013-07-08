package br.com.fastrequest.model;

public class Pedido {
	
	private int numeroClientes;
	private double valorTotal;
	
	public Pedido(int numeroClientes, double valorTotal ) {
		this.numeroClientes=numeroClientes;
                this.valorTotal=valorTotal;
                
	}
        
        public Pedido() {
		// TODO Auto-generated constructor stub
	}
        
	public int getNumeroClientes() {
		return numeroClientes;
	}
        
	public void setNumeroClientes(int numeroClientes) throws IllegalArgumentException, NumberFormatException {
    
            if (numeroClientes >= 0) {
                this.numeroClientes = numeroClientes;
                
            } else {
                throw new IllegalArgumentException("Pedido não pode ter número de pedidos negativo ou nulos.");
                
            }
        
		this.numeroClientes = numeroClientes;
	}
        
	public double getValorTotal() {
		return valorTotal;
	}
        
	public void setValorTotal(double valorTotal) throws IllegalArgumentException, NumberFormatException {
    
            if (valorTotal >= 0) {
                this.valorTotal = valorTotal;
                
            } else {
                throw new IllegalArgumentException("Pedido não pode ter valor total vazio, nulo ou negativo.");
                
            }
        
		this.valorTotal = valorTotal;
	}
	
	public void tempoPreparo(){
		
	}

}
