package Main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import bancoMysql.ConexaoBD;
import bancoMysql.TabelasAutomatizadas;
import br.com.fastrequest.view.TelaPrincipal;

public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	
	
	public static void main(String[] args) throws SQLException, NullPointerException {
		
			
			TabelasAutomatizadas banco;
	       try {
	    	   ConexaoBD.getConnection();
	    	   banco = new  TabelasAutomatizadas();
	    	   banco.criarBd();
	    	
	            
	            
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }catch(NullPointerException e1){
	        	JOptionPane.showMessageDialog(null, "Conexao Falhou , favor conectar o banco de dados");
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new TelaPrincipal().setVisible(true);
	            }
	        });
	}
}

