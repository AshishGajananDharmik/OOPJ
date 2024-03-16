package question3.com;

public class Employeedisplay {
	 public static void main(String[] args) {
	        Employee emp = new Employee();

	        // Calling each overloaded method with appropriate arguments
	        emp.displayInfo(101); // Calling with int parameter
	        emp.displayInfo(55000.0); // Calling with double parameter
	        emp.displayInfo("John Doe"); // Calling with String parameter
	
	

}

}