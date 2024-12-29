/******************************************************************************

                   The Trimmer Team's Mortgage Calculator
    
                            Creator: Joel Trimmer
                            Date: 12/17/2024
                            Version: 1.1.1

*******************************************************************************/
import java.util.Scanner;

public class Mortgage_Calculator
{
	public static void main(String[] args) {
	        double annualInterestRate = 0;
            int numberOfYears = 0;
            double loanAmount = 0;
            double monthlyPayment = 0;
            double monthlyInterestRate = 0;
	        double totalPayment = 0;
	    
	    // Scanner object allows input
		Scanner input = new Scanner(System.in);
        // Welcome to our Mortgage calculator And ask for the annual interest rate they want
        System.out.print("Hello, welcome to The Trimmer Teams Mortgage Calculator.\n" +
         "First off please enter the annual interst rate you would like.");  
        // Get the interest rate
         annualInterestRate = input.nextDouble();
        // Calculate the monthly interest rate
         monthlyInterestRate = (annualInterestRate / 1200);
        // Ask for the amount of years customer wants to have the loan.
        System.out.print("How many years would you like to have the mortgage?");
        // Get the amount of years
         numberOfYears = input.nextInt();
        // Ask for the Loan amount
        System.out.print("What is the amount you would like your loan to be?");
        // Get the loan amount.
         loanAmount =  input.nextDouble();
        // calculate the monthly payment
         monthlyPayment = (loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        // calculate the total payment
         totalPayment = (monthlyPayment * numberOfYears * 12);
        // print out payment
        System.out.println("Your monthly payment is $" + (int)(monthlyPayment * 100 / 100.0));
        // print out totalPayment
        System.out.println( "Your total payment is $" + (int)(totalPayment * 100 / 100.0));
        // Thank you statement
        System.out.print("Thank you for using the Trimmer Teams Mortgage Calculator. Have a great day!");
	}
}
