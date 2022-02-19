/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q3;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        double score,sum=0, average,n=0,SD,sum2=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a score [negative score to quit]: ");
        score = s.nextInt();
        double min = score, max = score;
        while(score>=0){
            if (score<min)
                min=score;
            else if (score>max)
                max=score;
            sum+=score;
            n++;
            sum2+=(score*score);
            System.out.print("Enter a score [negative score to quit]: ");
            score = s.nextInt();
            
    }
        average = sum/n;
        SD = Math.sqrt(((sum2-(Math.pow(sum,2))/n)/(n-1)));
        System.out.printf("Minimum Score: %.0f\n",min);
        System.out.printf("Maximum Score: %.0f\n",max);
        System.out.printf("Average Score: %.2f\n",average);
        System.out.printf("Standard Deviation: %.2f\n",SD);
            
        
    }
    
}
