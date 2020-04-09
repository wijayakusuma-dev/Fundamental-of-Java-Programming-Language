import java.util.Scanner;
public class nilaiakhir{
	public static void main(String[]args){
		int pil;
		double uts, uas, hasil;
		Scanner input = new Scanner(System.in);
		System.out.println("===MENU===");
		System.out.println("1. Nilai Akhir.");
		System.out.println("2. Exit.");
		
		System.out.print("Masukkan Pilihan Anda : ");
		pil = input.nextInt();
		
		switch(pil){
			case 1:
			System.out.print("Silahkan, Masukkan nilai UTS Anda : ");
			uts = input.nextDouble();
			System.out.print("Silahkan, Masukkan nilai Uas Anda : ");
			uas = input.nextDouble();
			hasil = (uts*0.7) + (uas*0.3);
			
			if(hasil > 100){
				System.out.println("Nilai yang Anda masukkan salah.");
			}else if (hasil >= 90){
				System.out.println("Nilai Akhir Anda \t: "+hasil);
				System.out.println("Grade 			\t: A");
			}else if (hasil >= 80){
				System.out.println("Nilai Akhir Anda \t: "+hasil);
				System.out.println("Grade 			\t: B");
			}else if (hasil >= 70){
				System.out.println("Nilai Akhir Anda \t: "+hasil);
				System.out.println("Grade 			\t: C");
			}else if (hasil >= 60){
				System.out.println("Nilai Akhir Anda \t: "+hasil);
				System.out.println("Grade 			\t: D");
			}else if (hasil < 0){
				System.out.println("Nilai yang Anda masukkan salah.");
			}else{
				System.out.println("Nilai Akhir Anda \t: "+hasil);
				System.out.println("Grade 			\t: E");
			}
			break;
			
			case 2:
			System.exit(0);
			break;
			
			default:
			System.out.println("INPUTAN SALAH");
		}
	}
}