/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L10Q1;

/**
 *
 * @author adina
 */
public abstract class SalarySystem{
    
    public String name,type;
    double salary;

    public SalarySystem(String name, String type) {
        this.name = name;
        this.type = type;
        salary=0;       
    }
    
    public double computeSalary;
}
