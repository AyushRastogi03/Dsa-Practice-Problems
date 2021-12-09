package Topic4_ArraysExercise;

import java.util.Scanner;

public class WhohasMajority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
	       
	       int n = sc.nextInt();
	       
	       int[] arr = new int[n];
	       for(int i=0;i<n;i++) {
	    	   
	    	   arr[i] = sc.nextInt();
	       }
	       
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       
	      int t =  majorityWins(arr,n,x,y);
	      
	       System.out.println(t);
	       
	       
	}
	
	 public static int majorityWins(int arr[], int n, int x, int y) {
	        // code here
	        int a=0,b=0;
	        
	        for(int i=0;i<n;i++){
	            if(x==arr[i]){
	                a++;
	            }
	            if(y==arr[i]){
	                b++;
	            }
	            
	        }
	        if(a>b)return x;
	    if(a<b) return y;
	    
	    return Math.min(x,y);

	    }

}
