import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
	
		System.out.printf("%nThe sum of %d and %d is %d%n", firstNumber, secondNumber, firstNumber + secondNumber);
		System.out.printf("The product of %d and %d is %d%n", firstNumber, secondNumber, firstNumber * secondNumber);
		System.out.printf("The difference of %d and %d is %d%n", firstNumber, secondNumber, firstNumber - secondNumber);
		System.out.printf("The quotient of %d and %d is %d%n", firstNumber, secondNumber, firstNumber / secondNumber);
	}
}	