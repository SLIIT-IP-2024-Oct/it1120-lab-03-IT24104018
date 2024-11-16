
import java.util.Scanner;

public class IT24104018Lab3Q4 { 
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the input is a valid five-digit number
        if (number >= 10000 && number <= 99999) {
            // Extract and print each digit
            int digit1 = number / 10000;          // First digit
            int digit2 = (number / 1000) % 10;    // Second digit
            int digit3 = (number / 100) % 10;     // Third digit
            int digit4 = (number / 10) % 10;      // Fourth digit
            int digit5 = number % 10;            // Fifth digit

            System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
        } else {
            // Print an error message for invalid input
            System.out.println("Error: Please enter a valid five-digit number.");
        }

        // Close the scanner
        scanner.close();
    }
}
