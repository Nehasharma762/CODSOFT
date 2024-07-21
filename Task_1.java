import java.util.Scanner;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1, maxRange = 100, maxAttempts = 5, score = 0;
        String playAgain;

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange, attempts = 0;
            System.out.println("Guess a number between " + minRange + " and " + maxRange + " in " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == targetNumber) {
                    System.out.println("Well done! You guessed in " + attempts + " attempts !");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Out of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.next().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Final score: " + score);
        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();   
    }
}
