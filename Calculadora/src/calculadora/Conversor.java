/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Stack;
import java.lang.Math;
/**
 *
 * @author JDS88
 */
public class Conversor {
    
    public String x;
    public int base;
    
    public Conversor(String x, int base){
        this.x = x;
        this.base = base;
    }
    //Evalua que la cadena no contenga un caracter diferente a un numero
    public boolean numerico(){
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    //Convertir los numeros a sus respectivas letras (11->B)
    public String letras(int valor){
        String resultado;
        switch(valor){
            case 10:
                resultado = "A";
                break;
            case 11:
                resultado = "B";
                break;
            case 12:
                resultado = "C";
                break;
            case 13:
                resultado = "D";
                break;
            case 14:
                resultado = "E";
                break;
            case 15:
                resultado = "F";
                break;
            case 16:
                resultado = "G";
                break;
            case 17:
                resultado = "H";
                break;
            case 18:
                resultado = "I";
                break;
            case 19:
                resultado = "J";
                break;
            case 20:
                resultado = "K";
                break;
            case 21:
                resultado = "L";
                break;
            case 22:
                resultado = "M";
                break;
            case 23:
                resultado = "N";
                break;
            case 24:
                resultado = "O";
                break;
            case 25:
                resultado = "P";
                break;
            case 26:
                resultado = "Q";
                break;
            case 27:
                resultado = "R";
                break;
            case 28:
                resultado = "S";
                break;
            case 29:
                resultado = "T";
                break;
            case 30:
                resultado = "U";
                break;
            case 31:
                resultado = "V";
                break;
            case 32:
                resultado = "W";
                break;
            case  33:
                resultado = "X";
                break;
            case 34:
                resultado = "Y";
                break;
            case 35:
                resultado = "Z";
                break;
            default:
                resultado = Integer.toString(valor);
                break;
        }
        return resultado;
    }
    
    //Convertir las letras a sus respectivos numeros (11 -> B)
    public int numeros(char valor){
        int resultado;
        switch(valor){
            case 'A':
                resultado = 10;
                break;
            case 'B':
                resultado = 11;
                break;
            case 'C':
                resultado = 12;
                break;
            case 'D':
                resultado = 13;
                break;
            case 'E':
                resultado = 14;
                break;
            case 'F':
                resultado = 15;
                break;
            case 'G':
                resultado = 16;
                break;
            case 'H':
                resultado = 17;
                break;
            case 'I':
                resultado = 18;
                break;
            case 'J':
                resultado = 19;
                break;
            case 'K':
                resultado = 20;
                break;
            case 'L':
                resultado = 21;
                break;
            case 'M':
                resultado = 22;
                break;
            case 'N':
                resultado = 23;
                break;
            case 'O':
                resultado = 24;
                break;
            case 'P':
                resultado = 25;
                break;
            case 'Q':
                resultado = 26;
                break;
            case 'R':
                resultado = 27;
                break;
            case 'S':
                resultado = 28;
                break;
            case 'T':
                resultado = 29;
                break;
            case 'U':
                resultado = 30;
                break;
            case 'V':
                resultado = 31;
                break;
            case 'W':
                resultado = 32;
                break;
            case 'X':
                resultado = 33;
                break;
            case 'Y':
                resultado = 34;
                break;
            case 'Z':
                resultado = 35;
                break;
            default:
                resultado = Integer.parseInt(""+valor);
                break;
        }
        return resultado;
    }
    
    //Leer y juntar la pila en un String
    public String pilaToString(Stack < String > pila){
        String resultado = "";
        while(pila.size() > 0){
            resultado = resultado + pila.pop();
        }
        return resultado;
    }
    
    //Convertir decimal a la base seleccionada
    public String conversorBase(){
        Stack < String > pila = new Stack < String > ();
        int numero = Integer.parseInt(x);
        while(numero >= base){
            pila.push(this.letras(numero%base));
            numero = Math.round(numero/base);
        }
        pila.push(this.letras(numero));
        return pilaToString(pila);
    }
    
    //Convertir base seleccionada a decimal
    public int conversorDecimal(){
        int decimal = 0;
        int exponente = x.length() - 1;
        for(int i = 0; i < x.length(); i++){
            int numero_resultante = this.numeros(x.charAt(i));
            //Se valida que coincida los numeros entrados con su base
            if(numero_resultante >= base){
                System.out.println("Los numeros dados no corresponden a la base");
                i = x.length();
                decimal = -1;
            }
            else{
                int potencia = (int)Math.pow(base, exponente);
                exponente--;
                decimal = decimal + (numero_resultante * potencia);
            }
        }
        return decimal;
    }
}
