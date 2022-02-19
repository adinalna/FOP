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
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class Lab7Q1redo {
    public static void main(String[] args) {
        /*{"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
        */
        try {
            ObjectInputStream in= new ObjectInputStream (new FileInputStream("coursename.dat"));
            String code,courseName;
            String[][]Course=new String[4][2];
            int i=0;
            try {
            while(true){                
                code=in.readUTF();
                courseName=in.readUTF();
                Course[i][0]=code;
                Course[i][1]=courseName;
                i++;
            }
            } catch (EOFException e) { }
            in.close();
            Scanner s = new Scanner(System.in);
            String inputcode;
            System.out.print("Enter course code: ");
            inputcode=s.next();
            for(int j=0; j<Course.length;j++){
                if(inputcode.equals(Course[j][0]))
                    System.out.println("Course Name: "+Course[j][1]);
            }        
            } catch (FileNotFoundException e) {
             System.out.println("File was not found"); 
            } catch (IOException e) {
            System.out.println("Problem with file input.");
}

    }
}
