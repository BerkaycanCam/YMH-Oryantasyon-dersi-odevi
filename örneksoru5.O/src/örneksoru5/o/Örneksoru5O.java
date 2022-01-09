/*dışarıdan girilen 20 sayılık bir dizinin ortalamasını ve toplamını
ekrana yazdıran sistemin java kodunu yazınız.
 */
package örneksoru5.o;
import java.util.Scanner;

public class Örneksoru5O {

    public static void main(String[] args) {
    double[] benimdizi=new double[20];
    Scanner klavye=new Scanner(System.in);    
    
    System.out.print("lütfen"+benimdizi.length+"sayı giriniz");
    for (int i=0; i<benimdizi.length; i++){
    benimdizi[i]=klavye.nextDouble();       
    }
    double toplam=0;
    double ortalama=0;
    for (int i=0; i<benimdizi.length; i++)
    toplam+=benimdizi[i];
    ortalama=toplam/benimdizi.length;
    System.out.println("sayıların toplamı:"+toplam);
    System.out.println("sayıların ortalaması:"+ortalama);
    }
    
}
