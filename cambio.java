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
public class cambio {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a, p, n;
            System.out.println("Ingrese una palabra");
            a=x.nextLine();
            System.out.println("Ingrese la letra a cambiar");
            p=x.nextLine();
            System.out.println("Por que letra la cambiara?");
            n=x.nextLine();
            System.out.println("Su palabra cambiada es: "+ a.replace(p, n));
    }
}
