package topic1_Mathematics;

import java.util.Scanner;


//bit wise 
public class IterativeSolution_ComputingPower {    // Time Complexity - O(log n ) and auxillary space - O(1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int res =1;
		while(k>0) {
			
			if(k%2!=0) {
				res = res * n;
			}
			n = n*n ;
			k = k/2;
			
			
		}
		
		System.out.println("output - "+ res);
	}

}
