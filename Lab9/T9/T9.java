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
public class T9 {
    //1(a)
    /*
    public static boolean compare(Student s,Teacher t){
        if(s.getClass()==t.getClass()){
            return true;
        }else{
            return false;                           }
        
    }
    //(b)
    
    public static boolean isClass(){
        if(s instanceofPerson)
            return true;
        else
            return false;
    }
    */
    public static void main(String[] args) {
     
        //3
        /*
        RegularPay regular = new RegularPay(0.50,8);
        SpecialPay special = new SpecialPay(0.50,8);
        
        System.out.println(regular.toString());
        System.out.println(special.toString());
        */
        
        //4
        
        PurchaseSystem purchase1 = new PurchaseSystem(123,10,8);
        SugarPurchase purchase2 = new SugarPurchase(456,10,5,0.3);
        
        System.out.println(purchase1.toString());
        System.out.println(purchase2.toString());
        
    }
}
