package Topic3_RecursionExercise;

import java.util.Scanner;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			System.out.println(new Sl().hanoi(n,1,3,2));
		}

	}

}

class Sl{
	int count =0;
	public int hanoi(int n,int from,int to,int aux) {
		
		if(n==1) {
			System.out.println("move disk 1 from rod "+ from+ " to rod "+ to );
			count++;
			return count;
		}
		
		hanoi(n-1,from,aux,to);
		System.out.println("move disk " + n +" from rod "+ from+ " to rod "+ to );
		count++;
		 hanoi(n-1,aux,to,from);
		
		return count ;
		
		
	}
}