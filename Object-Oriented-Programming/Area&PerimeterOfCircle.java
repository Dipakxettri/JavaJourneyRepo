
// Finding the area and perimeter of a circle

//Formula to calcluate the area and perimeter of  a circle  :
//Area = pi * radious * radious
//Perimeter = 2 * pi * radious
//The value of pi(π) is 3.14 by default

class Circle{
    float  radious;
    float pi;
    
    public float area(){
        return pi * radious * radious;
  
    }
    public float perimeter(){
        return 2 * pi * radious;
    }
    
}

public class Area&PerimeterOfCircle{
    public static void main(String[] args) {
        
        Circle ci = new Circle();
        
        ci.radious = 5f;
        ci.pi = 3.14f;
        
        System.out.println(ci.area());
        System.out.println(ci.perimeter());
        
        
    }
}

