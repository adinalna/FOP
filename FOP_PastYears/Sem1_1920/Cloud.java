/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1920;

/**
 *
 * @author adina
 */
public class Cloud {
    private String cloudPackage;
    protected double cost;

    public Cloud(String cloudPackage) {
        this.cloudPackage = cloudPackage;
    }

    //accessor
    public double getCost() {
        return cost;
    }

    public String toString() {
        return String.format("Cloud Package : " + cloudPackage + " Total Cost= %.2f",cost);
    }
    
    
}
