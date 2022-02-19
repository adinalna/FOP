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
import java.util.Random;
public class Game {
    private String name;
    private int score=0;

    public Game(String name) {
        this.name = name;
    }
    
     public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    
    public void Move(){
        Random r = new Random();
        int dice =r.nextInt(6)+1;
        score+=dice;
        System.out.println(name+" rolls"+dice);
    }
        
    public boolean Win(){
       return score>=100;
   }
        
    
}
