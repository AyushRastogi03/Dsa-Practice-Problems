package Topic4_Arrays;

import java.util.Scanner;

public class StockBuyandSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			
			arr[i] = sc.nextInt();
		}
		
		int t = arr[0];
		
		int d=0;
		
		for(int i=1;i<n;i++) {
			if(t<arr[i]) {
				d = d + (arr[i]-t);
				t = arr[i];
			}
			else {
				t = arr[i];
			}
		}
		
		System.out.println(d);

	}

}
