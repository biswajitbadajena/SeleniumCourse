package LearningJava;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height of Pyramid.");
		int height = scanner.nextInt();
		int start= height, end= height;
		for(int row_num = 0; row_num < height; row_num++,end++,start--)
		{
			for(int print_star = 1; print_star <= 2*height - 1; print_star++)
			{
				if(print_star>=start && print_star <= end)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
