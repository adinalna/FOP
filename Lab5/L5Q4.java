/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5Q4;

/**
 *
 * @author adina
 */
import java.util.Random;
public class L5Q4 {
    public static void main(String[] args) {
        Random r = new Random();        
        int[][] matrix = new int[3][3];
        System.out.println("Matrix: ");
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                matrix[i][j]=r.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }  
            System.out.println();
        }
        int newmatrix[][]= new int[3][3];
        newmatrix[0][0]=matrix[2][0];
        newmatrix[0][1]=matrix[1][0];
        newmatrix[0][2]=matrix[0][0];
        newmatrix[1][0]=matrix[2][1];
        newmatrix[1][2]=matrix[0][1];
        newmatrix[2][0]=matrix[2][2];
        newmatrix[2][1]=matrix[1][2];
        newmatrix[2][2]=matrix[0][2];
        
        System.out.print("\n90 degress rotated: ");
        System.out.println();
        for(int i=0; i<newmatrix.length;i++){
            for(int j=0; j<newmatrix[0].length;j++){
                System.out.print(newmatrix[i][j]+" ");
            }  
            System.out.println();
        
        }
        
                
              
                
        
        
    }
}
