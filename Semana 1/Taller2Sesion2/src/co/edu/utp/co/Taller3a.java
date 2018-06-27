/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.co;

import java.io.*;

public class Taller3a {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        System.out.println("Introduzca palabra 1:   ");
        System.out.println("Introduzca palabra 2:   ");
        System.out.println("Introduzca palabra 3:   ");
        try{
            palabra1 = dataIn.readLine();
            palabra2 = dataIn.readLine();
            palabra3 = dataIn.readLine();
        } catch (IOException e){
            System.out.println("Error!");
        }
       
       System.out.println(palabra1 + "" + palabra2 + "" + palabra3); 
    }
} 
        
