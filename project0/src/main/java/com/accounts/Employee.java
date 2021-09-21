package com.accounts;


public class Employee {
	
	protected int employeeID;
	protected String name;
	protected boolean isAdmin;
	
	
	
		public Employee(int employeeID) {
			
			this.employeeID= ++employeeID;
			employeeID=0;
		}
		public boolean getisAdmin() {
			System.out.println("Admin: "+ isAdmin);
			return isAdmin;
		}
		public void setisAdmin(boolean isAdmin){
			this.isAdmin= isAdmin;
		}
		
}
