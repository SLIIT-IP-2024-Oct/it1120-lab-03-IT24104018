
import java.util.Scanner;

public class IT24104018Lab3Q1A {

    public static void main(String[] args) {

        //declare the variables
        double pricePerKg, quantity, totalAmount;

        //Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the price per kilogram of rice
        System.out.print("Enter the price of 1kg: ");
        pricePerKg = input.nextDouble();

        //Prompt the user to enter the number of kilogrames they want to buy
        System.out.println("Enter the number of kilograms you wqant to buy:");
        quantity = input.nextDouble();

        //Calculate the total amount to be paid 
        totalAmount = pricePerKg = quantity;

        //Display the total amount
        System.out.println();
        System.out.println("The total amount is: " + totalAmount);

    }
}
