/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itados;
import java.util.Scanner;

/**
 *
 * @author mashu
 */
public class Raiz {
    public static void main(String[] args) {
        double n, rc;
        Scanner f= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        n=f.nextInt();
        rc=Math.sqrt(n);
        System.out.println("La raiz cuadrada del numero ingresado es: "+rc);
    }
}
