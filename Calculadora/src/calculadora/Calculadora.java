/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JDS88
 */
public class Calculadora {

    //Este menu es para digitar en la base los valores segun la operacion elegida
    public static void menuSecundario(int valor, int base) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("----------SubMenu-------------\n");
        System.out.println("'Si no sabes escribir en la base seleccionada");
        System.out.println("lo puedes hacer en la decimal y el resultado");
        System.out.println("se dara en tu base'\n");
        System.out.println("1->Escribir Decimal\n");
        System.out.println("2->Escribir en la Base elegida\n");
        System.out.println("------------------------------\n");
        System.out.println("Elige una Opcion:");
        String opcion = br.readLine();
        try {
            int numeroElegido = Integer.parseInt(opcion);
            System.out.println("Digita primer valor:");
            String dato1 = br.readLine();
            String dato2 = "";
            if(valor != 5){
                System.out.println("Digita segundo valor:");
                dato2 = br.readLine();
            }
            Conversor operando1 = new Conversor(null,0);
            Conversor operando2 = new Conversor(null,0);
            if(numeroElegido == 1){
               operando1.x = dato1;
               operando1.base = 10;
               operando2.x = dato2;
               operando2.base = 10;
            }
            else{
               operando1.x = dato1;
               operando1.base = base;
               operando2.x = dato2;
               operando2.base = base;
            }
            switch(valor){
                case 1:
                    Operaciones suma = new Operaciones(operando1.conversorDecimal(),operando2.conversorDecimal());
                    String resultadoSuma = Integer.toString(suma.suma());
                    operando1.x =  resultadoSuma;
                    operando1.base = base;
                    System.out.println("\nEl resultado de la suma es: "+operando1.conversorBase()+"\n");
                    break;
                case 2:
                    Operaciones resta = new Operaciones(operando1.conversorDecimal(),operando2.conversorDecimal());
                    int resta_entero = resta.resta();
                    String resultadoResta = Integer.toString(Math.abs(resta_entero));
                    operando1.x =  resultadoResta;
                    operando1.base = base;
                    String resultado;
                    if(resta_entero > 0){
                        resultado = operando1.conversorBase();
                    }
                    else{
                        resultado = "-"+operando1.conversorBase();
                    }
                    System.out.println("\nEl resultado de la resta es: "+resultado+"\n");
                    break;
                case 3:
                    Operaciones producto = new Operaciones(operando1.conversorDecimal(),operando2.conversorDecimal());
                    String resultadoProducto = Integer.toString(producto.producto());
                    operando1.x =  resultadoProducto;
                    operando1.base = base;
                    System.out.println("\nEl resultado del producto es: "+operando1.conversorBase()+"\n");
                    break;
                case 4:
                    Operaciones division = new Operaciones(operando1.conversorDecimal(),operando2.conversorDecimal());
                    String resultadoDivision = Integer.toString(division.division());
                    operando1.x =  resultadoDivision;
                    operando1.base = base;
                    System.out.println("\nEl resultado de la division es: "+operando1.conversorBase()+"\n");
                    break;
                case 5:
                    Operaciones inverso = new Operaciones(1,operando1.conversorDecimal());
                    String resultadoInverso = Integer.toString(inverso.division());
                    operando1.x =  resultadoInverso;
                    operando1.base = base;
                    System.out.println("\nEl resultado de la division es: "+operando1.conversorBase()+"\n");
                    break;
                default:
                    System.out.println("\nNo se selecciono la opcion correcta");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("--> Solo enteros :(");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    //Este menu es el principal donde se selecciona la operacion deseada
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroElegido = 0;
        while(numeroElegido != 6){
            System.out.println("--------Menu Operaciones----------\n");
            System.out.println("1->Suma\n");
            System.out.println("2->Resta\n");
            System.out.println("3->Producto\n");
            System.out.println("4->Division\n");
            System.out.println("5->Inverso\n");
            System.out.println("6->Salir\n");
            System.out.println("----------------------------------");
            System.out.println("Elige una Opcion:");
            String opcion = br.readLine();
            try {
            numeroElegido = Integer.parseInt(opcion);
            if(numeroElegido != 6){
            System.out.println("Digita la base (Debe estar comprendida entre 2-36): ");
            String base_digitada = br.readLine();
                if(Integer.parseInt(base_digitada) < 2 || Integer.parseInt(base_digitada) > 36){
                    System.out.println("--> Solo el rango mencionado :(");
                }
                else{
                   menuSecundario(numeroElegido,Integer.parseInt(base_digitada)); 
                }
            }
            } catch (NumberFormatException e) {
                System.out.println("--> Solo enteros :(");
            }
        }

    }
    
}
