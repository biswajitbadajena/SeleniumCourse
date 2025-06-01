package LearningJava;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 random numbers.");
		for (int n = 0; n < 5; n++) 
		{
			arr[n] = scanner.nextInt();
		}
		int large = arr[0], small = arr[0];
				
		for (int i = 1; i<arr.length ; i++)
		{
			if(arr[i] > large)
				large = arr[i];
			else if(arr[i] < small)
				small = arr[i];
		}
		
		System.out.println("Largest among the entered numbers is "+large);
		System.out.println("Smallest among the entered numbers is "+small);
		scanner.close();

	}

}
