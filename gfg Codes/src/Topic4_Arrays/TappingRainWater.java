package Topic4_Arrays;

import java.util.Scanner;

public class TappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
		  
			arr[i] = sc.nextInt() ;
		}
		
		// naive Solution theta(n^2)
		Naive(arr,n);
		
		//better Solution theta(n)
		
		Better(arr,n);

	}
	
	public static void Better(int arr[], int n) {
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		
		lmax[0] = arr[0];
		for(int i=1;i<n;i++) {
			lmax[i] = max(lmax[i-1],arr[i]);
		}
		rmax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rmax[i] = max(rmax[i+1],arr[i]);
		}
		int res =0;
		for(int i=1;i<n-1;i++) {
			res+=(min(lmax[i],rmax[i])-arr[i]);
		}
		
		if(res>0)
		System.out.println("Better - " + res);
		else
			System.out.println("better = 0");
	}
	
	public static void Naive(int arr[],int n) {
		
		int lmax , rmax , res=0 ;
		for(int i=1;i<n-1;i++) {
			
			lmax = arr[0];
			
			for(int j=0;j<i;j++) {
				lmax = max(lmax,arr[j]);
			}
			rmax = arr[i];
			for(int k=i+1;k<n;k++) {
				rmax = max(rmax,arr[k]);
			}
			
			res = res + (min(rmax,lmax)-arr[i]);
			
		}
		
		if(res>0)
		    System.out.println("naive - " + res);
		else
			System.out.println("better - 0");
	}
	
	public static int min(int a,int b) {
		if(a>b)
			return b ;
		else
			return a;
	}
	
	public static int max(int a,int b) {
		
		if(a>b)
			return a;
		else
			return b;
	}

}
