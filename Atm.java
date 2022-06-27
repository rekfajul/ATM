package main;

public class Atm {



//	Parameters
	private double balance;
	private double withdrawAmount;
	
	

//	Default Constructor
	public Atm() {
		super();
	}

//	Get method for Balance
	public double getBalance() {
		return balance;
	}
  
//	Set method for Balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

//	Get method for withdrawAmount
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
//	Set method for withdrawAmount
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	
}
