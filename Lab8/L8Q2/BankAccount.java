/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q2;

/**
 *
 * @author adina
 */
public class BankAccount {
    private double balance;
    private String name, IC;

    public BankAccount(double balance, String name, String IC) {
        this.balance = balance;
        this.name = name;
        this.IC = IC;
    }
    
    public void Deposit(int deposit){
        balance+=deposit;
        System.out.println("Deposit amount: "+deposit);
    }
    
    public void Withdraw(int withdraw){
        balance-=withdraw;
        System.out.println("Balance amount: "+withdraw);
    }
    
    public void ShowBalance(){
        System.out.println("Current balance: "+balance);
    }
    
    
}
