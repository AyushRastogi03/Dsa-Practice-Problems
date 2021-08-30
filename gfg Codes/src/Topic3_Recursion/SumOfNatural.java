package Topic3_Recursion;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		int sum = Natural(s);
		
		System.out.println("Sum Of natural no - " + sum);

	}
	
	public static int Natural(int s) {
		
		if(s==0) {
			return s;
		}
		
		return s+Natural(s-1);
		
		
	}

}
