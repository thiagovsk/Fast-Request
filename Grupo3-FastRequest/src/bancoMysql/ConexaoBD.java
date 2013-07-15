package bancoMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


 
public class ConexaoBD {
 
    private static final String URL_MYSQL = "jdbc:mysql://localhost/fast";
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL1   = "jdbc:mysql://localhost";
 
    public static Connection getConnection() {
        System.out.println("Conectando ao Banco de Dados");
        try {
            Class.forName(DRIVER_CLASS);
            return DriverManager.getConnection(URL_MYSQL, USER, PASS);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Conexao com o banco falhou !");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexao com o banco falhou");
        }
        return null;
    }
    
    private static String PW;
 
    public static String getPW() {
   
        return PW;
    }
    public static void setPW(String PW) {
        ConexaoBD.PW = PW;
    }
    public static String getUSER() {
    
        return USER;
    }
    

    public static Connection getConectarCasoEspecial()
    {
  
        try
        {
            Class.forName(DRIVER_CLASS);
            return DriverManager.getConnection(URL1, USER, PW);
        } catch (ClassNotFoundException e) {

        	JOptionPane.showMessageDialog(null, "Conexao com o banco falhou");
        	
        }catch(SQLException e){
        	JOptionPane.showMessageDialog(null, "Conexao com o banco falhou");
        }
        return null;
    }
}	