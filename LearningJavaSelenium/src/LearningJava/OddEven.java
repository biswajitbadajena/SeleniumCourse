package LearningJava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi please enter a number");
		int num = scanner.nextInt();
		if (num%2 == 0)
			System.out.println("The number is an EVEN number.");
		else
			System.out.println("The number is an ODD number.");
		scanner.close();

	}

}
