package Topic4_Arrays;

import java.util.Scanner;

public class LongestEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
    
		int res = 1,c=1;
		
		for(int i=1;i<n;i++) {
			if(arr[i]%2!=arr[i-1]%2) {
				c++;
			}
			else {
				res  =max(res,c);
			}
		}
		
		res = max(res,c);
		
		System.out.println(res);
	}
	
	public static int max(int a,int b) {
		if(a>b)
			return a;
		else
			return b;
	}

}
