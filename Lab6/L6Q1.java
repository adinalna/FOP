/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6Q1;

/**
 *
 * @author adina
 */
public class L6Q1 {
    public static void main(String[] args) {
        System.out.println("The first 20 triangular numbers: ");
        for(int i=1; i<=20; i++)
            System.out.print(Triangular(i)+" ");
    }
    public static int Triangular(int a){ 
        int num;
        num = a*(a+1)/2;
        return num;
    }
}
