

/*
sentencia if else

if(condicion){
  instruccion 1;
}
else{
   instruccion 2;
}
*/

package condicionales;

import java.util.Scanner;


public class Ifelse {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Introduce un numero: ");
        a = sc.nextInt();
        
        if(a==7){
            System.out.println("El numero introducido es 7");
        }
        else{
            System.out.println("El numero introducido no es 7");
        }
        
    }
    
}
