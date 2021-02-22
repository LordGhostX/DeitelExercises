public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Even Numbers");
		int number = 1;
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}

		System.out.println("\nOdd Numbers");
		number = 1;
		while (number <= 100) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
			number++;
		}

		System.out.println("\nEven and Odd Numbers\nEven\tOdd");
		number = 0;
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.printf("%d\t%d%n", number, number + 1);
			}
			number++;
		}
	}
}