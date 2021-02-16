import java.util.Scanner;

public class SeparatingDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a 5 digit integer: ");
		int number = input.nextInt();
		String numberString = Integer.toString(number);

		for (int i = 0; i < 5; i++) {
			System.out.printf("%s ", numberString.charAt(i));
		}
		System.out.println();
	}
}