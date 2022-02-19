/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1617;

/**
 *
 * @author adina
 */
public class Essay extends GradedActivity{
    private double grammar, spelling, length, content;

    public Essay(double grammar, double spelling, double length, double content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        score=grammar+spelling+length+content;
    }
      
    public String toString() {
        return "\nEssay score:" 
                + "\nGrammar: " + grammar 
                + "\nSpelling: " + spelling 
                + "\nLength: " + length 
                + "\ncontent: " + content
                + "\n\n"+super.toString();
    }
    
    
}
