package LearningJava;
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.*;
public class GradeValue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Grade.");
		String input = scanner.next();
		char grade;
		if(input.length() == 1)
		{
			grade = input.charAt(0);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        char c = (char)br.read();
			
			switch (grade)
			{
			case 'A':
			case 'a':
				System.out.println("Your rating is 'EXCELLENT'.");
				break;
			case 'B':
			case 'b':
				System.out.println("Your rating is 'VERY GOOD'");
				break;
			case 'C':
			case 'c':
				System.out.println("Your rating is 'GOOD'");
				break;
			case 'D':
			case 'd':
				System.out.println("Your rating is 'NEEDS IMPROVEMENT'");
				break;
			case 'F':
			case 'f':
				System.out.println("Your rating is 'FAIL'");
				break;
			default:
				System.out.println("Invalid Grade entered.");
			}
		}
		else
			System.out.println("Invalid Grade entered.");
		
		scanner.close();

	}

}
