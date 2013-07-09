/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fastrequest.view;

/**
 *
 * @author Antonio
 */
public class TelaAcompanhamentoCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaAcompanhamentoCliente
     */
    public TelaAcompanhamentoCliente() {
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

        Logo = new javax.swing.JLabel();
        PedidoDoCliente = new javax.swing.JPanel();
        StatusDoPedido = new javax.swing.JPanel();
        btnEmEspera = new javax.swing.JToggleButton();
        btnEmAndamento = new javax.swing.JToggleButton();
        btnFinalizado = new javax.swing.JToggleButton();
        FinalizacaoPagamento = new javax.swing.JPanel();
        Pagamento = new javax.swing.JPanel();
        txtTotalIndividual = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        TotalIndividual = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        btnFinalizarPagamento = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        cbDividirConta = new javax.swing.JComboBox();
        DividirConta = new javax.swing.JLabel();
        InformacoesAdicionais = new javax.swing.JPanel();
        CpfNaNota = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox();
        FormaPagamento = new javax.swing.JLabel();
        txtCpfNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg"))); // NOI18N

        PedidoDoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "SEU PEDIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        javax.swing.GroupLayout PedidoDoClienteLayout = new javax.swing.GroupLayout(PedidoDoCliente);
        PedidoDoCliente.setLayout(PedidoDoClienteLayout);
        PedidoDoClienteLayout.setHorizontalGroup(
            PedidoDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        PedidoDoClienteLayout.setVerticalGroup(
            PedidoDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        StatusDoPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "STATUS DO SEU PEDIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnEmEspera.setText("EM ESPERA");

        btnEmAndamento.setText("EM ANDAMENTO");

        btnFinalizado.setText("FINALIZADO");

        javax.swing.GroupLayout StatusDoPedidoLayout = new javax.swing.GroupLayout(StatusDoPedido);
        StatusDoPedido.setLayout(StatusDoPedidoLayout);
        StatusDoPedidoLayout.setHorizontalGroup(
            StatusDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusDoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StatusDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmEspera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmAndamento, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(btnFinalizado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
                .addContainerGap())
        );
        StatusDoPedidoLayout.setVerticalGroup(
            StatusDoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusDoPedidoLayout.createSequentialGroup()
                .addComponent(btnEmEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEmAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnFinalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        FinalizacaoPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "FINALIZACAO/PAGAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        Pagamento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "PAGAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtTotalIndividual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalIndividualActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        TotalIndividual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalIndividual.setText("Total Dividido");

        Total.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Total.setText("Total");

        btnFinalizarPagamento.setText("FINALIZAR");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        cbDividirConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDividirConta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DividirConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DividirConta.setText("Dividir Conta");

        javax.swing.GroupLayout PagamentoLayout = new javax.swing.GroupLayout(Pagamento);
        Pagamento.setLayout(PagamentoLayout);
        PagamentoLayout.setHorizontalGroup(
            PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PagamentoLayout.createSequentialGroup()
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PagamentoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnFinalizarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PagamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Total)
                            .addComponent(TotalIndividual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalIndividual)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PagamentoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(DividirConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDividirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PagamentoLayout.setVerticalGroup(
            PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PagamentoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DividirConta)
                    .addComponent(cbDividirConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalIndividual)
                    .addComponent(txtTotalIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        InformacoesAdicionais.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "INFORMACOES ADICIONAIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        CpfNaNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CpfNaNota.setText("CPF na Nota Fiscal");

        cbFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        FormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FormaPagamento.setText("Forma de Pagamento");

        txtCpfNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout InformacoesAdicionaisLayout = new javax.swing.GroupLayout(InformacoesAdicionais);
        InformacoesAdicionais.setLayout(InformacoesAdicionaisLayout);
        InformacoesAdicionaisLayout.setHorizontalGroup(
            InformacoesAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesAdicionaisLayout.createSequentialGroup()
                .addGroup(InformacoesAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformacoesAdicionaisLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(FormaPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InformacoesAdicionaisLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(CpfNaNota)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpfNota, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        InformacoesAdicionaisLayout.setVerticalGroup(
            InformacoesAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesAdicionaisLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(InformacoesAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FormaPagamento))
                .addGap(44, 44, 44)
                .addGroup(InformacoesAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfNaNota)
                    .addComponent(txtCpfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FinalizacaoPagamentoLayout = new javax.swing.GroupLayout(FinalizacaoPagamento);
        FinalizacaoPagamento.setLayout(FinalizacaoPagamentoLayout);
        FinalizacaoPagamentoLayout.setHorizontalGroup(
            FinalizacaoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinalizacaoPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FinalizacaoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InformacoesAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        FinalizacaoPagamentoLayout.setVerticalGroup(
            FinalizacaoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinalizacaoPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InformacoesAdicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        InformacoesAdicionais.getAccessibleContext().setAccessibleName("INFORMACOES ADICIONAIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(PedidoDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(StatusDoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FinalizacaoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(StatusDoPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PedidoDoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FinalizacaoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        FinalizacaoPagamento.getAccessibleContext().setAccessibleName("FINALIZACAO/PAGAMENTO");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtTotalIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalIndividualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalIndividualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CpfNaNota;
    private javax.swing.JLabel DividirConta;
    private javax.swing.JPanel FinalizacaoPagamento;
    private javax.swing.JLabel FormaPagamento;
    private javax.swing.JPanel InformacoesAdicionais;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Pagamento;
    private javax.swing.JPanel PedidoDoCliente;
    private javax.swing.JPanel StatusDoPedido;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel TotalIndividual;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JToggleButton btnEmAndamento;
    private javax.swing.JToggleButton btnEmEspera;
    private javax.swing.JToggleButton btnFinalizado;
    private javax.swing.JButton btnFinalizarPagamento;
    private javax.swing.JComboBox cbDividirConta;
    private javax.swing.JComboBox cbFormaPagamento;
    private javax.swing.JTextField txtCpfNota;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalIndividual;
    // End of variables declaration//GEN-END:variables
}
