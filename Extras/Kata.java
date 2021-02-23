public class Kata {
	public double calcAverage(int firstNumber, int secondNumber, int thirdNumber) {
		double result = (firstNumber + secondNumber + thirdNumber) / 3.0;
		return result;
	}

	public boolean isEven(int number) {
		boolean isEven = (number % 2 == 0);
		return isEven;
	}

	public String calcGrade(int score) {
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
}