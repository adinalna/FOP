/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem1_1617;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class Q2SEM1_1617 {
    public static void main(String[] args) {
        
        double fee, increment;
        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the initial tuition feel (i.e year 1): ");
        fee=s.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        increment=s.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        year=s.nextInt();
        System.out.printf("\nComputed tuition fee for year "+year+" is: %.2f",computeFee(fee,increment,year));
        System.out.println();
    }
    public static double computeFee(double fee, double increment,int year){
        //The question sample output seems to be wrong
        for(int i=0; i<year-1; i++){
            fee+=(fee*(increment/100));
        }
        return fee;
    }
}
