package Topic4_ArraysExercise;

import java.util.Scanner;

public class StrongestNeighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt() ;
			
		}
		
		 Strong(arr,n);
		
	   System.out.println();

	}

	
	public static void Strong(int[] arr , int n) {
		
		int t =0;
		for(int i=1;i<n;i++) {
			t = max(arr[i] , arr[i-1]);
			
			System.out.println(t);
		}
		
	}
	
	public static int max(int a, int b) {
		if(a>b)
			return a ;
		else
			return b ;
	}
}


