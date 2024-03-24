
/*
switch (dato)
{
case 1: intrucciones1;
       break;
case 2:intrucciones2;
        break;
case 3:intrucciones3;
        break;
case n: intruccionesn;
        break;
default:CasoContrario;
        break;
*/
package condicionales;

import java.util.Scanner;


public class Switch {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        
        int dato;
        
        System.out.println("Introduzca un numero entre 1-10: ");
        dato = sc.nextInt();
        
        switch(dato){
            case 1 -> System.out.println("El numero introducido es 1");
            case 2 -> System.out.println("El numero introducido es 2");
            case 3 -> System.out.println("El numero introducido es 3");
            default -> System.out.println("El numero introducido esta fuera del rango establecido: ");
        }
        
    }
}
