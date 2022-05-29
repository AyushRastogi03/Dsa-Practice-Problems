package Topic5_String;

import java.util.Scanner;

public class RotatedString {

	
	/*
	 * String a = ABCD
	 *  String b = BCDA 
	 * 
	 * check if b is rotation of a 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next() ;
		
		String b = sc.next() ;
		
		
		System.out.println(callingReverse(a,b));
	}
	
	
	public static boolean callingReverse(String a , String b ) {
		System.out.println(a+a);
		return (a+a).contains(b) ;
		
	}

}
