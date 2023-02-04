
package com.simplebankproject;

public class BankImpl implements Bank
{
	private int balance;
	BankImpl(int balance)// using constructor initialize the Available amount object in to constructor
	{
		this.balance = balance;
	}
	public void deposit(int amount)
	{
		System.out.println("Despositing Rs."+amount);
		balance = balance + amount; // balance += amount;
		System.out.println("Amount Deposited Successfully");
	}
	public void withdraw(int amount)
	{
		if(amount<=balance)
		{
			System.out.println("Withdraw Rs."+amount);
			balance = balance - amount; // balance -= amount;
			System.out.println("Amount Withdraw Successfully");
		}
		else
		{
			//Invoke an Exception and handle it using try and catch block
			//InsufficientbalanceException
			try
			{
				throw new InvalidBalanceException("Insufficient Balance!");
			}
			catch(InvalidBalanceException e) 
			{
				System.out.println(e.getMessage());  //InvalidBalanceException return the message so print or store it
			}
		}
	}
	@Override
	public String  getBalance() {
		// TODO Auto-generated method stub
		return ("Available Balance: "+balance+"\n");
	}
	@Override
	public String displayErrorMessage() {
		// TODO Auto-generated method stub
		return "Invalid Choice, Kindly Enter valid choice\n";
	}
}
