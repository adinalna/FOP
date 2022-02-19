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
import java.util.Random;
public class FirstGame {
    private int dice1, dice2;
    private static int score;
    protected String name;

    public FirstGame(String name) {
        dice1=0;
        dice2=0;
        this.name=name;
    }

    //Accessor
    public int getDice1() {
        return dice1;
    }

    public int getScore() {
        return score;
    }

    //Mutator
    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public void setScore(int score) {
        this.score = score;
    }

    
    public int DiceRoll(){
        Random r = new Random();
        do{
            dice1=r.nextInt((6)+1);
            dice2=r.nextInt((6)+1);
            score=dice1+dice2;
          }while(dice1==dice2);
        
        return score;
    }
    
    public String Win(){
        if(score>=100)
            return name+" Wins!\n";
        else
            return "";
    }
   
    public String toString() {
        return "Player name: "+name+"\nDice 1: "+dice1+"\nDice 2: "+dice2+"\nScore: "+score+"\n"+Win();
    }    
    
}
