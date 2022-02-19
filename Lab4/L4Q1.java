/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q1;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = s.nextInt();
        System.out.print("The factors are: ");
        for (int factor=1; factor<=num; factor++){
            if ((num%factor)==0)
                if(num!=factor)
                    System.out.print(factor+", ");
                else
                    System.out.println(factor);}
    }
}
