/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5Q3;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.util.Random;
public class L5Q3 {
    public static void main(String[] args) {
        int N, total;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter number(N) of employees: ");
        N = s.nextInt();
        int [][] hours = new int[N][7];
        for(int i=0; i<hours.length; i++){
            total=0;
            System.out.println("Employee "+(i+1)+": ");
            for(int j=0; j<7; j++){
                hours[i][j]=r.nextInt(8)+1;
                System.out.println("Day "+(j+1)+": "+hours[i][j]);
                total+=hours[i][j];  
            }
            System.out.println("Total hours: "+total+"\n");
        }    
        
        
    }
}
