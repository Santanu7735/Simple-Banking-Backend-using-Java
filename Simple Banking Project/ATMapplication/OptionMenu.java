package ATMapplication;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class OptionMenu extends Accounts
{
		int selection;// using for switch case statement
	
	Scanner menuInput = new Scanner(System.in);
//	DecimalFormate moneyFormat = new DecimalFormat(

	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	
//	Validate login information
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				data.put(1072, 7788);
				data.put(2043, 9944);
				
				System.out.println("Welcome to My ATM");
				
				System.out.println("Enter your Last 4-digitof your Account Number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin Number");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e) {
				System.out.println("\n"+ "invalid Charecter(s).only Numbers."+ "\n");
				x = 2;
				
			}
			for(Entry<Integer, Integer> entry:data.entrySet()) {
				if(entry.getKey() == getCustomeNumber() && entry.getValue() == getPinNumber()) {
				getAccountType();
				}
				
			}
			
		}
		while(x==1);
		
	}

//		== == display acc type menu with selection
	
	public void getAccountType() {

		System.out.println("Select The Option You Want To Access : ");
		System.out.println("Type 1 - Accounts Services");
		System.out.println("Type 2 - Savings Account");
		System.out.println("Type 3 - Exit ");
		System.out.println("Choice:");
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("successfully Exit");
			System.out.println("Thank You For using ATM");
			break ;
		default:
			System.out.println("Invalid Input");
			getAccountType();
		}
	
}

	private void getChecking() {
		
		System.out.println("Select The Account You Want To Access : ");
		System.out.println("Type 1 - For Checking Account Balance");
		System.out.println("Type 2 - For Withdral Funds");
		System.out.println("Type 3 - For Deposit Funds ");
		System.out.println("Type 4 - For Exit ");
		System.out.println("Choice:");
		
	selection = menuInput.nextInt();
		
		switch (selection) {
		
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdralInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break ;
		case 4:
			System.out.println("successfully Exit");
			System.out.println("Thank You For using ATM");
			break ;
		default:
			System.out.println("Invalid Input");
			getChecking();
		}

	}
private void getSaving() {
	
		System.out.println("Savings Account Balance : " + moneyFormat.format(getSavingBalance()));
		System.out.println("Type 1 - View Account Balance");
		System.out.println("Type 2 - Withdral Funds");
		System.out.println("Type 3 - Deposit Funds ");
		System.out.println("Type 4 - Exit ");
		System.out.println("Choice:");
		
	selection = menuInput.nextInt();
		
		switch (selection) {
		
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdralInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break ;
		case 4:
			System.out.println("successfully Exit");
			System.out.println("Thank You For using ATM");
			break ;
		default:
			System.out.println("Invalid Input");
			getChecking();
		}
	
}


	
}
