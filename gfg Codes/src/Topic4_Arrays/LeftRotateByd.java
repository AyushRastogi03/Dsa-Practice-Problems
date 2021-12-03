package Topic4_Arrays;

import java.util.Scanner;

public class LeftRotateByd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt() ;
		
		int[] ar = new int[a] ;
		for(int i=0;i<a;i++) {
			ar[i] = sc.nextInt();
			}
		
		// 1 st method --  naive theta(ad)
		int d = sc.nextInt() ;
		
		for(int i=0;i<d;i++) {
			int temp = ar[0];
			for(int j=1;j<a;j++) {
				
				ar[j-1] = ar[j];
			}
			ar[a-1] = temp ;
			
		}
          
		for(int i=0;i<a;i++) {
			System.out.print(ar[i] + " ");
		}
		
		
		
		// 2 nd method - better  theta(d)
	       
		int[] temp = new int[a];
		
		for(int i=0;i<d;i++) {
			temp[i] = ar[i];
		}
		for(int i=d;i<a;i++) {
			ar[i-d] = ar[i];
		}
		
		for(int i=0;i<d;i++) {
			ar[a-d+i] = temp[i];
		}
		
		
		// 3 - reverse method  -- theta(2d) == theta(d) 
		
		// perform reverse three times first from 0 to d ;
		// then from d to n ;
		// then reverse the whole array 
		
	}
	
	
	
	
	

}
