
//Simple Opps program to simulate different actions like in a game

class TommyVecetti{
    
    public void hit(){
        System.out.println("  Hitting....");
    }
    
    public void run(){
        System.out.println("  Running....");
    }
    
    public void fire(){
        System.out.println("  Firing....");
    }
}

public class GameActions{
    public static void main(String[] args) {
        
        TommyVecetti player1 = new TommyVecetti();
        player1.hit();
        player1.run();
        player1.fire();
    }
}
