/*
 çarpım tablosi indisleri ve bu indislerin toplamının olduğu bir tabloyu ekrana
çıktı olarak veren sistemin java kodunu yazınız.
 */
package örneksoru4.o;
import java.util.Scanner;

public class Örneksoru4O {

 
    public static void main(String[] args) {
    System.out.println("                   çarpım tablosu indisleri ve toplamları");
    System.out.print("\n  |  "+"\n  |");    
    for (int j=1; j<=9; j++)
        
    System.out.print("        "+j);
    
    System.out.println("\n--|--------------------------------------------------------------------------------");
    
    for (int i=1; i<=9; i++){
        
    System.out.print(i+" |");
    for (int j=1; j<=9; j++){
    System.out.printf("   %d%d -%d",j,i,i+j);
    if (i+j<10){
    System.out.printf(" ");    
    }    
        
    }    
     System.out.println();   
    }
    
    
    
    }
    
    
}
