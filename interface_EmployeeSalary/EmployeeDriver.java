package interface_EmployeeSalary;

public class EmployeeDriver {

    public static void main(String[] args) {

    	FullTimeEmployee ftm =new FullTimeEmployee(101, "Anish", 30000);
    	ftm.displayDetails();

        System.out.println("----------------");

        PartTimeEmployee ptm = new PartTimeEmployee(102, "Ravi", 80, 200);
        ptm.displayDetails();
    }
}