//MatrixAddition

public class Main {
    
    public static void MatrixAddition (String[] args) {
        int [ ][ ] mrx1 = {
            {8,2,4},
            {0,9,2},
            {4,7,1}
        };
        int [ ][ ] mrx2 = {
            {9,4,0},
            {4,5,6},
            {3,8,7}
        };
        int [ ][ ] results = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        
        for(int i = 0; i<mrx1.length; i++){
            for (int j = 0; j<mrx1[i].length; j++){
                results[i][j] = mrx1[i][j] + mrx2[i][j];
               System.out.print(results[i][j]+" ");
            }
           System.out.println(" ");
        }
    }
              }

