
/*
Programa que simule el funcionamiento de una calculadora. 
EL usuario debe digitar mediante teclado S/s para suma, R/r para resta
M/m para multiplicacion o D/d para division. 
*/
package condicionales;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);
       double Sum,Res,Mult,Div,n1,n2;
       char letra;
       
        System.out.println("Digite un numero: ");
        n1 = sc.nextDouble();
        System.out.println("Digite otro numero");
        n2 = sc.nextDouble();
        
        System.out.println("Digite la operacion correspodiente: "
                + "\nS: suma"
                + "\nR: resta"
                + "\nM: Multiplicacion"
                + "\nD: Division");
        letra = sc.next().charAt(0);
        
        if(letra == 'S' || letra == 's'){
            Sum = n1+n2;
            System.out.println("Resultado: "+Sum);
        }
        if(letra == 'R' || letra == 'r'){
            Res = n1-n2;
            System.out.println("Resultado: "+Res);
        }
        if(letra == 'M' || letra == 'm'){
            Mult = n1*n2;
            System.out.println("Resultado: "+Mult);
        }
        if(letra == 'D' || letra == 'd'){
            Div = n1/n2;
            System.out.println("Resultado: "+Div);
        }
        
        
        
    }
}
