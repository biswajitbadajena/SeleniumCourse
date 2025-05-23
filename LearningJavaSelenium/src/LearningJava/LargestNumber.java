package LearningJava;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number.");
		int N1 = scanner.nextInt();
		System.out.println("Enter 2nd number.");
		int N2 = scanner.nextInt();
		System.out.println("Enter 3rd number.");
		int N3 = scanner.nextInt();
		int largest = N1>N2 ? (N1>N3 ? N1 : N3)
				: (N2>N3 ? N2 : N3);
		System.out.println("Largest number is: " + largest);

	}

}
