/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q6;

/**
 *
 * @author adina
 */
public class L8Q6 {
    public static void main(String[] args) {
        
        BurgerStall stall1 = new BurgerStall("Ramlis");
        BurgerStall stall2 = new BurgerStall("McD");
        
        stall1.Sold(200);
        stall1.Sold(100);
        stall2.Sold(400);
        
        stall1.DisplaySold();
        stall2.DisplaySold();
        
        BurgerStall.DisplaySoldAll();
        
        
    }
}
