import java.util.Scanner;
public class uasnilaitotal{
	public static void main (String[]args){
		// deklarasi
		int b, d, e, f;
		String a, c, g;
		Scanner in = new Scanner(System.in);
		//input
		System.out.print("masukan Nama :");
		a = in.nextLine();
		System.out.print("masukan NPM :");
		b = in.nextInt();
		System.out.print("masukan kelas :");
		c = in.next();
		System.out.print("masukan nilai UTS :");
		d = in.nextInt();
		System.out.print("masukan nilai UAS : ");
		e = in.nextInt();
		f = (d + e) / 2;
		
		//kondisi
		if (f>=90){
			g = "Baik";
		}else if(f>=70){
			g = "cukup";
		}else if(f>=40){
			g = "kurang";
	    }else{
			g = "buruk";
		}
		
		// output
		System.out.println("----------------");
		System.out.println("Nama: " +a);
		System.out.println("NPM: " +b);
		System.out.println("Kelas: " +c);
		System.out.println("Nilai UTS: " +d);
		System.out.println("Nilai UAS: " +e);
		System.out.println("Rata-rata: " +f);
		System.out.println("Keterangan: " +g);
		
	}
}