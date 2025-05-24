package LearningJava;
import java.util.*;
public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter year.");
		int year = scanner.nextInt();
		System.out.println("Please enter month number.");
		int month_num = scanner.nextInt();
		
		if((year % 4 == 0 && year % 100 !=0) || year % 400 ==0)
		{
			switch (month_num)
			{
				case 2:
					System.out.println("Month has 29 days in it.");
					break;
			    case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("Month has 31 days in it.");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Month has 30 days in it.");
			        break;
			    default :
			    	System.out.println("There is no month number as "+ month_num);
			    
			}
		}
		
		else
		{
			switch (month_num)
			{
				case 2:
					System.out.println("Month has 28 days in it.");
					break;
			    case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("Month has 31 days in it.");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Month has 30 days in it.");
			        break;
			    default :
			    	System.out.println("There is no month number as "+ month_num);	
		}
		

	}
		scanner.close();

}
	
}
