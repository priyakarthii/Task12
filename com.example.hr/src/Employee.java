
public class Employee
{

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


    // Method to print name
    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Employee Salary: $" + salary);
    }

}