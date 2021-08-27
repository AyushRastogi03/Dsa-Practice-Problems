package Topic1_MathematicsExercise;

import java.util.Scanner;

public class SumOfDigitOfFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double digit =0;
		
		if (n < 0) 
			System.out.println("0");
  
        
        if (n <= 1) 
        	 System.out.println("1"); 
        
		for(int i =2;i<=n;i++) {
			digit=digit+Math.log10(i);
		}
		
		int sum = (int)(Math.floor(digit))+1;
		
		System.out.println("Output - " + sum);

	}

}
