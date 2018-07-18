/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.lang.Math;
/**
 *
 * @author JDS88
 */
public class Operaciones {
    public int x;
    public int y;
    
    public Operaciones(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //Realiza la suma de dos numeros enteros
    public int suma(){
        return x+y;
    }
    
    //Realiza la resta de dos numeros enteros
    public int resta(){
        return x-y;
    }
    
    //Realiza el producto de dos numeros enteros
    public int producto(){
        return x*y;
    }
    
    //Realiza la division de dos numeros enteros, 
    //aproximando si es decimal a entero (2,3 -> 2)
    public int division(){
        return Math.round(x/y);
    }
}
