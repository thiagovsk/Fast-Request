package br.com.fastrequest.view;

import Excecoes.ValidarCpfException;
import Excecoes.ValidarEmailException;
import Excecoes.ValidarTelefoneException;
import br.com.fastrequest.controller.ClienteController;
import br.com.fastrequest.model.ValidaCpf;
import br.com.fastrequest.model.ValidaEmail;
import br.com.fastrequest.model.ValidaTelefone;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Antonio
 */
public class TelaCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaCliente
     */
    
    
    public TelaCliente() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Logo = new javax.swing.JLabel();
        cadastrar = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        textNomeCliente = new javax.swing.JTextField();
        textCpfCliente = new javax.swing.JTextField();
        textEmailCliente = new javax.swing.JTextField();
        textTelefoneCliente = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        cadastrarcliente = new javax.swing.JLabel();
        primeiroNome = new javax.swing.JLabel();
        btnProsseguirSemCadastrar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        CpfLogin = new javax.swing.JLabel();
        TextCpfLogin = new javax.swing.JTextField();
        btnLogar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/logo2.jpg"))); // NOI18N

        cadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nome.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        nome.setText("Nome");

        cpf.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cpf.setText("CPF");

        email.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        email.setText("Email");

        telefone.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        telefone.setText("Telefone");

        textNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeClienteActionPerformed(evt);
            }
        });

        textEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailClienteActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cadastrarcliente.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cadastrarcliente.setText("CADASTRAR CLIENTE");

        primeiroNome.setText("*Primeiro nome");

        btnProsseguirSemCadastrar.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnProsseguirSemCadastrar.setText("Prosseguir sem Cadastrar");
        btnProsseguirSemCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsseguirSemCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("*Sem traços");

        jLabel2.setText("*DDD e Numero");

        javax.swing.GroupLayout cadastrarLayout = new javax.swing.GroupLayout(cadastrar);
        cadastrar.setLayout(cadastrarLayout);
        cadastrarLayout.setHorizontalGroup(
            cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrarLayout.createSequentialGroup()
                        .addGap(0, 121, Short.MAX_VALUE)
                        .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastrarLayout.createSequentialGroup()
                                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(cpf)
                                    .addComponent(email))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(primeiroNome)
                                    .addComponent(textNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(textEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(cadastrarLayout.createSequentialGroup()
                                .addComponent(telefone)
                                .addGap(18, 18, 18)
                                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(textTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(137, 137, 137))
                    .addGroup(cadastrarLayout.createSequentialGroup()
                        .addComponent(cadastrarcliente)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProsseguirSemCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cadastrarLayout.setVerticalGroup(
            cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarcliente)
                .addGap(31, 31, 31)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(textNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(primeiroNome))
                    .addGroup(cadastrarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpf)
                            .addComponent(textCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(textEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefone)
                    .addComponent(textTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProsseguirSemCadastrar)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        Login.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CpfLogin.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        CpfLogin.setText("CPF");

        TextCpfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCpfLoginActionPerformed(evt);
            }
        });

        btnLogar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogar.setText("Logar");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(CpfLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextCpfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfLogin)
                    .addComponent(TextCpfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogar))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fastrequest/imagens/promocao.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeClienteActionPerformed

    private void textEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailClienteActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        ClienteController clientecontroler = new ClienteController();
        ValidaCpf cpf = new ValidaCpf();
        ValidaTelefone telefone = new ValidaTelefone();
        ValidaEmail email = null;
        
        try {
            
            if (cpf.validarCpf(textCpfCliente.getText()) == false) {
                throw new ValidarCpfException();
            }
            
            if (email.validaEmail(textEmailCliente.getText()) == false) {
                throw new ValidarEmailException();
            }
            
            if(telefone.validaTelefone(textTelefoneCliente.getText()) == false) {
                throw new ValidarTelefoneException();
            }
            
            clientecontroler.salvar(textNomeCliente.getText(), textCpfCliente.getText(), textEmailCliente.getText(), textTelefoneCliente.getText());
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
            textNomeCliente.setText("");
            textCpfCliente.setText("");
            textEmailCliente.setText("");
            textTelefoneCliente.setText("");
            
            
        } catch (SQLException ex) {          
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conexão com o banco falhou!");
            
        }catch (ValidarTelefoneException ex) {
            JOptionPane.showMessageDialog(this, "Telefone Inválido, digite o DDD e o Numero (9 ou 8 digitos).");
                  
        } catch (ParseException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o nome.");
            
        } catch (ValidarCpfException ex) {
            JOptionPane.showMessageDialog(this, "CPF Inválido.");
            
        } catch (IllegalArgumentException e1){
            JOptionPane.showMessageDialog(this, e1.getMessage());
       
        } catch (ValidarEmailException ex) {
            JOptionPane.showMessageDialog(this, "Email Inválido.");
            
        }catch (NullPointerException e1){
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
                
        }catch (IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
        	
        }
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnProsseguirSemCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsseguirSemCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProsseguirSemCadastrarActionPerformed

    private void TextCpfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCpfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCpfLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CpfLogin;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField TextCpfLogin;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JToggleButton btnProsseguirSemCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cadastrar;
    private javax.swing.JLabel cadastrarcliente;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel primeiroNome;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField textCpfCliente;
    private javax.swing.JTextField textEmailCliente;
    private javax.swing.JTextField textNomeCliente;
    private javax.swing.JTextField textTelefoneCliente;
    // End of variables declaration//GEN-END:variables
    //...
}
