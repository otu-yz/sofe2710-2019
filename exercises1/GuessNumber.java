// Play guess the number game
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(101);  // 0 to 100 inclusive
        int guess;
        boolean correct = false;
        System.out.println("I\'m thinking of a number between 0 and 100 (inclusive).");
        while (!correct) {
            System.out.println("What\'s your guess? ");
            guess = input.nextInt();
            if (guess == num) {
                correct = true;
                System.out.println("You got it!");
            }
            else if (guess < num) {
                System.out.println("Too small.  Guess again? ");
            }
            else {  // guess > num
                System.out.println("Too big.  Guess again? ");
            }
        }
    }
}
