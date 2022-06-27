package main;
import java.util.*;

public class AtmInterfaceImpl implements AtmInterface {
	
	Scanner sc= new Scanner(System.in);
	

	Atm atm= new Atm();
	
	MainClass mc=new MainClass();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("The available balance in your account is "+atm.getBalance()+"\n");

	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		
		// TODO Auto-generated method stub
		if(atm.getBalance()==0)
			System.out.println("Your available amount is 0.0\n"+"Withdraw unsuccessfull\n");
		else if(atm.getBalance()<withdrawAmount) 
			System.out.println("Insufficient amount\n");
		else if(withdrawAmount<0) {
			System.out.println("Amount can't be negetive\n"+"Please enter correct amount");
			withdrawAmount=sc.nextDouble();
			withdrawAmount(withdrawAmount);
		}
		else {
		System.out.println("Withdraw successfull!!");
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}

	}

	@Override
	public void changePin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("Your new ATM pin is "+pin);
		
      
	}

}
