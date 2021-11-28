package Topic3_RecursionExercise;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			int p = sc.nextInt() ;
			System.out.println(new Po().po(n,p));
		}

	}

}

class Po{

		 long po(int n,int p)
		    {
		        if(p==0){
		            return 1 ;
		        }
		        if(p%2==0){
		            long y = po(n,p/2);
		            return (y%1000000007 * y%1000000007)%1000000007;
		        }
		        else{
		            return (n*po(n,p-1)%1000000007)%1000000007 ;
		        }
		        //Your code here
		       	
		        
		    }
}