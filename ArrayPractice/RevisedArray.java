
//Array Revise Using Array Reversal algorithm.

public class RevisedArray{
    
    public static void main (String[] args) {
        int [ ] arry = {1,2,3,4,5,6,7,8,9,10};
        int l = arry.length;
        int n = l/2;
        int temp;
        for (int i = 0; i<n; i++){
            temp = arry[i];
            arry[i] = arry[l-i-1];
            arry[l-i-1] = temp;
        }
        for (int i = 0; i<arry.length; i++){
            System.out.print(arry[i] + " ");
        }
        System.out.println(" ");
    }
}

