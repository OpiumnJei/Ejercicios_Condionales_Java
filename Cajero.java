/*
Programa que simule un cajero automatico con un saldo inicial de 10000 pesos.
configurar el siguiente menu de opciones: 
1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta.
3. Salir

*/

package condicionales;

import java.util.Scanner;

public class Cajero {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
            int cajero, i, r, total;
            
            System.out.println("Bienvendid@!" 
            +"\nSeleccione una de las siguientes opciones: "
            +"\n1. Ingresar dinero a la cuenta."
            +"\n2. Retirar dinero de la cuenta."
            +"\n3. Salir");
            cajero = sc.nextInt();
            
            if(cajero == 1){
                System.out.println("Digite la cantidad de dinero a ingresar: ");
                i = sc.nextInt();
                total = 100000 + i;
                System.out.println("Su nuevo saldo es: "+total);
            }
             if(cajero == 2){
                System.out.println("Digite la cantidad de dinero a retirar ");
                r = sc.nextInt();
                total = 100000 - r;
                System.out.println("Su nuevo saldo es: "+total);
            }
              if(cajero == 3){
                System.exit(0);
            }
            
    }
    
}
