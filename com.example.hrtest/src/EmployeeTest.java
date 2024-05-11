import  com.example.hr.Employee;

public class EmployeeTest {


    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee("priya", 1001, 50000.0);

        // Access fields using getters
        System.out.println("Employee ID: " + emp1.getId());
        emp1.printName();
        emp1.printSalary();
    }

}
