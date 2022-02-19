/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T6;

/**
 *
 * @author adina
 */
import java.util.Scanner;
import java.util.Random;
public class T6 {
    public static void main(String[] args) {
        
        //1(a)
        /*
        Scanner s = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter an 3 integer:");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        System.out.println("The maximum number is "+maximum(num1,num2,num3));
        
    }
        
        public static int maximum (int a, int b, int c){
            int max=a;
            if (b>a){
                if (b>c)
                    max=b;
                else 
                    max=c;
            }
            else if (c>a){
                if (c>b)
                    max=c;
                else 
                    max=b;
            }    
            return max;
        }
        */
        
        //(b)
        /*
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num=s.nextInt();
        System.out.println(square(num));
    }
        public static String square (int a){
            String result;
            if (a%(Math.sqrt(a))==0){
                result="The integer is a square number";
            }
            else {
                result="The integer is not a square number";
            }
            return result;
        }
        */
        
        //(c) idk :(
        
        //(d)
        /*
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num=s.nextInt();
        System.out.println(Pentagonal(num));
        }
        public static String Pentagonal(int a){
            int p;
            String result = "The number is not a pentagonal number";
            for (int n=1; n<=a/2;n++){
                p=n*((3*n)-1)/2;
                if (a==p){
                    result="The number is a pentagonal number";
                    break;
                }
            }
            if(a==1)
                result="The number is a pentagonal number";
            
            return result;
        }
        */
        
        //(e)
        /*
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=s.next();
        NumberInString(str);
       
        
    }
        public static void NumberInString(String a){
            char[] ch=a.toCharArray();
            int letters=0, digits=0;
            for (int i=0; i<ch.length; i++){
                if(Character.isLetter(ch[i]))
                    letters++;
                else if(Character.isDigit(ch[i]))
                    digits++;
            }
            System.out.println("Number of letter: "+letters);
            System.out.println("Number of digits: "+digits);
        }
        */
        
        //(f)
        /*
        int num;
        Random r = new Random();
        for(int i=1; i<=10; i++){
            num = r.nextInt(101);
            RandomNumber(num);
        }
    }
        public static void RandomNumber(int a){
            System.out.print(a+" ");
        }
        */
        
        //(g)
        /*
        double radius;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius=s.nextDouble();
        Circle(radius);
        
    }
        public static void Circle (double a){
            double area, circumference;
            area = a*a*Math.PI;
            circumference = 2*Math.PI*a;
            System.out.printf("Area of circle: %.2f\n",area);
            System.out.printf("Circumference of circle: %.2f\n",circumference);
        }
        */
        
        //(h)
        /*
        Random r = new Random();
        for(int i=0;i<10;i++){
            NoRepeat(r.nextInt(101),i);
        }
        System.out.println("Number repeated: "+NoRepeat(r.nextInt(101),i));
    }
        public static int NoRepeat(int a, int b){
            int [] num = new int [10];
            int repeat = 0;
            num[b]=a;
            System.out.print(num[b]+" ");
            for(int j=0;j<b;j++){
                if(num[j]==num[b]){
                    repeat=num[b];
                    break;
                }
            }
            
            return repeat;
        }
        */
        
        //2
        /*
        int num1,num2,num3;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        num1 = s.nextInt(); num2 = s.nextInt(); num3 = s.nextInt();
        DecreasingOrder(num1,num2,num3);
    }
        public static void DecreasingOrder(int a,int b,int c){
            int[] numbers={a,b,c};
            for ( int pass = 1; pass < numbers.length; pass++ ) 
		for ( int i = 0; i < numbers.length - 1; i++ ) 
			if ( numbers[ i ] < numbers[ i + 1 ] )  {
               		int hold = numbers[i];        
				numbers[i] = numbers[i+1];  
				numbers[i+1] = hold;
			}
            System.out.print("Array in descending order: ");
            for(int i=0; i<numbers.length; i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
        }
       */
}
}
   

