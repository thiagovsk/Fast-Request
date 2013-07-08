/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author Priscilla
 */
public class AtributoNaoPodeSerNulo extends Exception{
    
    
    public AtributoNaoPodeSerNulo(){
        super();
        
    }
     
     public AtributoNaoPodeSerNulo(String info){
        super(info);
        
    }
    
}
