package LearningJava;

import java.util.Scanner;

public class AgeCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi please enter your age.");
		int age = scanner.nextInt();
		String category = age>65 ? "Senior Citizen" 
				: (age<18 ? "Minor" : "Adult");
		System.out.println("The age category is: " + category);

	}

}
