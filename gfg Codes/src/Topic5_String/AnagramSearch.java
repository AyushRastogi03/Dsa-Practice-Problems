package Topic5_String;

import java.util.Scanner;

public class AnagramSearch {  
	
	/*
	 * Given a text and a pattern, the task is to find
	 * if there is anagram of pattern present in text. The video talks about two solutions to solve the problem.
	 * 
	 * eg - String txt - geeksforgeeks 
	 *          patt = frog 
	 *          o/p - true 
	 */
	
	 static final int CHAR = 256 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		  
		String text = sc.next() ;
		
		String patt = sc.next() ;
		
		
		System.out.println(check(text,patt));
		
	}  
	
	public static boolean check(String text , String patt) {
		
		int tx[] = new int[CHAR];
		int pt[] = new int[CHAR] ;
		
		
		for(int i=0 ;i<patt.length();i++) {
			tx[text.charAt(i)]++ ;
			pt[patt.charAt(i)]++ ;
		}
		
		for(int i= patt.length() ; i<text.length() ;i++)
		{
			if(isAnagram(tx,pt)) {
				return true ;
			}
			tx[text.charAt(i)]++ ;
			tx[text.charAt(i-patt.length())]-- ;
			
		}
		
		return false ;
		
	} 
	
	public static boolean isAnagram(int[] tx , int[] pt) {
		
		for(int i=0;i<CHAR;i++) {
			if(tx[i]!=pt[i])
				return false ;
		}
		return true ;
	}

}
