/*Üçgensel sayılar dizisi, terim numarası ve terim numarasındaki önceki sayıların
toplamını oluşturmaktadır.Üçgensel sayı dizisine ait programın java kodunu yazınız.
 */
package örneksoru8.o;
import java.util.Scanner;

public class Örneksoru8O {

  
    public static void main(String[] args) {
int kaydedici=0;
Scanner klavye=new Scanner(System.in);
System.out.println("Lütfen terim sayısı giriniz:");
int sayi=klavye.nextInt();
 for(int i=1; i<=sayi; i++){
 int yenisayi=kaydedici+i;    
  System.out.println(yenisayi);
  kaydedici=yenisayi;   
 }

}   
}
