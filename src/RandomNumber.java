import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Guess the number i;m thinking of. It's between 1-100");
		Scanner keyboard = new Scanner(System.in);

		int number1 = 0 + (int) ( Math.random() * 10 );

		int input = keyboard.nextInt();

		if (input == number1) 

			System.out.println("You're right.");
		else  

		{
			System.out.println("Wrong.");
		}


	}
}