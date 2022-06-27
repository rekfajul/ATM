package main;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmInterface ai=new AtmInterfaceImpl();
		
		int atmNumber=12345;//Already set ATM_Number
		int atmPin=1234;//Already set ATM_pin
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to ATM Machine\n");
//		Taking user input
		System.out.println("Enter your ATM Number:");
		int enteredAtmNumber=sc.nextInt();//ATM_Number user is entering
		System.out.println("Enter your PIN:");
		int enteredAtmPin=sc.nextInt();//ATM_pin user is entering
//		If the entered ATM_Number and entered ATM_pin is matching than Validation is successful.
		if((atmNumber==enteredAtmNumber)&&(atmPin==enteredAtmPin)) {
			System.out.println("Validation successful!!!\n");
			
			while(true) {
				System.out.println("1.View Available Amount.\n"
						+ "2.Withdraw Amount.\n"
						+ "3.Change the ATM Pin\n"
						+"4.Exit\n");
				System.out.println("Enter your choice:");
				int choice=sc.nextInt();
				if(choice==1) {
					ai.viewBalance();
				}
				else if(choice==2) {
					
					System.out.println("Enter the amount you want to withdraw:");
					double withdraw=sc.nextDouble();
					ai.withdrawAmount(withdraw);
				}
				else if(choice==3) {
					System.out.println("Please enter your new pin");
					int pin=sc.nextInt();
					ai.changePin(pin);
					atmPin=pin;
					
				}
				else if(choice==4) {
					System.out.println("Please collect you card,Thank you!!\n"+
				"Visit Again!!");
					System.exit(0);
				}
				else {
					System.out.println("Invalid Choice,Please enter a valid choice\n");
					
				}
				
			}
		}
		else {
			System.out.println("Sorry!! Entered ATM_Number and ATM_pin was wrong");
			System.exit(0);
		}

	}

}
