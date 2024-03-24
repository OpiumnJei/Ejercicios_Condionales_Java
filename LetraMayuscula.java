
//Hacer un programa que determine si una letra es mayuscula o minuscula

package condicionales;

import java.util.Scanner;

public class LetraMayuscula {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("Digite una letra: ");
        letra = sc.next().charAt(0);
        
        if(Character.isUpperCase(letra))
        {
         System.out.println("La letra introducida es Mayuscula");
        }
        else{
            System.out.println("La letra introducida es Minuscula");
        }
        
        
    }
}
