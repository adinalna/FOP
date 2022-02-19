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
public class GradedActivity {
    protected double score;
    
    //mutator
    public void setScore(double score) {
        this.score = score;
    }
    
    //accessor
    public double getScore() {
        return score;
    }
    
    public char getGrade(){
        if(score>=90)
            return 'A';
        else if(score>=80)
            return 'B';
        else if(score>=70)
            return 'C';
        else if(score>=60)
            return 'D';
        else if(score<60)
            return 'F';
        return 0;
    }

    public String toString() {
        return "Total score: "+score+
                "\nEssay grade: "+getGrade();
    }
    
    
}
