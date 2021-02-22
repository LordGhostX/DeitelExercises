/*
#1 Get user input

#2 Assign grade to A if 90 <= score <= 100

#3 Assign grade to B if 80 <= score < 90

#4 Assign grade to C if 70 <= score < 80

#4 If nothing above matches, assign F
*/

import java.util.Scanner;

public class MedSchoolGrader {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your grade: ");
		double numberGrade = input.nextDouble();

		char charGrade;
		if (numberGrade >= 90 && numberGrade <= 100) {
			charGrade = 'A';
		} else if (numberGrade >= 80 && numberGrade < 90) {
			charGrade = 'B';
		} else if (numberGrade >= 70 && numberGrade < 80) {
			charGrade = 'C';
		} else {
			charGrade = 'F';
		}

		System.out.println("Your grade is " + charGrade);
	}
}