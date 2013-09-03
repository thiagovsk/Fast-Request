/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.regex.*;

package databaseanalize.coreclasses;
/**
 *
 * @author Fillipe Feitosa
 * fillipe_feitosa@yahoo.com.br
 *
 */

public class CheckEmail{

	private String email;
	
	public CheckEmail(String email){
		this.setEmail(email);
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static boolean valide(string email){

	boolean isEmailValid=false;
	if(email != null && email.length()>0){
	    String expression = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,4}$";
	    Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(email);
	    if(matcher.matches()){
	    	isEmailValid=true;
	    }
	}
	return isEmailValid;
	}

}