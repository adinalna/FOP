/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3Q6;

/**
 *
 * @author adina
 */

import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius,x,y;
        
        System.out.print("Enter the radius: ");
        radius=s.nextInt();
        System.out.print("Enter x-coordinate: ");
        x=s.nextInt();
        System.out.print("Enter y-coordinate: ");
        y=s.nextInt();
        
        //center is (0,0)
        double d=Math.sqrt(Math.pow((x-0),2)+Math.pow((y-0),2));
        
        if(radius>d)
            System.out.println("The point is inside the circle");
        else if(radius<d)
            System.out.println("The point outside the circle");
        else if(radius==d)
            System.out.println("The point is on the circumference of the circle");
    }
   
    
}
