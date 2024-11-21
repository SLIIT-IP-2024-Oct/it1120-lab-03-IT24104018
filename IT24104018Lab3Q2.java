import java.util.Scanner;
public class IT24104018Lab3Q2{
	public static void main (String[]args){
	
	double monthlySalarry, OT_hours,OT_rate,OT_amount,Toatal_salary;
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print ("Enter the monthly salary : ");
	monthlySalarry = input.nextDouble();

	System.out.print("Enter the number of OT hours : ");
	OT_hours = input.nextDouble();
	
	System.out.print ("Enter the OT hourly rate : ");
	OT_rate = input.nextDouble();

	
	OT_amount = OT_hours * OT_rate;
	
	Toatal_salary = monthlySalarry + OT_amount;
	
	System.out.print ("The total salary including OT is : " + Toatal_salary );
	
	
	
		
	
	
	}








}