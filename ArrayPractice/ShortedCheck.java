
//ShortedCheck

public class ShortedCheck{
    public static void main (String[] args) {
        int [ ] arry = {2,4,8,10,12,18,20,40};
        boolean isShort = true;
        for(int i = 0; i<arry.length-1;i++){
            if(arry[i]>arry[i+1]){
                isShort = false;
                break;
            }
        }
        if(isShort){
            System.out.println("  Arry is Shorted");
        }
        else{
            System.out.println("  Arry is not Shorted");
        }
        }
    }

