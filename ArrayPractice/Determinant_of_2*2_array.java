
// calculate Determinant of 2 by 2 array
//Formula for 2 by 2 Matrix/Array |A| = (0,0) * (1,1) - (0,1) * (1,0)

public class Main {
    
    public static void main(String[] args) {
        int [ ] [ ] arry = {
            {1,2},
            {3,4}
        };
        
        int determinant_A = arry[0][0] * arry[1][1] - arry[0][1] * arry[1][0];
        
        System.out.println("  |A| = " + determinant_A);
        
            }
    }
