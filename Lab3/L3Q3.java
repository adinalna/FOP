/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3Q3;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Sales Volume: ");
        int sales = s.nextInt();
        double commission=0;
        if(sales<=100)
            commission=sales*0.05;
        else if(sales>100&&sales<=500)
            commission=sales*0.075;
        else if(sales>500&&sales<=1000)
            commission=sales*0.1;
        else if(sales>1000)
            commission=sales*0.125;
        
        System.out.printf("Commission: %.2f\n",commission);
    }
}