import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        int userInput;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextInt();
            if (userInput > maximumNumber) {
                maximumNumber = userInput;
            }
            if (userInput < minimumNumber) {
                minimumNumber = userInput;
            }
        }

        System.out.printf("The maximum number is %d%nThe minimum number is %d%n", maximumNumber, minimumNumber);
    }
}
