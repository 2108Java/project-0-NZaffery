package com.accounts;
public abstract class Account {
	
	
	public interface java {

	}

	protected static int accountsCount=0;
	
	
	
	protected int accountNumber;
	protected String type;
	protected double balance;
	protected Customer owner;
	protected int ownerID;
	
		public Account() {
			accountNumber = ++accountsCount;
			balance = 0;
			
		}
	
		public Account(Customer owner, double balance) {
			accountNumber = ++accountsCount;
			this.balance = balance;
			this.owner = owner;
			this.ownerID = owner.getID();
		
			
			
		}
	
		public  void makeWithdrawl(double amount) {
			balance -= amount;
			if(balance < 0)
				throw new IllegalArgumentException("Account cannot be negative, Please Try another amount!");
			if(amount == -amount)
				throw new IllegalArgumentException("You cannot withdraw a negative amount, please check your input and try again.");
		}
			
			
	
		
		
		
		public void makeDeposit(double amount) {
			balance += amount;
			if(amount == -amount)
				throw new IllegalArgumentException("You cannot deposit a negative amount, please check your input and try again.");
		}
		
		public int getAccountNumber() {
			return accountNumber;
		}
		
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
			
		}
		public double getBalance() {
			
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public Customer getOwner() {
			return owner;
		}
		
		public void setOwner(Customer owner) {
			this.owner= owner;
			
		}
		public String getType() {
			return type;
		}
		
		public static int getAccountsCount() {
			return accountsCount;
		}
		public static void setAccountsCount(int accountsCount) {
			
			Account.accountsCount = accountsCount;
		}
		
		public int getOwnerID() {
			return ownerID;
		}
}