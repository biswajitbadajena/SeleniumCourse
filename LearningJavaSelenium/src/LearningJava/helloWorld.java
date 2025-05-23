package LearningJava;

import java.util.Scanner;

public class helloWorld {

	public static void main(String Args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi please provide your name");
		String name = scanner.next();
	    System.out.println("Hello "+ name);
	}
}
