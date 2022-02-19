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
public class OtherDiscount extends DiscountPolicy{
    
    public double computeDiscount(int count, double itemCost){
        if(count>=1&&count<=2)
            return count*itemCost;
        
        else if(count>=3&&count<=5)
            return count*itemCost*0.90;
        
        else if(count>=6&&count<=8)
            return count*itemCost*0.80;
            
        else if(count>8)
            return count*itemCost*0.70;
        else
            return 0;
    }  
}
