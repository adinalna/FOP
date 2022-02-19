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
public class PartTimeStaff extends Staff{
    private int hours;

    public PartTimeStaff(String name, String IC, int hours) {
        super(name, IC);
        this.hours=hours;
    }
    
    public int getSalary(){
        return 40*hours;
    }
    
    public String toString() {
        return "Full Name: "+name+"\nIC: "+IC+"\nNumber of working hours: "+hours+"\nSalary: "+getSalary()+"\n";
    }
}
