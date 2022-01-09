/*Programa 1-100 arasında sayı tutturarak kullanıcının bu sayıyı tahmin etmesini sağlayınız.
Kullanıcının yazdığı sayılara bakarak “büyük” ya da “küçük” yaz gibisinden yönlendiriniz.
Sayıyı tahmin ettiğinde ise kaç adımda bulduğunu ekrana yazan programın java kodunu yazınız.

*/
package örneksoru.ö;
import java.util.Scanner;
public class ÖrneksoruÖ {

    public static void main(String[] args) {
    int sayi,kere=0,tahmin;
    sayi=(int)(Math.random()*100)+1;    
    do{
    Scanner oku=new Scanner (System.in);    
    kere++;    
    System.out.println("tahmininiz:");
    tahmin=oku.nextInt();
    if (tahmin>sayi){
    System.out.println("tahmininizi düşürün");
    }    
    if (tahmin<sayi){
     System.out.println("tahmininizi artıırın");   
    }    
    }    
while (tahmin!=sayi);
   System.out.println(kere+"adımda buldunuz");     
    }
    
}
