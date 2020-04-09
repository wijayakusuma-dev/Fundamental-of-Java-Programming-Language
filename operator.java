import java.util.Scanner;
class operator {
	public static void main (String[]args) {
		Scanner masuk = new Scanner (System.in) ;
		double a, b, c, d, e, f, g;
		System.out.println ("============================================");
		System.out.println ("             OPERASI ARITMATIKA             ");
	    System.out.println ("============================================");
	    System.out.print ("Masukkan Angka Pertama : ");
	    a = masuk.nextDouble();
     	System.out.print ("Masukkan Angka Kedua : ");
	    b = masuk.nextDouble ();
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		System.out.println ("--------------------------------------------");
		System.out.println ("Hasil dari "+a+" + "+b+" = "+c);
		System.out.println ("Hasil dari "+a+" - "+b+" = "+d);
		System.out.println ("Hasil dari "+a+" * "+b+" = "+e);
		System.out.println ("Hasil dari "+a+" / "+b+" = "+f);
		System.out.println ("Hasil dari "+a+" % "+b+" = "+g);
		System.out.println ("============================================");
	}
}
