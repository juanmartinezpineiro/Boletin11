package boletin11_1;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Intervalo {

    private String fraseAescribir = " A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática";
    private String fraseQueEscribo;
    private long diferencia;
    private Date intervaloInicio;
    private Date intervaloFin;
    
    public void intervalo(){
        intervaloInicio = new Date ();
        fraseQueEscribo = JOptionPane.showInputDialog("Escribe la siguiente frase" + "\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática" );
     if (fraseAescribir.equals(fraseQueEscribo)){ 
         intervaloFin = new Date();
         diferencia = intervaloFin.getTime() - intervaloInicio.getTime();
         diferencia = (diferencia / 1000);
         JOptionPane.showMessageDialog(null, "Tardaste " + diferencia + " segundo(s) en escribir la frade");
         }else {
         JOptionPane.showMessageDialog(null, "La frase está mal");
     }   
    }
    
}
