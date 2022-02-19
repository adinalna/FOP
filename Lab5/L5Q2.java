/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5Q2;

/**
 *
 * @author adina
 */
import java.util.Random;
public class L5Q2 {
    public static void main(String[] args) {
        
        Random r = new Random();
        int[] num= new int[10];
        for(int i=0; i<num.length; i++){
            num[i]=r.nextInt(21);
            for (int n=0;n<i;n++){
                if(num[n]==num[i]){
                    i--;
                    break;
                }
            }
        }
        System.out.println("10 Non-duplicate random integers: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
                                           
        
        
    
    
    }
}
