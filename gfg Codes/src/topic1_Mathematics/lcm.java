package topic1_Mathematics;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// naive 
		
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a==0&&res%b==0) {
				break;
			}
			res++;
		}
		
		System.out.println("Naive - " + res);

		
		// efficient 
		
		int l = lcm(a,b);
		
		System.out.println("better approach - " + l);
	}
	
	static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

}
