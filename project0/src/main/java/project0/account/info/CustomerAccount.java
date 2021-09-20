package project0.account.info;

public class CustomerAccount {

	protected int ID;
    protected String name;
    protected String phone;
    protected String email;
    protected boolean jointaccount;
   
    protected int accountNumber;
    protected String type;
    protected double balance;
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
	
	public boolean getjointaccount() {
		return jointaccount;
	}
	public void setjointaccount(boolean jointaccount) {
		this.jointaccount = false;
	}
	
	
}
