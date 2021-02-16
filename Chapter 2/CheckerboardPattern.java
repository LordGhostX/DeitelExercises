public class CheckerboardPattern {
	public static void main(String[] args) {
		String pattern = "* * * * * * * *";
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 1) {
				System.out.print(" ");
			}
			System.out.println(pattern);
		}
	}
}