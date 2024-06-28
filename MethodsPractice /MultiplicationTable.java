
//Multiplication Table Using Methods

public class MultiplicationTable {
    static void mult(int a){
        for(int i = 1; i < 11; i ++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
    public static void main(String[] args) {
        mult(2);
    }
}
