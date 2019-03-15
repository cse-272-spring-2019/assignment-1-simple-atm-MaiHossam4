/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public interface PublicinterfaceATM {
    
    
    public int setCustomerNumber(int customerNumber);
    public int getCustomerNumber();
    public int setPinNumber(int pinNumber);
    public int getPinNumber();
    public double getCheckingBalance();
    public double calcCheckingWithdraw(double amount);
    public double calcCheckingDeposit(double amount);
    public double getCheckingWithdrawInput(double withdraw);
    public double getCheckingDepositInput(double deposite );
    
    
    
    
    
    
}
