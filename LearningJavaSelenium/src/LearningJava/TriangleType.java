package LearningJava;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of 1st side of triangle.");
		int S1 = scanner.nextInt();
		System.out.println("Enter length of 2nd side of triangle.");
		int S2 = scanner.nextInt();
		System.out.println("Enter length of 3rd side of triangle.");
		int S3 = scanner.nextInt();
		String type = S1==S2 && S1==S3 ? "Equilateral Triangle."
				: (S1==S2 || S2==S3 ? "Isoscales Triangle." : "Scalen Triangle.");
		System.out.println("The triangle is called " + type);

	}

}
