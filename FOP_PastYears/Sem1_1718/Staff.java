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
public class Staff {
    protected String name,IC;

    public Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }

    public String toString() {
        return "Full Name: "+name+"\nIC: "+IC+"\n";
    }
    
    
}
