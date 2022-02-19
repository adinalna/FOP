/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q1;

/**
 *
 * @author adina
 */
import java.util.Random;
public class Number {
   private int occurence=10;
   private int MAX=100;
   private int[]RandomNum;

    //constructor for object a
    public Number() {
        RandomNum = new int[occurence];
        Generate();
    }
   
    // constructor for object b
    public Number(int occurence) {
        this.occurence = occurence;
        RandomNum = new int[occurence];
         Generate();
    }

    // constuctor for object c
    public Number(int occurence, int MAX) {
        this.occurence = occurence;
        this.MAX = MAX;
        RandomNum = new int[occurence];
        Generate();
    }
    
    public void Generate(){
        Random r = new Random();
        for(int i = 0; i<occurence; i++)
            RandomNum[i]= r.nextInt(MAX+1);
        System.out.println();
    }
        
    public void DisplayRandom(){
        System.out.print("Random numbers: ");
        for(int i = 0; i<occurence; i++){
             System.out.print(RandomNum[i]+" ");
        }
         System.out.println();
    }
    
    public void EvenNum(){
        System.out.print("Even numbers: ");
        for(int i = 0; i<occurence; i++){
            if(RandomNum[i]%2==0)
                System.out.print(RandomNum[i]+" ");
        }
        System.out.println();
    }
   
    public void PrimeNum(){
        System.out.print("Prime numbers: ");
        for(int i = 0; i<occurence; i++){
            boolean prime=true;
            if(RandomNum[i]==0)
                prime=false;
            if(RandomNum[i]==1)
                prime=false;
            for(int j = 2; j<=RandomNum[i]/2; j++){
                if(RandomNum[i]%j==0){
                    prime=false;
                    break;
                }
            }
            if (prime==true)
                System.out.print(RandomNum[i]+" ");
        }
        System.out.println();
                    
    }
    public void Maximum(){
        int max=RandomNum[0];
        for(int i = 0; i<occurence; i++){
            if(RandomNum[i]>max)
                max=RandomNum[i];
        }
        System.out.println("Maximum number: "+max);
        
    }
    
    public void Minimum(){
        int min=RandomNum[0];
        for(int i = 0; i<occurence; i++){
            if(RandomNum[i]<min)
                min=RandomNum[i];
        }
        System.out.println("Minimum number: "+min);
        
    }
    
    public void Average(){
        double sum=0,average;
        for(int i = 0; i<occurence; i++){
            sum+=RandomNum[i];
        }
        average=sum/occurence;
        System.out.println("Average: "+average);
    }
    
    public void SquareNum(){
        System.out.print("Square numbers: ");
        for(int i = 0; i<occurence; i++){
            if (RandomNum[i]%(Math.sqrt(RandomNum[i]))==0)
                System.out.print(RandomNum[i]+" ");
        }
        System.out.println("\n");
    }
    
}
