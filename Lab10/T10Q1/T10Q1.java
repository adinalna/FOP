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
public class T10Q1 {
    public static void main(String[] args) {
        
        BulkDiscount disc1 = new BulkDiscount(5,0.1);
        OtherDiscount disc2 = new OtherDiscount();
        //combineDiscount disc2 = new combineDiscount();
        
        Testing(disc1);
        Testing(disc2);
        
    }    
        public static void Testing(DiscountPolicy a){
            System.out.println("The Discount Price: "+a.computeDiscount(5, 25));
        }
}
