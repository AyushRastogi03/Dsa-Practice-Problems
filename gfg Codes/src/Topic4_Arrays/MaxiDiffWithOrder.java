package Topic4_Arrays;

import java.util.Scanner;

public class MaxiDiffWithOrder {

	public static void main(String[] args) { // max diff such that arr[j]-arr[i] and arr[j]>arr[i]
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = arr[1] - arr[0];
		int min = arr[0];
		
		for(int i=1;i<n;i++) {
			res = max(res,arr[i]-min);
			min = min(min,arr[i]);
		}
		
		System.out.println(res);
	}
  
	public static int max(int res,int a) {
		if(res>a) {
			return res ;
		}
		else {
			return a;
		}
	}
	
	public static int min(int min,int a) {
		if(min>a) {
			return a ;
		}
		else {
			return min;
		}
	}
}
