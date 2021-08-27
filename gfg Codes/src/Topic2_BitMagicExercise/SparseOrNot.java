package Topic2_BitMagicExercise;

import java.util.Scanner;

public class SparseOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt() ;
        
        while(s-- > 0) {
        	
        	int m = sc.nextInt() ;
        	
        	
        	Sparse p = new Sparse() ;
        	
        	if(p.isParse(m))
        	 System.out.println("0");
        	else
        	 System.out.println("1");
        }
	}

}

class Sparse {
	
	public static boolean isParse(int m) {
		
		int l,p=0 ;
		while(m>0) {
			l = 1&m ;
			
			if(p==l && l==1) {
				return true ;
			}
			
			p =l ;
			
			m= m>>1 ;
			
			
		}
		
		return false ;
		
		
		// another solution 
		
//		 int count = 0;
//	        while(n!=0){
//	            if(count==2)
//	           return false;
//	            if((n&1)==1){
//	                count++;
//	            }else{
//	                count=0;
//	            }
//	            n= n>>1;
//	        }
//	        if(count<2)
//	        return true;
//	        return false;
	}
}
