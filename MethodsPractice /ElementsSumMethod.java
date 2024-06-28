
//Array elements Sum using methods

public class ElementsSumMethod {
    static void sum(int [ ] array){
        int sum = 0;
        for (int i = 0; i < array.length; i ++){
            sum += array[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int [ ] arry = {2,2,2,2};
        sum(arry); 
    }
}
