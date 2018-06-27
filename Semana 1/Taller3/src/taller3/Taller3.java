/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;

public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int numero= new java.util.Random().nextInt(100);
        int numero1;
        System.out.println("Ingrese un núnmero aleatorio :  ");     
        numero1= input.nextInt();      
        while(numero1!=numero)
        {
            if(numero1 > numero)
            {
                System.out.println("\nEl número buscado es menor \n"); 
                System.out.println("Ingrese otro número :  "); 
                numero1= input.nextInt();
            }
            else
            {
                System.out.println("\nEl número buscado es mayor \n"); 
                System.out.println("Ingrese otro número :  "); 
                numero1= input.nextInt();
            }
        }
        System.out.println("\nEncontraste el número que buscabas \n");
    }

}
    
