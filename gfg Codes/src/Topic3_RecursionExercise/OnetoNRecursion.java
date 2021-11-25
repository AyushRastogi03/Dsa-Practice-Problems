package Topic3_RecursionExercise;

import java.util.Scanner;

public class OnetoNRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		int i=1;
		//OneToN(n,i);
        
		OneToN(n);
		sc.close();
	}
	
	public static void OneToN(int n,int i) {
		
		if(n==i) {
			System.out.println(n);
			return ;
		}
		
		System.out.print(i+" ");
		
		OneToN(n,i+1);
		
	}
	
	public static void OneToN(int n) {
		
		if(n==0) {
			return ;
		}
		
		OneToN(n-1);
		System.out.print(n+" ");
		
	}

}
