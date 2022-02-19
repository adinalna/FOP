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
public class CloudPackage extends Cloud{
    private int core,memory;
    private double price;

    public CloudPackage(String cloudPackage, int core, int memory, double price) {
        super(cloudPackage);
        this.core = core;
        this.memory = memory;
        this.price = price;
    }
    
    public boolean check (Job job){
        if(job.getMemory()>this.memory)
            return false;
        return true;           
    }
    
    public double totalCost(Job job){
        cost=(job.getTasks()/core)*price;
        return cost;
    }
    
}
