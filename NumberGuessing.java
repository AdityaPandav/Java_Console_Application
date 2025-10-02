import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        // Generate a random number between 1 and 100
        int answer = (int)(Math.random() * 100) + 1;
        int attempts = 8;   // Total number of attempts allowed

        Scanner input = new Scanner(System.in);
        System.out.println("**Welcome to the Number Guessing Game!**");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + attempts + " tries to guess it.\n");

        boolean guessedCorrectly = false;

        while (attempts > 0) {
            System.out.print("Enter your guess Between '1 to 100': ");
            int guess = input.nextInt();

            if (guess == answer) {
                System.out.println("✅ Woohoo! Correct Answer!");
                guessedCorrectly = true;
                break;   // Exit the loop since user guessed correctly
            }
            else if (guess > answer) {
                System.out.println("📉 Too High! Try again.");
            }
            else {
                System.out.println("📈 Too Low! Try again.");
            }

            attempts--;
            System.out.println("Remaining tries: " + attempts + "\n");
        }

        if (!guessedCorrectly) {
            System.out.println("❌ Sorry, you’re out of tries.");
            System.out.println("The correct number was: " + answer);
        }

        input.close();
    }
}


