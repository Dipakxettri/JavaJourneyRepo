
//MaxValueCheck

public class MaxValueCheck{
    public static void main (String[] args) {
        int [ ] arry = {1,2,100,3,0,9,4};
        int max = arry[0];
        for(int el : arry){
            if (el > max){
                max = el;
            }
        }
         System.out.println("  The max value in an array is "+max);
        }
    }
