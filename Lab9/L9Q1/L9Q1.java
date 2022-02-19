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
public class L9Q1 {
    public static void main(String[] args) {
        
        Rectangle shape1 = new Rectangle();
        Square shape2 = new Square();
        Circle shape3 = new Circle();
        
        shape1.Input(5, 7);
        shape2.Input(5);
        shape3.Input(6);
        
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
        
        
    }
}
