/*
 pedir el dia, ano y mes de una fecha e indicar si es correcta. con meses de 28, 30, 31 dias. sin anos bisiestos.
 */


package condicionales;

import java.util.Scanner;

public class FechaCorrecta {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   
    int dia, mes, ano; 
    
        System.out.println("Introduce el dia: ");
        dia = sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.println("Introduce el ano: ");
        ano = sc.nextInt();
        
        if((dia >= 29) && (mes  == 2)){
            System.out.println("fecha incorrecta");
        }
         if((dia >=32) && (mes  == 1)){
            System.out.println("Fecha incorrecta mmg");
            }

        if((dia >= 32) && (mes  == 3)){
            System.out.println("Fecha incorrecta mmg");
            }
        if((dia >= 32) && (mes  == 5)){
            System.out.println("Fecha incorrecta mmg");
            }
         if((dia >= 32) && (mes  == 7)){
            System.out.println("Fecha incorrecta mmg");
            }
          if((dia >= 32) && (mes  == 8)){
            System.out.println("Fecha incorrecta mmg");
            }
           if((dia >= 32) && (mes  == 10)){
            System.out.println("Fecha incorrecta mmg");
            }
            if((dia >= 32) && (mes  == 11)){
            System.out.println("Fecha incorrecta mmg");
            }
             if((dia >= 32) && (mes  == 12)){
            System.out.println("Fecha incorrecta mmg");
            }
        
        
        
     
        if((dia>=1)&&(dia<=31)){
            if((mes>=1)&&(mes<=12)){
                if((ano > 0)){
                    System.out.println("fecha correcta mmg");
                }
                else{
                    System.out.println("Fecha incorrecta, ano incorrecto");
                }
            }
            else{
                System.out.println("Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            System.out.println("Fecha incorrecta, dia incorrecto");
        }
        
       
        
         
        
        
        
 
        
    }
}
        
        
        
        
        

