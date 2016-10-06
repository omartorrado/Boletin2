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
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base;
        float altura;
        base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
        JOptionPane.showMessageDialog(null, "El area es: "+(base*altura)/2);
    }
    
}
