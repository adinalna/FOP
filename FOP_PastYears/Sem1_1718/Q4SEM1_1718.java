/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1718;

/**
 *
 * @author adina
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Q4SEM1_1718 {
    public static void main(String[] args) {
        
        try {
            ObjectInputStream in = new ObjectInputStream (new FileInputStream("Q4.dat"));
            int Q,M,Y;
            try {
                while(true) {
                 Q=in.readInt();
                 M=in.readInt();
                 Y=in.readInt();
                 DayOfTheWeek dof = new DayOfTheWeek(Q,M,Y);
                 System.out.println(dof.toString());
            }
            } catch (EOFException e) { }       
            in.close();
            } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
            } catch (IOException e) {
            System.out.println("Problem with file input.");
            }

    }
}
