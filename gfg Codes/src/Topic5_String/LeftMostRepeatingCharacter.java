package Topic5_String;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  string s = abcddb 
 *  o/p - 1 as b index is 1  
 *  
 */
public class LeftMostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next() ;
		
		
		// index of repeating character 
		
		int index  = Repeat(s);
		
		System.out.println("Index - " + index);
	}
	
	public static int Repeat(String s) {
		int[] a = new int[256];
		
		Arrays.fill(a,-1);
		int res = Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++) {
			
		    int al = a[s.charAt(i)];
		    System.out.println(a[s.charAt(i)]);
		    if(al==-1) {
		    	a[s.charAt(i)] = i ;
		    }
		    else {
		    	res = Math.min(res, al);
		    }
		}
		
		
		return res==Integer.MAX_VALUE?-1:res ;
		
		
		
	}

}
