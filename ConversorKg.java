/*
Programa que pase Kg a cualquier otra unidad de medida. 
Mostrar en pantalla un menu con las opciones a convertir.

*/
package condicionales;

import java.util.Scanner;

public class ConversorKg {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       
       int kg, convertir; 
       
        System.out.println("Bienvenido al conversor KingGrem! "
        +"\nSeleciona la unidad a la que deseas convertir: "
        +"\n1. Kg a Hg"
                + "\n2. Kg a Dag"
        +"\n3. Kg a G"
        +"\n4. Kg a Dg ");
        
        convertir = sc.nextInt();
        System.out.println("Digite la cantidad a convertir: ");
        kg = sc.nextInt();
        
        switch(convertir){
            case 1: System.out.println("Resultado: "+(kg*10)+" g");
            break;
            case 2: System.out.println("Resultado: "+(kg*100)+" Dag");
            break;
            case 3: System.out.println("Resultado: "+(kg*1000)+" G");
            break;
            case 4: System.out.println("Resultado: "+(kg*10000)+" Dg");
            break;
            default: System.out.println("Opcion incorrecta.");
            break;
        }
    }
}
