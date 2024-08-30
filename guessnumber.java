import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game variables
        int maxRange = 100; // Range of numbers (1 to 100)
        int maxAttempts = 10; // Maximum attempts per round
        int totalRounds = 3; // Number of rounds
        int totalScore = 0; // Total score
        boolean continueGame = true; // Flag to check if user wants to continue

        System.out.println("Welcome to the 'Guess the Number' game!");

        // Main game loop for multiple rounds
        for (int round = 1; round <= totalRounds && continueGame; round++) {
            System.out.println("\nRound " + round + " starts!");

            // Generate a random number between 1 and 100
            int randomNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            int score = 0;
            boolean hasGuessedCorrectly = false;

            // Loop for each attempt in the round
            while (attempts < maxAttempts) {
                System.out.println("Guess the number between 1 and " + maxRange + ": ");
                int userGuess = scanner.nextInt();
                attempts++;

                // Check the user's guess
                if (userGuess == randomNumber) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    score = maxAttempts - attempts + 1; // Award points based on remaining attempts
                    totalScore += score;
                    System.out.println("You earned " + score + " points in this round.");
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("The number is higher than " + userGuess + ". Try again.");
                } else {
                    System.out.println("The number is lower than " + userGuess + ". Try again.");
                }
            }

            // If the user did not guess correctly
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + randomNumber + ".");
            }

            System.out.println("End of Round " + round + ". Your total score is: " + totalScore);

            // Ask the user if they want to continue to the next round
            if (round < totalRounds) { // Ask only if there are more rounds available
                System.out.println("Do you want to continue to the next round? (yes/no): ");
                String userResponse = scanner.next().toLowerCase();

                if (!userResponse.equals("yes")) {
                    continueGame = false;
                    System.out.println("Thank you for playing! Your final score is: " + totalScore);
                }
            }
        }

        // Game over and display final score
        if (continueGame) {
            System.out.println("\nGame Over! Your final score after " + totalRounds + " rounds is: " + totalScore);
        }

        scanner.close();
    }
}
