
//Simple Calculator Program

import java.util.Scanner;
public class SimpleCalculator {
    
    public static void main(String[] args) {
        
        //variables
        int num1;
        int num2;
        char operator;
        int sum;
        
        //object
        Scanner sc = new Scanner(System.in);
        
        //User Input
        System.out.print("  Enter 1st Number  :");
        num1 = sc.nextInt();
        
        System.out.print("  Enter 2nd Number  :");
        num2 = sc.nextInt();
        
        System.out.print("  Enter Operator  :");
        operator = sc.next().charAt(0);
        
        //conditionals / cases
        switch (operator){
            
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' : 
                System.out.println(num1 / num2);
                break;
            default :
                System.out.println("  Incorrect Input");
        }
        
    }
}