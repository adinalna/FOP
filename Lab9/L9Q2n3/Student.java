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

public class Student extends PersonProfile {
    private String[]CourseName;
    private String[]CourseCode;
    private int[]Semester;
    private int[]Session;
    private int[]Mark;

    public Student(String name, String gender, String birthDate) {
        super(name, gender, birthDate);
        CourseCode=null;
        CourseName=null;
        Semester=null;
        Session=null;
        Mark=null;
                
    }

    public void getGrade(){
    try {
        Scanner input = new Scanner(new FileInputStream("C:\\Users\\adina\\OneDrive\\Desktop\\UM Assignments\\WIX1002 Fundamentals of Programming\\Lab09\\Lab09\\course.txt"));
        int num=0;
        String grade=null;
        while (input.hasNextLine()){
            CourseCode[i]=input.next();
            courseName=input.nextLine();
            semester=input.nextInt();
            session=input.nextInt();
            mark=input.nextDouble();
           
            num++;
            if(mark>=85)
                grade="A";
            else if(mark>=75)
                grade="A-";
            else if(mark>=70)
                grade="B+";
            else if( mark>=65)
                grade="B";
            else if( mark>=60)
                grade="B-";
            else if( mark>=55)
                grade="C+"; 
            else if( mark>=50)
                grade="C";
            else if( mark>=45)
                grade="D";
            else if( mark>=35)
                grade="E";
            else if( mark<35)
                grade="F";
            System.out.printf("%3d%10s%10s%10d%10d%10f10s",num,courseCode,courseName,semester,session,mark,grade);
        }
            input.close();
        
    } catch (FileNotFoundException e) {
    System.out.println("File was not found"); 
    }
    }
    
}
