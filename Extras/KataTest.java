public class KataTest {
	public static void main(String[] args) {
		Kata kata = new Kata();

		System.out.println("Average Calculator: " + kata.calculateAverage(10, 5, 3));
		System.out.println("Even Calculator: " + kata.isEven(10));
		System.out.println("Grade Calculator: " + kata.calculateGrade(76));

		System.out.println("Is 1 prime: " + kata.isPrimeNumber(1));
		System.out.println("Is 2 prime: " + kata.isPrimeNumber(2));
		System.out.println("Is 3 prime: " + kata.isPrimeNumber(3));
		System.out.println("Is 19 prime: " + kata.isPrimeNumber(19));
		System.out.println("Is 80 prime: " + kata.isPrimeNumber(80));
		System.out.println("Is 97 prime: " + kata.isPrimeNumber(97));
		System.out.println("Is 967 prime: " + kata.isPrimeNumber(967));

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.print((i * i * i) + " ");
		}

		for (int i = 1000; i > 0; i--) {
			System.out.println(i * i * i);
		}
	}	
}