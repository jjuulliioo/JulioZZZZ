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
public class mayus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a;
        do{
            System.out.println("Ingrese una palabra");
            a=x.nextLine();
            System.out.println(a.toUpperCase());
        }while(!a.equals(""));
    }
}
