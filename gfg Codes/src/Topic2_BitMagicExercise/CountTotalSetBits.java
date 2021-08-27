package Topic2_BitMagicExercise;

import java.util.Scanner;

public class CountTotalSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt() ;
		
		while(s-->0) {
			
			int m = sc.nextInt() ;
			
			Solv sol = new Solv();
			
			System.out.println(sol.CountTotal(m));
			
			//// shortest Method 
			int bit=0;
			for(int i=1;i<=m;i++) {
				
				bit = bit + Integer.bitCount(i);
			}
			System.out.println("Shortest Method - " + bit);
			
			// another method using power of 2 
			
			Solutio sd = new Solutio() ;
				
			System.out.println("Power of Two method - " + sd.countSetBits(m));
			
			
		}
	}

}

class Solv {
	
	public static int CountTotal(int m ) {
		
		int res = 0 ;
		while(m>0) {
			
			int Bit = SetBits(m);
			res = res + Bit ;
			m-- ;
		}
		return res ;
	}
	
	public static int SetBits(int n) {
		int r=0 ;
		while(n>0) {
			n = n&(n-1) ;
			r++ ;
		}
		
		return r ;
	} 

}
class Solutio{
	  
	  //Function to return sum of count of set bits in the integers from 1 to n.
	  public static int countSetBits(int n){
	  if(n==0)
	  return 0;
	  int x = largest2power(n);
	  int res1  =   x * (1<<(x-1));
	  //System.out.println("res1 - " + res1);
	  int remmsb = (n-(1<<x)+1);
	 // System.out.println("remsb - " + remmsb);
	  int rem = n - (1<<x);
	 // System.out.println("Rem = " + rem);
	  int  res = res1 + remmsb + countSetBits(rem);
	      
	  
	  return res; 
	  }
	  
	  
	 private static int largest2power(int n)
	 {
	     int x=0;
	     
	     while((1<<x)<=n)
	     x++;
	     return x-1;
	     
	 }
	 
	 
	  
	}

