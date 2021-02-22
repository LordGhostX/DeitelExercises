import java.util.Scanner;

public class ThreeDigitPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();
	
		int firstDigit = number / 100;
		int lastDigit = number % 10;
		boolean isPalindrome = firstDigit == lastDigit;
		
		if (isPalindrome) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}
}