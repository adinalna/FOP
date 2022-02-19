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
public class BurgerStall {
    private String ID;
    private int burgerSold;
    private static int burgerSum=0;

    public BurgerStall(String ID) {
        this.ID = ID;
        burgerSold=0;
    }
    
    public void Sold(int burger){
        burgerSold+=burger;
        burgerSum+=burgerSold;
    }
    
    public void DisplaySold(){
        System.out.println("Burger Stall "+ID+" sold "+burgerSold+" burgers");
        
    }
    
    public static void DisplaySoldAll(){
        System.out.println("Total burgers sold for all stalls: "+burgerSum);
    }
    
    
    
    
 
    
   
    
   
        
    
    
}



