package Topic3_Recursion;

import java.util.Scanner;

public class RopeCuttingProblem {

	public static void main(String[] args) {// if s = 5 , a=1 b=2 c = 5 ,, we will maximum cut when we will make 1 cut 5 times so maximujm cut = 5
		// TODO Auto-generated method stub
            
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt() ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt() ;
		int p = Pieces(s,a,b,c) ;
		
		System.out.println("Pieces Possible - " + p);
	}
   
	public static int Pieces(int s,int a,int b,int c) {
		
		if(s==0) {
			return 0;
		}
		if(s<0) {
			return -1 ;		
		}
		
		int res = max(Pieces(s-a,a,b,c),Pieces(s-b,a,b,c),Pieces(s-c,a,b,c));
		
		if(res==-1)
			return -1;
		
	   return res+1;
	}
	
	public static int max(int a, int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}
}
