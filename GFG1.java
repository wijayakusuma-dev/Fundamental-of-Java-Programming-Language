// Java program to check 
// validity of any triangle 

public class GFG1 { 


	// Function to calculate for validity 
	public static int checkValidity(int a, 
								int b, int c) 
	{ 
		// check condition 
		if (a + b > c || b + a > c || a + c > b) 
			return 0; 
		else
			return 1; 
	} 

	// Driver function 
	public static void main(String args[]) 
	{ 

		int a = 8, b = 12, c = 7; 
	
		// function calling and print output 
		if ((checkValidity(a, b, c)) == 1) 
			System.out.print("Valid"); 
		else
			System.out.print("Invalid"); 
		
	} 
} 

// This article is contributed by 'Akansh Gupta' 
