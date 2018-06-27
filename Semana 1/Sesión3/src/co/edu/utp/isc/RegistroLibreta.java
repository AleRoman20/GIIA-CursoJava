/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc;

/**
 *
 * @author Juan C
 */
public class RegistroLibreta {
    public String Nombre;
    public String Direccion;
    public int NumeroTelefono;
    public String DireccionEmail;
    
    public RegistroLibreta(){
        this.Nombre = "";
        this.Direccion = "";
        this.NumeroTelefono = -1;
        this.DireccionEmail = "";
    }
    
    public RegistroLibreta(String Nombre, String Direccion, int NumeroTelefono, String DireccionEmail){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.NumeroTelefono = NumeroTelefono;
        this.DireccionEmail = DireccionEmail;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public String getDireccionEmail() {
        return DireccionEmail;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setNumeroTelefono(int NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public void setDireccionEmail(String DireccionEmail) {
        this.DireccionEmail = DireccionEmail;
    }
    
   
    
}
