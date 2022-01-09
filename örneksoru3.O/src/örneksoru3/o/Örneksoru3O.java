/* Dışarıdan en ve boy değerleri girdi olarak alan ve bu değerlere göre "*" işaretleri
ile çizilen bir dörtgeni ekrana yazdıran sistemin java kodunu yazınız.
 
 */
package örneksoru3.o;
import java.util.Scanner;

public class Örneksoru3O {

    public static void main(String[] args) {
   Scanner klavye=new Scanner(System.in);
   System.out.println("lütfen bir en değeri giriniz:");
   int en=klavye.nextInt();
   System.out.println("lütfen bir boy değeri giriniz:");
   int boy=klavye.nextInt();
   
   for(int i=0; i<boy; i++){
       
   for (int j=0; j<en; j++){
    System.out.print("*");
       
       
   }    
       
     System.out.println("*");
   }
   
   
    }
    
}
