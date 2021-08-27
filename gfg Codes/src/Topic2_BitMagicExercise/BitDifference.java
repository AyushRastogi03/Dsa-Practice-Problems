package Topic2_BitMagicExercise;

import java.util.Scanner;

public class BitDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         while(t-->0) {
        	 
        	 int m = sc.nextInt() ;
        	 int n = sc.nextInt() ;
        	 
        	 Out o = new Out();
        	 
        	 System.out.println(o.Bitdiff(m,n));
        	 
        	 
         }
	}

}

class Out {
	public static int Bitdiff(int m,int n) {
		
		int i,j;
		int dif =0;
		while(n>0 || m>0) {
			i = n&1 ;
			j = m&1 ;
			if(i!=j) {
				dif++ ;
			}
			n = n>>1 ; m=m>>1 ;
		}
		return dif ;
		
		
		// better logic---------------------------------------------------- 
		
		 
//	    int f = a^b ;
//	    int res=0 ;
//	    while(f>0){
//	        f = (f&(f-1)) ;
//	        res++;
//	    }
//	    return res ;
		
		//------------------------------------------------------------------
	}
}
