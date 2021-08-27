package topic1_Mathematics;

import java.util.Scanner;

public class PrimeEffective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		boolean b = prime(a);
			
		System.out.println("output - " + b);
		
	}
	
	static boolean prime(int a) {
		
		if(a==1)
			return false;
		if(a==2 || a==3) {
			return true ;
		}
		if(a%2==0 || a%3==0)
			return false ;
		
		for(int i=5;i*i<=a;i=i+6) {
			if(a%i==0 || a%(i+2)==0)
				return false ;
		}
		return true ;
	}

}
