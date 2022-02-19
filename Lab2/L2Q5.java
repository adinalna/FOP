/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2Q5;

import java.util.Random;

/**
 *
 * @author adina
 */
public class L2Q5 {
   public static void main(String[] args) {
        
        Random r = new Random();
        int num,sum=0;
        final int MAX=10000;
        num = r.nextInt(MAX+1);
        System.out.println("Random number: "+num);
        while(num!=0){
            sum += num%10;
            num/=10;          
        }
        System.out.println("The sum of digits is "+sum);
    } 
}
