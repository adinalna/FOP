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
public class L8Q2 {
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount(2000000,"Lalisa Manoban","08083271997");
        Acc1.ShowBalance();
        Acc1.Deposit(300);
        Acc1.Withdraw(50);
        Acc1.ShowBalance();
    }
}
