package Topic3_Recursion;

import java.util.Scanner;

public class PrintingLogValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		System.out.println(Log(t));

	}
	
	public static int Log(int n) {
		if(n==1) {
			return 0;
		}
		
		return 1+ Log(n/2); // for log base 2 n/2 for 3 use n/3  ;
		
	}

}
