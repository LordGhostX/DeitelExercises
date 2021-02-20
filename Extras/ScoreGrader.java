import java.util.Scanner;

public class ScoreGrader {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your exam score: ");
		double score = input.nextInt();

		if (score >= 40) {
			System.out.println("Pass");
		}
		if (score < 40) {
			System.out.println("Fail");
		}
	}
}