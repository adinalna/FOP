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
public class SugarPurchase extends PurchaseSystem{
    private double sugarWeight;

    public SugarPurchase(int code, int quantity, double unitPrice,double sugarWeight) {
        super(code, quantity, unitPrice);
        this.sugarWeight = sugarWeight;
    }
    
    public double TotalPrice(){
        return quantity*unitPrice*sugarWeight;
    }
    
}
    
   
