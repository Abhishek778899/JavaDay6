import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		boolean condition = false;
		if (number == 0 || number == 1) {
			System.out.println(number + "Number  is not prime number");
		} 
		else 
		{
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					condition = true;
					break;
				}
			}

			if (!condition)
				System.out.println(number + " is prime number");
			else
				System.out.println(number + " is not  prime number");
		}
	}

		

	}

}
