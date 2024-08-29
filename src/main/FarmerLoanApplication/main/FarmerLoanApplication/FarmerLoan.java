package main.FarmerLoanApplication;
import java.util.Scanner;

class Farmer
{
	float loanAmount;
	float totaltenure;
	float simpleInterest;
	
	static float rateOfInterest;
	
	static
	{
		rateOfInterest = 2.5f;
	}
	
	void inputFromFarmer()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello Farmer, kindly please enter the loan amount you want ?");
		loanAmount = scan.nextFloat();
		
		System.out.println("Farmer, can you also please enter the total tenure for which you need the loan amount ?");
		totaltenure = scan.nextFloat();       
	}
	
	void computeSimpleInterest()
	{
		simpleInterest = (loanAmount * totaltenure * rateOfInterest)/100 ;
	}
	
	void displayMessage()
	{
		System.out.println("Your Simple Interest amount for the Loan taken is :" + simpleInterest);
	}
	
	void callAllMethods()
	{
		inputFromFarmer();
		computeSimpleInterest();
		displayMessage();
	}
	
}

public class FarmerLoan 
{

	public static void main(String[] args) 
	{

		Farmer farmer1 = new Farmer();
		Farmer farmer2 = new Farmer();
		
		System.out.println("Farmer 1: ");
		farmer1.callAllMethods();
		
		System.out.println("Farmer 2: ");
		farmer2.callAllMethods();

	}

}


