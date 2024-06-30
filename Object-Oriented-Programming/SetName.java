
//Opps to set name;


class Employee{
    String name;
    int salary;
    
    public String getName(){
        return name;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setName(String n){
        name = n;
    }
}

public class SetName{
    public static void main(String[] args) {
        
    Employee deepak = new Employee();
        deepak.salary = 80;
        System.out.println("  "+deepak.getSalary());
        deepak.setName("  Deepak Ghimire");
        System.out.println(deepak.getName());
    }
}
