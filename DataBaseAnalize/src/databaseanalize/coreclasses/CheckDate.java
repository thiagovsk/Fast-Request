/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package databaseanalize.coreclasses;

import java.util.GregorianCalendar; 
/**
 *
 * @author Fillipe Feitosa
 * fillipe_feitosa@yahoo.com.br
 *
 */
public class CheckDate{

    private String data;
    
    public CheckDate(String data){
    
        setData(data);
        
    }
    
    public String getData(){
        return data;
    }
    
    public final void setData(String data){
    
        this.data=data;
    }
    
    public static boolean validaData(String data) {
        GregorianCalendar calendar =  new GregorianCalendar();   
        int dia = 0, mes = 0, ano = 0;
        String diaStr = data.substring(0,2);
        String mesStr = data.substring(3,5);
        String anoStr = data.substring(6,10);
        try {
            dia = Integer.parseInt(diaStr);
            mes = Integer.parseInt(mesStr);
            ano = Integer.parseInt(anoStr);
        } catch (Exception e) {
            return false;
        }
        if (dia < 1 || mes < 1 || ano < 1) {
            return false;
        }else
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia <= 31) {
                    return true;
                }
            else {
                    return false;
                }
        }
            else
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= 30) {
                        return true;
                    }
            else {
                        return false;
                    }
        }
                else
                    if (mes == 2) {
            if (calendar.isLeapYear(ano)) {
                            if (dia <= 29) {
                    return true;
                }
                            else {
                    return false;
                }
                        }
            else
                if (dia <= 28) {
                            return true;
                        }
                else {
                            return false;
                        }
        }
                    else 
                        if (mes > 12) {
            return false;
        }
        return true;
    }

}
