/*
Programa que ingrese dos numeros por teclado y diga si ambos son pares o impares.
*/
package condicionales;

import java.util.Scanner;


public class ParesImpares {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);

        int n1,n2;
        
        System.out.println("Ingrese un numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        n2 = sc.nextInt();
        
        if(n1%2 == 0 && n2%2 == 0)
        {
            System.out.println(n1+" y "+n2+" Son pares");
        }
        System.out.println("Ambos numeros son impares");
        
        }
        
        
        
        
    
    
    }

