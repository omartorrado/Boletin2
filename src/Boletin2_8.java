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
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float centigrados=Float.parseFloat(JOptionPane.showInputDialog("Indique la temperatura en grados centigrados"));
        JOptionPane.showMessageDialog(null, centigrados+"ºC equivalen a "+(centigrados*1.8+32)+"º Farenheit y "+(centigrados+273.15)+" Kelvin");
    }
    
}
