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
public class inverso {
    public static void main(String[] args) {
        Scanner sap=new Scanner(System.in);
        int [] inv;
        inv = new int [6];
        int b=0;
        for(int a=0;a<inv.length;a++){
            System.out.println("Ingrese un numero");
            b=sap.nextInt();
            inv[a]=b;
        }
        int [] invertido;
        invertido = new int[inv.length];
        for(int e=0;e<inv.length;e++){
            invertido[e]=inv[inv.length-1-e];
        }
         System.out.println("El array insertado fue: " + Arrays.toString(inv));
         System.out.println("El array invertido es:: " + Arrays.toString(invertido));

    }
}
