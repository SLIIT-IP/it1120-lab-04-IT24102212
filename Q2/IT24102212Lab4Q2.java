import java.util.Scanner;

public class IT24102212Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input and validate exam marks
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid marks! Please enter exam marks (out of 100): ");
            examMarks = input.nextDouble();
        }

        // Input and validate lab submission marks
        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid marks! Please enter lab submission marks (out of 100): ");
            labMarks = input.nextDouble();
        }

        // Input and validate exam mark percentage
        System.out.print("Enter the percentage taken from the exam mark: ");
        double examPercentage = input.nextDouble();
        while (examPercentage < 0 || examPercentage > 100) {
            System.out.print("Invalid percentage! Please enter the percentage taken from the exam mark: ");
            examPercentage = input.nextDouble();
        }

        // Input and validate lab mark percentage
        System.out.print("Enter the percentage taken from the lab submission mark: ");
        double labPercentage = input.nextDouble();
        while (labPercentage < 0 || labPercentage > 100) {
            System.out.print("Invalid percentage! Please enter the percentage taken from the lab submission mark: ");
            labPercentage = input.nextDouble();
        }

        // Validate that the total percentage is 100
        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages! The total percentage must add up to 100.");

            System.out.print("Enter the percentage taken from the exam mark: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter the percentage taken from the lab submission mark: ");
            labPercentage = input.nextDouble();
        }

        // Calculate the final mark
        double finalMark = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
        System.out.println("The final mark is: " + finalMark);

        // Close the Scanner object
        input.close();
    }
}
