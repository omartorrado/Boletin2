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
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millas_a_metros=1852;
        Double millas=Double.parseDouble(JOptionPane.showInputDialog("Introduzca una distancia en millas para \nobtener su equivalente en metros"));
        JOptionPane.showMessageDialog(null, millas+" millas equivalen a "+millas*millas_a_metros+" metros");
    }
    
}
