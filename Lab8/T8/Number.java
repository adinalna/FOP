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
//(k) Create an object of the class Number with the value 20 and 40.
public class Number {
    private int num;

    public Number(int num) {
        this.num = num;
    }
    

    public void setNum(int num) {
        this.num = num;
    }
    
    public static void main(String[] args) {
        //(k) Create an object of the class Number with the value 20 and 40.
        Number num1 = new Number(20);
        Number num2 = new Number(40);
    }

    
    
    
    
}
