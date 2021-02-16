import java.util.Scanner;  

public class SmallestLargest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		System.out.print("Enter the third number: ");
		int thirdNumber = input.nextInt();

		System.out.printf("%nThe sum of %d, %d and %d is %d%n", firstNumber, secondNumber, thirdNumber, firstNumber + secondNumber + thirdNumber);
		System.out.printf("The average of %d, %d and %d is %d%n", firstNumber, secondNumber, thirdNumber, (firstNumber + secondNumber + thirdNumber) / 3);
		System.out.printf("The product of %d, %d and %d is %d%n", firstNumber, secondNumber, thirdNumber, firstNumber * secondNumber * thirdNumber);

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

		System.out.printf("The largest of %d, %d and %d is %d%n", firstNumber, secondNumber, thirdNumber, largestNumber);
		System.out.printf("The smallest of %d, %d and %d is %d%n", firstNumber, secondNumber, thirdNumber, smallestNumber);
	}
}