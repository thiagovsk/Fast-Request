/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.view;

import java.util.List;

import br.com.fastrequest.controller.ProdutoController;
import br.com.fastrequest.model.Produto;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

import tabelas.PedidoTableModel;
import tabelas.TabelaJaEscolhida;

/**
 *
 * @author Antonio
 */
public class TelaPedido extends javax.swing.JFrame {

    /**
     * Creates new form TelaPedido
     */
    public TelaPedido() {
        initComponents();
    }
    private List<Produto> pedidoListBebida = new ProdutoController().listaProdutosBebida();
    private List<Produto> pedidoListPrato = new ProdutoController().listaProdutosPrato();
    private List<Produto> pedidoListSobremesa = new ProdutoController().listaProdutosSobremesa();
    private List<Produto>lista = new ProdutoController().listaProdutos();
    private int registro=0;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    Produto[] p = new Produto[produtos.size()];
    DefaultListModel modelo = new DefaultListModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PedidosAndamento3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        ResumoPedido = new javax.swing.JPanel();
        btnExcluirItem1 = new javax.swing.JButton();
        btnEnviarPedido = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Bebida = new javax.swing.JPanel();
        panelBebida = new javax.swing.JScrollPane();
        tabelaBebida = new javax.swing.JTable();
        btnConcluido1 = new javax.swing.JButton();
        observacaoBedida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PedidosAndamento2 = new javax.swing.JPanel();
        tableSobremesa = new javax.swing.JScrollPane();
        tabelaSObremesa = new javax.swing.JTable();
        btnIncluirSobremesa = new javax.swing.JButton();
        txtObservacaoSobremesa = new javax.swing.JTextField();
        ObservacaoBebida = new javax.swing.JLabel();
        Prato = new javax.swing.JPanel();
        painelPrato = new javax.swing.JScrollPane();
        tabelaPedido = new javax.swing.JTable();
        txtObservacaoPrato = new javax.swing.JTextField();
        observacaoPrato = new javax.swing.JLabel();
        btnIncluirPrato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        PedidosAndamento3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "PEDIDOS EM ANDAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        javax.swing.GroupLayout PedidosAndamento3Layout = new javax.swing.GroupLayout(PedidosAndamento3);
        PedidosAndamento3.setLayout(PedidosAndamento3Layout);
        PedidosAndamento3Layout.setHorizontalGroup(
            PedidosAndamento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        PedidosAndamento3Layout.setVerticalGroup(
            PedidosAndamento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg"))); // NOI18N

        ResumoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "RESUMO DO PEDIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnExcluirItem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluirItem1.setText("EXCLUIR ITEM");
        btnExcluirItem1.setPreferredSize(new java.awt.Dimension(50, 25));
        btnExcluirItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItem1ActionPerformed(evt);
            }
        });

        btnEnviarPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnviarPedido.setText("ENVIAR PEDIDO");
        btnEnviarPedido.setPreferredSize(new java.awt.Dimension(50, 25));
        btnEnviarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPedidoActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        
      
       
        jList1.setModel(modelo);
        
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout ResumoPedidoLayout = new javax.swing.GroupLayout(ResumoPedido);
        ResumoPedido.setLayout(ResumoPedidoLayout);
        ResumoPedidoLayout.setHorizontalGroup(
            ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResumoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ResumoPedidoLayout.createSequentialGroup()
                            .addComponent(btnExcluirItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(btnEnviarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResumoPedidoLayout.setVerticalGroup(
            ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResumoPedidoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ResumoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BEBIDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        PedidoTableModel pedido = new PedidoTableModel(pedidoListBebida);
        tabelaBebida.setModel(pedido);
        pedido.fireTableDataChanged();
        tabelaBebida.setColumnSelectionAllowed(true);
        tabelaBebida.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        panelBebida.setViewportView(tabelaBebida);

        btnConcluido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConcluido1.setText("INCLUIR BEBIDA");
        btnConcluido1.setPreferredSize(new java.awt.Dimension(50, 25));
        btnConcluido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluido1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Observacoes");

        javax.swing.GroupLayout BebidaLayout = new javax.swing.GroupLayout(Bebida);
        Bebida.setLayout(BebidaLayout);
        BebidaLayout.setHorizontalGroup(
            BebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addComponent(observacaoBedida)
                    .addGroup(BebidaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btnConcluido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BebidaLayout.setVerticalGroup(
            BebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BebidaLayout.createSequentialGroup()
                .addComponent(panelBebida, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(observacaoBedida, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConcluido1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bebidas", Bebida);

        PedidosAndamento2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "SOBREMESA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        PedidoTableModel pedidoS = new PedidoTableModel(pedidoListSobremesa);
        tabelaSObremesa.setModel(pedidoS);
        pedido.fireTableDataChanged();
        tabelaSObremesa.setColumnSelectionAllowed(true);
        tabelaSObremesa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableSobremesa.setViewportView(tabelaSObremesa);

        btnIncluirSobremesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIncluirSobremesa.setText("INCLUIR SOBREMESA");
        btnIncluirSobremesa.setPreferredSize(new java.awt.Dimension(300, 25));
        btnIncluirSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirSobremesaActionPerformed(evt);
            }
        });

        ObservacaoBebida.setText("Observacoes");

        javax.swing.GroupLayout PedidosAndamento2Layout = new javax.swing.GroupLayout(PedidosAndamento2);
        PedidosAndamento2.setLayout(PedidosAndamento2Layout);
        PedidosAndamento2Layout.setHorizontalGroup(
            PedidosAndamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidosAndamento2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PedidosAndamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtObservacaoSobremesa)
                    .addGroup(PedidosAndamento2Layout.createSequentialGroup()
                        .addComponent(ObservacaoBebida)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnIncluirSobremesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                .addContainerGap())
        );
        PedidosAndamento2Layout.setVerticalGroup(
            PedidosAndamento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PedidosAndamento2Layout.createSequentialGroup()
                .addComponent(tableSobremesa, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ObservacaoBebida)
                .addGap(18, 18, 18)
                .addComponent(txtObservacaoSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIncluirSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sobremesas", PedidosAndamento2);

        Prato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRATO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        PedidoTableModel pedidoP = new PedidoTableModel(pedidoListPrato);
        tabelaPedido.setModel(pedidoP);
        pedido.fireTableDataChanged();
        tabelaPedido.setColumnSelectionAllowed(true);
        tabelaPedido.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        painelPrato.setViewportView(tabelaPedido);

        txtObservacaoPrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        observacaoPrato.setText("Observacoes");

        btnIncluirPrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIncluirPrato.setText("INCLUIR PRATO");
        btnIncluirPrato.setPreferredSize(new java.awt.Dimension(50, 25));
        btnIncluirPrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirPratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PratoLayout = new javax.swing.GroupLayout(Prato);
        Prato.setLayout(PratoLayout);
        PratoLayout.setHorizontalGroup(
            PratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtObservacaoPrato, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIncluirPrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPrato, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(PratoLayout.createSequentialGroup()
                        .addComponent(observacaoPrato)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PratoLayout.setVerticalGroup(
            PratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PratoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(observacaoPrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtObservacaoPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnIncluirPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jTabbedPane1.addTab("Comidas ", Prato);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FAZER AQUI O SEU PEDIDO!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 1375, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResumoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ResumoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluido1ActionPerformed
      
      Produto produto = new Produto();
      String nome = pedidoListBebida.get(tabelaBebida.getSelectedRow()).getNome();
      double preco = pedidoListBebida.get(tabelaBebida.getSelectedRow()).getPreco();
      
      
      produto.setNome(nome);
      produto.setPreco(preco);
      produtos.add(produto);
      produtos.toArray(p);
      System.out.println(produto.toString());
     
      modelo.addElement(produto.toString());
	
    }//GEN-LAST:event_btnConcluido1ActionPerformed

    private void btnIncluirPratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirPratoActionPerformed
    
      Produto produto = new Produto();
      String nome = pedidoListPrato.get(tabelaPedido.getSelectedRow()).getNome();
      double preco = pedidoListPrato.get(tabelaPedido.getSelectedRow()).getPreco();
      
      
      produto.setNome(nome);
      produto.setPreco(preco);
      produtos.add(produto);
      produtos.toArray(p);
      System.out.println(produto.toString());
     
      modelo.addElement(produto.toString());
	
      
      
      
           
        
    }//GEN-LAST:event_btnIncluirPratoActionPerformed

    private void btnIncluirSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirSobremesaActionPerformed
       
      Produto produto = new Produto();
      String nome = pedidoListSobremesa.get(tabelaSObremesa.getSelectedRow()).getNome();
      double preco = pedidoListSobremesa.get(tabelaSObremesa.getSelectedRow()).getPreco();
      
      
      produto.setNome(nome);
      produto.setPreco(preco);
      produtos.add(produto);
      produtos.toArray(p);
      System.out.println(produto.toString());
     
      modelo.addElement(produto.toString());
	
    }//GEN-LAST:event_btnIncluirSobremesaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEnviarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarPedidoActionPerformed

    private void btnExcluirItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bebida;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel ObservacaoBebida;
    private javax.swing.JPanel PedidosAndamento2;
    private javax.swing.JPanel PedidosAndamento3;
    private javax.swing.JPanel Prato;
    private javax.swing.JPanel ResumoPedido;
    private javax.swing.JButton btnConcluido1;
    private javax.swing.JButton btnEnviarPedido;
    private javax.swing.JButton btnExcluirItem1;
    private javax.swing.JButton btnIncluirPrato;
    private javax.swing.JButton btnIncluirSobremesa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField observacaoBedida;
    private javax.swing.JLabel observacaoPrato;
    private javax.swing.JScrollPane painelPrato;
    private javax.swing.JScrollPane panelBebida;
    private javax.swing.JTable tabelaBebida;
    private javax.swing.JTable tabelaPedido;
    private javax.swing.JTable tabelaSObremesa;
    private javax.swing.JScrollPane tableSobremesa;
    private javax.swing.JTextField txtObservacaoPrato;
    private javax.swing.JTextField txtObservacaoSobremesa;
    // End of variables declaration//GEN-END:variables
}
