/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T7;

/**
 *
 * @author adina
 */
//read binary
import java.io.ObjectInputStream;
//read text file
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//write binary
import java.io.ObjectOutputStream;
//write text file
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
public class T7 {
    public static void main(String[] args) {
        Random r = new Random();
        
        //1(a)
        /*
        int num1,num2,max=0;
        double sum=0,average;
        System.out.println("10 Random integers in file integer.txt\n");
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("integer.txt"));
            for(int i=0; i<10; i++){
                num1 = r.nextInt(1001);
                out.println(num1);
                sum+=num1;
                if(num1>max)
                    max=num1;
            }
            out.close();   
            }
        catch (IOException e) {
            System.out.println("Problem with file output"); 
        }
        
        
        //(b)
        
        try {
            Scanner in = new Scanner(new FileInputStream("integer.txt"));
            while (in.hasNextInt()) {
                System.out.println(in.nextInt());
            }
            in.close();
            } 
        catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        System.out.println("Largest integer: "+max);
        //(c)
  
        System.out.println("\n10 Random integers in file integer.dat\n");
        try {
            ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("integer.dat"));
            for(int i=0; i<10; i++){
                num2=r.nextInt(1001);
                output.writeInt(num2);
            }
            output.close();
            } 
        catch (IOException e) {
            System.out.println("Problem with file output.");
        }
        
        //(d)
        
        try {
            ObjectInputStream input = new ObjectInputStream (new FileInputStream("integer.dat"));
            for(int i=0; i<10; i++){
                num2=input.readInt();
                System.out.println(num2);  
                sum+=num2;
            }
            input.close();
            } 
        catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        catch (IOException e) {
            System.out.println("Problem with file input.");
        }   
        //average
        average=sum/20;
        System.out.println("\nAverage: "+average);
        */

        //2(a)
        //PrintWriter out = new PrintWriter(new FileOutputStream("d:\\data\\matrix.txt"));
        //(b)
        /*
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            out.close();
            } catch (IOException e) {
             System.out.println("Problem with file output");
            }
        */
        //(c)
        /*
        int num;
        Scanner a = new Scanner(new FileInputStream("data.dat"));
        num = a.nextInt();
        a.close();
        */
        /*
        ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
        o.writeChar('A');
        o.close();
        */
    }
}
