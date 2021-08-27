package Topic2_BitMagic;

import java.util.Scanner;

public class Kth_Bit {

	public static void main(String[] args) {   // check whether kth Bit is set or not 
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       int a = sc.nextInt();
       
       int k = sc.nextInt();
       
       NaiveSolutionWithoutUsingBitwise(a,k);
       
       // better solution 
       System.out.println("Better Solution");
       String s = BetterSolution(a,k);
       
       System.out.println(s);

}
	
	public static void NaiveSolutionWithoutUsingBitwise(int a,int k) {
		System.out.println("Naive Solution");
		 int i=1;
	       int l ;
	       if(a==0) {
	    	   System.out.println("No");
	       }
	       while(a>0) {
	    	   l= a%2 ;
	    	   
	    	   if(i==k) {
	    		   if(l==1) {
	    			   System.out.println("Yes");
	    		   }
	    		   else {
	    			   System.out.println("No");
	    		   }
	    	   }
	    	   i++;
	    	   a=a/2;
	       }
	       
	      
		
	}
	
	public static String BetterSolution(int a , int k) {
		
		
		if((a&(1<<(k-1)))!=0) { // its using left shift we can also do using right shift operator (a>>(k-1)&1)==1
			return "yes";
		}
		else {
			return "No";
		}
	}
 
}