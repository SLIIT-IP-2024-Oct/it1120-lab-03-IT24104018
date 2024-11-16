
import java.util.Scanner;

public class IT24104018Lab3Q1B { 
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Prompt user for number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate the total amount
        double totalAmount = pricePerKg * kilograms;

        // Calculate the discount amount (10%)
        double discount = totalAmount * 0.10;

        // Calculate the final amount after the discount
        double finalAmount = totalAmount - discount;

        // Display the results
        System.out.printf("The total amount before discount is:%.2f\n", totalAmount);
        System.out.printf("The discount is:%.2f\n",discount);
        System.out.printf("The total amount to pay after discount is: %.2f\n",finalAmount);

      
        scanner.close();
    }
}
