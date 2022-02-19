/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2Q6;

import java.util.Scanner;

/**
 *
 * @author adina
 */
public class L2Q6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double Q, M, I, F;
        System.out.print("Enter the amount of water in gram: ");
        double Mg = s.nextDouble();
        System.out.print("Enter the initial tempearture in Fahrenheit: ");
        double T1 = s.nextDouble();
        System.out.print("Enter the final temperaure in Fahrenheit: ");
        double T2 = s.nextDouble(); 
        M = Mg/1000;
        I = (T1-32)/1.8;
        F = (T2-32)/1.8;
        Q = M*(F-I)*4184;
        
        System.out.printf("The energy needed is %4.6e\n", +Q);
    }
}
