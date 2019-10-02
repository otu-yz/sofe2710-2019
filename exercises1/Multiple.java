// Decide if first number is a multiple of second number
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        }
        if (num1 % num2 != 0) {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }
}
