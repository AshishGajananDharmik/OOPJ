package question3.com;
public class Employee {
    // Overloaded method for int parameter
    public void displayInfo(int employeeId) {
        System.out.println("Employee ID: " + employeeId);
    }

    // Overloaded method for double parameter
    public void displayInfo(double salary) {
        System.out.println("Employee Salary: $" + salary);
    }

    // Overloaded method for String parameter
    public void displayInfo(String employeeName) {
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        // Calling each overloaded method with appropriate arguments
        emp.displayInfo(101); // Calling with int parameter
        emp.displayInfo(55000.0); // Calling with double parameter
        emp.displayInfo("John Doe"); // Calling with String parameter
    }
}