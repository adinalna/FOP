/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T10Q1;

/**
 *
 * @author adina
 */
public class BulkDiscount extends DiscountPolicy{
    public double min,discountRate;

    public BulkDiscount(double min, double discountRate) {
        this.min = min;
        this.discountRate = discountRate;
    }
            
    public double computeDiscount(int count, double itemCost){
        if(count>min)
            return count*itemCost-(count*itemCost*discountRate);
        else
            return count*itemCost;
    }
}
