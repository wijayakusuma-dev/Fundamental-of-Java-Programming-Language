public class segitiga2 {
	public static void main (String[]args){
		for (int i = 1; i <= 3; i++) {
				for (int j=1; j<=i ; j++){
					System.out.print("#");
				}
					System.out.println(" ");
			}
			System.out.println("");
			for (int i = 3; i>=1; i--){
				for (int k = 2; k>=i;k--){
					System.out.print(" ");
				}
				for (int j = 1; j<=i; j++){
					System.out.print("#");
				}
				System.out.println("");
				}
			}
}