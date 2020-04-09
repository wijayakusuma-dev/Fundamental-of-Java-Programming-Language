/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labti;
 import java.util.Scanner;
/**
 *
 * @author wijay
 */
public class relasi {
   
	Scanner input = new Scanner(System.in);
	int [] himpunanA = new int [100];
	int [] himpunanB = new int [100];
	int [] himpunanhasil = new int [100];
	int jumlahanggotaA, jumlahanggotaB;
	int jumlahrelasi, jumlahrelasimaks;
public void inputanggota(){
	System.out.print("\nMasukkan Jumlah Anggota Himpunan A : ");
	jumlahanggotaA = input.nextInt();
	System.out.println("Anggota Himpunan A ");
	for (int i=1;i<=jumlahanggotaA;i++){
		System.out.print("Anggota " +i+ " : ");
		himpunanA[i] = input.nextInt();
	}
	System.out.print("\n Masukkan Jumlah Anggota B : ");
	jumlahanggotaB = input.nextInt();
	System.out.println("Anggota Himpunan B ");
	for (int i=1;i<=jumlahanggotaB;i++){
		System.out.print("Anggota" +i+ " : ");
		himpunanB[i] = input.nextInt();
	}
	jumlahrelasimaks = jumlahanggotaA * jumlahanggotaB;
	System.out.println("\nBanyak Relasi maksimal yang terjadi Adalah : "+jumlahrelasimaks);
	do{
		System.out.print("\nMasukkan Jumlah Relasi terjadi : ");
		jumlahrelasi = input.nextInt();
	}while(jumlahrelasi>jumlahrelasimaks);
}
public void inputrelasi(){
		System.out.println("Relasi yang terjadi : ");
		for (int i=1; i<=jumlahrelasi; i++){
			int [] anggotaA = new int[100];
			int [] anggotaB = new int[100];
			boolean samaA = false;
			boolean samaB = false;
			
			System.out.println("\nRelasi ke-"+i+" : ");
			do{
				System.out.print("Masukkan Asal A : ");
				anggotaA[i] = input.nextInt();
				System.out.print("Masukkan Tujuan B : ");
				anggotaB[i] = input.nextInt();
				for(int j=1; j<=jumlahanggotaA; j++){
					if(anggotaA[i]==himpunanA[j]){
						samaA = true;
					}
				}
				for (int k=1; k<=jumlahanggotaB; k++){
					if(anggotaB[i]==himpunanB[k]){
						samaB = true;
					}
				}
				if(samaA==false){
					System.out.println("Anggota Himpunan tidak terdapat di himpunan A");
				}
				if(samaB==false){
					System.out.println("Anggota Himpunan tidak terdapat di himpunan B");
				}
				if(samaA==true || samaB==true){
					himpunanhasil[i]=anggotaB[i];
				}
			}while(samaA==false || samaB==false);
		}
}
public void cetakrelasi(){
	System.out.print("\nDaerah Domain = { ");
	for(int i=1; i<=jumlahanggotaA; i++){
		System.out.print(himpunanA[i]+" ");
	}
	System.out.println("}");
	System.out.print("Daerah Kodomain = { ");
	for(int i=1; i<=jumlahanggotaB; i++){
		System.out.print(himpunanB[i]+" ");
	}
	System.out.println("}");
	System.out.print("Daerah Range adalah = { ");
	for(int i=1; i<=jumlahrelasi; i++){
		System.out.print(himpunanhasil[i]+" ");
	}
	System.out.println("}");
}
public static void main(String[]args){
	relasi a = new relasi();
	a.inputanggota();
	a.inputrelasi();
	a.cetakrelasi();
}
}


		
