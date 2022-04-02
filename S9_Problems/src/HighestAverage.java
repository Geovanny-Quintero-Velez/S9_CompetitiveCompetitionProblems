package Main;

import java.util.Arrays;
import java.util.Scanner;

public class HighestAverage
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int arrLength = Integer.parseInt(sc.nextLine());
		
		String[] stringValues = new String[arrLength];
		
		stringValues = sc.nextLine().split(" ");
		
		int[] values = new int[arrLength];
		
		for(int i = 0; i < arrLength; i++)
		{
			values[i] = Integer.parseInt(stringValues[i]);
		}
		
		int queries = Integer.parseInt(sc.nextLine());
		
		int[] kValues = new int[queries];
		
		for(int i = 0; i < queries; i++)
		{
			kValues[i] = Integer.parseInt(sc.nextLine());
		}
		
		int length = 0;
		int average = 0;
		
		Arrays.sort(values);
		
		for(int i = 0; i < kValues.length; i++)
		{
			for(int j = 1; j <= values.length; j++)
			{
				average = averageArr(values, j);
				
				if(average < kValues[i])
				{
					length++;
				}
				else 
				{
					break;
				}
			}
			
			System.out.println(length);
			length = 0;
		}
	}
	
	public static int averageArr(int arr[], int indx)
	{
		int result = 0;
		for(int i = 0; i < indx; i++)
		{
			result += arr[i];
		}
		result /= indx;
		return result;
	}
}
