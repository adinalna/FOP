/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9Q1;

/**
 *
 * @author adina
 */
public class Shape {
    protected String name;
    protected double perimeter, area;

    public Shape() {
        name=null;
        perimeter=0;
        area=0;
    }

    //Accessor
    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
    
    //Mutator
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "Shape name: " + name + "\nperimeter: "+perimeter + "\nArea: "+area +"\n";
    }
    
    
    
}
