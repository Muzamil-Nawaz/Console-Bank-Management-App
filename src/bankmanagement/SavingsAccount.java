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
public class SavingsAccount {
    public long accNO;
    public double interest;
    public long balance=0;
    SavingsAccount(long accNo,double interest){
        this.accNO = accNo;
        this.interest = interest;
        
    }
    public void transfer(){
        
    }
    
}
