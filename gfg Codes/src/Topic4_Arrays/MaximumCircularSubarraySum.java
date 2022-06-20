package Topic4_Arrays;

import java.util.Scanner;

public class MaximumCircularSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
	
	int[] ar = new int[n];
	
	for(int i=0;i<n;i++) {
		ar[i] = sc.nextInt();
	}
	
	
	// naive Solution O(n^2)
	
	int arr = naiveSolution(ar,n);

		System.out.println(arr);
	 
	// better solution O(n)
	
	int arrr = betterSolution(ar,n);

		System.out.print(arrr);
	
	
	}
   
	public static int naiveSolution(int[] arr, int n) {
		 
	    int res =0;	
	
		for(int i=0;i<n;i++) {
			int currsum = arr[i];
			int currmax = arr[i];
			for(int j=1;j<n;j++) {
				
				int index = (i+j)%n ;
				
				currsum +=arr[index];
				currmax = max(currmax,currsum);
			}
			
			res = max(res,currmax);
		}
		
		return res ;
	}
    public static int betterSolution(int[] arr, int n) {
		
    	int maxnormal = normalsubarraymax(arr,n);
    	
    	if(maxnormal<0) {
    	   return maxnormal ;
    	}
    	
    	int arrsum =0;
    	for(int i=0;i<n;i++) {
    	   
    		arrsum+=arr[i];
    		arr[i] = -arr[i]; // inplace of reverting the array we can also create metho of minsubarraysum and subtract with total sum 
    		
    	}
    	
    	int max_circular = arrsum + normalsubarraymax(arr,n);
    	
    	return max(max_circular,maxnormal);
    	
		
	}
    
    public static int normalsubarraymax(int[] arr , int n) { //kadane's algorithm to find max subArray
    
    	int res=arr[0],maxx = arr[0];
    	
    	for(int i=1;i<n;i++) {
    	  
    		maxx = max(arr[i], maxx + arr[i]);
          res = max(res , maxx);
    	}
    	
    	return res ;
    	
    }
    
    public static int max(int a , int b) {
    	if(a>b)
    		return a;
    	else
    		return b;
    	
    }
    
}
