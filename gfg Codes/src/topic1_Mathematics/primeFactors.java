package topic1_Mathematics;

import java.util.Scanner;

public class primeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//naive 
		int k=n;
		System.out.println("naive");
		for(int i =2;i<k;i++) {
			if(isprime(i)) {
				
				int x = i;
				while(k%x== 0) {
					System.out.println(i);
					 x=x*i;
				}
			}
		}
		
		// effective 
		
		   effectivemethod(n);
		
		// most effective 
		
		mostEffectivemethod(n);

	}
	
	static boolean isprime(int a) {
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
	//effective
	static void effectivemethod(int n) {
		System.out.println("effective-");
        for(int i=2;i*i<=n;i++) {
		    
			while(n%i==0) {
				System.out.println(i + " ");
				n=n/i;
			}
			
		}
		if(n>1) {
			System.out.println(n);
		}
	}
	//mosteffective
	static void mostEffectivemethod(int n) {
		System.out.println("most effective -- ");
		if(n<=1)
			System.out.println("not factor");
		while(n%2==0) {
			System.out.println("2 ");
			n = n/2;
		}
	   while(n%3==0) {
		   System.out.println("3 ");
			n = n/3;
	   }
	   
	   for(int i=5;i*i<=n;i=i+6) {
		   while(n%i==0) {
			   System.out.println(i+" ");
			   n=n/i;
		   }
		   while(n%i+2==0) {
			   System.out.println(i+2+" ");
			   n=n/i+2;
		   }}
		   if(n>3) {
			   System.out.println(n);
		   }
	   
	}

}
