import java.util.Scanner;
import java.util.Random;

public class numgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the user guesses correctly
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            try {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please guess a number between 1 and 100!");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low, try again!");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high, try again!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
