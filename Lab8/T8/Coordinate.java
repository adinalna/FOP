/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8;

/**
 *
 * @author adina
 */
public class Coordinate {
    private double x,y;

    //construtor
    public Coordinate() {
        x=0;
        y=0;
    }
    
    //mutator
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //accessor

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void Display(){
        System.out.println("Coordinate: ("+x+","+y+")");
    }
    
    public static void main(String[] args) {
        Coordinate a = new Coordinate();
        a.setX(2.0);
        a.setY(5.0);
        a.Display();
    }
}
