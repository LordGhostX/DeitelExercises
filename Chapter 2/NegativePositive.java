import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numberOfPositive = 0, numberOfNegative = 0, numberOfZeros = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
	
			if (number > 0) {
				numberOfPositive++;
			} else if (number < 0) {
				numberOfNegative++;
			} else {
				numberOfZeros++;
			}
		}

		System.out.printf("There are %d Positive Numbers%nThere are %d Negative Numbers%nThere are %d Zeros%n", numberOfPositive, numberOfNegative, numberOfZeros);		
	}	
}