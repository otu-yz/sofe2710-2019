// Decide if the three sides make up a triangle
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int side1 = input.nextInt();
        System.out.print("Enter second side: ");
        int side2 = input.nextInt();
        System.out.print("Enter third side: ");
        int side3 = input.nextInt();

        boolean isTriangle = false;
        if (side1 < side2 + side3) {
            if (side2 < side1 + side3) {
                if (side3 < side1 + side2) {
                    isTriangle = true;
                }
            }
        }

        if (isTriangle) {
            System.out.println("It\'s a triangle");
        }
        if (!isTriangle) {
            System.out.println("It\'s not a triangle");
        }
    }
}
