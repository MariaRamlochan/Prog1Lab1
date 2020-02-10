import java.util.*;
public class ScannerPractice{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		//For testing purposes
		//Scanner input = new Scanner(4 6);

		System.out.println("Enter a interger: ");
		int value = input.nextInt();

		System.out.println("You've typed " + value );


		System.out.println("Enter a double ");
		double valueD = input.nextDouble();
		System.out.println("You've typed " + valueD);


		System.out.println("Enter your full name");
		String firstName = input.next();
		System.out.println("You're first name is " + firstName);

		String name = input.nextLine();
		System.out.println("Your full name is " + firstName + name);






	}
}