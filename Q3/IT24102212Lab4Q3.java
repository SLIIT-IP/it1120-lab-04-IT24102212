import java.util.Scanner;

public class IT24102212Lab4Q3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive."
                    : (number < 0) ? "The number is Negative."
                    : "The number is Zero.";

        // Print the result
        System.out.println(result);

        // Close the Scanner object
        input.close();
    }
}

