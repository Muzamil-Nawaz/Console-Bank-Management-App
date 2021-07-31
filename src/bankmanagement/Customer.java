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
public class Customer {
    public long customerId,accountNo;
    public String name, email,profession,type,manager;
    Customer(long customerId,String name,String email, String profession,String manager,String type,long accountNo){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.profession = profession;
        this.type = type;
        this.manager = manager;
        this.accountNo = accountNo;
    }
    public String toString(){
        if(this.type.equalsIgnoreCase("vip"))
            return "Customer [Id:"+this.customerId+",Name:"+this.name+",Email :"+this.email+",Profession:"+this.profession+",Manager:"+this.manager+"]";
        else
            return "Customer [Id:"+this.customerId+",Name:"+this.name+",Email :"+this.email+",Profession:"+this.profession+",Type:"+this.type+"]";
    }
}
