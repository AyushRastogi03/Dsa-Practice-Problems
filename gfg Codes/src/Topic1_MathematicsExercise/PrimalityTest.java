package Topic1_MathematicsExercise;

import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<=1) {
			System.out.println("No");
			System.exit(0);
			}
		if(n==2||n==3) {
			System.out.println("Yes");
			System.exit(0);
		}
		if(n%2==0||n%3==0) {
			System.out.println("No");
			System.exit(0);
		}
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i!=0 || n%i+2!=0) {
				System.out.println("No");
				System.exit(0);
			}
				
		}
		
		System.out.println("Yes");
	}

}
