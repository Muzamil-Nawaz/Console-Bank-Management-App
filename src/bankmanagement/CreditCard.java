/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;

/**
 *
 * @author ADMIN
 */
public class CreditCard {
    public long cardNumber;
    public double monthlyBoundry;
    public long cusId;
    public long balance;
    public CreditCard(long cardNumber,long cusId,double monthlyboundry){
        this.cardNumber = cardNumber;
        this.cusId = cusId;
        this.monthlyBoundry = monthlyboundry;
        CurrentAccount ca =BankManagement.currentaccounts.get(cusId);
        this.balance = ca.balance;
        
        
    }
    public void setBalance(long l){
        this.balance=l;
    }
    public CreditCard(){}
    public  void withdraw(){
        System.out.print("Enter Amount to Witdraw :");
        long l = BankManagement.sc.nextLong();
        if(BankManagement.currentaccounts.get(BankManagement.id).balance < l)
            System.out.println("Invalid Amount.");
        else{
            
            BankManagement.currentaccounts.get(BankManagement.id).setBalance(BankManagement.currentaccounts.get(BankManagement.id).balance-l);
            System.out.println("Amount withdrawn Successfully\t\t New Balance:"+BankManagement.currentaccounts.get(BankManagement.id).balance);
            
        }
        BankManagement.cardMenu();
        
    }
    public void deposit(){
        System.out.print("Enter Amount to Deposit :");
        long l = BankManagement.sc.nextLong();
        BankManagement.currentaccounts.get(BankManagement.id).setBalance(BankManagement.currentaccounts.get(BankManagement.id).balance+l);
        System.out.println("Amount Deposited  Successfully\t\t New Balance:"+BankManagement.currentaccounts.get(BankManagement.id).balance);
        BankManagement.cardMenu();
            
        
    }
    public void transfer(){
        try{
    
            System.out.print("Enter amount to transfer:");
            long l = BankManagement.sc.nextLong();
            System.out.print("Enter Account number to transfer:");
            long l2 = BankManagement.sc.nextLong();
            CurrentAccount ac1 = BankManagement.currentaccounts.get(l);
            CurrentAccount ac2 = BankManagement.currentaccounts.get(l2);
            if(ac1.balance >=l){
                ac1.setBalance(ac1.balance-l); 
                ac2.setBalance(ac2.balance+l);
                System.out.println("Tansferred Successfully.");
            }
            else
                System.out.println("Invalid Amount.");
            BankManagement.cardMenu();
            }
            catch(Exception e){
                System.out.println("Invalid input .");
                BankManagement.cardMenu();
            }
        
        
    }
    public void checkCustomerAndCurrentBalance(long id){
        try{
           
        
            
        
            System.out.println("Current Balance of account is "+BankManagement.currentaccounts.get(id).balance);
        }
        catch(Exception e){
            System.out.println("Invalid input .");
            BankManagement.cardMenu();
        }
    }
    public String toString(){
        return "[Card Number :"+cardNumber+",Customer Id :"+cusId+","+",Monthly Boundry :"+monthlyBoundry+",Balance:"+balance+"]";
    }
   
}
