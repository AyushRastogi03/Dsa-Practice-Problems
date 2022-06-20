package Topic6_Stack;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterElement {

	/*
	 * Input: 
N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
           int[] arr = {6,8,0,1,3} ;
           
           
           // Brute Force Approach 
           
           bruteforce(arr) ;
           
           // USing Stack 
            
           
	}
	
	public static void bruteforce(int[] arr) {
		
		List<Integer> a = new ArrayList<>() ;
		 
		
		for(int i=0;i<arr.length;i++) {
			int t =-1;
			for(int j=i+1;j<arr.length;j++) {
				  if(arr[i]<arr[j]) {
					  t = j ;
					  break ;
				  }
			}
			
			if(t>-1) {
				a.add(arr[t]) ;
			}
			else {
				a.add(-1) ;
			}
		}
		
	     System.out.println(a);
	}

}
