/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrais;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author mashu
 */
public class Arrais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr;
        int par=0, imp=0;
        arr = new int[10];
        int papu=0;
        Scanner x= new Scanner(System.in);
        for(int in=0;in<arr.length;in++){
            System.out.println("INgrese numeros aleatrios");
        papu=x.nextInt();
        arr[in]=papu;
            if(papu%2==0){
                par++;
            }else if(papu%3==0){
                imp++;
            }else{
                System.out.println("ola");
            }
        }
        System.out.println("El numero de pares ingresados fueron: "+par);
        System.out.println("El numero de impares ingresados fueron: "+imp);
        System.out.println("El array: " + Arrays.toString(arr));
        
    }
    
}
