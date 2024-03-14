package in.acts.cdac;
import java.util.Scanner;
 class Question4 {

	public static void main(String[] args) {
		int day;
		System.out.println("Enter the day number");
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		switch (day) {
        case  1 :
             System.out.println("Monday");
            break;
        case 2:
        	 System.out.println("Tuesday");
            break;
        case 3:
        	 System.out.println("wensday");
            break;
        case 4:
        	 System.out.println("Thursday");
            break;
        case 5:
        	 System.out.println("Firday");
        	break;
        case 6:
        	 System.out.println("Saturday");
        	break;
        case 7:
        	 System.out.println("Sunday");
        	break;
        default:
            System.out.println("Error: Invalid input");
            return;
    }
	}

}
