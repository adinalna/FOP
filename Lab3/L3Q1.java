/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3Q1;

/**
 *
 * @author adina
 */
import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);    
    int num1,num2,answer = 0;
    char operator;
    System.out.print("Enter two interger number: ");
    num1 = s.nextInt(); num2 = s.nextInt();
    System.out.print("Enter the operand: ");
    operator = s.next().charAt(0);
    
    if(operator=='+')
        answer=num1+num2;
    else if(operator=='-')
        answer=num1-num2;
    else if(operator=='*')
        answer=num1*num2;
    else if(operator=='/')
        answer=num1/num2;
    else if(operator=='%')
        answer=num1%num2;
    
    System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    
}
}