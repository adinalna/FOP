/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L7Q4;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class L7Q4 {
    public static void main(String[] args) {
        
        try {
        Scanner in= new Scanner(new FileInputStream("C:\\Users\\adina\\OneDrive\\Desktop\\UM Assignments\\WIX1002 Fundamentals of Programming\\bp.txt"));
        String str="";
        int i=0, numWords=0, numCh=0;
        String[]words=null;
        char[]characters = null;
        while (in.hasNextLine()){
            str=in.nextLine();
            words=str.split(" ");
            numWords+=words.length;
            characters=str.toCharArray();
            numCh+=characters.length;
            for(int j=0; j<characters.length; j++){
                if(characters[j]==' ')
                    numCh--;
            }
            i++;
        }
        System.out.println("Number of characters: "+numCh);
        System.out.println("Number of words: "+numWords);
        System.out.println("Number of lines: "+i);
        in.close();
        } catch (FileNotFoundException e) {
        System.out.println("File was not found"); 
        }

        
    }
    
}
