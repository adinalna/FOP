/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q3;

/**
 *
 * @author adina
 */
//writing to text file
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
//reading text file 
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class L7Q3 {
    public static void main(String[] args) {
        char []TextReverse = null;
        try {
            PrintWriter out1 = new PrintWriter(new FileOutputStream("text.txt"));
            out1.println("BLACKPINK");
            out1.println(123);
            out1.print(12345);
            out1.println("IS THE REVOLUTION");
            out1.close();
            }catch (IOException e) {
            System.out.println("Problem with file output"); 
            }

        try {
            Scanner in = new Scanner(new FileInputStream("text.txt"));
            String str="";
            while (in.hasNextLine()){
                str=in.nextLine();
                TextReverse= str.toCharArray();
            }
            in.close();
            }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
            }
            
        try {
            PrintWriter out2 = new PrintWriter(new FileOutputStream(".txt"));
            for(int i=TextReverse.length-1; i>=0; i--){
                    out2.println(TextReverse[i]);
                }
            }catch (IOException e) {
            System.out.println("Problem with file output"); 
            }
       
    }
}
