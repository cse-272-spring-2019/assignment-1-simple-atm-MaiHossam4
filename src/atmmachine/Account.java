package atmmachine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */



import java.text.DecimalFormat;
import java.util.*;

public class Account {
    Stack<Double> stack = new Stack<Double>(); 
ArrayList<Double> array = new ArrayList<Double>();
	
	Scanner input = new Scanner(System.in);
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
        private int count=-1;
          private double  [] arr =new double [4];
	  private double Amount;
	
	
	
	/* Set the customer number */

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	/* Get the customer number */

	public int getCustomerNumber() {
		return customerNumber;
	}

	/* Set the pin number */

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	/* Get the pin number */

	public int getPinNumber() {
		return pinNumber;
	}

	/* Get Checking Account Balance */

	public double getCheckingBalance() {
		return checkingBalance;
	}

	

	/* Calculate Checking Account withdrawal */

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	

	/* Calculate Checking Account deposit */

	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
                
		return checkingBalance;
	}

	

	/* Customer Checking Account Withdraw input */

	public double getCheckingWithdrawInput(double withdraw) {
		System.out.println("Checking Account Balance: " + checkingBalance);
		System.out.print("Amount you want to withdraw from  Account: ");
		double amount = withdraw;
		
		if ((checkingBalance - amount) >= 0) {
			double newBalnce =calcCheckingWithdraw(amount);
			
			   History(amount);
			
			return newBalnce;
			
			 
			 } 
		 else {
			System.out.println("you dont have enough balacne" + "\n");
		}return 0;
                
		}  
        
        
        
        
   private double [] History(double amount){
        double history[]=new double[5];
                                       
               stack.push(amount);
	    for(int i =0; i<=4; i++){
           
                history[i]=stack.pop() ; 
                
            } 
            return history;
                   }            
	

	/* Customer Checking Account Deposit input */

	public double getCheckingDepositInput(double deposite ) {
		
		
		double amount = deposite;

		if ((checkingBalance + amount) >= 0) 
		checkingBalance=calcCheckingDeposit(amount);
	           return (checkingBalance) ;  
                             
		
               
	}

	

	
}
