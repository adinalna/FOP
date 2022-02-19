/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q4;

/**
 *
 * @author adina
 */
public class L8Q4 {
    public static void main(String[] args) {
        
        Fraction ratio1 = new Fraction();
        ratio1.Input(20,10);
        System.out.println("Numerator: "+ratio1.getNumerator());
        System.out.println("Dominator: "+ratio1.getDominator());
        ratio1.DisplayFraction();
    }
}
