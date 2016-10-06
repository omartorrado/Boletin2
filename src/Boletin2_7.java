/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nominal=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el capital"));
        float interes_mensual=(Float.parseFloat(JOptionPane.showInputDialog("Introduzca el interes anual \n(en tanto por cien)"))/1200);
        float plazo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el plazo en años"))*12;
        double cuota_mensual=(nominal*Math.pow((1+interes_mensual),plazo)*interes_mensual)/(Math.pow((1+interes_mensual),plazo)-1);
        JOptionPane.showMessageDialog(null, "La cuota mensual será de "+cuota_mensual+"€ \n capital "+nominal+" ,interes mensual "+interes_mensual+" plazo "+plazo);
        //comprobar los resultados
        
    }
    
}
