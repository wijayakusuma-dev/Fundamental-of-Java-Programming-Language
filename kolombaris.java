import java.util.Scanner;
public class kolombaris{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int baris = 4;
		int kolom = 4;
		
		int nilai[][] = new int [baris][kolom];
		
		for (int b = 1; b<baris; b++){
			for (int k=1; k<kolom; k++){
				System.out.print("Input Nilai ["+b+", "+k+"] = ");
				nilai [b][k]=input.nextInt();
			}
		}
		System.out.println("Baris dan kolom akan terlihat");
		
		for (int b = 1; b<baris; b++){
			for (int k=1; k<kolom ; k++){
				System.out.print(nilai[b][k]+" ");
				
			}
			System.out.println();
		}
	}
}










