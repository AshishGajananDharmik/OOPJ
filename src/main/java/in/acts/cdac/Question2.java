package in.acts.cdac;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check leaap year or not");
		int year=sc.nextInt();
		
		if(year%4==0 || year%400 == 0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not Leap year");
		}

	}

}
