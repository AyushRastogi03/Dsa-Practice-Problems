package Topic4_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MeanandMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       
       int[] arr = new int[n];
       for(int i=0;i<n;i++) {
    	   
    	   arr[i] = sc.nextInt();
       }
       
       // mean 
       int f  = mean(arr,n);
       int m = median(arr,n);
       
       System.out.println("mean - " + f + " median - " + m);
       
	}
	
	public static int median(int A[],int N)
    {
      
       Arrays.sort(A);
       
       if(N%2==0){
           int k = N/2 ;
           return (int)Math.floor((A[k]+A[k-1])/2);
       }
       
       int f =(int) Math.floor(N/2);
       
       return A[f];
      
    }
	
	 public static int mean(int A[],int N)
	    {
	       //Your code here
	       int sum =0;
	       for(int i=0;i<N;i++){
	           sum+=A[i];
	       }
	       
	       return (int) Math.floor(sum/N);
	    }

}
