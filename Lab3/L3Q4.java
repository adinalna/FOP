/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3Q4;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L3Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p1dice1,p1dice2,p2dice1,p2dice2,result1,result2;        
        System.out.print("Player 1 first dice roll: ");
        p1dice1=s.nextInt();
        System.out.print("Player 1 second dice roll: ");
        p1dice2=s.nextInt();
        System.out.print("Player 2 first dice roll: ");
        p2dice1=s.nextInt();
        System.out.print("Player 2 secon dice roll: ");
        p2dice2=s.nextInt();
        
        result1=p1dice1+p1dice2;
        result2=p2dice1+p2dice2;

        if(result1>result2)
            System.out.println("Player 1 is the winner");
        else if(result1<result2)
            System.out.println("Player 2 is the winner");
        else
            System.out.println("Its a tie");
    }
}
