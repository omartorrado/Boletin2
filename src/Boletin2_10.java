
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
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos euros tiene?"));
        int b100=total/100;
        int b20=(total-b100*100)/20;
        int b5=(total-b100*100-b20*20)/5;
        int b1=(total-b100*100-b20*20-b5*5);
        JOptionPane.showMessageDialog(null, "Se podria desglosar en: \n Billetes de 100: "+b100+"\n Billetes de 20: "+b20+"\n Billetes de 5: "+b5+"\n Monedas de 1: "+b1);
    }
    
}
