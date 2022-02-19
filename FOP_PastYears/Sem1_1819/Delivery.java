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
public class Delivery {
    private String sender,recipient;
    private double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost(){
        if(weight<=5)
            return weight*2.80;
        else if(weight<=20)
            return (5*2.80)+((weight-5)*5.20);
        else if(weight<=50)
            return (5*2.80)+(15*5.20)+((weight-20)*7.00);
        else if(weight>50)
            return (5*2.80)+(15*5.20)+(30*7.00)+((weight-50)*8.60);
        return 0;
    }

    public String toString() {
        return "From : "+sender+" To: "+recipient+"\nWeight of Package : "+weight+" kg\nShipping Cost : RM"+totalCost()+"\n";
    }
    
    
}
