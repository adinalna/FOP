/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5Q1;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.util.Random;
public class L5Q1 {
    public static void main(String[] args) {
        int N;
        double sum=0,average,lowest=100,highest=0;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter N students: ");
        N = s.nextInt();
        double[] score = new double[N];
        System.out.println("List of scores: ");
        for(int i=0; i<score.length; i++){
            score[i]=r.nextInt(101);
            System.out.println((i+1)+". "+score[i]);
            sum+=score[i];
            if(score[i]<lowest)
                lowest=score[i];
            if(score[i]>highest)
                highest=score[i];
        }
        average=sum/N;
        System.out.println("Highest score: "+highest);
        System.out.println("Lowest Score: "+lowest);
        System.out.println("Average: "+average);
        
            
            
            
            
        
        
    }
    
}
