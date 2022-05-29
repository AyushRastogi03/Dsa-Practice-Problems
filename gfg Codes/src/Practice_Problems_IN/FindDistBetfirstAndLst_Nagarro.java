package Practice_Problems_IN;

import java.util.Scanner;

public class FindDistBetfirstAndLst_Nagarro {

	
	// we have to find distance between first character and the last character of a string 
	
	/*
	 * eg - String s1 = "the hindu times" 
	 * s2 = t
	 * 
	 * o/p - first index = 0 last index - 10 // ignore space dont count 
	 * 
	 */
	public static void main(String[] args) { // along with this have to check if count of particular char is >1 or not . 
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine() ;
		
		char c = sc.next().charAt(0);
		
		int f_index = s.indexOf(c);
		
		int l_index = s.lastIndexOf(c) ;
		
		int t=0;
		for(int i=f_index+1;i<l_index;i++) {
			if(s.charAt(i)==c||s.charAt(i)==' ') {
				continue ;
			}
			else 
			   t++ ;
		}
		
		System.out.println("final length - " + t);
	}

}
