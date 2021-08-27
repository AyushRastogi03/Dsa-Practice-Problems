package topic1_Mathematics;

import java.util.Scanner;

public class ComputingPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		int k = sc.nextInt();
		int res =1 ;
		
		//naive 
		System.out.println("Naive");     // O(n) time complexity
		
		for(int i=1;i<=k;i++) {
			res = res * n;
		}
		
		System.out.println("output - "+ res);
        
		// effective 
		System.out.println("Effective");        //Θ(log n) alt 233
		int tem = power(n,k);
		
		System.out.println("output - " + tem);
		
		
		
	}
     static int power(int n, int k) {
          
    	 if(k==0) {
    		 return 1;
    	 }
    	 
    	 int temp = power(n,k/2);             
    	 temp = temp*temp ;
    	 
    	 if(k%2==0)
    		 return temp ;
    	 else
    		 return temp*n;
     }
     
}
