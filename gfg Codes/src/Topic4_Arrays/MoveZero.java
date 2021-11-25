package Topic4_Arrays;

import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt() ;
			
		}
		
		int[] a = Move(arr,n);
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
	
	public static int[] Move(int[] arr , int n) {
		
		int count =0,temp=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				
				temp = arr[i] ;
				arr[i] = arr[count] ;
				arr[count] = temp ;
				count++ ;
			}
		}
		return arr ;
	}
	

}
