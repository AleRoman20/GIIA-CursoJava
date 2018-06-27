package co.edu.utp.co;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan C
 */

import java.util.Scanner;


public class Taller3b {
    public static void main(String[] args) {
    String Palabra1 = "";
    String Palabra2 = "";
    String Palabra3 = "";
    Scanner scanIn = new Scanner(System.in);
    System.out.println("Ingrese Palabra 1: ");
    System.out.println("Ingrese Palabra 2: ");
    System.out.println("Ingrese Palabra 3: ");
    Palabra1 = scanIn.nextLine();
    Palabra2 = scanIn.nextLine();
    Palabra3 = scanIn.nextLine();
    System.out.println(Palabra1 + " " + Palabra2 + " " + Palabra3);
    }
}
  

