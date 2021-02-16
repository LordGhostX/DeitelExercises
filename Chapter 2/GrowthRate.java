public class GrowthRate {
	public static void main(String[] args) {
		long worldPopulation = 7800000000L;
		double growthRate = (1.1 / 100) + 1;

		System.out.printf("The world population after the first year is %f%n", worldPopulation * growthRate);
		System.out.printf("The world population after the second year is %f%n", worldPopulation * growthRate * growthRate);
		System.out.printf("The world population after the third year is %f%n", worldPopulation * growthRate * growthRate * growthRate);
		System.out.printf("The world population after the fourth year is %f%n", worldPopulation * growthRate * growthRate * growthRate * growthRate);
		System.out.printf("The world population after the fifth year is %f%n", worldPopulation * growthRate * growthRate * growthRate * growthRate * growthRate);
	}
}