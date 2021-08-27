package Topic2_BitMagic;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println("No");
		}
		
		int f = a & (a-1) ;
		
		if(f==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
				

	}

}
