package topic1_Mathematics;

import java.util.Scanner;

public class Pallindrome { // time Complexity is tyheta(d) where d is no of digit ..
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int f =a ;
		int rev=0,n ;
		
		while(a!=0) {
			n = a%10;
			
			rev = rev*10 + n ;
			
			a =a/10 ;
			
		}
		
		System.out.println(rev==f);

	}

}
