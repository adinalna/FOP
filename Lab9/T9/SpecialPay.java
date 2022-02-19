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
public class SpecialPay extends PaySystem{
    

    public SpecialPay(double payRate, int hours) {
        super(payRate, hours);
        this.payRate=payRate;
        this.hours=hours;
    }
    
    
    public double TotalPay(){
        return (super.TotalPay()*0.3)+super.TotalPay();
    }

    
     
    
}
