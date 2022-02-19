/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1819;

/**
 *
 * @author adina
 */
public class Q5SEM1_1819 {
    public static void main(String[] args) {
        
        double total;
        Delivery D1 = new Delivery("Ali","Ahmad",4.4);
        Delivery D2 = new Delivery("Ah Chong","Fatimah",63.1);
        SpecialDelivery D3 = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        SpecialDelivery D4 = new SpecialDelivery("Ang","Liew ",19.0,true,true);
        System.out.println(D1.toString());
        System.out.println(D2.toString());
        System.out.println(D3.toString());
        System.out.println(D4.toString());
        total=D1.totalCost()+D2.totalCost()+D3.totalCost()+D4.totalCost();
        System.out.println("The total shipping cost is RM "+total);
    }
}
