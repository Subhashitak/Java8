import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a Random object to generate the random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        int userGuess = 0; // Initialize userGuess
        boolean hasGuessedCorrectly = false;
        
        // Do-while loop to continue guessing until the correct number is guessed
        do {
            // Prompt the user to guess the number
            System.out.print("Guess the number (between 1 and 100): ");
            
            // Read the user's guess
            userGuess = scanner.nextInt();
            
            // Check if the guess is too high, too low, or correct
            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                // If the guess is correct
                System.out.println("Congratulations! You guessed the correct number.");
                hasGuessedCorrectly = true;
            }
            
        } while (!hasGuessedCorrectly); // Continue looping until the correct number is guessed
        
        // Close the scanner
        scanner.close();
    }
}
+