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
public class Job {
    private String job;
    private int tasks, memory;

    public Job(String job, int tasks, int memory) {
        this.job = job;
        this.tasks = tasks;
        this.memory = memory;
    }

    //Accessor
    public String getJob() {
        return job;
    }

    public int getTasks() {
        return tasks;
    }

    public int getMemory() {
        return memory;
    }

    public String toString() {
        return "Job Name : "+job+" Memory = " + memory + "GB Number Of Tasks = " + tasks;
    }

    
    
}
