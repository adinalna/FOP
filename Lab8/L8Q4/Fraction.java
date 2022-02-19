/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q4;

/**
 *
 * @author adina
 */
public class Fraction {
    private int numerator, dominator;

    //constructor
    public Fraction() {
        numerator=0;
        dominator=0;
    }
    
    //input method
    public void Input(int numerator, int dominator){
        this.numerator=numerator;
        this.dominator=dominator;
    }
    
    //mutator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDominator(int dominator) {
        this.dominator = dominator;
    }
    
    //accessor
    public int getNumerator() {
        return numerator;
    }

    public int getDominator() {
        return dominator;
    }
    
    public void DisplayFraction(){
        int gcd=1;
        for(int i = 1; i <= numerator && i <= dominator; i++){
            if(numerator%i==0 && numerator%i==0)
                gcd = i;
        }
        if (dominator/gcd==1)
            System.out.println("Simplest form: "+(numerator/gcd));
        else
            System.out.println("Simplest form: "+(numerator/gcd)+"/"+(dominator/gcd));
    }
}
