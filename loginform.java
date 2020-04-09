import java.util.Scanner;
public class loginform{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String username, password;
		boolean usernameSama = false, passwordSama = false;
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
		}else{
			System.out.println("Username / Password salah, silahkan masukkan kembali!");
		}
	}
}









