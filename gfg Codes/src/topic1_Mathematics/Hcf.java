package topic1_Mathematics;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b = sc.nextInt();
		// naive Solution 
		
		int min = Math.min(a,b);
		
		int res = min ;
		
		while(res>0) {
			if(a%res==0 && b%res==0) {
				break;
			}
			res-- ;
		}
		System.out.println("out naive - "+ res);
		
		// Euclidean Algo 
		while(a!=b) {
			
			if(a>b) {
				a=a-b;
			}
			else {
				b= b-a ;
			}
		}
		
		System.out.println("out - "+ a);
		
		//approach 3 
		
		  int ot = gcd(a,b);
		  
		  System.out.println("GCD - " + ot);

	}

	static int gcd(int a , int b) {
		
		if(b==0)
			return a;
		else
			return gcd(a,a%b);
	}
	
}
