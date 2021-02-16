import java.util.Scanner;

public class ComparingIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();

		if (firstNumber > secondNumber) {
			System.out.printf("%n%d is larger than %d%n", firstNumber, secondNumber);
		}
		if (secondNumber > firstNumber) {
			System.out.printf("%n%d is larger than %d%n", secondNumber, firstNumber);
		}
		if (firstNumber == secondNumber) {
			System.out.println("\nThese numbers are equal");
		}
	}
}