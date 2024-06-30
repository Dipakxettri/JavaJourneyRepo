
//Opps to update name

import java.util.Scanner;

class Employee{
    String name;
    int salary;
    
    public void getName(){
        System.out.println(name);
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void changeName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("  Enter your new name  :");
        String namee = sc.nextLine();
        name = namee;
        System.out.print("  Your changed name is "+namee);
        sc.close();
    }
}

public class UpdateName{
    public static void main(String[] args) {
    Employee deepak = new Employee();
        deepak.name = "  Deepak Ghimire";
        deepak.salary= 80;
        deepak.getName();
        System.out.println("  "+deepak.getSalary());
        deepak.changeName();
    }
}
