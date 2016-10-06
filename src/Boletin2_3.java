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
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cambio;
        float euros;
        cambio = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el cambio de euros a dolares"));
        euros = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el importe en euros"));
        JOptionPane.showMessageDialog(null, "El importe en dolares es de: "+cambio*euros);
    }
    
}
