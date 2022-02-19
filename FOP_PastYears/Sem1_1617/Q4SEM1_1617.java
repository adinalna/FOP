/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1617;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q4SEM1_1617 {
    public static void main(String[] args) {
        
        int real1,real2,imaginary1,imaginary2;
        
        Scanner s = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        real1=s.nextInt();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        imaginary1=s.nextInt();
        Complex num1 = new Complex(real1,imaginary1);
       
        System.out.print("First complex number. Enter a number for the real part: ");
        real2=s.nextInt();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        imaginary2=s.nextInt();
        Complex num2 = new Complex(real2,imaginary2);
        
        System.out.println("First "+num1.toString());
        System.out.println("Second "+num2.toString());
        Complex.addComplexNum(num1, num2);
        Complex.subtractComplexNum(num1, num2);
    }
    
}
