/*Bir fabrikada makinelerin çalışmaya başlama zamanları farklıdır. Fabrikanın
çalışmaya başlama saati mevsime göre değişmektedir. Sonbahar ve Kış aylarında
fabrika 08:00 de çalışmaya başlamaktadır. İlkbahar ve Yaz aylarında ise fabrikanın 
çalışmaya başlama saati 09:00 dır. Fabrikanın paydos saati her mevsim 17:00 dır.
Makineler Sonbahar ve Kış aylarında 30 dakika ara ile İlkbahar ve Yaz aylarında
ise 45 dakika ara ile çalışmaya başlatılmaktadır. Programa fabrikadaki makine
sayısı ve hangi ayda olduğu (1 ile 12 arasında bir değer) bilgisi giriş olarak veriliyor.
Programın çıktısı olarak makinelerin sırasıyla toplam kaç dakika çalıştığı ekrana yazdırılmaktadır.
Programın java kodunu yazınız.
 
 */
package örneksoru9.o;
import java.util.Scanner;

public class Örneksoru9O {


    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    System.out.println("makine sayısını giriniz:");
    int makinesayisi=klavye.nextInt();
    System.out.println("kaçıncı ayda olduğunuzu giriniz:");
    int ay=klavye.nextInt();
    int sure,aralik;
    if (ay>2&& ay<9){
    sure=480;    
     aralik=45;   
    }
    else {
     sure=540;   
     aralik=30;   
    }
    for (int i=makinesayisi; i>0; i-- ){
        
        System.out.println("çalışma saati:"+sure);
        sure=sure-aralik;
    }
    
    }
    
}
