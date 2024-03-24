
/*
Pedir notas de 0-100, evaluar dicha calificacion en: 
* Quemao,
* Pasaste a chepa,
* Ta' mas o meno, 
* Un duro.
*/
package condicionales;

import java.util.Scanner;


public class PedirNota {
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   
   int nota; 
   
       System.out.println("Introduzca una calificacion de 0 - 100: ");
       nota = sc.nextInt();
       
       if(nota<=69){
           System.out.println("Ta' quemao' ma' bro, pa la otra");
       }
              if((nota>=70) &&(nota<=75) ){
              System.out.println("Pasaste a chepa, arrastao' creta");
              }
              if((nota>=76) &&(nota<=85) ){
              System.out.println("Ta' mas o menos");
              }
              if((nota>=86) &&(nota<=100) ){
              System.out.println("Un duro");
              }
                  
           
       }
       
       
}
   
   

    

