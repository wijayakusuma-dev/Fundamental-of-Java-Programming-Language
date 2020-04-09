import java.util.Scanner;
public class kfull{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int pilihan, panjang, lebar, tinggi, volume;
		double uts, uas, hasil;

		System.out.println ("------------------------ KFULL ---------------------------");
		System.out.println ("1. Nilai Akhir");
		System.out.println ("2. Volume Balok");
		System.out.print ("Masukan pilihan [1-2] : ");
		pilihan = input.nextInt();

		switch (pilihan) {
			case 1 :
			System.out.println ("------------------------ NILAI AKHIR -------------------------");
			System.out.print ("Nilai UTS : ");
			uts = input.nextDouble();
			System.out.print ("Nilai UAS : ");
			uas = input.nextDouble();
			hasil = (uts*0.7) + (uas*0.3);
			System.out.println ("-----------------------------------------------------------");
			if (hasil > 100){
				System.out.println ("Nilai Anda salah, Cek kembali!");
			}
			else if ( hasil >= 90){
				System.out.println ("Nilai Akhir \t: "+hasil);
				System.out.print ("Grade	\t: A");
			}
			else if ( hasil >= 80){
				System.out.println ("Nilai Akhir \t: "+hasil);
				System.out.print ("Grade	\t: B");
			}
			else if ( hasil >= 70){
				System.out.println ("Nilai Akhir \t: "+hasil);
				System.out.print ("Grade	\t: C");
			}
			else if ( hasil >= 60){
				System.out.println ("Nilai Akhir \t: "+hasil);
				System.out.print ("Grade	\t: D");
			}
			else if ( hasil < 0){
				System.out.println ("Nilai Akhir \t: "+hasil);
				System.out.print ("Nilai Anda salah, Cek kembali!");
			}
			else {
				System.out.println ("Nilai Akhir \t: "+hasil);
				System.out.print ("Grade	\t: E");
			}
			break;

			case 2 : 
			System.out.println ("----------------------- VOLUME BALOK ------------------------");
			System.out.print ("Panjang \t: ");
			panjang = input.nextInt();
			System.out.print ("Lebar \t: ");
			lebar = input.nextInt();
			System.out.print ("Tinggi \t: ");
			tinggi = input.nextInt();
			volume = panjang * lebar * tinggi;
			System.out.print ("Volume balok \t: "+volume);
			break;

			default :
			System.out.println ("Inputan salah! tidak tersedia dalam pilihan.");

		}
	}
}

