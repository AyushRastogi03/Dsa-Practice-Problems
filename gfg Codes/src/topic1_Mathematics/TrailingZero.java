package topic1_Mathematics;

import java.util.Scanner;

public class TrailingZero {

	public static void main(String[] args) {  //time Complexity = Theta(logn)
		// TODO Auto-generated method stub 
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int res=0;
		for(int i=5;i<=a;i=i*5) {
			res = res + a/i;
		}
       
		System.out.println("result - " + res);
	}

}
