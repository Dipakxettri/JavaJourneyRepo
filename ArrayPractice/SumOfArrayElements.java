/*With for Loop*/
public class SumOfArrayElements{
    public static void main(String[] args) {
        int [] arry = {1,2,3,4};
        int sum = 0;
        for (int i = 0;i<arry.length;i++){
            int elements = arry[i];
            sum = elements+sum;
        }
           System.out.print(sum);
    }
}

/* With for each Loop*/
public class SumOfArrayElements{
    public static void main(String[] args) {
        int [] arry = {1,2,3,4};
        int sum = 0;
        for (int elements:arry){
            sum = elements+sum;
        }
           System.out.print(sum);
    }
}
