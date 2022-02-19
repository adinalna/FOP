/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1718;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q2SEM1_1718 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int N;
        System.out.print("Enter number of teams: ");
        N=s.nextInt();
        s.nextLine();
        String[]Teams = new String[N];
        int[]Scores = new int [N];
        
        //Enter the teams and score
        for (int i=0; i<Teams.length;i++){
            System.out.print("Enter team "+(i+1)+" name: ");
            Teams[i]=s.nextLine();
            System.out.print("Enter team "+(i+1)+" score: ");
            Scores[i]=s.nextInt();
            s.nextLine();
        }
        
       //Bubblesort the teams scores in descending order
       int holdscore;
       String holdname;
       for (int pass = 1; pass < Teams.length; pass++){
		for (int i = 0; i < Teams.length - 1; i++) 
			if (Scores[i]<Scores[i+1]) {
                            holdname = Teams[i];
                            holdscore = Scores[i];
				Teams[i] = Teams[i+1]; 
                                Scores[i] = Scores[i+1];
				Teams[i+1] = holdname;
                                Scores[i+1] = holdscore;
			}
       }
        System.out.println("List the teams with highest score first");
        for (int i=0; i<Teams.length;i++){
            System.out.print(Teams[i]+" ("+Scores[i]+") | ");
        }
    }
}
