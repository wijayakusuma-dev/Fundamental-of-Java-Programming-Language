import java.util.Scanner;
public class pengulangan{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	
		int pilihan, panjang, lebar, luas, npm;
		String nama, kelas;

		System.out.println ("------------------------ MENU ---------------------------");
		System.out.println ("1. Data Diri");
		System.out.println ("2. Luas Persegi Panjang");
		System.out.print("Masukkan Pilihan [1-2] : ");
		pilihan = input.nextInt();
		switch(pilihan){
			case 1:
			System.out.println("Data Diri");
			System.out.print("Masukkan Nama Anda \t: ");
			nama = input.next();
			System.out.print("Masukkan Kelas Anda \t: ");
			kelas = input.next();
			System.out.print("Masukkan NPM Anda \t: ");
			npm = input.nextInt();
			System.out.println("==========DATA DIRI========");
			System.out.println("Nama Anda adalah \t: "+nama);
			System.out.println("Kelas Anda adalah \t: "+kelas);
			System.out.println("NPM Anda adalah \t: "+npm);
			System.out.println("===========================");
			break;
			case 2:
			System.out.println("Luas Persegi Panjang");
			System.out.print("Masukkan Panjang \t: ");
			panjang = input.nextInt();
			System.out.print("Masukkan Lebar 	\t: ");
			lebar = input.nextInt();
			luas = panjang * lebar;
			System.out.println("===========LUAS PERSEGI PANJANG============");
			System.out.println("Luas Persegi Panjang adalah : "+luas+ " cm^2");
			System.out.println("===========================================");
			break;
			default:
			System.out.println("Pilihan Anda tidak ada di Menu");
		}
	}
}