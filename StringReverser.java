
package stringreverser;
import java.util.InputMismatchException;
import java.util.Scanner;


public class StringReverser {

    
    public static void main(String[] args) {
        
        String firString = "";
        String secString = "";   
        Scanner scannner = new Scanner(System.in); 
        
        System.out.println("What would you like reverse?");
        firString = scannner.nextLine();
        secString = new StringBuilder(firString).reverse().toString();
        
        System.out.println(secString);
    }
    
}
