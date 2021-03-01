import java.util.Scanner;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = 57;
        int guessedNumber;
        while (true) {
            System.out.print("Guess a number: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber == numberToGuess) {
                System.out.println("You got the number right!");
                break;
            } else {
                System.out.println("You failed the number, try again!");
            }
        }
    }
}