package Topic5_String;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringDistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc = new Scanner(System.in);
		   
		   
		   String s = sc.next() ;
		    
		   
		   // o(n2) solution 
		   
		   CallingN2(s);
		   
		   //O(n) solution
		   
		   CallingN(s);
		   
		   
	}
	
	

	public static void CallingN2(String s ) {
		
		
		
		int res =0;
		int n = s.length() ;
		for(int i=0;i<n;i++) {
			boolean[] b = new boolean[256] ;
			for(int j=i;j<n;j++) {
				
				if(b[s.charAt(j)]==true) {
					break ;
				}
				else {
					res = Math.max(res,j-i+1);
					b[s.charAt(j)]=true ;
				}
			}
		}
		
		System.out.println("N2 Output - "+res);
	}
	
	private static void CallingN(String s) {
		// TODO Auto-generated method stub 
		int n = s.length() ;
		int[] ar = new int[256] ;
		
		Arrays.fill(ar,-1);
		
		int j=0,res=0;
	    for(int i=0;i<n;i++) {
			j = Math.max(j,ar[s.charAt(i)]+1);
			int max = i-j+1 ;
			res = Math.max(max,res) ;
			ar[s.charAt(i)] = i ;
		}
	    
	    
	    System.out.println("N output - "+ res);
		
	}

	

}
