import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		

		System.out.print("Enter your weight in pounds: ");
		int weight = input.nextInt();

		System.out.print("Enter your height in inches: ");
		int height = input.nextInt();

		double bmi = (weight * 703) / (height * height);
		System.out.printf("Your BMI is: %f%n%n", bmi);

		System.out.println("""
BMI VALUES
Underweight: less than 18.5
Normal: between 18.5 and 24.9
Overweight: between 25 and 29.9
Obese: 30 or greater
""");
	}
}