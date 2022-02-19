/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2Q2;
/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        double P, D, R, Y, M;
        System.out.print("The price of the car: ");
        P = s.nextDouble();
        System.out.print("Down payment: ");
        D= s.nextDouble();
        System.out.print("Interest Rate in %: ");
        R = s.nextDouble();
        System.out.print("Loan duration in a year: ");
        Y = s.nextDouble();
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly payment: %.2f\n", M);
    }
}
