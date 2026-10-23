package interface_EmployeeSalary;

public class PartTimeEmployee implements Employee {

    int empId;
    String eName;
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(int empId, String eName,
                            int hoursWorked, double hourlyRate) {
        super();
        this.empId = empId;
        this.eName = eName;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

 
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + eName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Salary: " + calculateSalary());
    }
}