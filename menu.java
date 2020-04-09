/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;
import java.util.Scanner;
/**
 *
 * @author wijay
 */
public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, angka1, angka2, sisahbagi, perkalian, x; 
        int pembagian, penjumlahan, pengurangan;
        String nama, alamat, lampu;
        boolean ulang=true;
        
        System.out.println("DAFTAR MENU");
        System.out.println("1. Kalkulator");
        System.out.println("2. Segitiga sama sisi");
        System.out.println("3. Segitiga siku siku");
        System.out.println("4. Segitiga siku siku terbalik");
        System.out.println("5. Exit.");
        System.out.print("Masukkan Pilihan [1-5] : ");
        pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                System.out.print("Masukkan angka    \t: ");
                angka1 = input.nextInt();
                System.out.print("Masukkan angka selanjutnya \t: ");
                angka2 = input.nextInt();
                
                penjumlahan = angka1 + angka2;
                pengurangan = angka1 - angka2;
                perkalian = angka1 * angka2;
                pembagian = angka1 / angka2;
                sisahbagi = angka1 % angka2;
                System.out.println("===OPERASI ARTITMATIKA===");
                System.out.println("Hasil penjumlahan \t: " +penjumlahan);   
                System.out.println("Hasil pengurangan \t: " +pengurangan);  
                System.out.println("Hasil perkalian \t: " +perkalian);  
                System.out.println("Hasil pembagian \t: " +pembagian);  
                System.out.println("Hasil sisah bagi / modulus \t: " +sisahbagi);
                break;
            
            case 2:
                System.out.print("Masukkan baris segitiga yang anda ingingkan : ");
                x = input.nextInt();
                for (int i = 1; i <= x; i++) {
                    for (int j = x; j > i; j--) {
                        System.out.print(" ");   
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
                
            case 3:
                 System.out.print("Masukkan baris segitiga yang anda ingingkan : ");
                x = input.nextInt();
                for (int i = 1; i<= x; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");    
                    }
                    System.out.println("");
                }
                break;
                
            case 4:
                for (int i=6; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                
            case 5:
                System.exit(0);
                break;
                
            default:
                System.out.println("Pilihan yang anda pilih tidak tersedia");
        }
    }
}
