/*Bir cümle içinde istenen bir kelimeyi arayıp kaçıncı karakterden sonra başladığını
bulan programın java kodunu yazınız.
 */
package örneksoru2.o;
import java.util.Scanner;

public class Örneksoru2O {

    public static void main(String[] args) {
   String s,ys,aranan,sonuc="bulunamadı";
   int a;
   Scanner oku=new Scanner(System.in);
   System.out.println("lütfen bir cümle giriniz:");
   s=oku.nextLine();
   System.out.println("aradınız kelime nerdir:");
   aranan=oku.nextLine();
   for(a=0; a<s.length()-aranan.length()+1; a++){
   ys=s.substring(a,a+aranan.length());
   if (ys.matches(aranan))    
sonuc="bulunduğu yer="+a;   
   }
   System.out.println(sonuc);
   
   
    }
    
}
