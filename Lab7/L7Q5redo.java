/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q5redo;

/**
 *
 * @author adina
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class L7Q5redo {
    
    public static void main(String[] args) {
        
    
    try {
        ObjectInputStream in = new ObjectInputStream (new FileInputStream("C:\\Users\\adina\\OneDrive\\Desktop\\UM Assignments\\WIX1002 Fundamentals of Programming\\Lab07 (1)\\Lab07\\person.dat"));
        int numOfRecord,age,i=0;
        String name;
        char gender;
        numOfRecord=in.readInt();
        String[][]PersonInfo=new String[numOfRecord][3];
        try {
            while(true) {
                name=in.readUTF();
                age=in.readInt();
                gender=in.readChar();   
                PersonInfo[i][0]=name;
                PersonInfo[i][1]=Integer.toString(age);
                PersonInfo[i][2]=Character.toString(gender);
                i++;
            }
            } catch (EOFException e) {}
        
              
            for (int pass = 1; pass < PersonInfo.length; pass++){
                for (int k = 0; k < PersonInfo.length - 1; k++ ){
                    if ( PersonInfo[k][0].compareToIgnoreCase(PersonInfo[k+1][0])>0) {
                        //switch name
                        String holdname = PersonInfo[k][0];        
                        PersonInfo[k][0] = PersonInfo[k+1][0];  
                        PersonInfo[k+1][0] = holdname;
                        //switch age
                        String holdage = PersonInfo[k][1];        
                        PersonInfo[k][1] = PersonInfo[k+1][1];  
                        PersonInfo[k+1][1] = holdage;
                        //switch gender
                        String holdgender = PersonInfo[k][2];        
                        PersonInfo[k][2] = PersonInfo[k+1][2];  
                        PersonInfo[k+1][2] = holdgender;
			}
                }
            }
            System.out.println("Person Records:\n");
            for(int m=0;m<PersonInfo.length;m++){
                System.out.println("Name: "+PersonInfo[m][0]);
                System.out.println("Age: "+PersonInfo[m][1]);
                System.out.println("Gender: "+PersonInfo[m][2]+"\n");
            }
   
        in.close();
        } catch (FileNotFoundException e) {
        System.out.println("File was not found"); 
        } catch (IOException e) {
        System.out.println("Problem with file input.");
        }
    }

}
