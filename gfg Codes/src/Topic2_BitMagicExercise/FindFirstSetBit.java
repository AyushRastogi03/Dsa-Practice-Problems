package Topic2_BitMagicExercise;

import java.util.Scanner;

public class FindFirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         int t = sc.nextInt();
         
         while(t-->0) {
        	 int n = sc.nextInt();
        	 Solution s = new Solution();
        	 
        	 System.out.println(s.firstBit(n));
         }
	
	}

}

class Solution {
	
	public static int firstBit(int n) {
		int res =0,i=0;
		while(n>0) {
			i++;
			if((n&1)!=0) {
				return i ;
			}
			
			n=n>>1 ;
		}
		
		return 0 ;
		
		/// best solution without using loop 
		
//		public static int getFirstSetBitPos(int n){
//	        if(n==0) return 0;
//	        return (int)(Math.log(n&-n)/Math.log(2.0)) + 1; 
//	    }
		
		
	}
}