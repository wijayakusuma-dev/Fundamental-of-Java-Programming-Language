package labti;
import java.util.Scanner;

public class login{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String username, password;
		boolean usernameSama = false, passwordSama = false;
                do{
		System.out.println("=======LOGIN======");
		System.out.print("Masukkan Username : ");
		username = input.next();
		System.out.print("Masukkan Password : ");
		password = input.next();
		System.out.println("==================");
		
		if("Wijaya".equals(username))
			usernameSama = true;
		if("katasandi76".equals(password))
			passwordSama = true;
		
		if(usernameSama == true && passwordSama == true){
			System.out.println("Hai Selamat datang, "+username);
                }else if(usernameSama == false && passwordSama == false){
                        System.out.println("Username dan Password yang Anda masukkan salah, silahkan masukkan kembali.");
                }else if(usernameSama == false){
                        System.out.println("Username yang Anda masukkan salah, silahkan masukkan kembali.");
                }else{
			System.out.println("Password yang Anda masukkan salah, silahkan masukkan kembali.");
		}
                }while(usernameSama == false || passwordSama == false);
}
}









