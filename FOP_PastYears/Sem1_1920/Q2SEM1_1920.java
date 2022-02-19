/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1920;

/**
 *
 * @author adina
 */
//incomplete
import java.util.Scanner;
public class Q2SEM1_1920 {
    public static void main(String[] args) {
        
        //For each column [0]degree,[1]minute,[2]second,
        //[0][3]Latitude,[1][3]Longitude
        double Input1[][]= new double[2][4];
        double Input2[][]= new double[2][4];
        System.out.println("Enter location 1");
        Input(Input1);
        System.out.println("Enter location 2");
        Input(Input2);
        System.out.print("Location 1 : ");
        DecimalDegree(Input1);
        System.out.print("Location 2 : ");
        DecimalDegree(Input2);
        System.out.println("Distance : "+Distance(Input1,Input2));

        
    }
    public static void Input(double[][]input){
        Scanner s = new Scanner(System.in);
        char direction; 
            for(int j=0; j<2;j++){    
                    System.out.print("Enter Direction: [N, S, E, W]: ");
                    direction=s.next().charAt(0);
                    System.out.print("Enter Degree, Minute, and Second : ");
                    input[j][0]=s.nextDouble();
                    input[j][1]=s.nextDouble();
                    input[j][2]=s.nextDouble();
                    if(direction=='S'||direction=='W')
                        input[j][0]=0-input[j][0];
                    
            }
        
    }
    
    public static void DecimalDegree(double[][]Location){
        double Latitude, Longitude;       
        Latitude = Location[0][0]+((Location[0][1]*60)+Location[0][2])/3600;
        Longitude = Location[1][0]+((Location[1][1]*60)+Location[1][2])/3600;
        System.out.printf("%.6f Latitude , %.6f Longitude\n",Latitude,Longitude);
    }
    
    public static double Distance(double[][]Location1, double[][]Location2){
        double a,c,d,difference_latitude,difference_longitude;
        difference_latitude=Math.toRadians(Location1[0][3]-Location2[0][3]);
        difference_longitude=Math.toRadians(Location1[1][3]-Location2[1][3]);
        a=Math.pow(Math.sin(difference_latitude/2),2)+(Math.cos(Location1[0][3])*Math.cos(Location2[0][3])*Math.pow(Math.sin(difference_longitude/2),2));
        c=2*a*Math.tan(2*(Math.sqrt(a)*Math.sqrt(1-a)));
        d=6371*c;
        return d;
    }
}
