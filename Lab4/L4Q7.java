/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q7;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double M, P, I, N, C, L, R, Total=0;
    System.out.print("Enter principal amount: ");
    P = s.nextDouble();
    System.out.print("Enter interest in %: ");
    I = s.nextDouble();
    System.out.print("Enter total number of month(s): ");
    N = s.nextDouble();
    
    M = (P*(I/(12*100)))/(1-Math.pow((1+I/(12*100)),-N));
    System.out.printf("%5s%23s%17s%16s%22s%22s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
    
    for(int n=1; n<=N; n++){
        
        C = M*Math.pow((1+I/(12*100)),-(1+N-n));
        L = M-C;
        R = (L/(I/(12*100)))-C;
        Total+=L;
        System.out.printf("%-5d%23.2f%17.2f%16.2f%22.2f%22.2f\n",n ,M, C, L, R, Total);
    
        
        
        
    }
    }
    
}
