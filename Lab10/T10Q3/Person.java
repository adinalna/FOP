/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T10Q3;

/**
 *
 * @author adina
 */
public class Person implements Comparable{
    public String name;

    public Person(String name) {
        this.name = name;
    }
    
    //Accessor
    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: "+name;
    }
    
    public int compareTo(Object other){
        if(name.compareTo(((Person)(other)).getName())<0)
            return 1;
        else
            return -1;
                    
    }
    
}
