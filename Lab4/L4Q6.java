/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q6;

/**
 *
 * @author adina
 */

import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int random_number = r.nextInt(Integer.MAX_VALUE);
        System.out.println("Random number is " + random_number);
        String random_number_string = Integer.toString(random_number);
        System.out.println("The number of digit is " + random_number_string.length());
        
                
    }
    
}
