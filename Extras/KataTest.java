public class KataTest {
	public static void main(String[] args) {
		Kata kata = new Kata();

		System.out.println("The average of the numbers are: " + kata.calcAverage(3, 4, 5));

		System.out.println("Is 10 Even: " + kata.isEven(10));

		System.out.println("The grade for 79 is " + kata.calcGrade(79));
	}	
}