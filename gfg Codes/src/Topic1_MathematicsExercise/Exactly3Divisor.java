package Topic1_MathematicsExercise;

import java.util.Scanner;

public class Exactly3Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		int g=0;
		int n = sc.nextInt();
		if(n<4) {
			System.out.println("0");
		}
		else {
		for(int i=4;i<=n;i++) {
			
			if(isPrime(i)) {
				continue ;
			}
			else {
				int t = CountDivisor(i);
				if(t==3) {
					g++;
					
				}
				
			}
			
			
		}
	   }
		System.out.println("not so effective output- " + g);
		
		
		
		
		// second effective method -----------------------------
		
		// as we know only those number will have 3 divisors whose squareroot would be prime number 
		
		//so we only have to check how many prime number are there in  √n 
		
		int b =(int) Math.sqrt(n);
		int c=0;
		for(int i=2;i<=b;i++) {
			if(isPrime(i))
				c++;
		}
		
		System.out.println("effective method ans - " + c);
		
		
		}
	
	static int CountDivisor(int l) {
		int count=0;
		for(int i=1;i*i<=l;i++) {
			if(l%i==0) {
				count++;
			   if(i!=l/i) {
				   count++;
			   }
			}
			
		}
		return count;
	}
	
	static boolean isPrime(int a) {
		
		if(a==1)
			return false;
		if(a==2 || a==3) {
			return true ;
		}
		if(a%2==0 || a%3==0)
			return false ;
		
		for(int i=5;i*i<=a;i=i+6) {
			if(a%i==0 || a%(i+2)==0)
				return false ;
		}
		return true ;
	}

}
