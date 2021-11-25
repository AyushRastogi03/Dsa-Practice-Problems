package Topic3_Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		
		char a = sc.next().charAt(0);
		
		char b = sc.next().charAt(0);
		
		char c = sc.next().charAt(0);
		
		Tower(n,a,b,c);
		
			
	}
	
	public static void Tower(int n,char a,char b,char c) {
		if(n==1) {
			System.out.println("move 1 from "+a+" to "+c);
			return ;
		}
		
		Tower(n-1,a,c,b);
		System.out.println("move" + n + "from " + a+" to "+c);
		Tower(n-1,b,a,c);
	}

}
