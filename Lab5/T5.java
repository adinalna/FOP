/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T5;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.util.Random;
public class T5 {
    public static void main(String[] args) {
        
        //1(a)
        //float[] num = new float[12];
        
        //(b)
        //char[] letter = {'A', 'B', 'C', 'D', 'E'};
        
        
        //(c)
        //String[] Name = new String[100];
        
        //(d)
        //int[][] integer = new int[6][2];
        
        //(e)
        //int[][] matrix = {{6,9},{2,5},{4,6}};
       
        //(g)
        //matrix[1][1] = 4; matrix[2][0] = 3; matrix[2][1] = 7;
        
        //2(a)
        //String[] code = {"AAA","AAB","AAC","AAC"};
        
        //(b)
        /*
        int sum=0;
        int[]num = new int[10];
        for(int k=0; k<=num.length; k++)
            sum+=num[k];
        
        */
        
        //(c)//check 
        /*
        int[][]t = new int[3][];
        t[1][2] = 5;
        System.out.println(t[1][2]);
        */
        
        //(d)
        /* check 
        int i =4;
        int []score=new int[6];
        score[1]=78;
        score[++i]=100;
        System.out.println(score[i]);
        */
        
        //3
        /*
        int[] marks = new int[5];
        marks[0] = 12;
        marks[1] = 31;
        marks[0] = 961;
        marks[3] = 31;
        marks[2] = 1;
        marks[2] = 961;
        */
        // marks[0]=12, ,marks[1]=31, marks[2]=961, marks[3]=31
        
        //4
        /*
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str=s.nextLine();
        String[] sentence = str.split(" ");
        for(int i=0; i<sentence.length; i++)
            if(sentence[i].equals("the")){
                sum++;
            }
             System.out.println("Occurrence of \"the\": "+sum);
        */     
        
        //5
        /*
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str=s.nextLine();
        char []sentence =str.toCharArray();
        System.out.print("Sentence in reverse: ");
        for(int i=sentence.length-1; i>=0; i--){
            System.out.print(sentence[i]);
            }
        System.out.println();
        */
        
        //6
        
        Random r = new Random();
        int num = r.nextInt(256);
        System.out.println("The number: "+num);
        int[] bin = new int[8];
        for(int i= bin.length-1; i>=0; i--){
            bin[i]=num%2;
            num/=2;
        }
        System.out.print("Binary conversion: ");
        for (int j=0; j<bin.length; j++){
            System.out.print(bin[j]);
        }
        System.out.println();
        
         
            
        
        
        
        
        
        
        
        
        
        
                
                
                
                
        
        
        
        
        
        
        
        
        
               
        
        
        
        
    }
    
}
