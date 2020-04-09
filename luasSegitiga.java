package belajar;
import java.util.Scanner;
public class luasSegitiga {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int alas, tinggi;
            double luas;
            
            System.out.print("Masukkan nilai Alas Segitiga : ");
            alas = input.nextInt();
            System.out.print("Masukkan nilai Tinggi Segitiga : ");
            tinggi = input.nextInt();
            luas = 0.5*alas*tinggi;
            System.out.println("Luas Segitiga = "+luas);
            
    }
    
}
