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
public class Taller1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i%10 != 2 && i%10 != 5) {
               System.out.println(""+ i);   
            }
        }
    }
}
