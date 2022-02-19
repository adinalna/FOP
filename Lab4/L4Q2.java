/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q2;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L4Q2 {
    public static void main(String[] args) {
        int num, sum=0, sum2=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = s.nextInt();
        for(int i=1; i<=num; i++){
            sum+=i;
            if(i!=num){
                System.out.print(sum+" + ");}
            else{
                System.out.print(sum);}
        sum2+=sum;}
        System.out.println(" = "+sum2);    
        
            
            
    }
    
}   
