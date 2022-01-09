/*bir satış elemanının günlük sattığı ürün miktarına göre alacağı ücret şu şekilde belirleniyor:
Günlük satış miktarı 50 adetten az ise 15 TL sabit ücret artı satılan ürün başına 1 TL prim almaktadır.
Günlük satış miktarı 50 adet ve üzeri ise sabit 15 ücret ve 50 adet kadar olan her bir ürün için
2 TL, 50 adetin üstündeki ürünler için ise 3 TL prim almaktadır.
Bu satış elemanının günlük sattığı ürün adedine göre alacağı ücreti hesaplayan java kodunu yazınız.
 */
package örneksoru10.o;
import java.util.Scanner;

public class Örneksoru10O {

    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);    
    double satis,ucret;    
        
    System.out.println("günlük satılan ürün adedini giriniz:");    
    satis=klavye.nextDouble();    
     if(satis<50){
     ucret=15.0+ satis*1.0;    
         
     }else{
     ucret=15.0+50*2.0+(satis-50)*3.0;
         
     }    
     System.out.println("buna göre günlük ücret:"+ucret);   
        
        
 
    }
    
}
