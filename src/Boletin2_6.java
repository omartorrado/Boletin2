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
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tarifa= Float.parseFloat(JOptionPane.showInputDialog("Indique el precio de tarifa"));
        float importe = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el importe pagado"));
        JOptionPane.showMessageDialog(null, "Se le ha aplicado un "+(100*(tarifa-importe)/tarifa)+"% de descuento");
    }
    
}
