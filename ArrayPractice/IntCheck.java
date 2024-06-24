
//IntCheck

import java.util.Scanner;
public class IntCheck {
    public static boolean isNumber(Object obj) {
        return obj instanceof Number;
    }
    public static void main (String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int [ ]arry = {1,2,3,4};
        int store;
        boolean check;
        for(int i = 0; i<arry.length; i++){
            store = arry[i];
            check = (isNumber(arry[i]));
            if (check == false){
                System.out.println("  The Array does not contant a number ");
                break;
            }
            else{
                System.out.println("  The Array contant a number ");
                break;
            }
        }
    }
}



