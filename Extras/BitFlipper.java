import java.util.Scanner;

public class BitFlipper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a bit (1/0): ");
		int bit = input.nextInt();
		
		boolean flipped = false;
		if (bit == 1 && flipped == false) {
			bit = 0;
			flipped = true;
			System.out.println("The flipped bit is: " + bit);
		}
		if (bit == 0 && flipped == false) {
			bit = 1;
			flipped = true;
			System.out.println("The flipped bit is: " + bit);
		}
		if (flipped == false) {
			System.out.println("Enter a valid bit (1/0)");
		}
	}
}