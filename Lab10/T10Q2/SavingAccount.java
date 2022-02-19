/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T10Q2;

/**
 *
 * @author adina
 */
public class SavingAccount implements Interest{
    public double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }
    
    public double computeInterest(){
         return balance*0.5/12;
    }
}
