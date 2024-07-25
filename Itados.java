package itados;
import java.util.Scanner;
/**
 *
 * @author mashu
 */
public class Itados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int n;
        System.out.println("Ingrse un numero, el programa determinara si es primo");
        n=x.nextInt();
        System.out.println(primo(n));
    }
        public static boolean primo(int a){
            if(a%1==0 && a%a==0){
                return true;
            }else{
                return false;
            }
            
        
    }
}

