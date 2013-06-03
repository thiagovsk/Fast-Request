package br.com.fastrequest.controller;


import br.com.fastrequest.model.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.fastrequest.model.ProdutoService;
import br.com.fastrequest.view.TelaProdutos;

import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/** //nossa controler
 *
 * @author Thiagoo
 * 
 * 
 */
public class ProdutoActionListener implements ActionListener {

    private TelaProdutos frame;
    private ProdutoService service;
    @Override
   
    
   
    public void actionPerformed(ActionEvent event) {
       
        
            
          if(event.getActionCommand().equals("inserir")){
              
              salvar();
          }else if (event.getActionCommand().equals("salvar")){
              salvar();
          }else if (event.getActionCommand().equals("cancelar")){
          }else if (event.getActionCommand().equals("excluir")){
          }else if (event.getActionCommand().equals("aletar")){
          }
          
          
         
        
           
    }



  

    public ProdutoActionListener(TelaProdutos frame) {
        this.frame=frame;
        service = new ProdutoService();
      
    }
    
    public void adicionaListener(){
    frame.getBtnIncluirProduto().addActionListener(this);


    frame.getBtnAlterarProduto().addActionListener((ActionListener) frame);
    frame.getBtnCancelar();
    frame.getBtnCancelar1();
    frame.getBtnAlterarProduto().addActionListener(this);
    frame.getBtnDeletarProduto().addActionListener(this);
  frame.getBtnIncluirProduto().addActionListener(this);
    
    }
  
    public void habilitarBotao(){
        frame.getBtnCancelar1().setEnabled(true);
        frame.getBtnIncluirProduto().setEnabled(true);
         frame.getBtnAlterarProduto().setEnabled(true);
     frame.getBtnDeletarProduto().setEnabled(true);
      frame.getBtnCancelar1().setEnabled(true);
        frame.getBtnIncluirProduto().setEnabled(true);
    }
   
     
   
    
    
  private void inserir(){
      
    }
    
    private void salvar(){
        
           service.salvar(FormProduto());
        JOptionPane.showMessageDialog(frame, "Produto salvo com sucesso", "Salvar",JOptionPane.INFORMATION_MESSAGE);
    }
    
    private Produto FormProduto(){
        
        
            Produto produto = new Produto();
            if(!"".equals(frame.getTxtNome().getText())){
            produto.setIdProduto((int) Long.parseLong(frame.getTxtNome().getText()));
            }
            produto.setNome(frame.getTxtNome1().getText());
            produto.setDescricao(frame.getTxtDescicao1().getText());
            produto.setPreco(frame.getTxtPreco1());
            
            return produto;
    
    }
     
    
}
