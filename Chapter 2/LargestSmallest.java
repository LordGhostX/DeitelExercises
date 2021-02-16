import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		System.out.print("Enter the third number: ");
		int thirdNumber = input.nextInt();
		System.out.print("Enter the fourth number: ");
		int fourthNumber = input.nextInt();
		System.out.print("Enter the fifth number: ");
		int fifthNumber = input.nextInt();

		int smallestNumber, largestNumber;
		if (firstNumber > secondNumber) {
			largestNumber = firstNumber;
			smallestNumber = secondNumber;
		} else {
			largestNumber = secondNumber;
			smallestNumber = firstNumber;
		}
		if (thirdNumber > largestNumber) {
			largestNumber = thirdNumber;
		}
		if (thirdNumber < smallestNumber) {
			smallestNumber = thirdNumber;
		}
		if (fourthNumber > largestNumber) {
			largestNumber = fourthNumber;
		}
		if (fourthNumber < smallestNumber) {
			smallestNumber = fourthNumber;
		}
		if (fifthNumber > largestNumber) {
			largestNumber = fifthNumber;
		}
		if (fifthNumber < smallestNumber) {
			smallestNumber = fifthNumber;
		}

		System.out.printf("%nThe largest number is %d%n", largestNumber);
		System.out.printf("The smallest number is %d%n", smallestNumber);
	}	
}