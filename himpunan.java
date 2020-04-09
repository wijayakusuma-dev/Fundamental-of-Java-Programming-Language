package labti;
import java.util.Scanner;

public class himpunan {
 int[] himpunanA = new int[100];
 int[] himpunanB = new int[100];
 int jumlahAnggotaA;
 int jumlahAnggotaB;
 
 public void dataAnggotaA(){
     Scanner input1 = new Scanner(System.in);
     System.out.print("Masukkann Jumlah Anggota Himpunan A : ");
     jumlahAnggotaA = input1.nextInt();
     
     System.out.println("Anggota Himpunan A ");
     for (int i = 1; i <= jumlahAnggotaA; i++) {
         System.out.print("Anggota "+i+" : ");
         himpunanA[i]=input1.nextInt();
     }
     System.out.println("******************");
 }

 public void dataAnggotaB(){
     Scanner input2 = new Scanner(System.in);
     System.out.print("Masukkann Jumlah Anggota Himpunan B : ");
     jumlahAnggotaB = input2.nextInt();
     
     System.out.println("Anggota Himpunan B ");
     for (int i = 1; i <= jumlahAnggotaB; i++) {
         System.out.print("Anggota "+i+" : ");
         himpunanB[i]=input2.nextInt();
     }
     System.out.println("********************");
}
 public void tampilAnggota(){
     System.out.print("Anggota Himpunan A = { ");
     for (int i = 1; i <= jumlahAnggotaA; i++) {
         System.out.print(himpunanA[i]+"    ");
     }
     System.out.println("}");
     
     System.out.print("Anggota Himpunan B = { ");
     for (int i = 1; i <= jumlahAnggotaB; i++) {
         System.out.print(himpunanB[i]+"   ");
     }
     System.out.println("}");
     System.out.println("******************");
 }
public void himpunanGabungan(){
    System.out.print("Himpunan Gabungan A U B : { ");
    for (int i = 1; i <= jumlahAnggotaA; i++) {
        System.out.print(himpunanA[i]+"   ");
    }
    for (int i = 1; i <= jumlahAnggotaB; i++) {
        boolean adaSama = false;
        for (int j = i; j <= jumlahAnggotaA; j++) {
            if (himpunanB[i]==himpunanA[j]) 
                adaSama=true;
            }
            if(adaSama==false){
                System.out.println(himpunanB[i]+" ");
            }
        }
        System.out.println("}");
        System.out.println("*****************************************");
    }
public void himpunanIrisan(){
            System.out.println("Himpunan Irisan A n B : { ");
            for (int i = 1; i <= jumlahAnggotaB; i++) {
                boolean adaSama = false;
                for (int j = 1; j <= jumlahAnggotaA; j++) {
                    if (himpunanB[i]==himpunanA[j]) 
                        adaSama=true;
                    }
                    if (adaSama==true) {
                        System.out.print(himpunanB[i]+" ");
                    }
                }
                System.out.println("}");
                System.out.println("************************************");
            }
public void himpunanSelisih(){
    System.out.print("Himpunan Selisih A - B : { ");
    for (int i = 1; i <= jumlahAnggotaA; i++) {
        boolean adaSama = false;
        for (int j = 1; j <= jumlahAnggotaB; j++) {
            if (himpunanA[i]==himpunanB[j]) 
                adaSama=true;
            }
            if (adaSama==false) {
                System.out.print(himpunanA[i]+" ");
            }
        }
        System.out.println("{");
        
	System.out.print("Himpunan Selisih B - A : { ");
	for (int i=1;i<=jumlahAnggotaB;i++){
	boolean adaSama = false;
	for(int j=1;j<=jumlahAnggotaA;j++){
        if(himpunanB[i]==himpunanA[j])
		adaSama=true;
	}
		if(adaSama==false){
		System.out.print(himpunanB[i]+" ");
		}
				
            }
        System.out.println("}");
        System.out.println("********************************************");
    }
    public static void main(String[]args){
        himpunan tampil = new himpunan ();
        tampil.dataAnggotaA();
        tampil.dataAnggotaB();
        tampil.tampilAnggota();
        tampil.himpunanGabungan();
        tampil.himpunanIrisan();
        tampil.himpunanSelisih();
    }
}