/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1819;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q4SEM1_1819 {
    public static void main(String[] args) {
        
        try {
            Scanner in = new Scanner(new FileInputStream("myAmbition.txt"));
            String line;
            int sentences=0,totalWords=0;
            char[]ch;
            char character;
            int[]CharacterNum=new int[26];
            while (in.hasNextLine()){
                line=in.nextLine();
                String[]words=line.split(" ");
                totalWords+=words.length;
                ch=new char[line.length()];
                for (int i = 0; i < line.length(); i++) { 
                    ch[i] = line.charAt(i); 
                    if(ch[i]=='.')
                        sentences++;
                } 
                for (int i = 0; i < line.length(); i++) { 
                    character=line.charAt(i);
                    if(Character.isLetter(character)){
                        character=Character.toUpperCase(character);
                        CharacterNum[character-'A']++;
                    }  
                }
            }  
            System.out.println("Number of sentences : "+sentences);
            System.out.println("Number of words : "+totalWords);
            for (int i = 0; i < CharacterNum.length; i++) { 
                System.out.print((char)(i+'A')+" : "+CharacterNum[i]+" ");
                if((i+1)%8==0)
                    System.out.println();
            }
            System.out.println();
            
            in.close(); 
            
            } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
            }
            
            
        
    }
}
