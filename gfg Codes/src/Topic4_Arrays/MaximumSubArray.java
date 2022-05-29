package Topic4_Arrays;

import java.util.Scanner;

public class MaximumSubArray {

	 static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int res = arr[0];
		int maxEnd = arr[0];
    
		for(int i=1;i<n;i++) {
			
			maxEnd = max(maxEnd + arr[i],arr[i]);
			
			res = max(res,maxEnd);
		}
		
		System.out.println(res);
	}
	
	public static int max(int a,int b) {
		if(a>b)
			return a;
		else
	        return b;		
	
	}

}
