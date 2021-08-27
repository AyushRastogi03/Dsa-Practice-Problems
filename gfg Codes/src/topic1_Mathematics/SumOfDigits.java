package topic1_Mathematics;

import java.util.Scanner;
import java.util.*;

public class SumOfDigits { // time complexity  = Theta(d) where d is no. of digit 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int p =a ;
		int m = a;
		int count=0;
		while(a!=0) {
			a = a/10;
		   count++;
		}
		
		System.out.println("iterative method - "+count);
	  
		//another method  recursion
		
		int l = SumDigit(p);
		
		System.out.println("Recursion - " + l);
		
		
		// another method logarithmic 
		
		int logg =(int)(Math.floor(Math.log10(m) + 1));
		
		System.out.println("log - " + logg);
	}
	
	static int SumDigit(int p) {
		
		if(p==0) {
			return 0;
		}
		else {
			return 1 + SumDigit(p/10);
		}
	}

}
