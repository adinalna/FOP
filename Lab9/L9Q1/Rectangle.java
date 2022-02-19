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
public class Rectangle extends Shape{
    private double height,length;

    public Rectangle() {
        name="Rectangle";
    }
    
    public void Input(double height, double length){
        this.height=height;
        this.length=length;
        CalAreaPerimeter();
    }
    
    public void CalAreaPerimeter(){
        perimeter=(length*2)+(height*2);
        area=(length*height);
    }
    
    
    
    
}
