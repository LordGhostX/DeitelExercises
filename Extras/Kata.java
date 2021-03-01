public class Kata {
	public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
		double result = (firstNumber + secondNumber + thirdNumber) / 3.0;
		return result;
	}

	public boolean isEven(int number) {
		boolean isEven = (number % 2 == 0);
		return isEven;
	}

	public String calculateGrade(int score) {
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "C";
		} else {
			return "D";
		}
	}

	public boolean isPrimeNumber(int number) {
		int primeLimit = (int) Math.sqrt(number);
		for (int i = 2; i < primeLimit + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		boolean isPrime = true && number != 1;
		return isPrime;
	}
}