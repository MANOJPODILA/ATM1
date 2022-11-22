package ATM_MACHINE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ACCOUNT {
	
	private int pinNumber;
	private int customerNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat money = new DecimalFormat("'$$',###,0.0");
	
	public int SetCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	public int getCustomerNumber() {
		return customerNumber;
		
	}
	
	public int SetPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;	
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public double checkingBalance() {
		return checkingBalance;
	}
	public double savingBalance() {
		return savingBalance;
	}
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance-amount);
		return checkingBalance;
	}
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance-amount);
		return savingBalance;
	}
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance+amount);
		return checkingBalance;
	}
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance+amount);
		return savingBalance;
	}
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance  " +money.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Amount :");
		double amount = sc.nextDouble();
		
		if((checkingBalance-amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New cheecking account Balance : "+money.format(checkingBalance));
		}
		else {
			System.out.println("Balance cannot be negative ");
		}
		
	}
	public void getSavingWithdrawInput() {
		System.out.println("saving account balance :"+money.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving account ");
		double amount = sc.nextDouble();
		
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance : " +money.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be negative :");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Checking Account Balance : "+money.format(savingBalance));
		System.out.println("Amount you want to deposit from checking amount: ");
		double amount = sc.nextDouble();
		
		if((savingBalance+amount)>=0) {
			calcSavingDeposit(amount);
			System.out.println("New Checking Amount Balance : " +money.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be negative :");
		}
		
	}
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance : "+money.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking amount: ");
		double amount = sc.nextDouble();
		
		if((checkingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Amount Balance : " +money.format(checkingBalance));
		}
		else {
			System.out.println("Balance cannot be negative :");
		}
	}
	
	

}
