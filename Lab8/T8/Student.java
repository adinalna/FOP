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
//1(a)Define a class Student
public class Student {
    
    //(b)Declare the instance variable that used to store contact number.
    private String contact;
    
    //(c)Create the constructor that initializes the contact number to null.
    public Student() {
        contact = "null";
    }
    
    //(d)Create another constructor that assign the parameter value to the contact number. 
    public Student(String contact) {
        this.contact = contact;
    }
    
    //(e)Create an accessor and mutator method for the contact number.

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    //(e)Create a method that used to display the contact number.
    public void Display(){
        System.out.println("Student contact number: "+contact);
    }
    
    public static void main(String[] args) {
        
         //(g)Create an object of the class Student
        Student a = new Student();
        
        //(h)Change the contact number using the mutator method.
        a.setContact("0121234567");

    }
    
    
    
    
}
