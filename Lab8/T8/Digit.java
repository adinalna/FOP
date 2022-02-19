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
//2(a)Define a class Digit
public class Digit {
    
    //(b)Declare the instance variable that used to store a number.
    private int number;
    //(c)Create a constructor that assign the parameter value to the number

    public Digit(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    
    //(e)Create a method that used to display the digit multiplication of the number.
    
    public void Output() {
        System.out.println("The number is "+number+"\nDigit multiplication: "+digitMultiplication());
    }
    
    //(d) Create a digitMultiplication method that returns the multiplication of the number. If the number is 1345, the method will return 60.
    public int digitMultiplication(){ 
        int product=1;
        while(number>0){   
            product*=(number%10);
            number/=10;
        }
        return product;
    }
    
    public static void main(String[] args) {
        
        
         Digit d = new Digit(1345);
         d.Output();
    }
    
    
   
            
    
}
