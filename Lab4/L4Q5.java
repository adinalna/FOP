/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4Q5;

/**
 *
 * @author adina
 */
import java.util.Random;
public class L4Q5 {
    public static void main(String[] args) {
        /*
        int dice1=0, dice2 = 0,sum1=0,sum2=0;
        Random r = new Random();
        System.out.printf("%19s%24s","Player 1 dice rolls", "Player 2 dice rolls\n");
        while(sum1<100&&sum2<100){
            dice1 = r.nextInt(6)+1;
            dice2 = r.nextInt(6)+1;
            System.out.printf("%10d%23d\n", dice1, dice2);
            sum1+=dice1;
            sum2+=dice2;
            while (dice1==6){
                System.out.printf("%10s",dice1);
                sum1+=dice1;
                dice1 = r.nextInt(5)+1;}
            while (dice2==6){
                System.out.printf("%33d", dice2);
                sum2+=dice2;
                dice2 = r.nextInt(5)+1;}
    }
    
        if(sum1>sum2)
            System.out.println("\nPlayer 1 wins! with score of "+sum1);
        else
            System.out.println("\nPlayer 2 wins! with score of "+sum2);
        */
        
        Random rnd = new Random();
        int player1 = 0;
        int player2 = 0;
        int dice = 0;
        game:
        while(player1 <= 100 && player2 <= 100){
            do{
                dice = rnd.nextInt(6) + 1;
                System.out.println("Player 1 rolled " + dice);
                player1 += dice;
                System.out.println("Player 1's score : " + player1);

                if (player1 > 100) {
                    System.out.println("Player 1 WIN!");
                    break game;
                }
            }while(dice == 6);

            do {
                dice = rnd.nextInt(6) + 1;
                System.out.println("Player 2 rolled " + dice);
                player2 += dice;
                System.out.println("Player 2's score : " + player2);
                if (player2 > 100) {
                    System.out.println("Player 2 WIN!");
                    break;
                }
            }while(dice == 6);
        }
    }
}

