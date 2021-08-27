package Topic3_Recursion;

import java.util.Scanner;

public class PrintN21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in) ;
        
        int s = sc.nextInt() ;
        
        N2One(s) ;
        
 	}
	
	public static void N2One(int s) {
		if(s==0) {
			return ;
		}
		
		System.out.print(s);
		System.out.print(" ");
		N2One(s-1);
		
	}

}
