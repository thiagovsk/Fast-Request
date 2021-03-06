/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.view;

import br.com.fastrequest.controller.ProdutoController;
import br.com.fastrequest.model.Produto;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.ProdutoTableModel;

/**
 *
 * @author Yeltsin
 */

public class TelaProduto2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaProduto2
     */
    public TelaProduto2() {
        initComponents();
    }

    private List<Produto> produtoList = new ProdutoController().listaProdutos();
    private int registro=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        logo = new javax.swing.JLabel();
        pesquisaProduto = new javax.swing.JPanel();
        nomeProdutoPesquisar = new javax.swing.JLabel();
        txtNomeProdutoPesquisar = new javax.swing.JTextField();
        txtProdutoPesquisar = new javax.swing.JButton();
        pesquisar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnExcluirProduto = new javax.swing.JButton();
        cadastroProduto = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JTextField();
        cadastrarProduto = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JLabel();
        precoProduto = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        tipoProduto = new javax.swing.JLabel();
        cbPratoProduto = new javax.swing.JCheckBox();
        cbBebidaProduto = new javax.swing.JCheckBox();
        cbSobremesaProduto = new javax.swing.JCheckBox();
        descricaoProduto = new javax.swing.JLabel();
        janelaProduto = new javax.swing.JScrollPane();
        txtDescricaoProduto = new javax.swing.JTextPane();
        btnCadastrarProduto = new javax.swing.JButton();
        btnLimparProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnIrparaCardapio = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnTelaInicial1 = new javax.swing.JButton();
        btnTelaCadastrarFuncionario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fast Request");
        setMinimumSize(new java.awt.Dimension(1366, 768));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg")));

        logo.setPreferredSize(new java.awt.Dimension(1366, 150));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg"))); // NOI18N

        pesquisaProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomeProdutoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nomeProdutoPesquisar.setText("Nome ");

        txtProdutoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdutoPesquisar.setText("Pesquisar");
        txtProdutoPesquisar.setMaximumSize(new java.awt.Dimension(1366, 761));
        txtProdutoPesquisar.setMinimumSize(new java.awt.Dimension(1366, 761));
        txtProdutoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoPesquisarActionPerformed(evt);
            }
        });

        pesquisar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        pesquisar.setText("PESQUISAR PRODUTO");

        ProdutoTableModel produto = new ProdutoTableModel(produtoList);
        tabelaProdutos.setModel(produto);
        produto.fireTableDataChanged();
        tabelaProdutos.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabelaProdutos);
        tabelaProdutos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnExcluirProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pesquisaProdutoLayout = new javax.swing.GroupLayout(pesquisaProduto);
        pesquisaProduto.setLayout(pesquisaProdutoLayout);
        pesquisaProdutoLayout.setHorizontalGroup(
            pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaProdutoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pesquisaProdutoLayout.createSequentialGroup()
                            .addComponent(nomeProdutoPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomeProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pesquisaProdutoLayout.setVerticalGroup(
            pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdutoPesquisar)
                    .addComponent(txtNomeProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        cadastroProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cadastrarProduto.setText("CADASTRAR PRODUTO");

        nomeProduto.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nomeProduto.setText("Nome");

        precoProduto.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        precoProduto.setText("Preço");

        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });

        tipoProduto.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        tipoProduto.setText("Tipo");

        buttonGroup1.add(cbPratoProduto);
        cbPratoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPratoProduto.setText("Prato");
        cbPratoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPratoProdutoActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbBebidaProduto);
        cbBebidaProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBebidaProduto.setText("Bebida");

        buttonGroup1.add(cbSobremesaProduto);
        cbSobremesaProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSobremesaProduto.setText("Sobremesa");

        descricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        descricaoProduto.setText("Descrição");

        janelaProduto.setViewportView(txtDescricaoProduto);

        btnCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        btnLimparProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimparProduto.setText("Limpar");
        btnLimparProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroProdutoLayout = new javax.swing.GroupLayout(cadastroProduto);
        cadastroProduto.setLayout(cadastroProdutoLayout);
        cadastroProdutoLayout.setHorizontalGroup(
            cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroProdutoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroProdutoLayout.createSequentialGroup()
                        .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nomeProduto)
                            .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tipoProduto)
                                .addComponent(precoProduto)))
                        .addGap(18, 18, 18)
                        .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cadastroProdutoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoProduto)
                            .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(cadastroProdutoLayout.createSequentialGroup()
                                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cadastroProdutoLayout.createSequentialGroup()
                                    .addComponent(cbPratoProduto)
                                    .addGap(100, 100, 100)
                                    .addComponent(cbSobremesaProduto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbBebidaProduto))
                                .addComponent(janelaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroProdutoLayout.createSequentialGroup()
                        .addComponent(cadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        cadastroProdutoLayout.setVerticalGroup(
            cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarProduto)
                .addGap(52, 52, 52)
                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoProduto)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tipoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPratoProduto)
                    .addComponent(cbSobremesaProduto)
                    .addComponent(cbBebidaProduto))
                .addGap(18, 18, 18)
                .addComponent(descricaoProduto)
                .addGap(18, 18, 18)
                .addComponent(janelaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        btnIrparaCardapio.setText("CARDAPIO");
        btnIrparaCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrparaCardapioActionPerformed(evt);
            }
        });

        btnAlterarCliente.setText("ALTERAR CADASTRO CLIENTE");
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnTelaInicial1.setText("TELA INICIAL");
        btnTelaInicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaInicial1ActionPerformed(evt);
            }
        });

        btnTelaCadastrarFuncionario1.setText("ACOMPANHAR PEDIDO");
        btnTelaCadastrarFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastrarFuncionario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIrparaCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTelaCadastrarFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTelaCadastrarFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIrparaCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnTelaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPratoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPratoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPratoProdutoActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        ProdutoController pc = new ProdutoController();
        
        try {
            if(cbPratoProduto.isSelected()==true){
            pc.salvar(txtNomeProduto.getText(), txtDescricaoProduto.getText(), 
                    Double.parseDouble(txtPrecoProduto.getText()),cbPratoProduto.getText());
                    cbPratoProduto.setSelected(false);
                    
            }
              if(cbBebidaProduto.isSelected()==true){
            pc.salvar(txtNomeProduto.getText(), txtDescricaoProduto.getText(), 
                    Double.parseDouble(txtPrecoProduto.getText()),cbBebidaProduto.getText());
                    
            }
                if(cbSobremesaProduto.isSelected()==true){
            pc.salvar(txtNomeProduto.getText(), txtDescricaoProduto.getText(), 
                    Double.parseDouble(txtPrecoProduto.getText()),cbSobremesaProduto.getText());
                    
            }
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
            
            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
            txtDescricaoProduto.setText("");
            cbBebidaProduto.setSelected(false);
            cbPratoProduto.setSelected(false);
            cbSobremesaProduto.setSelected(false);
            atualizarTabela();
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conexao com o banco falhou!");
            
        } catch (ParseException ex) {
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o nome.");
            
        } catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Favor preencha os campos corretamente. \n Nao e permitido campos em branco, letras ou virgulas no campo 'preço'.");
            
        } catch (IllegalArgumentException e2){
            JOptionPane.showMessageDialog(this, "Favor preeencher todos os campos" );
       
        } catch (NullPointerException e1){
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos." );

        } catch (InputMismatchException e){
            JOptionPane.showMessageDialog(this, "Por favor, preencha apenas com números.");
        
        }
        
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnIrparaCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrparaCardapioActionPerformed
       TelaPedido tela = new TelaPedido();
       tela.setVisible(true);
       setVisible(false);
       //
    }//GEN-LAST:event_btnIrparaCardapioActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
// TODO add your handling code here:
    txtNomeProduto.setText("");
    txtPrecoProduto.setText("");
    txtDescricaoProduto.setText("");
    cbBebidaProduto.setSelected(false);
    cbPratoProduto.setSelected(false);
    cbSobremesaProduto.setSelected(false);
    atualizarTabela();
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void btnTelaCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCardapioActionPerformed
             // TODO add your handling code here:
    }//GEN-LAST:event_btnTelaCardapioActionPerformed

    private void txtProdutoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoPesquisarActionPerformed
        // TODO add your handling code here:
        ProdutoController pc = new ProdutoController();
        

        try {
            Produto p = pc.buscaContatoPorNome(txtNomeProdutoPesquisar.getText());
            txtNomeProduto.setText(p.getNome());
            txtDescricaoProduto.setText(p.getDescricao());
            txtPrecoProduto.setText(String.valueOf(p.getPreco()));
            JOptionPane.showMessageDialog(precoProduto, "Encontrado com Sucesso. ");
            txtNomeProdutoPesquisar.setText("");
            atualizarTabela();
          
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(precoProduto, "Conexão com banco falhou.");
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
            
        }catch (NullPointerException e1){
            JOptionPane.showMessageDialog(precoProduto, "Cadastro nao encontrado.");

        }catch (NumberFormatException nfe) {  
             JOptionPane.showMessageDialog(precoProduto, "Formato inválido. Digite um número.");  
}
        
    }//GEN-LAST:event_txtProdutoPesquisarActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
     
       try {
             ProdutoController pc = new ProdutoController();
      
       int id = produtoList.get(tabelaProdutos.getSelectedRow()).getIdProduto();
          if(cbPratoProduto.isSelected()==true){
              pc.alterar( id, txtNomeProduto.getText(), txtDescricaoProduto.getText(),
              Double.parseDouble(txtPrecoProduto.getText()),cbPratoProduto.getText());
         
            }
              if(cbBebidaProduto.isSelected()==true){
           pc.alterar( id, txtNomeProduto.getText(), txtDescricaoProduto.getText(),
              Double.parseDouble(txtPrecoProduto.getText()),cbBebidaProduto.getText());         
            }
                if(cbSobremesaProduto.isSelected()==true){
           pc.alterar( id, txtNomeProduto.getText(), txtDescricaoProduto.getText(),
              Double.parseDouble(txtPrecoProduto.getText()),cbSobremesaProduto.getText());
                    
            }
           
                     JOptionPane.showMessageDialog(precoProduto, "Cadastro Alterado com sucesso");
    txtNomeProduto.setText("");
    txtPrecoProduto.setText("");
    txtDescricaoProduto.setText("");
    cbBebidaProduto.setSelected(false);
    cbPratoProduto.setSelected(false);
    cbSobremesaProduto.setSelected(false);
    atualizarTabela();
    
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conexão com o banco falhou!");
            
        } catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Favor preencha os campos corretamente. \n Nao são permitido campos em branco ou Letras no campo preço.");
            
        } catch (IllegalArgumentException e2){
            JOptionPane.showMessageDialog(this, "Favor preeencher todos os campos.");
            
        }catch(NullPointerException e1){
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos." );

        }catch(IndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(this, "Selecione o produto na tabela");
        
        }
        
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnTelaAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaAcompanhamentoActionPerformed
        TelaAcompanhamentoFuncionario tela = new TelaAcompanhamentoFuncionario();
        tela.setVisible(true);
        setVisible(false);        
        
    }//GEN-LAST:event_btnTelaAcompanhamentoActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        AlterarCadastroCliente tela = new AlterarCadastroCliente();
        tela.setVisible(true);
        
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroClientesActionPerformed

    private void btnTelaCadastrarFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrarFuncionario1ActionPerformed
        TelaAcompanhamentoFuncionario telaAcompanhamento = new TelaAcompanhamentoFuncionario();
        telaAcompanhamento.setVisible(true);
        setVisible(false);
        
    	
    	// TODO add your handling code here:
    }//GEN-LAST:event_btnTelaCadastrarFuncionario1ActionPerformed

    private void btnTelaInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicial1ActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnTelaInicial1ActionPerformed
    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       ProdutoController pc = new ProdutoController();
       
        try {
        	int id = produtoList.get(tabelaProdutos.getSelectedRow()).getIdProduto();
            
            int confirm = JOptionPane.showConfirmDialog(this, "Confirmam exclusao ?", "Excluir Produto",JOptionPane.YES_NO_OPTION);
            
            if(confirm!=0){
            return;
            }
            pc.excluir(id);
            JOptionPane.showMessageDialog(this, "Cadastro excluido com sucesso");
            atualizarTabela();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "problema com o banco de dados");
      
            
        }
        
          catch (ArrayIndexOutOfBoundsException ex) {
        JOptionPane.showMessageDialog(this, "Selecione o produto a ser excluido");
        
  
    }        
    }
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnIrparaCardapio;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnTelaCadastrarFuncionario1;
    private javax.swing.JButton btnTelaInicial1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cadastrarProduto;
    private javax.swing.JPanel cadastroProduto;
    private javax.swing.JCheckBox cbBebidaProduto;
    private javax.swing.JCheckBox cbPratoProduto;
    private javax.swing.JCheckBox cbSobremesaProduto;
    private javax.swing.JLabel descricaoProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane janelaProduto;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel nomeProdutoPesquisar;
    private javax.swing.JPanel pesquisaProduto;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JLabel precoProduto;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JLabel tipoProduto;
    private javax.swing.JTextPane txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtNomeProdutoPesquisar;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JButton txtProdutoPesquisar;
    // End of variables declaration//GEN-END:variables
    private void atualizarTabela(){
        produtoList = new ProdutoController().listaProdutos();
        ProdutoTableModel produto = new ProdutoTableModel(produtoList);
        tabelaProdutos.setModel(produto);
        produto.fireTableDataChanged();

    }
}
