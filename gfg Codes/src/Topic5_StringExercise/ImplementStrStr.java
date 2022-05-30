package Topic5_StringExercise;

import java.util.Scanner;

/*
 * s = GeeksForGeeks, x = Fr
Output: -1
Explanation: Fr is not present in the
string GeeksForGeeks as substring.

	s = GeeksForGeeks, x = For
Output: 5
Explanation: For is present as substring
in GeeksForGeeks from index 5 (0 based
indexing).
 */

public class ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next() ;
		String x = sc.next() ;
		
		
		for(int i=0;i<s.length();i++) {
			boolean isEqual = true ; 
			for(int j=0;j<x.length();j++) {
				if(x.charAt(j)!=s.charAt(i+j)) {
					isEqual = false ;
					break ;
				}
			}
			
			if(isEqual) {
				System.out.println(i);
			}
		}
		
		
	

	}

}
