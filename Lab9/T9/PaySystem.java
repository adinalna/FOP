/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T9;

/**
 *
 * @author adina
 */
public class PaySystem {
    protected double payRate;
    protected int hours;

    public PaySystem(double payRate, int hours) {
        this.payRate = payRate;
        this.hours = hours;
    }
    
    public double TotalPay(){
        return hours*payRate;
        
    }
    
    public String toString() {
        return "Total Payment: "+TotalPay();
    }
    
    
}
