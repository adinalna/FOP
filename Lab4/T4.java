/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4;

/**
 *
 * @author adina
 */
import java.util.Random;
public class T4 {
    public static void main(String[] args){
        
        //No.1(a)   
        /*
          int n=1;
          while (Math.pow(n,3)<2000){
                n++;}
          
          System.out.println("n: "+(n-1));
        */  
                  
        //(b)
        /*
         for (int num=1;num<=12;num++){
             int square = num*num;
             System.out.println("Square of "+num+" is "+square);
         }
        */ 
        
        //(c)
        /*
        Random r = new Random();
        int c = 0, MAX=100;
        for (int i=1;i<=4;i++){
            for(int j=1; j<=5; j++){  
                c = r.nextInt(MAX+1); 
                System.out.printf("%-5d",c);}
        System.out.printf("%3d\n",c);}
        */
        
        //(d)
        /*
        double num1=1, num2=25,sum=0;
        for(int i=1; i<=25; i++){
            sum = num1/num2;
            num1++;
            num2--;
            if(num1==25&&num2==1)
                break;
    }
        System.out.printf("The sum of series: 1/25+2/24+3/23...+25/1 is %1.2f\n",sum);
        */
        
     //No.2   
     //(a)
     /*
     int sum=0;
     for(int x =10;x>0;x++)
        sum+=x;
     */
     
     //(b)
     /*
     int x=0, y=0;
     do{
        x += 2;
        y += x;
        System.out.println(x + " and " + y);}
     while (x < 100);
     */
     //(c)
     /*
     for (int x=1, y=20; x<y; x++, y-=2)
        System.out.println(x +" "+ y);
     */
     
     //(d)
     /*
     int i =1;
     while(i<10) {
        i++;
        if (i==10)
            System.out.println("Program End");
}   */
     
     
     //No.3 
     
     int f1 = 1, f2 = 1;
        System.out.print("Fibonacci sequence: ");

        for (int i = 1; i <= 10; ++i){
            System.out.print(f1 + ", ");
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
      
     
        
        
        
    }
    
           
}
  
            
    
    

