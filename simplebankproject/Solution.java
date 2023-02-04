
package com.simplebankproject;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank bank = new BankImpl(10000);
		while(true)
		{
			System.out.println("1:Deposit Amount\n2:Withdraw Amount\n3:Check Balance\n4:Exit\n");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Amount to be Deposited:");
				int amountToDeposit= scan.nextInt();
				bank.deposit(amountToDeposit);	//	bank.deposit(scan.nextInt());
				break;
			}
			case 2:
			{
				System.out.println("Enter Amount to be Withdrawn::");
				int amountToWithdraw= scan.nextInt();
				bank.withdraw(amountToWithdraw);	//	bank.withdraw(scan.nextInt());
				break;
			}
			case 3:
			{
				System.out.println(bank.getBalance());
				break;
			}
			case 4:
			{
				System.out.println("Thank u\n");
				break;
			}
			default:
			{
				System.out.println(bank.displayErrorMessage());
			}//end of switch 
			//after switch
			}//end of while loop

		}
	}
}
