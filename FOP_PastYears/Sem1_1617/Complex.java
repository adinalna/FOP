/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1617;

/**
 *
 * @author adina
 */
public class Complex {
    private double real, imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    
    public static void addComplexNum(Complex num1,Complex num2){
        double newreal=num1.getReal()+num2.getReal();
        double newimaginary=num1.getImaginary()+num2.getImaginary();
        System.out.println("Addition of the two complex number: ("+newreal+" + "+newimaginary+"i)");
    }
    
   public static void subtractComplexNum(Complex num1,Complex num2){
       double newreal=num1.getReal()-num2.getReal();
       double newimaginary=num1.getImaginary()-num2.getImaginary();
       System.out.println("Substraction of the two complex number: ("+newreal+" + "+newimaginary+"i)");
   }

    public String toString() {
        return "complex number: ("+real+" + "+imaginary+"i)";
    }
   
   
}
