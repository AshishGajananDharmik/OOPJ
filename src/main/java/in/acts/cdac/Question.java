package in.acts.cdac;
import java.util.Scanner;
public class Question {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		ch=sc.next().charAt(0);
		 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                System.out.println(ch + " is a vowel.");
	            } else {
	                System.out.println(ch + " is a consonant.");
	            }
	        } else {
	        	System.out.println("Invalid input. Please enter a valid alphabet character.");
	        }

	}

}
