/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q5;

/**
 *
 * @author adina
 */
public class L8Q5 {
    public static void main(String[] args) {
        
        Game player1 = new Game("Lalisa Manoban");
        Game player2 = new Game("Roseanne Park");
        
        int round=1;
        while (true) {
            System.out.println("Round " + round);
            player1.Move();
            System.out.println("Current Score for " + player1.getName() +  " is " + player1.getScore());

            if (player1.Win()) {
                System.out.println(player1.getName() + " wins the game");
                break;
            }

            player2.Move();
            System.out.println("Current Score for " + player2.getName() + " is "  + player2.getScore());
            if (player2.Win()) {
                System.out.println(player2.getName() + " wins the game");
                break;
            }
            System.out.println("");
            round++;
        }
        
    }
}
