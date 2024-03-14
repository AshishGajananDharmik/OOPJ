package in.acts.cdac;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerical grade");
		int marks =sc.nextInt();
		if(marks>90)
		{
			System.out.println("A+ Grade");
			
		}else if(marks>80 && marks<=90)
		{
			System.out.println("A Grade");
		}else if(marks>70 && marks<=80)
		{
			System.out.println("B Grade");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("C Grade");
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
