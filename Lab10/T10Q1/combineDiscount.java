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
public class combineDiscount extends DiscountPolicy{
    public DiscountPolicy policy1;
    public DiscountPolicy policy2;

    public combineDiscount(DiscountPolicy policy1, DiscountPolicy policy2) {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }
    
    
    
    public double computeDiscount(int count, double itemCost){
      
            
    }
    
}
