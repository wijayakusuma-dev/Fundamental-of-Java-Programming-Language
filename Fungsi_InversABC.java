import java.util.Scanner;

public class Fungsi_InversABC{
	Scanner input = new Scanner(System.in);
	int [] HimpunanA;
	int [] HimpunanB;
	int [] HimpunanRelasi;
	int [] HimpunanAsal;
	int jmlHimpunanA, jmlHimpunanB, jmlRelasi;
	boolean adaSama = false, satu2;

	public static void main(String [] args){
		Fungsi_InversABC obj = new Fungsi_InversABC();
		obj.inputAnggota();
		obj.cetakHimpunan();
		obj.inputRelasi();
		obj.cekFungsi();
		obj.cetakRelasi();
	}

	public void inputAnggota(){
		System.out.print("Masukkan Jumlah Himpunan A = ");
		jmlHimpunanA = input.nextInt();
		HimpunanA =  new int [jmlHimpunanA];
		for(int i=0; i<=(jmlHimpunanA-1); i++){
			System.out.print("Himpunan A yang ke "+(i+1)+" : ");
			HimpunanA[i] = input.nextInt();
		}

		System.out.print("Masukkan Jumlah Himpunan B = ");
		jmlHimpunanB = input.nextInt();
		HimpunanB =  new int [jmlHimpunanB];
		for(int i=0; i<=(jmlHimpunanB-1); i++){
			System.out.print("Himpunan B yang ke "+(i+1)+" : ");
			HimpunanB[i] = input.nextInt();
		}
	}

	public void cetakHimpunan(){
		System.out.print("Anggota Himpunan A = {");
		for(int i=0; i<=(jmlHimpunanA-1); i++){
			System.out.print(HimpunanA[i]+ " ");
		}
		System.out.print("}");

		System.out.print("Anggota Himpunan B = {");
		for(int i=0; i<=(jmlHimpunanB-1); i++){
			System.out.print(HimpunanB[i]+ " ");
		}
		System.out.print("}");
	}

	public void inputRelasi(){
		int jmlRelasiMaks = jmlHimpunanA * jmlHimpunanB;
		System.out.println("Relasi Maksimal yang terjadi adalah "+jmlRelasiMaks);
		do{
			System.out.print("Masukkan Jumlah Relasi yang terjadi : ");
			jmlRelasi = input.nextInt();
		}while(jmlRelasi>jmlRelasiMaks);

		HimpunanRelasi = new int[jmlRelasi];
		HimpunanAsal = new int[jmlRelasi];
		System.out.println("Masukkan Relasi yang terjadi : ");
		for(int i=0; i<(jmlRelasi-1); i++){
			int [] temp = new int [jmlRelasi];
			int [] temp2 = new int [jmlRelasi];
			boolean SamaA = false;
			boolean SamaB = false;
			System.out.println("Relasi ke "+(i+1)+" : ");
			do{
				System.out.print("Masukkan Asal A : ");
				temp[i] = input.nextInt();
				System.out.print("Masukkan Tujuan B : ");
				temp2[i] = input.nextInt();
				for(int j=0; j<=(jmlHimpunanA-1); j++){
					if(temp[i] == HimpunanA[j]){
						SamaA = true;
					}
				}
				for(int k=0; k<=(jmlHimpunanB-1); k++){
					if(temp2[i] ==HimpunanB[k]){
						SamaB = true;
					}
				}
				if(SamaA==false || SamaB==false){
					System.out.println("Anggota Himpunan Tidak terdapat di himpunan A atau B");
				}
				if(SamaA==true && SamaB==true){
					HimpunanRelasi[i] = temp2[i];
					HimpunanAsal[i] = temp[i];
				}
			}while(SamaA==false || SamaB==false);
		}
	}

	public void cekFungsi(){
		int jumlahAnggota = 0;
		for(int i=0; i<=(jmlHimpunanA-1); i++){
			for(int j=0; j<=(jmlRelasi-1); j++){
				if(HimpunanA[i]==HimpunanAsal[j]){
					jumlahAnggota++;
				}
			}
		}

		for(int i=0; i<=(jmlRelasi-1); i++){
			for(int j=i+1; j<=(jmlRelasi-1); j++){
				if(HimpunanAsal[i]==HimpunanAsal[j]){
					adaSama=true;
				}
			}
		}

		if(jumlahAnggota==jmlHimpunanA && adaSama == false){
			System.out.println("Relasi yang diinput adalah Fungsi");
			jumlahAnggota = 0;
			for(int i=0; i<=(jmlHimpunanB-1); i++){
				for(int j=0; j<=(jmlRelasi-1); j++){
					if(HimpunanB[i]==HimpunanRelasi[j]){
						jumlahAnggota++;
					}
				}
			}
			for(int i=0; i<=(jmlRelasi-1); i++){
				for(int j=i+1; j<=(jmlRelasi-1); j++){
					if(HimpunanRelasi[i]==HimpunanRelasi[j]){
						adaSama=true;
					}
				}
			}
			if(jumlahAnggota==jmlHimpunanB && adaSama == false){
				System.out.println("Fungsi yang diinput adalah Fungsi Satu-Satu.");
				satu2=true;
			}
		}else{
			System.out.println("Relasi yang diinput Bukan Fungso, hanya Relasi biasa.");
		}
	}

	public void cetakRelasi(){
		System.out.print("Daerah Domain = { ");
		for(int i=0; i<=jmlHimpunanA-1; i++){
			System.out.print(HimpunanA[i]+" ");
		}
		System.out.println("}");

		System.out.print("Daerah Kodomain = { ");
		for(int i=0; i<=jmlHimpunanB-1; i++){
			System.out.print(HimpunanB[i]+" ");
		}
		System.out.println("}");
		
		System.out.print("Daerah Range adalah = { ");
		for(int i=0; i<=jmlRelasi-1; i++){
			boolean adaSama=false;
			for(int j=i+1; j<=jmlRelasi-1; j++){
				if(HimpunanRelasi[i]==HimpunanRelasi[j])
					adaSama=true;
				}
				if(adaSama==false)
					System.out.print(HimpunanRelasi[i]+" ");
			}
		System.out.println("}");

		if(satu2){
			System.out.println("\nFungsi Inversnya adalah : ");
			System.out.print("Daerah Domain : { ");
			for(int i=0; i<=jmlHimpunanA-1; i++){
				System.out.print(HimpunanB[i]+" ");
			}
			System.out.println("}");
			
			System.out.print("Daerah Kodomain : { ");
			for(int i=0; i<=jmlHimpunanB-1; i++){
				System.out.print(HimpunanA[i]+" ");
			}
			System.out.println("}");
			
			System.out.print("Daerah Range adalah = { ");
			for(int i=0; i<=jmlRelasi-1; i++){
				for(int j=i+1; j<=jmlRelasi-1; j++){
					if(HimpunanAsal[i]==HimpunanAsal[j]){
						adaSama=true;
					}
				}
				if(adaSama==false)
					System.out.print(HimpunanAsal[i]+" ");
			}
			System.out.println("}");
		}
	}
}