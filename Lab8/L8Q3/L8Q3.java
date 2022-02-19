num/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q3;

/**
 *
 * @author adina
 */

public class L8Q3 {
    public static void main(String[] args) {
        
        WeightCalculator person1 = new  WeightCalculator();
        person1.Input(18, 176);
        person1.CalRecommendedWeight();
        person1.Display();
        
    }
}
