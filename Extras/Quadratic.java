import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the value of A: ");
		double a = input.nextDouble();
		System.out.print("Enter the value of B: ");
		double b = input.nextDouble();
		System.out.print("Enter the value of C: ");
		double c = input.nextDouble();

		double d = Math.sqrt((b * b) - (4 * a * c));
		double firstRoot = (-b + d) / (2 * a);
		double secondRoot = (-b - d) / (2 * a);

		System.out.printf("The first root of the equation is %.2f%nThe second root of the equation is %.2f%n", firstRoot, secondRoot);
	}
}