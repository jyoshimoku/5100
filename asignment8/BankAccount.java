package hw8;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	static int money,balance,depos,post,save;
	static Scanner input = new Scanner(System.in);
	public static void option() {
		while(true) {
			System.out.println("Please enter the nember what you want to do.");
			System.out.println("1.Deposit money 2.Use money 3.Print your balance 4.Quit");
		 
			int count = input.nextInt();
			switch (count) {
			case 1: {
			deposit()	;
				
			}
			case 2: {
				 
                if(balance==0){
                    
                    System.out.println("Sorry You Dont Have Enough Balance to use.");
                 
                    option();
                }
                else{
                use();}	
			break;	
			}
			
		    case 3: {
		    	bal();
			break;	
			}
			
		    case 4: {
		    	System.out.println("GoodBye! Thank You.");
		    	System.exit(0);
		    	break;	
			}
			default:
				System.out.println("Please reenter the number.");
			}
			
		}
	} 
	
	//use money
	public static void use (){	
		
		System.out.println("Please entre the number of money for using");
		money = input.nextInt();
		if(money>balance){
            System.out.println();
            System.out.println("Sorry You Dont Have enough Balance to use. ");
            System.out.println();
            use();
        }
        else{
        	System.out.println("Successfully use $"+money+"in your account");
 	
        	calculateWithd(money);
            option();
        }

		    }

	public static void deposit () {
		
		System.out.println("Please enter the nember of money you want to deposit.");

		save = input.nextInt();
        System.out.println("Successfully Deposited $"+save+" in your account");
		calculateDepot(save);
	
	}
	
	public static void calculateDepot(int depot){
        balance=balance+depot;
        option();
    }
	
	public static void calculateWithd(int withd){
        balance=balance-withd;
        option();
    }
	
  
    public static void bal(){
    	
             System.out.print("Your Balance is "+ balance+" $\r");
    	 
        option();
    }
	
public static void main(String[] args) {
	
	System.out.println("Welcome the programe of dispenses Currency.");
option();
	
	
}
}
