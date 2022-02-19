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
import java.util.Random;
public class Q2SEM1_1819 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N;
        System.out.print("Enter N : ");
        N=s.nextInt();
        int[][]A=new int[N][N];
        int[][]B=new int[N][N];
        Matrix(A);
        Matrix(B);
        DisplayMatrix(A,B);
        MatrixAddittion(A,B);
        MatrixMultiplication(A,B);
    }
    
    public static int[][]Matrix(int[][]a){
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=r.nextInt(10);
            }
        }
        return a;
    }
    
    public static void DisplayMatrix(int[][]a,int[][]b){
        //display matrix A
        System.out.print("Matrix A");
        for(int i=0;i<a.length;i++){
            System.out.println();
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println();
        //matrix B
        System.out.print("Matrix B");
        for(int i=0;i<b.length;i++){
            System.out.println();
            for(int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
        }  
    }
    
    public static void MatrixAddittion(int[][]a,int[][]b){
        //addition of matrix A and B
        int Result[][]=new int[a.length][a.length];
        for(int i=0;i<Result.length;i++){
            for(int j=0;j<Result[0].length;j++){
                Result[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println();
        //diplay result matrix
        System.out.print("Matrix A + B");
        for(int i=0;i<Result.length;i++){ 
            System.out.println();
            for(int j=0;j<Result[0].length;j++){
                System.out.print(Result[i][j]+" ");
            }
        }
    }
    
    public static void MatrixMultiplication(int[][]a,int[][]b){
        //multiplication of A and B
        int Result[][]=new int[a.length][a.length];
        for(int i=0;i<Result.length;i++){ 
            for(int j=0;j<Result[0].length;j++){
                   Result[i][j]=0;
               for(int k=0;k<Result[0].length;k++){
                   Result[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println();
        //display result
        System.out.print("Matrix A X B");
        for(int i=0;i<Result.length;i++){ 
            System.out.println();
            for(int j=0;j<Result[0].length;j++){
                System.out.print(Result[i][j]+" ");
            }
        }
        System.out.println();
    }
}
