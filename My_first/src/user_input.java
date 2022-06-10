import java.util.Scanner;
public class user_input {
	public static void main(String[] args) {
		//user_input(some number)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		
		System.out.println("The entered value is");
		System.out.println(user_input_number);
		//decimal number(use double)
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter some decimal number");
		double user_input_double = scan1.nextDouble();
		
		System.out.println("The entered value is");
		System.out.println(user_input_double);
		//asking text input
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the string");
		String user_input_String = scan2.nextLine();
		
		System.out.println("The entered string is");
		System.out.println(user_input_String);
		
		


	}


}
