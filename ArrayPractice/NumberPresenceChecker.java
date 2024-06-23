//NumberPresenceChecker
public class ValueCheck{
    public static void NumberPresenceChecker (String[] args) {
        int [] arry = {1,2,3,4};
        boolean IsFind = false;
        int numm = 4;
        for(int elements:arry){
            if (elements == numm){
                IsFind = true;
                break;
            }
        }
        if (IsFind){
            System.out.println("  The Present");
        }
        else{
            System.out.println("  Not Present");
        }
    }
}
