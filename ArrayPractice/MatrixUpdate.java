
//MatrixUpdate

import java.util.Scanner;
public class MatrixUpdate {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[ ][ ] matrix = {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
        };
        int rl= matrix.length;
        System.out.println("  Update an matrix game");
        System.out.print("  Enter Row  :");
        int row = sc.nextInt();
        System.out.print("  Enter Column  :");
        int column = sc.nextInt();
        System.out.print("  Enter Value  :");
         int value = sc.nextInt();
        System.out.println(" ");
        matrix[row][column] = value;
        
        for(int i = 0; i<rl; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
