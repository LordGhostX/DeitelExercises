import java.util.Scanner;

public class Cylinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the cylinder: ");
		double radius = input.nextDouble();

		System.out.print("Enter the length of the cylinder: ");
		double length = input.nextDouble();

		double area = radius * radius * Math.PI;
		double volume = area * length;

		System.out.printf("The area is %f%nThe volume is %f%n", area, volume);
	}
}