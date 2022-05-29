package Topic5_String;

import java.util.Arrays;
import java.util.Scanner;

/*
 * string s = "abcddab"   // non repeating chracter is c 
 * 
 */
public class LeftMostNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next() ;
		
		// sol
		
		int index = sol(s);
		
		System.out.println(index);
	}
	
	
	public static int sol(String s) {
		
		int[] b = new int[256] ;
		Arrays.fill(b,0);
		int res = Integer.MAX_VALUE ;
		for(int i=s.length()-1;i>=0;i--) {
			
			if(b[s.charAt(i)]<2) {
				b[s.charAt(i)]++ ;
				
			}

		}    
		
		for(int i=0;i<s.length();i++) {
			if(b[s.charAt(i)]==1) {
				res = Math.min(res,i) ;
			}
		
		}
		return res == Integer.MAX_VALUE? -1 : res ;
	}

}
