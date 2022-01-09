/* üçe üçlük 2 matrisin dizinin elemanarını toplayıp yeni bir matriste ekrana yazdıran programın 
java kodunu yazınız.
 
 */
package örneksoru6.o;


public class Örneksoru6O {

 
    public static void main(String[] args) {
    int[][] dizi={{1,2,3},{4,5,6},{7,8,9}};
    int[][] dizi2={{10,11,12},{13,14,15},{16,17,18}};
    
    int[][] c=new int[3][3];
    
    for (int i=0; i<3; i++){
     for(int j=0; j<3; j++){
     c[i][j]=dizi[i][j]+dizi2[i][j];    
     System.out.print(c[i][j]+" ");    
         
     }   
      System.out.println();  
    }
    }
}