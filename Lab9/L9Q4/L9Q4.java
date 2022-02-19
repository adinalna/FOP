/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9Q4;

/**
 *
 * @author adina
 */
public class L9Q4 {
    public static void main(String[] args) {
        
        FirstGame player1 = new FirstGame("Lalisa");
        FirstGame player2 = new FirstGame("Roseanne");
        
        player1.DiceRoll();
        player2.DiceRoll();
        System.out.println(player1.toString());
    }
}
