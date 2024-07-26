/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrais;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author mashu
 */
public class suma {
     public static void main(String[] args) {
         Scanner efe=new Scanner(System.in);
         int a=0;
         int [] arre;
         arre=new int[5];
         int zz=0;
         for(int i=0;i<arre.length;i++){
            System.out.println("Ingrese numeros para que se sumen");
            zz=efe.nextInt();
            arre[i]=zz; 
            a=a+arre[i];
         }
         System.out.println("La suma de los numeros es: "+a);
         System.out.println("El array del programa: " + Arrays.toString(arre));
         
        
     }
}
