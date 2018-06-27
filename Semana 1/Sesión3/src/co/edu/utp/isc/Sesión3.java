/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc;

import java.util.Scanner;

/**
 *
 * @author Juan C
 */
public class Sesión3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nIngrese su nombre:  ");
        String Nombre = input.next();
        System.out.println("\nIngrese su dirección:  ");
        String Direccion = input.next();
        System.out.println("\nIngrese su número de teléfono:  ");
        int NumeroTelefono= input.nextInt();
        System.out.println("\nIngrese su correo: ");
        String DireccionEmail = input.next();
        RegistroLibreta x= new RegistroLibreta(Nombre,Direccion,NumeroTelefono,DireccionEmail);
        System.out.println("\nNombre: "+x.getNombre()+"\nDireccion: "+x.getDireccion()+"\nNumero de Telefono: "+x.getNumeroTelefono()+"\nCorreo: "+x.getDireccionEmail());
    }
    
}
