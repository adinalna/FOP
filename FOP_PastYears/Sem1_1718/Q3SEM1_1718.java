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
import java.util.Scanner;
import java.util.Random;
public class Q3SEM1_1718 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        Random r = new Random();
        int N;
        System.out.print("Enter the number of random integers: ");
        N=s.nextInt();
        int[]Numbers = new int [N];
        for(int i=0; i<Numbers.length; i++){
            Numbers[i]=r.nextInt(10001);
        }
        Display(Numbers);
        System.out.println("Minimum number : "+Minimum(Numbers));
        NearestHundred(Numbers);
        Reverse(Numbers);
        }
    
        public static void Display(int[]num){
            System.out.print("The random integer : ");
            for(int i=0; i<num.length;i++){
                System.out.print(num[i]+" ");
            }
            System.out.println();
        }
        
        public static int Minimum(int[]num){
            int min=num[0];
            for(int i=0; i<num.length;i++){
                if(num[i]<min)
                    min=num[i];
            }
            return min;
        }
        
        public static void NearestHundred(int[]num){
            System.out.print("The approximation of the integer to the nearest hundred : ");
            int[]Rounded=num.clone();
            int temp=0;
            for(int i=0; i<num.length;i++){
                temp=Rounded[i]/10;
                if(temp%10>=5)
                    Rounded[i]=((Rounded[i]+99)/100)*100;
                else if(temp%10<5)
                    Rounded[i]=(Rounded[i]/100)*100;
                System.out.print(Rounded[i]+" ");
            }
            System.out.println();
        }
        
        public static void Reverse(int[]num){
            int[]ReverseNum=num.clone();
            int digit;
            for(int i=0; i<num.length;i++){
                int temp=0;
                while(ReverseNum[i]!=0){
                    digit=ReverseNum[i]%10;
                    ReverseNum[i]/=10;
                    temp=temp*10+digit;
                }  
                ReverseNum[i]=temp;
            }       
            System.out.print("The random integer in reverse order : ");
            for(int i=0; i<num.length;i++){
                System.out.print(ReverseNum[i]+" "); 
            }
            System.out.println();
        }
}
