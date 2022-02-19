package T9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adina
 */
public class PurchaseSystem {
    protected int code, quantity;
    protected double unitPrice;

    public PurchaseSystem(int code, int quantity, double unitPrice) {
        this.code = code;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        
    }
    
    public double TotalPrice(){
        return quantity*unitPrice;
    }

    public String toString() {
        return "PurchaseSystem\nProduct code: " + code + "\nQuantity: " + quantity + "\nUnit price: " + unitPrice+"\nTotal price: "+TotalPrice()+"\n";
    }
    
    
    
}
