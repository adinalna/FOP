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
public class SpecialDelivery extends Delivery{
    private boolean weekend,night;

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekend, boolean night) {
        super(sender, recipient, weight);
        this.weekend=weekend;
        this.night=night;
    }
    
     public double totalCost(){
        if (weekend==true&&night==true)
            return (super.totalCost()+50)*1.20;
        else if(weekend==true)
            return super.totalCost()+50;
        else if(night==true)
            return super.totalCost()*1.20;
        return 0;
     }
    public String toString() {
        if (weekend==true&&night==true)
            return super.toString()+"Weekend Delivery\nNight Time Delivery\n";
        else if(weekend==true)
            return super.toString()+"Weekend Delivery\n";
        else if(night==true)
            return super.toString()+"Night Time Delivery\n";
        return null;
    }
}
