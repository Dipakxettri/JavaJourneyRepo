
//Sum of Natural Numbers

public class NaturalNumberSum {
    static int naturalNumberSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + naturalNumberSum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(naturalNumberSum(10));
    }
}


