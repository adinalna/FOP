/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q1;

/**
 *
 * @author adina
 */
//Writing to binary file
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Reading bianary file
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.EOFException;
//Scanner
import java.util.Scanner;
public class L7Q1 {
    public static void main(String[] args) {
        
        try {
            String[][] Course = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}};
            ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("coursename.dat"));
            for (int i=0; i<Course.length;i++ ){
                for (int j=0; j<Course[0].length;j++ )
                    out.writeUTF(Course[i][j]);
            }
        
            out.close();
            }catch (IOException e) {
            System.out.println("Problem with file output.");
            }

        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("coursename.dat"));
            Scanner s = new Scanner(System.in);
            boolean found =false;
            String InputCode,CourseName, CourseCode;
            System.out.print("Enter Course Code: ");
            InputCode = s.next();
            try {
                while(true){
                    CourseCode=in.readUTF();
                    CourseName=in.readUTF();
                    if(CourseCode.equals(InputCode)){
                        found=true;
                        System.out.println("Couse Name: "+CourseName);
                        break;
                     }
                }
            }catch (EOFException e) {
                if(found==false)
                    System.out.println("The course is not found");
            }
            in.close();
            }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
            }catch (IOException e) {
            System.out.println("Problem with file input.");
            }

    }
}
