/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9Q4;

import java.util.Random;

/**
 *
 * @author adina
 */
public class SecondGame extends FirstGame{

    public SecondGame(String name) {
        super("");
        this.name=name;
    }
    
    public int DiceRoll(){
        int i=0,no2repeat=0;
        Random r = new Random();
        do{
            setDice1(r.nextInt((6)+1));
            setScore(+getDice1());
            no2repeat+=getDice1();
            i++;
            if(i==3)
                setScore(-no2repeat);
          }while(getDice1()==6);
       
        if(getScore()>100){
            setScore(-getDice1());
        }
        
        return getScore();
    }

    public String Win(){
        if(getScore()==100)
            return name+" Wins!\n";
        else
            return "";
    }
    
    public String toString() {
        return "Player name: "+name+"\nDice : "+getDice1()+"\nScore: "+getScore()+"\n"+Win();
    }    
}
    