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
public class L10Q2 {  
    public static void main(String[] args) {
        
        SavingAccount interest1 = new SavingAccount(1000);
        FixedAccount interest2 = new FixedAccount(2000);
        Testing(interest1);
        Testing(interest2);
    }
    
    public static void Testing(Interest a){
        System.out.printf("Interest: %.2f\n", a.computeInterest());
    }
}
