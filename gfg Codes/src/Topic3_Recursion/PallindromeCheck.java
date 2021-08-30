package Topic3_Recursion;

import java.util.Scanner;

public class PallindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int l = s.length();
		
		boolean b = Check(s,0,l-1);
		
		if(b) {
			System.out.println("its pallindrome");
		}
		else {
			System.out.println("not pallindrome");
		}
		
		
	}
	
	public static boolean Check(String s,int start,int end) {
		
		if(start>=end) {
			return true ;
		}
		
		return ((s.charAt(start)==s.charAt(end)) && Check(s,start+1,end-1));
		
		
	}

}
