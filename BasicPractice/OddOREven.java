
//Odd or Even Check;

import java.util.Scanner;
public class OddOREven {
    
    public static void main(String[] args) {
        
        //variables
        int num;
        
        //object
        Scanner sc = new Scanner(System.in);
        
        //User Input
        System.out.print("  Enter Number  :");
        num = sc.nextInt();
        
        //conditionals
        if(num%2 == 0){
            System.out.println("  Even");
        }
        else{
        System.out.println("  Odd");
        }
    }
}
