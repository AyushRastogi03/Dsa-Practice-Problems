package Topic4_ArraysExercise;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		int d = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt() ;
		}
		
		int[] u = revArr(arr,n,d);
		
		for(int i:u) {
			System.out.print(i+" ");
		}
		

	}
	
	public static int[] revArr(int[] arr, int n, int d) {
		
		reverse(arr,0,d);
		reverse(arr,d,n);
		reverse(arr,0,n);
		
		return arr;
	}
	
	public static void reverse(int[] arr,int c,int n) {
		int t=n-1,temp=0;
		for(int i=c;i<t;i++) {
			temp = arr[i];
			arr[i] = arr[t];
			arr[t] = temp;
			
			t--;
		}
	}

}
