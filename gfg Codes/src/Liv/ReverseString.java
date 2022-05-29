package Liv;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next() ;
		char[] c = s.toCharArray() ;
		int t=0 ;
	    for(int i=0;i<s.length();i++) {
	    	
	    	if(s.charAt(i)=='.') {
	    		reverse(c,t,i-1);
	    		t = i+1 ;
	    	}
	    	
	    	
	    }
	    
	    reverse(c,t,s.length()-1);
	    reverse(c,0,s.length()-1);
	    
	    String e = new String(c);
	    System.out.println(e);
	}
	
	
	public static void reverse(char[] c,int p, int t) {
		char temp ;
		while(p<t) {
			temp = c[p] ;
			c[p] = c[t] ;
			c[t] = temp ;
			
			p++;
			t--;
		}
	}

}
