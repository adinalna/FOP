/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q8;

/**
 *
 * @author adina
 */

import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
       
        Random r = new Random();
        int number_of_prime = r.nextInt(101);
        System.out.println("Number of prime to find: " + number_of_prime);
        int prime_printed = 0;
        int current_number = 2;
        while (prime_printed < number_of_prime) {
            boolean prime = true;
            for(int i = 2; i <= current_number/2 ; i++){
                if(current_number % i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                prime_printed++;
                System.out.println(current_number);
            }

            current_number ++;
        }
        
    }
    
}
