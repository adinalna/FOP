/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3Q5;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c,d,e,f,x = 0,y=0;
        
        System.out.println("Cramer's rule for linear equations where: \nax + by = e\ncx + dy = f\n");
        System.out.print("Enter a: ");
        a=s.nextInt();
        System.out.print("Enter b: ");
        b=s.nextInt();
        System.out.print("Enter c: ");
        c=s.nextInt();
        System.out.print("Enter d: ");
        d=s.nextInt();
        System.out.print("Enter e: ");
        e=s.nextInt();
        System.out.print("Enter f: ");
        f=s.nextInt();
        
        if((a*d-b*c)==0)
            System.out.println("The equation has no solution");
        else
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.println("x: "+x+"\ny: 3"+y);
        
        
    }
   
}
