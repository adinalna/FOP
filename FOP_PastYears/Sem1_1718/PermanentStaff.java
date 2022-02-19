/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1718;

/**
 *
 * @author adina
 */
public class PermanentStaff extends Staff{
    private String grade;

    public PermanentStaff(String name, String IC, String grade) {
        super(name, IC);
        this.grade=grade;
    }  
    
    public int getSalary(){
        if(grade=="EM01")
            return 7000;
        else if(grade=="EM02")
            return 5000;
        else if(grade=="EM03")
            return 3000;
        else if(grade=="EM04")
            return 1000;
        return 0;
    }
    
    public String toString() {
        return "Full Name: "+name+"\nIC: "+IC+"\nGrade: "+grade+"\nSalary: "+getSalary()+"\n";
    }
    
}
