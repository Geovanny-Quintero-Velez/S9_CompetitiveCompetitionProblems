import java.util.Arrays;
import java.util.Scanner;

public class GamerHemose {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int nInputs = Integer.parseInt(sc.nextLine());

		String[][] inputs = new String[nInputs*2][];
		
		int[] nWeapons = new int[nInputs];
		int[] enemyLife = new int[nInputs];
		
		for(int i = 0; i < nInputs*2; i++)
		{
			inputs[i] = sc.nextLine().split(" ");
		}
		
		for(int i = 0; i < nInputs; i++)
		{		
			nWeapons[i] = Integer.parseInt(inputs[i*2][0]);
			enemyLife[i]= Integer.parseInt(inputs[i*2][1]);
		}
		
		int[][] weaponsDamage = new int[1000][nInputs];
		
		int column = 0;
		
		for(int i = 1; i < nInputs; i++)
		{
			for(int j = 0; j < nWeapons[i-1]; j++)
			{
				weaponsDamage[j][column] = Integer.parseInt(inputs[(i*2)-1][j]);
			}
			column++;
		}
		
		for(int i = 0; i < nInputs; i++)
		{
			bubbleSortMatrix(weaponsDamage, weaponsDamage[i].length, i);
		}
		
		for(int i = 0; i < weaponsDamage.length; i++)
		{
			for(int j = 0; j < weaponsDamage[0].length; j++)
			{
				System.out.println(weaponsDamage[i][j]);
			}
		}
		
		int totalDamage = 0;
		int count = 0;
		
		for(int i = 0; i < enemyLife.length; i++)
		{
			for(int j = 0; j < nWeapons[i] && totalDamage < enemyLife[i]; j++)
			{
				totalDamage += weaponsDamage[j][i];
				count++;
			}
			
			System.out.println(count);
			
			totalDamage = 0;
			count = 0;
		}
	}
	
	public static void bubbleSortMatrix(int arr[][], int n, int column) //Adaptado del github del grupo
	{
		for(int i = 1; i < n -1; i++)
	   	{
	    	if (arr[column][i] > arr[column][i-1])
	    	{
	    		int temp = arr[column][i];
	    		arr[column][i] = arr[column][i-1];
	            arr[column][i-1] = temp;
	    	}
	   	}
	}
	
}