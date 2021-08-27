package topic1_Mathematics;

import java.util.Scanner;

public class AllDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		// naive solution 
		System.out.println("Naive Solution");   // Θ(n) time complexity
		for(int i=1;i<=n;i++) {              
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		//effective Method
		
		System.out.println("Effective Method");         // Θ(√n) time complexity 
		
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {                          
				System.out.println(i);
				
				if(i!=n/i) {
					System.out.println(n/i);
				}
			}
		}
		
		

	}

}
