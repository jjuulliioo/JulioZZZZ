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
public class MayoryMenor {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int [] ola;
        ola = new int [8];
        int x=0;
        
        for(int e=0;e<ola.length;e++){
            System.out.println("Ingrese un numero");
            x=a.nextInt();
            ola[e]=x;
        }
        int max = ola[0];
        int min = ola[0];
        for(int e=0;e<ola.length;e++){
            if(ola[e]>max){
                max=ola[e];
            }
            if(ola[e]<min){
                min=ola[e];
            }
                
            }
            
        System.out.println("El numero mayor es "+max);
        System.out.println("El numero menor es "+min);
        System.out.println("El array del programa: " + Arrays.toString(ola));

    
}
    }
