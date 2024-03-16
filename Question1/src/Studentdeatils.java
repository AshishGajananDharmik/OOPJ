import java.util.Scanner;

public class Studentdeatils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student name");
		student.name=sc.nextLine();
		System.out.println("Enter the Student ID");
		student.StudentId=sc.nextInt();
		System.out.println("Enter the Student marks");
		student.marks=sc.nextFloat();
		System.out.println("Enter the Student age");
		student.age=sc.nextInt();
		System.out.println("Student name: "+student.name);

		System.out.println("Student name: "+student.StudentId);

		System.out.println("Student name: "+student.marks);

		System.out.println("Student name: "+student.age);
	}

}
