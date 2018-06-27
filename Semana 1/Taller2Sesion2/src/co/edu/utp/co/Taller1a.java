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
public class Taller1a {
    public static void main(String[] args) {
        for (int i = 1539; i <= 2505; i++) {
            if (i%10 != 2 && i%10 != 0 && i%10 != 4 && i%10 != 6 && i%10 !=8) {   
                System.out.println(""+ i);
            } 
        }
    }
   
}
