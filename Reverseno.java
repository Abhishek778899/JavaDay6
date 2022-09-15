import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		// Declare and Initialize Reverse Variable
		int reverse = 0;
		// number should be Greater than Zero
		while (number != 0) {
			int reminder = number % 10;
			reverse = (reverse * 10) + reminder;
			number = number / 10;
		}
		// Print Reverse Number
		System.out.println("Reverse Number is: " + reverse);
	}


		

}


