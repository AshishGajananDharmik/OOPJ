package in.acts.cdac;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		int number1=10;
		int number2=20;
		int result;
		System.out.println("Enter the choice");
		System.out.println("+ additon ");
		System.out.println("- subtraction");
		System.out.println(" * Multiplication");
		System.out.println("/ divide");
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		switch (choice) {
        case '+':
            result = number1 + number2;
            break;
        case '-':
            result = number1 - number2;
            break;
        case '*':
            result = number1 * number2;
            break;
        case '/':
            if (number2 != 0) {
                result = number1 / number2;
            } else {
                System.out.println("Error: Division by zero");
                return;
            }
            break;
        default:
            System.out.println("Error: Invalid operator");
            return;
    }
		
		// TODO Auto-generated method stub
		System.out.println("Result: " + result);
	}

}
