package Topic1_MathematicsExercise;

import java.util.Scanner;

public class QuadetricEquationRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = (b*b)-4*a*c;
		
		if(d<0) {
			System.out.println("Imaginary");
		}
		else {
			double root1 = (-b + Math.sqrt(d))/2*a ;
			 double root2 = (-b - Math.sqrt(d))/2*a ;
			 System.out.println("Root1 - " + (int)root1 + " Root2 - " + (int)root2);
		}
		
		

	}

}
