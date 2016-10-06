
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otorradomiguez
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double b100=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos billetes hay de 100€?"));
        double b20=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos billetes hay de 20€?"));
        double b5=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos billetes hay de 5€?"));
        double b1=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas monedas hay de 1€?"));
        JOptionPane.showMessageDialog(null, "En total hay "+(b100*100+b20*20+b5*5+b1)+"€");
    }
    
}
