
//Opps to print methords of cellphone like vibrating and ringing.

class CellPhone{
    
    public void ring(){
        System.out.println("  Ringing....");
    }
    
    public void vibrate(){
        System.out.println("  Vibrating....");
    }
}

public class CellPhone{
    public static void main(String[] args) {
        
        CellPhone redmi = new CellPhone();
        
        redmi.ring();
        redmi.vibrate();
    
    }
}
