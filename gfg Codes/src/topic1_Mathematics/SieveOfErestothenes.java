package topic1_Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErestothenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// naive method 
		System.out.println("naive");
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}                                        // O(n*√n)
		}
		
		//effective
		System.out.println();
		System.out.println("effective");
                                                         //O(√n)
		boolean isPrime[] = new boolean[n+1];

		Arrays.fill(isPrime, true);
		
		for(int i=2;i*i<=n;i++) {
			if(isPrime(i)) {
				for(int j=2*i ; j<=n;j=j+i) {   // for more effective put j=i*i , 
					isPrime[j] = false;
				}                                    
			}
		}
		                                
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				System.out.print(i+ " ");
			}
		}
		
		
		// most effective method       ------------ O(nloglogn)
		
//		boolean isPrime[] = new boolean[n+1];
//
//		Arrays.fill(isPrime, true);
//		
//		for(int i=2;i<=n;i++) {
//			if(isPrime(i)) {
//				System.out.print(i+ " ");
//				for(int j=i*i ; j<=n;j=j+i) {   // for more effective put j=i*i , 
//					isPrime[j] = false;
//				}                                    
//			}
//		}
	}

	static boolean isPrime(int n) {
		
		if(n<2)
			return false ;
		if(n==2 || n==3)
			return true ;
		if(n%2==0 || n%3==0)
			return false;
	    for(int i=5;i*i<=n;i=i+6) {
	    	if(n%i==0)
	    		return false;
	    	if(n%i+2==0)
	    		return false;
	    }
	    return true;
		
	}
}
