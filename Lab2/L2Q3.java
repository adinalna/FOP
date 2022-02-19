/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2Q3;

/**
 *
 * @author adina
 */
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
       
    Random r = new Random();
    int num; 
    double sum=0,average;
    final int MAX=50, MIN=10;
    for (int i=1;i<=3;i++){
        num = r.nextInt(MAX-MIN+1)+MIN;
        sum += num;
        System.out.println("Random number "+i+": "+num );
    }
    average=sum/3;
    System.out.printf("The sum: %.2f\n", sum);
    System.out.printf("The average: %.2f\n", average);
       
}
}
