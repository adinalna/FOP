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
public class Circle extends Shape{
    private double diameter;

    public Circle() {
        name="Circle";
        
    }
    
    public void Input(double diameter){
        this.diameter=diameter;
        CalAreaPerimeter();
    }
    
    public void CalAreaPerimeter(){
        perimeter=diameter*Math.PI;
        area=((diameter/2)*Math.PI);
    }
}
