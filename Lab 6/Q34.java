import java.util.Scanner;

class Employee_Detail{
    int Employee_ID;
    String Name;
    String Destination;
    double Salary;


    void getDetails(int Employee_ID, String Name, String Destination, double Salary){
        System.out.println("Employee ID: "+Employee_ID);
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee Destination: "+Destination);
        System.out.println("Employee Salary: "+Salary);    
    }

    
    }


public class Q34 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Employee_Detail a = new Employee_Detail();
        System.out.println("Enter Employee ID: ");
         a.Employee_ID = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        a.Name = sc.next();
        System.out.println("Enter Employee Destination: ");
        a.Destination = sc.next();
        System.out.println("Enter Employee Salary: ");
        a.Salary = sc.nextDouble();
        a.getDetails(a.Employee_ID, a.Name, a.Destination, a.Salary);
        
    }
}
