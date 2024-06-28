
//Printing Star pattern using methords in java

/*
*
**
***
****
*/
public class StarPattern {
    static void starpattern(int n){
        for(int i = 0; i <n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
    public static void main(String[] args) {
        starpattern(4);
    }
}

