package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		while(lector.hasNextLine()){
			int n = Integer.parseInt(lector.nextLine());
			String[] data = lector.nextLine().split(" ");
			int budget = Integer.parseInt(lector.nextLine());
			ArrayList<Integer> prices = new ArrayList<>();
			for(int i = 0; i<n;i++) {
				prices.add(Integer.parseInt(data[i]));
			}
			Collections.sort(prices);
			System.out.print(findPrices(prices, budget) + "\n"); ;
			lector.nextLine();
		}
		
	}
	
	public static String findPrices(ArrayList<Integer> tempPrices, int budget) {
		int budgetPosition = -1;
		int count = 0;
		while(budgetPosition == -1) {
			budgetPosition = searchPrice(tempPrices, tempPrices.size(), budget-count);
			count++;
		}
		int firstNumberPosition = budgetPosition/2;
		int numberPositionToFind = -1;
		while(numberPositionToFind == -1) {
			numberPositionToFind = searchPrice(tempPrices, firstNumberPosition, budget-tempPrices.get(firstNumberPosition));
			if(numberPositionToFind == -1) {
				firstNumberPosition++;
			}
	
		}
		return ("Peter should buy books whose prices are " + tempPrices.get(numberPositionToFind)+ " and " +tempPrices.get(firstNumberPosition)+".\n");
	}
		
	
	public static int searchPrice(ArrayList<Integer> arr, int n, int k) {
		 int inicio = 0;
	        int fin = n - 1;
	        int medio = -1;
	        while (inicio <= fin){
	            medio = (inicio + fin)/2;
	            if(arr.get(medio) == k){
	                return medio;
	            }else if (k < arr.get(medio)){
	                fin = medio - 1;
	            }else if (k > arr.get(medio)){
	                inicio = medio + 1;
	            }
	        }
	        return -1;
	}
}
