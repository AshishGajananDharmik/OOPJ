package example.com;



class Employee {
	 String name;
	 int empid;
	 float salary;
	
}

public class EmployeeDetails {
	public static void main(String []args)
	{
		Employee emp1 =new Employee();
		emp1.name="Ashish";
		emp1.empid=10;
		emp1.salary=10.2f;
		System.out.println("name:  empid :  salary: ");
		System.out.println(emp1.name+"  " +emp1.empid+"       "+emp1.salary);
		
		
	}

}
