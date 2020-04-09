package labti;
import java.util.Scanner;

public class LABTI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String  nama, kelas;
        int  npm;
                
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukkann NPM Anda : ");
        npm = input.nextInt();
        System.out.print("Masukkan Kelas Anda : ");
        kelas = input.next();
        
        System.out.println("=====================");
        System.out.println("Nama : "+nama+" ");
        System.out.println("NPM : "+npm+" ");
        System.out.println("Kelas : "+kelas+" ");
  
    }   
}
















