/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5Q5;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.util.Random;
public class L5Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[20];
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0; i<num.length; i++){
            num[i]=r.nextInt(101);
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
        //Bubble sort in descending order
        for ( int pass = 1; pass < num.length; pass++ ){
		for ( int i = 0; i < num.length - 1; i++ ){
			if ( num[ i ] < num[ i + 1 ] ){
               		int hold = num[i];        
				num[i] = num[i+1];  
				num[i+1] = hold;
			} }
        }
        System.out.println("Array in descending order");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
        //Number to be searched
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a numher to search: ");
        int search=s.nextInt();
        
        //Linear search
        for(int i=0; i<num.length; i++){
            if(num[i]==search){
                System.out.println("Linear Search - "+(i+1)+" loop(s)");
                break;
            }
        }
        
        
        
      
        
        
        
    }  

}
