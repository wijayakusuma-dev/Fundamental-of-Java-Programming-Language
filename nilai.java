import java.util.Scanner;
public class nilai{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("masukan nilai : ");
		int a = in.nextInt();
		
		if (a>=70){
			System.out.print("lulus");
		}else{
			System.out.print("gagal");
		}
	}
}