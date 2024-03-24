
//pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene. 

package condicionales;

import java.util.Scanner;

public class CifrasNum {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int num;
    
        System.out.println("Introduzca un numero entre 0 - 99 999");
        num = sc.nextInt();
        
        if(num<10){
            System.out.println("La cifra introducida tiene 1 digitos");
        }
        else if(num<100){
            System.out.println("La cifra introducida tiene 2 digitos");
        }
        else if(num<1000){
            System.out.println("La cifra introducida tiene 3 digitos");
        }
        else if(num<10000){
            System.out.println("La cifra introducida tiene 4 digitos");
        }
        else if(num<100000){
            System.out.println("La cifra introducida tiene 5 digitos");
        }
        else{
            System.out.println("La cifra introducida esta fuera del rango establecido.");
        }
        
    }
}
