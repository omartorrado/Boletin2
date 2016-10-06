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
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado:"));
        //JOptionPane.showMessageDialog(null, "El area es: "+lado*lado);
        //o bien
        JOptionPane.showMessageDialog(null, "El area es: "+Math.pow(lado,2));
     
    }
    
}
