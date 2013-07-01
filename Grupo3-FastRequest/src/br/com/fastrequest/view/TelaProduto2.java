/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.view;

import Excecoes.PrecoNaoRecebeString;
import br.com.fastrequest.controller.ProdutoController;
import br.com.fastrequest.model.Produto;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        pesquisaProduto = new javax.swing.JPanel();
        nomeProdutoPesquisar = new javax.swing.JLabel();
        txtNomeProdutoPesquisar = new javax.swing.JTextField();
        txtProdutoPesquisar = new javax.swing.JButton();
        tabela = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        pesquisar = new javax.swing.JLabel();
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
        btnTelaCadastrarFuncionario = new javax.swing.JButton();
        btnTelaCadastro = new javax.swing.JToggleButton();
        btnTelaInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg")));

        logo.setPreferredSize(new java.awt.Dimension(1366, 150));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(0, 0, 1366, 150);

        pesquisaProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomeProdutoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nomeProdutoPesquisar.setText("Nome ");

        txtProdutoPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdutoPesquisar.setText("Pesquisar");
        txtProdutoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoPesquisarActionPerformed(evt);
            }
        });

        jTablePesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Preço"
            }
        ));
        tabela.setViewportView(jTablePesquisar);
        jTablePesquisar.getColumnModel().getColumn(0).setHeaderValue("Nome");
        jTablePesquisar.getColumnModel().getColumn(1).setHeaderValue("Preço");

        pesquisar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        pesquisar.setText("PESQUISAR");

        javax.swing.GroupLayout pesquisaProdutoLayout = new javax.swing.GroupLayout(pesquisaProduto);
        pesquisaProduto.setLayout(pesquisaProdutoLayout);
        pesquisaProdutoLayout.setHorizontalGroup(
            pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaProdutoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pesquisaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pesquisaProdutoLayout.createSequentialGroup()
                            .addComponent(nomeProdutoPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomeProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
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
                    .addComponent(txtProdutoPesquisar))
                .addGap(38, 38, 38)
                .addComponent(tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(pesquisaProduto);
        pesquisaProduto.setBounds(21, 168, 521, 526);

        cadastroProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cadastrarProduto.setText("CADASTRAR");

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

        cbPratoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPratoProduto.setText("Prato");
        cbPratoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPratoProdutoActionPerformed(evt);
            }
        });

        cbBebidaProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBebidaProduto.setText("Bebida");

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

        javax.swing.GroupLayout cadastroProdutoLayout = new javax.swing.GroupLayout(cadastroProduto);
        cadastroProduto.setLayout(cadastroProdutoLayout);
        cadastroProdutoLayout.setHorizontalGroup(
            cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroProdutoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarProduto)
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
                            .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(cadastroProdutoLayout.createSequentialGroup()
                                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnLimparProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(cadastroProdutoLayout.createSequentialGroup()
                                        .addComponent(cbPratoProduto)
                                        .addGap(100, 100, 100)
                                        .addComponent(cbSobremesaProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbBebidaProduto))
                                    .addComponent(janelaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                    .addComponent(btnCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        getContentPane().add(cadastroProduto);
        cadastroProduto.setBounds(569, 168, 528, 529);

        btnTelaCadastrarFuncionario.setText("CADASTRAR FUNCIONÁRIO");
        btnTelaCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastrarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnTelaCadastrarFuncionario);
        btnTelaCadastrarFuncionario.setBounds(1128, 168, 228, 110);

        btnTelaCadastro.setText("CARDÁPIO");
        btnTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnTelaCadastro);
        btnTelaCadastro.setBounds(1128, 296, 228, 110);

        btnTelaInicial.setText("TELA INICIAL");
        getContentPane().add(btnTelaInicial);
        btnTelaInicial.setBounds(1128, 424, 228, 110);

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
            pc.salvar(txtNomeProduto.getText(), txtDescricaoProduto.getText(), Double.parseDouble(txtPrecoProduto.getText()));
            JOptionPane.showMessageDialog(this, "Produto salvo com sucesso!");
            txtNomeProduto.setText("");
            txtPrecoProduto.setText("");
            txtDescricaoProduto.setText("");
            cbBebidaProduto.setSelected(false);
            cbPratoProduto.setSelected(false);
            cbSobremesaProduto.setSelected(false);
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conexão com o banco falhou!");
        } catch (ParseException ex) {
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o nome.");
        }catch(NumberFormatException e1){
         JOptionPane.showMessageDialog(null, "Favor nao inserir letras no campo Preco");
    }
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnTelaCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTelaCadastrarFuncionarioActionPerformed

    private void btnLimparProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoActionPerformed
// TODO add your handling code here:
    txtNomeProduto.setText("");
    txtPrecoProduto.setText("");
    txtDescricaoProduto.setText("");
    cbBebidaProduto.setSelected(false);
    cbPratoProduto.setSelected(false);
    cbSobremesaProduto.setSelected(false);
    }//GEN-LAST:event_btnLimparProdutoActionPerformed

    private void btnTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTelaCadastroActionPerformed

    private void txtProdutoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoPesquisarActionPerformed
        // TODO add your handling code here:
        ProdutoController pc = new ProdutoController();
        try {
            Produto p = pc.buscaContatoPorNome(txtNomeProdutoPesquisar.getText());
        } catch (SQLException ex) {
            Logger.getLogger(TelaProduto2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtProdutoPesquisarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProduto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnLimparProduto;
    private javax.swing.JButton btnTelaCadastrarFuncionario;
    private javax.swing.JToggleButton btnTelaCadastro;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JLabel cadastrarProduto;
    private javax.swing.JPanel cadastroProduto;
    private javax.swing.JCheckBox cbBebidaProduto;
    private javax.swing.JCheckBox cbPratoProduto;
    private javax.swing.JCheckBox cbSobremesaProduto;
    private javax.swing.JLabel descricaoProduto;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JScrollPane janelaProduto;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomeProduto;
    private javax.swing.JLabel nomeProdutoPesquisar;
    private javax.swing.JPanel pesquisaProduto;
    private javax.swing.JLabel pesquisar;
    private javax.swing.JLabel precoProduto;
    private javax.swing.JScrollPane tabela;
    private javax.swing.JLabel tipoProduto;
    private javax.swing.JTextPane txtDescricaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtNomeProdutoPesquisar;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JButton txtProdutoPesquisar;
    // End of variables declaration//GEN-END:variables
}
