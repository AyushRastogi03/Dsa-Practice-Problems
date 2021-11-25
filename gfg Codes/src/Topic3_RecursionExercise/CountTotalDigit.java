package Topic3_RecursionExercise;

import java.util.Scanner;

public class CountTotalDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc  = new Scanner(System.in);
   
    int t = sc.nextInt() ;
    
    while(t-- >0) {
		 
		int n  = sc.nextInt() ;
		System.out.println(new Soli().count(n));
	}
	}

}

  class Soli{
	public static int count(int n) {
		if(n==0) {
			return 1;
		}
		if(n>0 && n<10) {
			return 1;
		}
		
		return 1 + count(n/10);
	}
}
