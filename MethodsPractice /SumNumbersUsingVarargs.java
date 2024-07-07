
//Printing the sum of numbers using VarArgs

public class SumNumbersUsingVarargs {
    static void sumNumbers(int... arry){
        int sum = 0;
        for (int i = 0; i < arry.length; i ++){
            sum = sum + arry[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        sumNumbers(1,2,3,4);
    }
