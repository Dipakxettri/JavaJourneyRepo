
//Opps to identify the Area and Perimeter of a Square
//Formula :
//Area = side * side
//Perimeter = 4 * side

class Square{
    int side;
    
    public int area(){
        return side * side;
    }
    
    public int perimeter(){
        return 4 * side;
    }
}

public class Main{
    public static void main(String[] args) {
        
        Square sq = new Square();
        sq.side = 8;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
