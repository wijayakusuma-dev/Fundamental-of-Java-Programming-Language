import java.util.Scanner;
public class panjang{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Luas Persegi Panjang");
		System.out.print("Panjang :");
		int pj = in.nextInt();
		System.out.print("Lebar :");
		int lb = in.nextInt();
		System.out.println("");
		
		int luas;
		luas = pj * lb;
		
		System.out.println("Luas Persegi Panjang : "+luas);
		
	}
}
