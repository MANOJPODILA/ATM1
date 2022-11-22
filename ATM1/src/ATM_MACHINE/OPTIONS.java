package ATM_MACHINE;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OPTIONS extends ACCOUNT{
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat Dec = new DecimalFormat("@,@@@,0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();
	
	 void getLogin() throws IOException {
		 int x = 1; 
		 do {
			 try {
				 data.put(7993573, 1803);
				 data.put(949120, 1847);
				 
				 System.out.println("WELCOME TO ATM ");
				 System.out.println("ENTER your customer number : ");
				 SetCustomerNumber(sc.nextInt());
				 
				 System.out.println("enter pin number : ");
				 SetPinNumber(sc.nextInt());
			 }
			 catch (Exception e){
				 System.out.println("\n" +  "Invalid number " + "\n");
				 x=2;
			 }
			 int cn = getCustomerNumber();
			 int pn = getPinNumber();
			 if(data.containsKey(cn) && data.get(cn) == pn) {
				 getAccountType();
			 }
			 else {
				 System.out.println("wrong pin number or wrong account number ");
				 
			 }
			 
		 }
		 while(x==0);
		
	}

	private void getAccountType() 
	{
		System.out.println("select accounnt type you are wanted to access : ");
		System.out.println("select 1  Checkingamount");
		System.out.println("select 2  SavingsAmount");
		System.out.println("select 3 exit ");
		
		int selection = sc.nextInt();
		switch  (selection) {
		case 1 : 
			getChecking();
			break;
		case 2 :
			getSaving();
			break;
		case 3 :
			System.out.println("Thank you for using the application");
			break;
		default : 
			System.out.println("Incorrect ");
			break;
		}
		
	}

	private void getChecking() {
		System.out.println("checking amount: ");
		System.out.println("Type-1 view Balance ");
		System.out.println("Type-2 Withdraw funds");
		System.out.println("Type-3 Deposit Funds");
		System.out.println("Type-4 Exit");
		System.out.println("choice : ");
		int selection  = sc.nextInt();
		switch(selection) {
		case 1:
			System.out.println("checking Account Balance : " +Dec.format(checkingBalance()));
			getAccountType();
			break;
		case 2: 
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("thank you for using our application ");
			break;
		default:
			System.out.println("Invalid choice ");
			getChecking();
			
		}
		
	}


	private void getSaving() 
    {
		System.out.println("View Checking : ");
		System.out.println("Type-1 to view balance ");
		System.out.println("Type-2 withdraw funds ");
		System.out.println("Type-3 Deposit Funds ");
		System.out.println("Type-4 exit ");
		System.out.println("Choice : ");
		
		int selection = sc.nextInt();
		
		switch (selection) {
		case 1 :
			System.out.println("view balance is : "+Dec.format(savingBalance()));
			break;
		case 2 :
			getSavingWithdrawInput();
			System.out.println();
			break;
		case 3 :
			getSavingDepositInput();
			System.out.println();
		case 4:
			System.out.println("Thank you for using our application");
			break;
		default :
			System.out.println("invalid ");
			break;
		}
		
		
		
// TODO Auto-generated method stub
		
	}

	

}
