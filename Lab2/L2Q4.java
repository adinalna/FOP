/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2Q4;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L2Q4 {
public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int inputseconds, mins, hours, seconds;
        System.out.print("Enter the number of seconds: ");
        inputseconds = s.nextInt();
        
        hours = inputseconds/(60*60);
        mins = (inputseconds%(60*60))/60;
        seconds = inputseconds%(60*60)-(mins*60);
        
        System.out.println(inputseconds+" seconds is "+hours+" hours, "+mins+" minutes and "+seconds+" seconds");
        
        
        
        
    }    
}
