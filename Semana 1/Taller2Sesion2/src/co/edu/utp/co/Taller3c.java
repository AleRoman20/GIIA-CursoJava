/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.co;

/**
 *
 * @author Juan C
 */
import javax.swing.JOptionPane;
public class Taller3c {
   public static void main( String[] args ){
    String Palabra1 = "";
    String Palabra2 = "";
    String Palabra3 = "";
    Palabra1 =JOptionPane.showInputDialog("Ingrese Palabra 1:  ");    
    Palabra2 =JOptionPane.showInputDialog("Ingrese Palabra 2:  ");    
    Palabra3 =JOptionPane.showInputDialog("Ingrese Palabra 3:  ");
    String msg = Palabra1 + " " + Palabra2 + " " +Palabra3;
    JOptionPane.showMessageDialog(null, msg);
   }
}

