package Topic4_Arrays;

import java.util.Scanner;

public class LeaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt() ;
		
		int[] a = new int[s];
		
		for(int i=0;i<s;i++) {
			a[i] = sc.nextInt() ;
		}
		
		
		// naive sol -- o[n^2]
		
		// another method
		int t=0;
		
		for(int i=s-1;i>=0;i--) {
			if(t<a[i]) {
				System.out.print(a[i] + " ");
				t= a[i];
			}
		}
		
	}

}
