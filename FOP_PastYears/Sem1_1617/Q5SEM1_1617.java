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
public class Q5SEM1_1617 {
    public static void main(String[] args) {
        
        double grammar,spelling,length,content;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        grammar=s.nextDouble();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        spelling=s.nextDouble();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        length=s.nextDouble();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        content=s.nextDouble();
        Essay essay1 = new Essay(grammar,spelling,length,content);
        System.out.println(essay1.toString());
    }
}
