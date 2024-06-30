
//Opps to identify the Area and Perimeter of a Rectangle 
//Formula :
//Area = length * breadth
//Perimeter = 2 * (length + breadth)

class Rectangle{
    int length;
    int breadth;
    
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
    
}

public class Area&PerimeterOfRectangle {
    public static void main(String[] args) {
        
        Rectangle re = new Rectangle();
        re.length = 5;
        re.breadth = 3;
        System.out.println(re.area());
        System.out.println(re.perimeter());
    }
}
