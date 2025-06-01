package LearningJava;
import java.util.*;
public class MoveDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[] = {2,0,4,0,0,6};
		int temp;
		for (int i = arr.length-1; i >= 0; i--)
		{
			if(arr[i] == 0)
			{
				for (int j=i; j<=arr.length-2 && arr[j+1] !=0 ; j++)
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;					
				}
			}
			
		}
		
		for (int k = 0; k <= arr.length-1; k++)
			System.out.println(arr[k]);
		scanner .close();

	}
	
}
