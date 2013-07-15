/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author Antonio
 */
@SuppressWarnings("serial")
public class PrecoNaoRecebeString extends RuntimeException{
    
    
    public PrecoNaoRecebeString(){
     super();
    
    }

  

    public PrecoNaoRecebeString(String message) {
        super(message);
        
    }


   
    
}
