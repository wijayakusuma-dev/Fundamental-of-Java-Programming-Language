import java.util.Scanner;
public class pilihan{
	public static void main(String[]args){
		Scanner in = new Scanner (System.in);
		System.out.println("Alat Tulis Kantor");
		System.out.println("1. Buku");
		System.out.println("2. Pensil");
		System.out.println("3. Pulpen");
		System.out.print("Cek harga 1-3 : ");
		int a = in.nextInt();
		switch(a){
			case 1:
			System.out.println("Harga Rp7000");
			break;
			case 2:
			System.out.println("Harga Rp2500");
			break;
			case 3:
			System.out.println("Harga Rp4000");
			break;
			default:
			System.out.println("masukan salah");
			
		}
	}
}