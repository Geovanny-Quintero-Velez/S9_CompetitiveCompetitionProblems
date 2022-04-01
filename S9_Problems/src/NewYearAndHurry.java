
import java.util.Scanner;

public class NewYearAndHurry {
		
	public static void main(String[]args) {
		int time=4*60;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		int k=Integer.parseInt(input[1]);
		int n=Integer.parseInt(input[0]);
		time=time-k;
		int[] ns=new int[n];
		for(int i=0;i<ns.length;i++) {
			ns[i]=5*(i+1);
		}
		int i=0;
		while(time>=0&&i<ns.length) {
			time-=ns[i];
			i++;
		}
		if(time<0) {
			i--;
		}
		System.out.println(i);
	}
	
}
