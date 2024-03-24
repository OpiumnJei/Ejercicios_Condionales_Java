/*
En una plaza se hace un 20% de descuento a todas las compras que superen los $300
Cual sera la cantidad que pagara una persona por su compra?
 */
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Descuento {
    public static void main(String[]args){
       
       Scanner sc = new Scanner(System.in);
       
       float Vcompra,descuento,total;
       
        System.out.println("Ingrese el valor de la compra: ");
        Vcompra = sc.nextFloat();
        
        if(Vcompra>300){
        descuento = (float) (Vcompra*0.20);
        total = (float)(Vcompra-descuento);
        JOptionPane.showMessageDialog(null,"Total a pagar: $"+total);
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Total a pagar: $"+Vcompra);
        }
    
    }
}
