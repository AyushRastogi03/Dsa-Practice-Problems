package Topic1_MathematicsExercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int res =1 ;
		for(int i =a;i>0;i--) {
			res = res * i ;
		}
		
		System.out.println(res);

	}

}
