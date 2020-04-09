public class segitigaSamaSisi{
	public static void main(String[]args){
		int x = 3;
		for (int i=1; i<=x; i++){
			for (int j=x; j>i; j--){
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++){
				System.out.print ("* ");
			}
			System.out.println();
		}
	}
}


