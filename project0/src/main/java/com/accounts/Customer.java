package com.accounts;


public class Customer {

	
	
	protected static int customerCount=0;
	protected int ID;
	protected String name;
	protected String phone;
	protected String email;
	protected boolean approved;

	
	
	
	 public Customer(String name, String phone, String email, boolean approved) {
	        ID = ++customerCount;
	        this.name = name;
	        this.phone = phone;
	        this.email = email;
	        this.approved=approved;
	        approved=false;
	    }
	
	
	public int getID() {
		// TODO Auto-generated method stub
		return ID;}
	public void setID(int ID) {
		this.ID =ID;
		
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		
		this.name = name;
	}
	public String getphone() {
		
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
		
	}

	public static int getCustomerCount() {
		return customerCount;
	}
	public static void setCustomerCount(int customerCount) {
		Customer.customerCount= customerCount;
	}
	public boolean getapproved() {
		return approved;
		
	}
	public boolean setapproved(boolean approved) {
		return this.approved=approved;
	}
	
	
}
