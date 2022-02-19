package L9Q1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adina
 */
public class Square extends Shape{
    private double length;

    public Square() {
        name="Square";
    }

    public void Input(double length){
        this.length=length;
        CalAreaPerimeter();
    }
    
    public void CalAreaPerimeter(){
        perimeter=length*4;
        area=length*length;
    }
    
    
    
    
    
    
}
