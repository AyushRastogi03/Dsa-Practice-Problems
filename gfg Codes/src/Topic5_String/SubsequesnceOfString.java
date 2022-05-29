package Topic5_String;

import java.util.Scanner;


/*
 * String a = ABC , b = BC ---- return true 
 * 
 * 
 */
public class SubsequesnceOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		String s = sc.next() ;
		String t = sc.next() ;
		
		
		// 1. iterative Solution 
		
		boolean b = IterativeSol(s,t);
		
		System.out.println(b);

	}
	
	
	public static boolean IterativeSol(String s, String t) {
		
		if(s.length()<t.length())
			return false ;
		int i=0,j=0;
		while(i<s.length()&&j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				
				j++;
			}
		   i++;
		}
		
		if(j == t.length()) {
			return true ;
		}
		
		return false ;
		
	}

}
