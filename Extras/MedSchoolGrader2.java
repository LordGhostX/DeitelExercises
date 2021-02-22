/*
#1 Get user input

#2 Calculate user grade
	Assign grade to A if score >= 90
	Assign grade to B if score >= 80
	Assign grade to C if score >= 70

#3 Tell the user their grade
*/

import java.util.Scanner;

public class MedSchoolGrader2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your grade: ");
		double numberGrade = input.nextDouble();

		char charGrade;
		if (numberGrade >= 90) {
			charGrade = 'A';
		} else if (numberGrade >= 80) {
			charGrade = 'B';
		} else if (numberGrade >= 70) {
			charGrade = 'C';
		} else {
			charGrade = 'F';
		}

		System.out.println("Your grade is " + charGrade);
	}
}