package in.acts.cdac;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your weight in kilograms: ");
		        double weight = scanner.nextDouble();

		        System.out.print("Enter your height in meters: ");
		        double height = scanner.nextDouble();

		     
		        double bmi = weight / (height * height);

		       
		        String category;
		        if (bmi < 18.6) {
		            category = "underweight";
		        } else if (bmi >= 18.6 && bmi < 25) {
		            category = "normal weight";
		        } else {
		            category = "overweight";
		        }

		      
		        System.out.println("Your BMI is: " + bmi);
		        System.out.println("You are classified as: " + category);

		        scanner.close();
		   


	}

}
