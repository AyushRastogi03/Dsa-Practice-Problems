package Topic2_BitMagic;

import java.util.Scanner;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int p=a  ;
		int f= a;
		
		// naive solution
		System.out.println("Naive direct");
		int res =0,k ;
		while(a>0) {
			if(a%2!=0) {       
				res++;
			}
			a=a/2;
		}
		System.out.println(res);
		
		
		// using bit wise - naive  
		System.out.println("Naive Bit wise");
		
		int re =0 ;
		
		while(p>0) {
			
			re = re+ (p&1);
			
			p=p>>1;
		}
		System.out.println(re);
		
		
		// better solution 
		System.out.println("Better");
		
		int r =0 ;
		
		while(f>0) {
			f = f & (f-1);
			r++;
		}
		
		System.out.println(r);

	}

}
