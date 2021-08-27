package Topic2_BitMagic;

import java.util.Scanner;

public class PowerSetUsingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		char[] st = s.toCharArray();
		
		int n = s.length();
		
		int size = (int) Math.pow(2,n);
		
		for(int i=0;i<size ; i++) {
			
			for(int j=0;j<n;j++) {
				
				if((i&(1<<j))!=0) {
					System.out.print(st[j]);
				}
	
			}
			System.out.print(" ");
		}

	}

}
