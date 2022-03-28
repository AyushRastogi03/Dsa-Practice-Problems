package Topic4_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestMissPosNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int t = small(arr,n);
		
		System.out.println("smallest Number - " + t);
		

	}
	
	public static int small(int[] arr,int n) {
		
		Arrays.sort(arr);
		
		int c =1 ;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==c) {
				c++;
			}
		}
		
		return c ;
	
		
	}

}
