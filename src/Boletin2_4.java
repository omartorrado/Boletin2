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
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1;
        float num2;
        num1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un valor"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un segundo valor"));
        JOptionPane.showMessageDialog(null, "La suma de los dos valores es: "+(num1+num2)+"\nLa resta de los dos valores es: "+(num1-num2)+"\nEl producto de los dos valores es: "+(num1*num2)+"\nEl cociente entre los dos valores es: "+(num1/num2));
    }
}
