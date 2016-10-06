
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
public class Boletin2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo_fijo=Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cuanto es el salario fijo?"));
        float total_ventas=Float.parseFloat(JOptionPane.showInputDialog("¿Cual es el total de ventas?"));
        float distancia=Float.parseFloat(JOptionPane.showInputDialog("¿Cuantos kilometros recorre al mes para ir al trabajo?"));
        float dias_trabajados=Float.parseFloat(JOptionPane.showInputDialog("¿Cuantos dias ha trabajado?"));
        JOptionPane.showMessageDialog(null, "Su sueldo liquido es de "+(((sueldo_fijo+(0.05*total_ventas)+(2*distancia)+(30*dias_trabajados))*0.82)-36));
    }
    
}
