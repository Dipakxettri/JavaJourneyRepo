
//Rock paper scissors Game

import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        
        
        //title / Guidence
        System.out.println("  Enter 1 for Rock\n  Enter 2 for paper\n  Enter 3 for scissors ");
        
        //objects
        Scanner sc = new Scanner(System.in);
        Random rn =new Random();
        
        int computer = rn.nextInt(3)+1;
        
        //user Inputs or Guesses
        System.out.println("  Computer has guess its number");
        System.out.println("  Your turn  :");
        int player = sc.nextInt();
        
        //Outputs
        System.out.println("  Computer 's input : " + computer);
        System.out.println("  Player 's input : " + player);
        
        //conditionals
        if(computer == 1 && player == 2 || computer == 2 && player == 3 || computer == 3 && player == 1 ){
            System.out.println("  Player win");
        }
        
        else if(computer == 2 && player == 1 || computer == 3 && player == 2 || computer == 1 && player == 3){
            System.out.println("  Computer win");
        }
        else{
            System.out.println("  Incorrect Input");
        }
    }
    
}
