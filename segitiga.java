import java.util.Scanner;

public class segitiga {
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print ("Masukan angka : ");
		int x = input.nextInt();
		for (int i = 1; i <= x; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}