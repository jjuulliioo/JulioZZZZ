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
public class MAXdivisor {
    public static int divisor(int x, int y){
        int a=Math.max(x, y);
        int b=Math.min(x, y);
        int re=0;
        do{
            re=b;
            b=a%b;
            a=re;
        }while(b!=0);
        return re;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un numero");
        n1=x.nextInt();
        System.out.println("Ingrese otro numero");
        n2=x.nextInt();
        
        System.out.println("El minimo comun divisor es; "+divisor(n1, n2));
        
    }
}
