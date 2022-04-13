/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Menghitung Bilangan 1 Sampai Dengan Banyaknya Inputan Bilangan Oleh User");
    
     int N;
     int hasil = 0;

     Scanner angka = new Scanner(System.in);
     System.out.print("inputkan banyaknya bilangan = ");
     N = angka.nextInt();

     for (int v=1; v<=N; v++) {
	     hasil += v;
     }
        System.out.println("=====================");
     System.out.println("Hasil Bilangan: " + hasil);
        System.out.println("=====================");
    }
    
}
