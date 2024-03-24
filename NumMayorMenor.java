//  pedir dos numeros, decir cual es el mayor o si son iguales. 

package condicionales;

import java.util.Scanner;

public class NumMayorMenor {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        int n1,n2;
        
        System.out.println("Introduzca un numero: ");
        n1 = sc.nextInt();
         System.out.println("Introduzca otro numero: ");
        n2 = sc.nextInt();
        
        if(n1>n2){
            System.out.println(n1+" es mayor que "+n2);
        }
            else if(n2>n1){
                   System.out.println(n2+" es mayor que "+n1);
                }
            else{
                System.out.println("Ambos numeros son iguales");
            
            
            }
    }
}
