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
public class Palindromon {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    String pal;
    System.out.println("Ingrese la palabra a revisar");
    pal=a.nextLine();
    String palind="";
    for(int i=pal.length()-1; i>=0; i--){
        palind=palind+pal.charAt(i);
        
    }
    if(palind.equals(pal)){
        System.out.println("Es palindromo");
    }else{
        System.out.println("No es palindromo");
    }
}
    }
    
