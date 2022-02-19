/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9Q2n3;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lecturer extends PersonProfile{
    private String courseName, courseCode;
    private int semester, session,credit,numStudents;

    public Lecturer(String name, String gender, String birthDate) {
        super(name, gender, birthDate);
        courseCode=null;
        courseName=null;
        semester=0;
        session=0;
        credit=0;
        numStudents=0;
    }
    
     public void getInfo(){
    try {
        Scanner input = new Scanner(new FileInputStream("C:\\Users\\adina\\OneDrive\\Desktop\\UM Assignments\\WIX1002 Fundamentals of Programming\\Lab09\\Lab09\\lecturer.txt"));
        while (input.hasNextLine()){
            courseCode=input.next();
            courseName=input.nextLine();
            semester=input.nextInt();
            session=input.nextInt();
            credit=input.nextInt();
            numStudents=input.nextInt();
            System.out.println(courseCode);
        }
        
    
    
        
            input.close();
        
    } catch (FileNotFoundException e) {
    System.out.println("File was not found"); 
    }
    }
}
