/*
 3* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labti;
import java.util.Scanner;

public class inputan {
 
 public static void main(String[] args) {
  System.out.print("Masukkan Banyak Baris : ");
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();
  
  for(int i=1; i<=x; i++) {
   for(int j=x-1; j>=i; j--) {
    System.out.print(" "); //Spasi
   }
   
   for (int k=1; k<=i; k++) {
    System.out.print(" *"); // Bintang
   }
   System.out.println("");
  }
 }
}