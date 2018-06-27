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
public class Taller2b {
    public static void main(String[] args) {
          if (args.length < 2) {
            System.out.println("Ingrese dos argumentos");
            return;
        }
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        System.out.println("Suma:" + n1 + "+" + n2 + "=" + (n1 + n2));
        System.out.println("Resta:" + n1 + "+" + n2 + "=" + (n1 - n2));
        System.out.println("Multiplicación:" + n1 + "+" + n2 + "=" + (n1 * n2));
        System.out.println("División:" + n1 + "/" + n2 + "=" + (n1 / n2));
        }
}

