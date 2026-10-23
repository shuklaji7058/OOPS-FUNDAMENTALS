package interface_EmployeeSalary;

public class FullTimeEmployee implements Employee {

    int empId;
    String eName;
    double salary;

    public FullTimeEmployee() {
        super();
    }

    public FullTimeEmployee(int empId, String eName, double salary) {
        super();
        this.empId = empId;
        this.eName = eName;
        this.salary = salary;
    }

    
    public double calculateSalary() {
        return salary;
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: " + calculateSalary());
    }
}