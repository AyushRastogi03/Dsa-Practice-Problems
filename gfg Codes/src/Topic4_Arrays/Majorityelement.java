package Topic4_Arrays;

import java.util.Scanner;

public class Majorityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
			
		}
		int a = 0,c=1;
		for(int i=1;i<n;i++) {
			if(ar[i] == ar[a]) {
				c++;
			}
			else {
				c-- ;
			}
			
			if(c==0) {
				a = i;
				c =1;
			}
		}
		
		int count =0;
		
		for(int i=0;i<n;i++) {
			if(ar[a] == ar[i]) {
				c++;
			}
		}
		if(c<n/2) {
			System.out.println("-1");
		}
		else {
			System.out.println(a);
		}
		
		
	}

}
