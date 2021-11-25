package Topic4_Arrays;

import java.util.Scanner;

public class FrequencyOfsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt() ;
		
		int[] arr = new int[n] ;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt() ;
		}
		
		frequency(arr,n);

	}
	
	public static void frequency(int[] arr , int n) {
		
		int count;
		for(int i=0;i<n;i++) {
			count =1;
			for(int j=i+1;j<n;j++) {
				if((arr[i] == arr[j])&&(arr[i]!=0)) {
					count++ ;
					arr[j]=0;
				}
			}
			if(arr[i]!=0)
			System.out.println(arr[i] + " -" + count);
		}
	}

}
