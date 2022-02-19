/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q5;

/**
 *
 * @author adina
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
public class L7Q5 {
    public static void main(String[] args) {
        String[][]records = null;
        int recordNum=0,row=0;
        try {
        ObjectInputStream in = new ObjectInputStream (new FileInputStream("C:\\Users\\adina\\OneDrive\\Desktop\\UM Assignments\\WIX1002 Fundamentals of Programming\\Lab07 (1)\\Lab07\\person.dat"));
        try {
            recordNum=in.readInt();
            while(true){ 
                records[row][0]=in.readUTF();
                records[row][1]=Integer.toString(in.readInt());
                records[row][2]=Character.toString(in.readChar());
                row++;
            }
        }catch (EOFException e) {
            String hold1=null, hold2=null, hold3=null;
            for(int i=0;i<row;i++){    
                if(records[row][0].compareTo(records[row+1][0])>0){
                    //name
                    hold1 = records[row][0];
                    records[row][0]=records[row+1][0];
                    records[row+1][0]=hold1;
                    //age
                    hold2 = records[row][1];
                    records[row][1]=records[row+1][1];
                    records[row+1][1]=hold2;
                    //gender
                    hold3 = records[row][3];
                    records[row][3]=records[row+1][3];
                    records[row+1][3]=hold3;
                }
            }
        }in.close();
        } catch (FileNotFoundException e) {
        System.out.println("File was not found"); 
        } catch (IOException e) {
        System.out.println("Problem with file input.");
        }
        System.out.println("Number of people: "+recordNum);
        System.out.printf("%4s%10s%16s","Name","Äge","Gender");
        for(int j=0;j<row;j++)
            System.out.printf("%3s%8s%14s",records[row][0],records[row][1],records[row][2]);
    }
}
