
//MinValueCheck

public class Main{
    public static void main (String[] args) {
        int [ ] arry = {1,2,100,3,0,9,4};
        int min = arry[0];
        for(int el : arry){
            if (el < min){
                min = el;
            }
        }
         System.out.println("  The min value in an array is " + min);
        }
    }


