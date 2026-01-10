package ATMapplication;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {

	private int customerNumber ;
	private int pinNumber ;
	private double savingBalance ;
	
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
//	set the customer number 
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
//	Get the customer number
	public int getCustomeNumber() {
		return customerNumber;
	}
//           	==--==
	
//	set the customer pinNumber
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
//	Get the customer pinNumber
	public int getPinNumber() {
		return pinNumber;
	}
//            	==--==
	
//	Get the checkBalance
	
	public double getCheckBalance() {
		return savingBalance;
	}
//				==--==
	
//	Get the savingBalance
	
	public double getSavingBalance() {
		return savingBalance;
	}
//	            ==--==
//		Calculate Checking Account Withdrawal
	
	public double calCheckingWithdrawal(double amount) {
		savingBalance = (savingBalance - amount) ;
		return savingBalance;
	}
//  					  ==--==
//			Calculate Savings Account Withdrawal amount
	
	public double calSavingWithdrawal(double amount) {
		savingBalance = (savingBalance - amount) ;
		return savingBalance;
	}
//	 		Calculate SavingsAccount deposit amount
	
	public double calCheckingDeposit(double amount) {
		savingBalance = (savingBalance + amount) ;
		return savingBalance ;
	}
	
//		Calculate SavingsAccount Withdraw amount
	
	public double calSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount) ;
		return savingBalance;
	}
		
//	=== Customer Checking Account Withdral Input ====
	
	public void getCheckingWithdralInput() {
		System.out.println("Your Account Balance : " + moneyFormat.format(savingBalance));
		System.out.println("Put Amount you want to withdral from Account Account");
		double amount = input.nextDouble();
		if ((savingBalance - amount) >0) { 
			calCheckingWithdrawal(amount);
			System.out.println("Successfully withdral == Take your Cash ");
			System.out.println("New Checking Account Balance : " + moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be Negetive." + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println(" Account Balance : " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from Saving Account :");
		double amount = input.nextDouble();
	
	if ((savingBalance + amount) >= 0) { 
		calSavingDeposit(amount);
		System.out.println("Successfully Deposited");
		System.out.println("New Account Balance : " + moneyFormat.format(savingBalance));
		}
	else {
		System.out.println("Balance cannot be negative");
	}
	
	}	
	
}
		
	