/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3Q2;

/**
 *
 * @author adina
 */
import java.util.Random;
public class L3Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int MAX=5;
        int num = r.nextInt(MAX+1);
        if(num==0)
            System.out.println("0 is zero.");
        else if(num==1)
            System.out.println("1 is one.");
        else if(num==2)
            System.out.println("2 is two.");
        else if(num==3)
            System.out.println("3 is three.");
        else if(num==3)
            System.out.println(" is four.");
        else if(num==3)
            System.out.println("5 is five.");
    }
   
}
