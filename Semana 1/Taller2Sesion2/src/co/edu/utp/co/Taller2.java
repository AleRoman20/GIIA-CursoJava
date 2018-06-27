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
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++)
        {
        if(args[i] == null){        
            System.out.println("Ingrese una frase");
            }
        System.out.println(""+args[i]);
        }
    }
}
         
    

