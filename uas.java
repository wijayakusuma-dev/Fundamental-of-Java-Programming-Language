import java.util.Scanner;
public class uas{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("masukan nilai UAS : ");
		int a = in.nextInt();
		
		if (a>=80){
			System.out.print("baik");
		}else if(a>=60){
			System.out.print("cukup");
		}else{
			System.out.print("buruk");
		}
	}
}