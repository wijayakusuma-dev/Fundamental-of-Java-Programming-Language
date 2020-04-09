import java.util.Scanner;

public class day{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int day;
		System.out.print("What's day is today?");
		day = input.nextInt();
		
		switch(day){
			case 1:
			System.out.println("Today is Monday");
			break;
			case 2:
			System.out.println("Today is Tuesday");
			break;
			case 3:
			System.out.println("Today is Wednesday");
			break;
			case 4:
			System.out.println("Today is Thursday");
			break;
			case 5:
			System.out.println("Today is Friday");
			break;
			case 6:
			System.out.println("Today is Saturday");
			break;
			case 7:
			System.out.println("Today is Sunday");
			break;
			default:
			System.out.println("Your day is not available");
		}
	}
}