import java.util.Scanner;

public class MonkEncounterWithPolynomial {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int numOfInputs=Integer.parseInt(sc.nextLine());
		String[][] inputs=new String[numOfInputs][];
		long[] cuad=new long[numOfInputs];
		long[] bx =new long[numOfInputs];
		long[] c =new long[numOfInputs];
		long[] k =new long[numOfInputs];
		for(int i=0;i<numOfInputs;i++) {
			inputs[i]=sc.nextLine().split(" ");
			cuad[i]=Integer.parseInt(inputs[i][0]);
			bx[i] =Integer.parseInt(inputs[i][1]);
			c[i]=Integer.parseInt(inputs[i][2]);
			k[i]=Integer.parseInt(inputs[i][3]);
		}
		for(int i=0;i<numOfInputs;i++) {
			int x=0;
			
			
			while(!(((cuad[i]*x*x)+(bx[i]*x)+c[i])>=k[i])) {
				
				x++;
			}
			System.out.println(x);
		}
	}
}
