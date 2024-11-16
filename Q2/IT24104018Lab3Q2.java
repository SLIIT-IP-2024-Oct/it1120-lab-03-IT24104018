
import java.util.Scanner;

public class IT24104018Lab3Q2 { 
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        // Input the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate the OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate the total salary
        double totalSalary = monthlySalary + otAmount;

        // Display the results
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);

        // 
        scanner.close();
    }
}
